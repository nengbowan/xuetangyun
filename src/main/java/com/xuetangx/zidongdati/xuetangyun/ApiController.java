package com.xuetangx.zidongdati.xuetangyun;

import com.alibaba.fastjson.JSONObject;
import com.xuetangx.zidongdati.xuetangyun.config.WebHeader;
import com.xuetangx.zidongdati.xuetangyun.dto.CourseDto;
import com.xuetangx.zidongdati.xuetangyun.dto.CourseListDto;
import com.xuetangx.zidongdati.xuetangyun.dto.QuestionAnswerDto;
import com.xuetangx.zidongdati.xuetangyun.dto.QuestionGetDto;
import com.xuetangx.zidongdati.xuetangyun.util.CollectionUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class ApiController {
    private String baseUrl = "http://hbu.xuetangx.com";

    private String cloudUrl = baseUrl + "/newcloud/api";

    private String username;

    private String passwd;


    private CookieStore cookieStore = new BasicCookieStore();

    private HttpClient client = HttpClients.custom().setDefaultCookieStore(cookieStore).build();

    public ApiController(String username , String passwd){
        this.username = username;
        this.passwd = passwd;
    }
    public String login(){
        String loginUrl = cloudUrl + "/v1/user/login/";

        HttpPost post = new HttpPost(loginUrl);

        post.addHeader(new BasicHeader(WebHeader.USERAGENT_KEY , WebHeader.USERAGENT_VALUE_1));
        post.addHeader(new BasicHeader(WebHeader.Refer_Key , "http://hbu.xuetangx.com/newcloud/login/"));
        post.addHeader(new BasicHeader(WebHeader.CONTENTTYPE_KEY , WebHeader.CONTENTTYPE_VALUE));

        //{"username":"20182306005","password":"197527","remember":0}
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair( "username" , username));
        nvps.add(new BasicNameValuePair("password" , passwd));
        nvps.add(new BasicNameValuePair("remember" , "0"));

        post.setEntity(new UrlEncodedFormEntity(nvps , Charset.defaultCharset()));

        try {
            HttpResponse httpResponse = client.execute(post);
            HttpEntity httpEntity = httpResponse.getEntity();
            String respStr = EntityUtils.toString(httpEntity ,Charset.defaultCharset());
           return respStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getCourseListJson(){
        String url = cloudUrl + "/studentcourse/?termid=377&search=&credit=0&status=&limit=10&page=1";
        HttpGet get = new HttpGet(url);

        get.addHeader(new BasicHeader(WebHeader.USERAGENT_KEY , WebHeader.USERAGENT_VALUE_1));
        get.addHeader(new BasicHeader(WebHeader.Refer_Key , "http://hbu.xuetangx.com/newcloud/dashboard"));

        try {
            HttpResponse httpResponse = client.execute(get);
            HttpEntity httpEntity = httpResponse.getEntity();
            String respStr = EntityUtils.toString(httpEntity ,Charset.defaultCharset());
            return respStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    public void start(){
        //获取cookie
        login();

        String  courseListJson= getCourseListJson();

        CourseListDto courseListDto = JSONObject.parseObject( courseListJson , CourseListDto.class);

        if(CollectionUtils.isNotEmpty(courseListDto.getResults())){
            for(CourseDto courseDto : courseListDto.getResults()){
                //进行中的课程
                if(courseDto.getStatus().equals("ing")){
                    String coursewareUrl = courseDto.getCourseware_url();
                    String siteUrl = baseUrl + coursewareUrl;
                    String coursewarePage = getCoursewarePage(siteUrl);

                    List<String> coursewareUrls = parseCoursewareUrls(coursewarePage);

                    if(CollectionUtils.isNotEmpty(coursewareUrls)){
                        for(String temp : coursewareUrls){
                            System.out.println("单个课程明细地址 ： " + baseUrl + temp);
                            String html = getCoursewareSinglePage(baseUrl + temp);
                            // &lt; => <  ; &gt; => > ; &amp; => & ; &quot; => "转换
                            String formattedHtml = formatHtml(html);
                            Document doc = Jsoup.parse(formattedHtml);
                            Elements eles = doc.select(".vert-mod");
                            if(eles != null && eles.size() != 0){
                                for(Element ele : eles){
                                    Elements questionEles = ele.select("div div[class~=vert]");

                                    if(CollectionUtils.isNotEmpty(questionEles)){
                                        for(Element questionEle : questionEles){
                                            //视频 Video 单选题
                                            String questionType = questionEle.select("div div").get(0).attr("data-type");
//                                            String questionRequestToken = questionEle.select("div div").get(0).attr("data-request-token");

                                            switch (questionType){
                                                case "Video" : System.out.println("这是一个Video类型");break;
                                                case "Problem" : {
                                                    String questionUrl = questionEle.select("div div").get(1).attr("data-url");
//                                                    String questionStatus = questionEle.select("div div").get(1).attr("data-progress_status"); //done none

                                                    //获取题目具体内容
                                                    String questionGetUrl = baseUrl + questionUrl + "/problem_get";
                                                    String questionGetJson = getQuestionAnswerJson(questionGetUrl);
                                                    QuestionGetDto getDto = parseQuestionGetJson(questionGetJson);
                                                    System.out.println(formatHtml(getDto.getHtml()));
                                                    String submitCountStr = Jsoup.parse(StringEscapeUtils.unescapeHtml4(getDto.getHtml())).select("div.submission_feedback").text().replaceAll("您已经使用了2次中的 ","").replaceAll("次提交","");
                                                    //一次都没提交过答案
                                                    Integer actualSubmitCount = StringUtils.isEmpty(submitCountStr) ? 0 :Integer.valueOf( submitCountStr);
                                                    System.out.println(actualSubmitCount);
                                                    if(actualSubmitCount < 2){
                                                        //获取题目具体答案
                                                        String questionAnswerUrl = baseUrl + questionUrl + "/problem_show";
                                                        String questionAnswerJson = getQuestionAnswerJson(questionAnswerUrl);
                                                        //{
//                                                        "msg": "该问题的描述在你加载本页面之后已经发生变化了。请刷新你的页面。",
//                                                                "success": false
//                                                    }
                                                        QuestionAnswerDto answerDto = parseQuestionAnswerJson(questionAnswerJson);
                                                        System.out.println(answerDto.getAnswers());
                                                        System.out.println("提交答案");
                                                    }


//                                                if("none".equals(questionStatus)){
//
//                                                }

//                                        if("none".equals(answerDto.getProgress_status())){
//                                            //未完成的
//
//                                        }
                                                };break;
                                                case "HTMLModule" : System.out.println("这是一个HTMLModule类型");break;
                                                default: System.out.println("questionType" + questionType);
                                            }
                                        }
                                    }

//                                String dataProblemId = questionEle.attr("data-problem-id");
//                                String dataUrl = questionEle.attr("data-url");
//                                System.out.println(dataUrl);
                                }

                            }
                        }
                    }
                }
            }
        }
        return;
    }

    private QuestionGetDto parseQuestionGetJson(String questionGetJson) {
        return JSONObject.parseObject(questionGetJson , QuestionGetDto.class);
    }

    private QuestionAnswerDto parseQuestionAnswerJson(String questionAnswerJson) {
        return JSONObject.parseObject(questionAnswerJson , QuestionAnswerDto.class);
    }

    private String getQuestionAnswerJson(String questionAnswerUrl) {
        HttpGet get = new HttpGet(questionAnswerUrl);

        get.addHeader(new BasicHeader(WebHeader.USERAGENT_KEY , WebHeader.USERAGENT_VALUE_1));
        get.addHeader(new BasicHeader(WebHeader.Refer_Key , "http://hbu.xuetangx.com/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/2645a520388d4777aef17fa569316214/"));
        try {
            HttpResponse httpResponse = client.execute(get);
            HttpEntity httpEntity = httpResponse.getEntity();
            String respStr = EntityUtils.toString(httpEntity ,Charset.defaultCharset());
            return respStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //&lt; => <  ; &gt; => > ; &amp; => &
    private String formatHtml(String html) {
        return StringEscapeUtils.unescapeHtml4(html);
//        return html.replaceAll("&lt;" , "<")
//                .replaceAll("&gt;" , ">")
//                .replaceAll("&amp;" , "&")
//                .replaceAll("&#34;" , "\"")
//                .replaceAll("&quot;" , "\"")
//                ;

    }

    private String getCoursewareSinglePage(String singleCoursewareUrl) {
        HttpGet get = new HttpGet(singleCoursewareUrl);

        get.addHeader(new BasicHeader(WebHeader.USERAGENT_KEY , WebHeader.USERAGENT_VALUE_1));
        try {
            HttpResponse httpResponse = client.execute(get);
            HttpEntity httpEntity = httpResponse.getEntity();
            String respStr = EntityUtils.toString(httpEntity ,Charset.defaultCharset());
            return respStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;


    }

    private List<String> parseCoursewareUrls(String coursewarePage) {
        List<String> urls = new ArrayList<>();
        Document doc = Jsoup.parse(coursewarePage);
        Elements eles = doc.select("li a[href~=courseware/]");
        if(eles != null && eles.size() != 0){
            for(Element ele : eles){
                urls.add(ele.attr("href"));

            }
            return urls;

        }
        return null;
    }

    private String getCoursewarePage(String courwareUrl) {
        HttpGet get = new HttpGet(courwareUrl);

        get.addHeader(new BasicHeader(WebHeader.USERAGENT_KEY , WebHeader.USERAGENT_VALUE_1));
        try {
            HttpResponse httpResponse = client.execute(get);
            HttpEntity httpEntity = httpResponse.getEntity();
            String respStr = EntityUtils.toString(httpEntity ,Charset.defaultCharset());
            return respStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
