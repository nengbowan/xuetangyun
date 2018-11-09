package com.xuetangx.zidongdati.xuetangyun;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class CoursewarePageTests {

    @Test
    public void test(){
        String html = "<!DOCTYPE html>" +
                "<!--[if IE 7]><html class=\"ie ie7 lte9 lte8 lte7\" lang=\"zh-cn\"><![endif]-->" +
                "<!--[if IE 8]><html class=\"ie ie8 lte9 lte8\" lang=\"zh-cn\"><![endif]-->" +
                "<!--[if IE 9]><html class=\"ie ie9 lte9\" lang=\"zh-cn\"><![endif]-->" +
                "<!--[if gt IE 9]><!--><html lang=\"zh-cn\"><!--<![endif]-->" +
                "" +
                "<head dir=\"ltr\">" +
                "    <meta charset=\"UTF-8\">" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "  <title>" +
                "" +
                " hbu_2018031901X 课件 | 河北大学学堂云" +
                "</title>" +
                "" +
                "  <script type=\"text/javascript\">" +
                "    /* immediately break out of an iframe if coming from the marketing website */" +
                "    (function(window) {" +
                "      if (window.location !== window.top.location) {" +
                "        window.top.location = window.location;" +
                "      }" +
                "    })(this);" +
                "  </script>" +
                "" +
                "  <script type=\"text/javascript\" src=\"/jsi18n/\"></script>" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/player/jquery.min.397754ba49e9.js\"></script>" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/user_track.7b0c8318d1ba.js\"></script>" +
                "" +
                "  <link rel=\"icon\" type=\"image/x-icon\" href=\"http://storage.xuetangx.com/spoc/hbu/favicon.ico\" />" +
                "" +
                "  " +
                "  " +
                "" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-vendor.f514c2e00e9f.css\" rel=\"stylesheet\" type=\"text/css\" />" +
                "" +
                "" +
                "" +
                "  " +
                "  " +
                "" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-app.abbd1d326a45.css\" rel=\"stylesheet\" type=\"text/css\" />" +
                "" +
                "" +
                "" +
                "  " +
                "  " +
                "" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-app-extend1.dc4f981d2e3e.css\" rel=\"stylesheet\" type=\"text/css\" />" +
                "" +
                "" +
                "" +
                "  " +
                "  " +
                "" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-app-extend2.a4aabe189aff.css\" rel=\"stylesheet\" type=\"text/css\" />" +
                "" +
                "" +
                "" +
                "<style>" +
                "  html,body,h1,h2,h3,h4,h5,p,span {text-transform: none!important;}" +
                "</style>" +
                "    " +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-main_vendor.c1170b9488ac.js\" charset=\"utf-8\"></script>" +
                "" +
                "" +
                "" +
                "  <script>" +
                "    window.baseUrl = \"//vpc-static-cdn.xuetangx.com/static/\";" +
                "    (function (require) {" +
                "        var urlArgs = \"v=4f9cf36\";" +
                "      require.config({" +
                "          baseUrl: baseUrl," +
                "          urlArgs: urlArgs" +
                "      });" +
                "    }).call(this, require || RequireJS.require);" +
                "  </script>" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/require-config-lms.da42d4d4e28b.js\"></script>" +
                "" +
                "  " +
                "" +
                "  " +
                "" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-course-vendor.b7ecded0fc78.css\" rel=\"stylesheet\" type=\"text/css\" />" +
                "" +
                "" +
                "" +
                "" +
                "  " +
                "" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-course.427d7c943b58.css\" rel=\"stylesheet\" type=\"text/css\" />" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/split.1e256a271150.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/jquery.truncate.b81308a54759.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/jquery.ajaxfileupload.27e7569a4c1e.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/Markdown.Converter.33f02cbe2eb8.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/Markdown.Sanitizer.253c591d1f95.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/Markdown.Editor.dd676cbe4563.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/jquery.autocomplete.3bd10d7510d2.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/jquery.timeago.9605aaf0437d.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/src/jquery.timeago.locale.b54a9c010cd6.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/mustache.2aa68bb79181.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/URI.min.03b89112e46e.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/backbone-min.752b6162850f.js\"></script>" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/src/tooltip_manager.0df6414b1730.js\"></script>" +
                "" +
                "<link href=\"//vpc-static-cdn.xuetangx.com/static/css/vendor/jquery.autocomplete.09a0b34739a2.css\" rel=\"stylesheet\" type=\"text/css\">" +
                "" +
                "" +
                "  " +
                "" +
                "" +
                "" +
                "  " +
                "" +
                "" +
                "  <!--[if lt IE 9]>" +
                "    <script src=\"//vpc-static-cdn.xuetangx.com/static/js/html5shiv.0ce8f355891c.js\"></script>" +
                "  <![endif]-->" +
                "" +
                "  " +
                "  <!-- dummy segment.io -->" +
                "<script type=\"text/javascript\">" +
                "  var analytics = {" +
                "    track: function() { return; }," +
                "    trackLink: function() { return; }," +
                "    pageview: function() { return; }," +
                "    page: function() { return; }" +
                "  };" +
                "</script>" +
                "<!-- end dummy segment.io -->" +
                "" +
                "" +
                "  <meta name=\"path_prefix\" content=\"\">" +
                "" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"http://storage.xuetangx.com/spoc/public/overrides/new/hbu.css\" />" +
                "" +
                "" +
                "" +
                "</head>" +
                "" +
                "<body class=\"ltr courseware  lang_zh-cn\">" +
                "  <div class=\"window-wrap\" dir=\"ltr\">" +
                "    <a class=\"nav-skip\" href=\"#course-content\">跳过本内容页</a>" +
                "" +
                "    " +
                "<!--[if IE]>" +
                "<div class=\"sr message-accessibility message\" id=\"mathjax-accessibility-message\" aria-hidden=\"true\">" +
                "\t<p class=\"copy\">这个页面采用MathJax技术来显示数学公式。为了使数学式可用，我们建议使用MathPlayer插件。请访问<a href=\"//www.dessci.com/en/products/mathplayer/download.htm\">MathPlayer下载页面</a> 来为你的浏览器下载插件。</p>" +
                "</div>" +
                "<div class=\"sr message-accessibility message\" id=\"mathplayer-browser-message\" aria-hidden=\"true\">" +
                "\t<p class=\"copy\">" +
                "\t 你的浏览器不支持MathPlayer插件。为了使用MathPlayer，请使用IE6到9兼容浏览器。" +
                "\t </p>" +
                "</div>" +
                "<![endif]-->" +
                "" +
                "" +
                "    " +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "  <header class=\"global slim\" aria-label=\"全局导航\">" +
                "    <nav>" +
                "    <h1 class=\"logo\">" +
                "      <a href=\"/\">" +
                "        " +
                "            <img src=\"http://storage.xuetangx.com/spoc/hbu/logo-header.png\" alt=\"河北大学学堂云\"/>" +
                "        " +
                "      </a>" +
                "    </h1>" +
                "" +
                "        <h2>" +
                "            <span class=\"provider\">TsinghuaX:</span> hbu_2018031901X 习近平新时代中国特色社会主义思想" +
                "        </h2>" +
                "" +
                "    <ol class=\"left nav-global authenticated\">" +
                "      " +
                "          <li class=\"nav-global-01\">" +
                "              <a href=\"/\">查找课程</a>" +
                "          </li>" +
                "      " +
                "    </ol>" +
                "    <ol class=\"user\">" +
                "      <li class=\"primary\">" +
                "        <a href=\"/dashboard\" class=\"user-link\">" +
                "          <span class=\"avatar\"></span>" +
                "          <span class=\"sr\">控制面板： </span> hbu_20182306005" +
                "        </a>" +
                "      </li>" +
                "      <li class=\"primary\">" +
                "        <a href=\"#\" class=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"sr\">更多选择下拉列表</span> &#9662;</a>" +
                "        <ul class=\"dropdown-menu\" aria-label=\"More Options\" role=\"menu\">" +
                "          " +
                "              <li><a href=\"/faq\">帮助</a></li>" +
                "          " +
                "          <li><a href=\"/logout\" role=\"menuitem\">登出</a></li>" +
                "        </ul>" +
                "      </li>" +
                "    </ol>" +
                "  </nav>" +
                "</header>" +
                "<!--[if lte IE 8]>" +
                "<div class=\"ie-banner\" aria-hidden=\"true\"><strong>警告:</strong> 你的浏览器不能完全支持全部功能. 我们强烈建议您使用 <a href=\"https://www.google.com/intl/en/chrome/browser/\" target=\"_blank\">Chrome</a> 或 <a href=\"http://www.mozilla.org/en-US/firefox/new/\" target=\"_blank\">Firefox</a>. 并使用windows 7 以上的系统.</div>" +
                "<![endif]-->" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "    <div class=\"content-wrapper\" id=\"content\">" +
                "      " +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "<input type=\"hidden\" value=\"您的账号在其他设备或浏览器已登录，请重新登录后学习\" id=\"logged_out_msg\">" +
                "" +
                "" +
                "<script type=\"text/template\" id=\"image-modal-tpl\">" +
                "    <div class=\"wrapper-modal wrapper-modal-image\">" +
                "  <section class=\"image-link\">" +
                "    <%= smallHTML%>" +
                "    <a href=\"#\" class=\"modal-ui-icon action-fullscreen\" role=\"button\">" +
                "      <span class=\"label\">" +
                "        <i class=\"icon fa fa-arrows-alt fa-large\"></i> <%= gettext(\"Fullscreen\") %>" +
                "      </span>" +
                "    </a>" +
                "  </section>" +
                "" +
                "  <section class=\"image-modal\">" +
                "    <section class=\"image-content\">" +
                "      <div class=\"image-wrapper\">" +
                "        <img alt=\"<%= largeALT %>, <%= gettext('Large') %>\" src=\"<%= largeSRC %>\" />" +
                "      </div>" +
                "" +
                "      <a href=\"#\" class=\"modal-ui-icon action-close\" role=\"button\">" +
                "        <span class=\"label\">" +
                "          <i class=\"icon fa fa-remove fa-large\"></i> <%= gettext(\"Close\") %>" +
                "        </span>" +
                "      </a>" +
                "" +
                "      <ul class=\"image-controls\">" +
                "        <li class=\"image-control\">" +
                "          <a href=\"#\" class=\"modal-ui-icon action-zoom-in\" role=\"button\">" +
                "            <span class=\"label\">" +
                "              <i class=\"icon fa fa fa-search-plus fa-large\"></i> <%= gettext(\"Zoom In\") %>" +
                "            </span>" +
                "          </a>" +
                "        </li>" +
                "" +
                "        <li class=\"image-control\">" +
                "          <a href=\"#\" class=\"modal-ui-icon action-zoom-out is-disabled\" aria-disabled=\"true\" role=\"button\">" +
                "            <span class=\"label\">" +
                "              <i class=\"icon fa fa fa-search-minus fa-large\"></i> <%= gettext(\"Zoom Out\") %>" +
                "            </span>" +
                "          </a>" +
                "        </li>" +
                "      </ul>" +
                "    </section>" +
                "  </section>" +
                "</div>" +
                "" +
                "</script>" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "  " +
                "" +
                "" +
                "" +
                "    " +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "<nav class=\"courseware wrapper-course-material\">" +
                "  <div class=\"course-material\">" +
                "    <ol class=\"course-tabs\" course_id=\"course-v1:TsinghuaX+hbu_2018031901X+2018_T2\">" +
                "        " +
                "          <li>" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware\" class=\"active\">" +
                "                 课件" +
                "                   <span class=\"sr\">, current location</span>" +
                "             </a>" +
                "          </li>" +
                "        " +
                "          <li>" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/info\" class=\"\">" +
                "                 课程公告" +
                "             </a>" +
                "          </li>" +
                "        " +
                "          <li>" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/discussion/forum\" class=\"\">" +
                "                 讨论区" +
                "             </a>" +
                "          </li>" +
                "        " +
                "          <li>" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/course_wiki\" class=\"\">" +
                "                 Wiki" +
                "             </a>" +
                "          </li>" +
                "        " +
                "          <li>" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/progress\" class=\"\">" +
                "                 学习进度" +
                "             </a>" +
                "          </li>" +
                "      " +
                "    </ol>" +
                "  </div>" +
                "</nav>" +
                "" +
                "<div id=\"qarobot\"></div>" +
                "<script src=\"//storage.xuetangx.com/public_assets/xuetangx/course/qa-robot.190034b7c0af2d862b87.js\" type=\"text/javascript\"></script>" +
                "" +
                "" +
                "<script type=\"text/javascript\">" +
                "  (function(){" +
                "    var courseId = 'course-v1:TsinghuaX+hbu_2018031901X+2018_T2';" +
                "    var showCoursesList = ['course-v1:TsinghuaX+iceeikcest_302401842x+2018_T1', " +
                "                            'course-v1:iceeikcest_MITX+CTDS101+2017_T2', " +
                "                            'course-v1:iceeikcest_MITx+CS_Python101+2017_T1', " +
                "                            'course-v1:UC_Berkeley+CS169_1x+2017_T2'];" +
                "    if(showCoursesList.indexOf(courseId) != -1 && window.location.hostname === \"mooc.engedu.ikcest.org\"){" +
                "        var layerFragment = document.createDocumentFragment();" +
                "        var layerLink = document.createElement(\"a\");" +
                "        layerFragment.appendChild(layerLink);" +
                "        layerLink.href = \"http://micro-diploma.mikecrm.com/FBykBzn\";" +
                "        layerLink.target = \"_blank\";" +
                "        layerLink.style = \"position:fixed;display:block;z-index:999999;width:114px;height:132px;right: 30px;top:50%;margin-top:-80px;\";" +
                "        var layerBOX = document.createElement(\"div\");" +
                "        layerBOX.setAttribute(\"style\", \"position:relative;width:114px;height:132px;background:url(//storagecdn.xuetangx.com/public_assets/xuetangx/UNESCO-spoc/dd9b23d58471efa75136f75b52525b6b.form-entry-114x132.png) center center no-repeat;background-size:100% auto;\");" +
                "        layerLink.appendChild(layerBOX);" +
                "        document.body.appendChild(layerFragment);" +
                "    }" +
                "  })();" +
                "</script>" +
                "" +
                "    " +
                "" +
                "" +
                "<style type=\"text/css\">" +
                "" +
                "/*******************************" +
                "            Button" +
                "*******************************/" +
                "" +
                ".ui.button {" +
                "  cursor: pointer;" +
                "  display: inline-block;" +
                "  min-height: 1em;" +
                "  outline: none;" +
                "  border: none;" +
                "  vertical-align: baseline;" +
                "  background-color: #e0e0e0;" +
                "  color: rgba(0, 0, 0, 0.6);" +
                "  font-family: 'Lato', 'Helvetica Neue', Arial, Helvetica, sans-serif;" +
                "  margin: 0em 0.25em 0em 0em;" +
                "  padding: 0.8em 1.5em 0.8em;" +
                "  text-transform: none;" +
                "  text-shadow: none;" +
                "  font-weight: bold;" +
                "  line-height: 1;" +
                "  font-style: normal;" +
                "  text-align: center;" +
                "  text-decoration: none;" +
                "  background-image: none;" +
                "  border-radius: 0.2857rem;" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "  -webkit-user-select: none;" +
                "     -moz-user-select: none;" +
                "      -ms-user-select: none;" +
                "          user-select: none;" +
                "  -webkit-transition: opacity 0.1s ease, background-color 0.1s ease, color 0.1s ease, box-shadow 0.1s ease, background 0.1s ease;" +
                "          transition: opacity 0.1s ease, background-color 0.1s ease, color 0.1s ease, box-shadow 0.1s ease, background 0.1s ease;" +
                "  -webkit-tap-highlight-color: transparent;" +
                "}" +
                "" +
                "" +
                "/*******************************" +
                "            States" +
                "*******************************/" +
                "" +
                "" +
                "/*--------------" +
                "      Hover" +
                "---------------*/" +
                "" +
                ".ui.button:hover {" +
                "  background-color: #e8e8e8;" +
                "  background-image: none;" +
                "  box-shadow: '';" +
                "  color: rgba(0, 0, 0, 0.8);" +
                "}" +
                ".ui.button:hover .icon {" +
                "  opacity: 0.85;" +
                "}" +
                "" +
                "/*--------------" +
                "      Focus" +
                "---------------*/" +
                "" +
                ".ui.button:focus {" +
                "  background-color: '';" +
                "  background-image: '';" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 0px 1px rgba(81, 167, 232, 0.8) inset, 0px 0px 3px 2px rgba(81, 167, 232, 0.8);" +
                "  color: rgba(0, 0, 0, 0.8);" +
                "}" +
                ".ui.button:focus .icon {" +
                "  opacity: 0.85;" +
                "}" +
                "" +
                "/*--------------" +
                "      Down" +
                "---------------*/" +
                "" +
                ".ui.button:active," +
                ".ui.active.button:active {" +
                "  background-color: #cccccc;" +
                "  background-image: '';" +
                "  color: rgba(0, 0, 0, 0.8);" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 1px 4px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                "" +
                "/*--------------" +
                "     Active" +
                "---------------*/" +
                "" +
                ".ui.active.button {" +
                "  background-color: #d0d0d0;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0px 0px 1px transparent inset;" +
                "  color: rgba(0, 0, 0, 0.8);" +
                "}" +
                ".ui.button.active:hover {" +
                "  background-color: #d0d0d0;" +
                "  background-image: none;" +
                "  color: rgba(0, 0, 0, 0.8);" +
                "}" +
                ".ui.button.active:active {" +
                "  background-color: #d0d0d0;" +
                "  background-image: none;" +
                "}" +
                "" +
                "/*--------------" +
                "    Loading" +
                "---------------*/" +
                "" +
                "" +
                "/* Specificity hack */" +
                ".ui.loading.loading.loading.loading.loading.loading.button {" +
                "  position: relative;" +
                "  cursor: default;" +
                "  point-events: none;" +
                "  text-shadow: none !important;" +
                "  color: transparent !important;" +
                "  -webkit-transition: all 0s linear;" +
                "          transition: all 0s linear;" +
                "}" +
                ".ui.loading.button:before {" +
                "  position: absolute;" +
                "  content: '';" +
                "  top: 50%;" +
                "  left: 50%;" +
                "  margin: -0.64285em 0em 0em -0.64285em;" +
                "  width: 1.2857em;" +
                "  height: 1.2857em;" +
                "  border-radius: 500rem;" +
                "  border: 0.2em solid rgba(0, 0, 0, 0.15);" +
                "}" +
                ".ui.loading.button:after {" +
                "  position: absolute;" +
                "  content: '';" +
                "  top: 50%;" +
                "  left: 50%;" +
                "  margin: -0.64285em 0em 0em -0.64285em;" +
                "  width: 1.2857em;" +
                "  height: 1.2857em;" +
                "  -webkit-animation: button-spin 0.6s linear;" +
                "          animation: button-spin 0.6s linear;" +
                "  -webkit-animation-iteration-count: infinite;" +
                "          animation-iteration-count: infinite;" +
                "  border-radius: 500rem;" +
                "  border-color: #ffffff transparent transparent;" +
                "  border-style: solid;" +
                "  border-width: 0.2em;" +
                "  box-shadow: 0px 0px 0px 1px transparent;" +
                "}" +
                ".ui.labeled.icon.loading.button .icon {" +
                "  background-color: transparent;" +
                "  box-shadow: none;" +
                "}" +
                "@-webkit-keyframes button-spin {" +
                "  from {" +
                "    -webkit-transform: rotate(0deg);" +
                "            transform: rotate(0deg);" +
                "  }" +
                "  to {" +
                "    -webkit-transform: rotate(360deg);" +
                "            transform: rotate(360deg);" +
                "  }" +
                "}" +
                "@keyframes button-spin {" +
                "  from {" +
                "    -webkit-transform: rotate(0deg);" +
                "            transform: rotate(0deg);" +
                "  }" +
                "  to {" +
                "    -webkit-transform: rotate(360deg);" +
                "            transform: rotate(360deg);" +
                "  }" +
                "}" +
                ".ui.basic.loading.button:not(.inverted):before {" +
                "  border-color: rgba(0, 0, 0, 0.1);" +
                "}" +
                ".ui.basic.loading.button:not(.inverted):after {" +
                "  border-top-color: #aaaaaa;" +
                "}" +
                "" +
                "/*-------------------" +
                "      Disabled" +
                "--------------------*/" +
                "" +
                ".ui.buttons .disabled.button," +
                ".ui.disabled.button," +
                ".ui.disabled.button:hover," +
                ".ui.disabled.button.active {" +
                "  cursor: default;" +
                "  background-color: #dcddde !important;" +
                "  color: rgba(0, 0, 0, 0.4) !important;" +
                "  opacity: 0.3 !important;" +
                "  background-image: none !important;" +
                "  box-shadow: none !important;" +
                "  pointer-events: none;" +
                "}" +
                "" +
                "" +
                "/*******************************" +
                "             Types" +
                "*******************************/" +
                "" +
                "" +
                "/*-------------------" +
                "       Animated" +
                "--------------------*/" +
                "" +
                ".ui.animated.button {" +
                "  position: relative;" +
                "  overflow: hidden;" +
                "  padding-right: 0em !important;" +
                "}" +
                ".ui.animated.button .content {" +
                "  will-change: transform, opacity;" +
                "}" +
                ".ui.animated.button .visible.content {" +
                "  position: relative;" +
                "  margin-right: 1.5em;" +
                "}" +
                ".ui.animated.button .hidden.content {" +
                "  position: absolute;" +
                "  width: 100%;" +
                "}" +
                "" +
                "/* Horizontal */" +
                ".ui.animated.button .visible.content," +
                ".ui.animated.button .hidden.content {" +
                "  -webkit-transition: right 0.3s ease 0s;" +
                "          transition: right 0.3s ease 0s;" +
                "}" +
                ".ui.animated.button .visible.content {" +
                "  left: auto;" +
                "  right: 0%;" +
                "}" +
                ".ui.animated.button .hidden.content {" +
                "  top: 50%;" +
                "  left: auto;" +
                "  right: -100%;" +
                "  margin-top: -0.5em;" +
                "}" +
                ".ui.animated.button:hover .visible.content {" +
                "  left: auto;" +
                "  right: 200%;" +
                "}" +
                ".ui.animated.button:hover .hidden.content {" +
                "  left: auto;" +
                "  right: 0%;" +
                "}" +
                "" +
                "/* Vertical */" +
                ".ui.vertical.animated.button .visible.content," +
                ".ui.vertical.animated.button .hidden.content {" +
                "  -webkit-transition: top 0.3s ease, -webkit-transform 0.3s ease;" +
                "          transition: top 0.3s ease, transform 0.3s ease;" +
                "}" +
                ".ui.vertical.animated.button .visible.content {" +
                "  -webkit-transform: translateY(0%);" +
                "      -ms-transform: translateY(0%);" +
                "          transform: translateY(0%);" +
                "  right: auto;" +
                "}" +
                ".ui.vertical.animated.button .hidden.content {" +
                "  top: -50%;" +
                "  left: 0%;" +
                "  right: auto;" +
                "}" +
                ".ui.vertical.animated.button:hover .visible.content {" +
                "  -webkit-transform: translateY(200%);" +
                "      -ms-transform: translateY(200%);" +
                "          transform: translateY(200%);" +
                "  right: auto;" +
                "}" +
                ".ui.vertical.animated.button:hover .hidden.content {" +
                "  top: 50%;" +
                "  right: auto;" +
                "}" +
                "" +
                "/* Fade */" +
                ".ui.fade.animated.button .visible.content," +
                ".ui.fade.animated.button .hidden.content {" +
                "  -webkit-transition: opacity 0.3s ease, -webkit-transform 0.3s ease;" +
                "          transition: opacity 0.3s ease, transform 0.3s ease;" +
                "}" +
                ".ui.fade.animated.button .visible.content {" +
                "  left: auto;" +
                "  right: auto;" +
                "  opacity: 1;" +
                "  -webkit-transform: scale(1);" +
                "      -ms-transform: scale(1);" +
                "          transform: scale(1);" +
                "}" +
                ".ui.fade.animated.button .hidden.content {" +
                "  opacity: 0;" +
                "  left: 0%;" +
                "  right: auto;" +
                "  -webkit-transform: scale(1.5);" +
                "      -ms-transform: scale(1.5);" +
                "          transform: scale(1.5);" +
                "}" +
                ".ui.fade.animated.button:hover .visible.content {" +
                "  left: auto;" +
                "  right: auto;" +
                "  opacity: 0;" +
                "  -webkit-transform: scale(0.75);" +
                "      -ms-transform: scale(0.75);" +
                "          transform: scale(0.75);" +
                "}" +
                ".ui.fade.animated.button:hover .hidden.content {" +
                "  left: 0%;" +
                "  right: auto;" +
                "  opacity: 1;" +
                "  -webkit-transform: scale(1);" +
                "      -ms-transform: scale(1);" +
                "          transform: scale(1);" +
                "}" +
                "" +
                "/*-------------------" +
                "       Inverted" +
                "--------------------*/" +
                "" +
                ".ui.inverted.button {" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;" +
                "  background: transparent none;" +
                "  color: #ffffff;" +
                "  text-shadow: none !important;" +
                "}" +
                ".ui.inverted.buttons .button {" +
                "  margin: 0px 0px 0px -2px;" +
                "}" +
                ".ui.inverted.buttons .button:first-child {" +
                "  margin-left: 0em;" +
                "}" +
                ".ui.inverted.vertical.buttons .button {" +
                "  margin: 0px 0px -2px 0px;" +
                "}" +
                ".ui.inverted.vertical.buttons .button:first-child {" +
                "  margin-top: 0em;" +
                "}" +
                ".ui.inverted.buttons .button:hover {" +
                "  position: relative;" +
                "}" +
                ".ui.inverted.button:hover {" +
                "  background: #ffffff;" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;" +
                "  color: rgba(0, 0, 0, 0.8);" +
                "}" +
                "" +
                "/*-------------------" +
                "       Social" +
                "--------------------*/" +
                "" +
                "" +
                "/* Facebook */" +
                ".ui.facebook.button {" +
                "  background-color: #3b579d;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.facebook.button:hover {" +
                "  background-color: #3f5da8;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.facebook.button:active {" +
                "  background-color: #314983;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Twitter */" +
                ".ui.twitter.button {" +
                "  background-color: #4092cc;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.twitter.button:hover {" +
                "  background-color: #4c99cf;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.twitter.button:active {" +
                "  background-color: #3180b7;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Google Plus */" +
                ".ui.google.plus.button {" +
                "  background-color: #d34836;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.google.plus.button:hover {" +
                "  background-color: #d65343;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.google.plus.button:active {" +
                "  background-color: #bc3a29;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Linked In */" +
                ".ui.linkedin.button {" +
                "  background-color: #1f88be;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.linkedin.button:hover {" +
                "  background-color: #2191cb;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.linkedin.button:active {" +
                "  background-color: #1a729f;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* YouTube */" +
                ".ui.youtube.button {" +
                "  background-color: #cc181e;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.youtube.button:hover {" +
                "  background-color: #da1a20;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.youtube.button:active {" +
                "  background-color: #ac1419;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Instagram */" +
                ".ui.instagram.button {" +
                "  background-color: #49769c;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.instagram.button:hover {" +
                "  background-color: #4e7ea6;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.instagram.button:active {" +
                "  background-color: #3e6484;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Pinterest */" +
                ".ui.pinterest.button {" +
                "  background-color: #00aced;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.pinterest.button:hover {" +
                "  background-color: #00b7fc;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.pinterest.button:active {" +
                "  background-color: #0092c9;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* VK */" +
                ".ui.vk.button {" +
                "  background-color: #4D7198;" +
                "  color: #ffffff;" +
                "  background-image: none;" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.vk.button:hover {" +
                "  background-color: #5279a2;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.vk.button:active {" +
                "  background-color: #415f80;" +
                "  color: #ffffff;" +
                "}" +
                "" +
                "/*--------------" +
                "     Icon" +
                "---------------*/" +
                "" +
                ".ui.button > .icon {" +
                "  opacity: 0.8;" +
                "  margin: 0em 0.4em 0em -0.2em;" +
                "  -webkit-transition: opacity 0.2s ease;" +
                "          transition: opacity 0.2s ease;" +
                "  vertical-align: baseline;" +
                "  color: '';" +
                "}" +
                ".ui.button > .right.icon {" +
                "  margin: 0em -0.2em 0em 0.4em;" +
                "}" +
                "" +
                "" +
                "/*******************************" +
                "           Variations" +
                "*******************************/" +
                "" +
                "" +
                "/*-------------------" +
                "       Floated" +
                "--------------------*/" +
                "" +
                ".ui[class*=\"left floated\"].buttons," +
                ".ui[class*=\"left floated\"].button {" +
                "  float: left;" +
                "  margin-left: 0em;" +
                "  margin-right: 0.25em;" +
                "}" +
                ".ui[class*=\"right floated\"].buttons," +
                ".ui[class*=\"right floated\"].button {" +
                "  float: right;" +
                "  margin-right: 0em;" +
                "  margin-left: 0.25em;" +
                "}" +
                "" +
                "/*-------------------" +
                "       Compact" +
                "--------------------*/" +
                "" +
                ".ui.compact.buttons .button," +
                ".ui.compact.button {" +
                "  padding: 0.6em 1.125em 0.6em;" +
                "}" +
                ".ui.compact.icon.buttons .button," +
                ".ui.compact.icon.button {" +
                "  padding: 0.6em 0.6em 0.6em;" +
                "}" +
                ".ui.compact.labeled.icon.buttons .button," +
                ".ui.compact.labeled.icon.button {" +
                "  padding: 0.6em 3.725em 0.6em;" +
                "}" +
                "" +
                "/*-------------------" +
                "        Sizes" +
                "--------------------*/" +
                "" +
                ".ui.mini.buttons .button," +
                ".ui.mini.buttons .or," +
                ".ui.mini.button {" +
                "  font-size: 0.71428571rem;" +
                "}" +
                ".ui.tiny.buttons .button," +
                ".ui.tiny.buttons .or," +
                ".ui.tiny.button {" +
                "  font-size: 0.85714286rem;" +
                "}" +
                ".ui.small.buttons .button," +
                ".ui.small.buttons .or," +
                ".ui.small.button {" +
                "  font-size: 0.92857143rem;" +
                "}" +
                ".ui.buttons .button," +
                ".ui.buttons .or," +
                ".ui.button {" +
                "  font-size: 1rem;" +
                "}" +
                ".ui.large.buttons .button," +
                ".ui.large.buttons .or," +
                ".ui.large.button {" +
                "  font-size: 1.14285714rem;" +
                "}" +
                ".ui.big.buttons .button," +
                ".ui.big.buttons .or," +
                ".ui.big.button {" +
                "  font-size: 1.28571429rem;" +
                "}" +
                ".ui.huge.buttons .button," +
                ".ui.huge.buttons .or," +
                ".ui.huge.button {" +
                "  font-size: 1.42857143rem;" +
                "}" +
                ".ui.massive.buttons .button," +
                ".ui.massive.buttons .or," +
                ".ui.massive.button {" +
                "  font-size: 1.71428571rem;" +
                "}" +
                "" +
                "/*--------------" +
                "    Icon Only" +
                "---------------*/" +
                "" +
                ".ui.icon.buttons .button," +
                ".ui.icon.button {" +
                "  padding: 0.8em 0.8em 0.8em;" +
                "}" +
                ".ui.icon.buttons .button > .icon," +
                ".ui.icon.button > .icon {" +
                "  opacity: 0.9;" +
                "  margin: 0em;" +
                "  vertical-align: top;" +
                "}" +
                "" +
                "/*-------------------" +
                "        Basic" +
                "--------------------*/" +
                "" +
                ".ui.basic.buttons .button," +
                ".ui.basic.button {" +
                "  background: transparent !important;" +
                "  background-image: none;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "  font-weight: normal;" +
                "  border-radius: 0.2857rem;" +
                "  text-transform: none;" +
                "  text-shadow: none !important;" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.basic.buttons {" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15);" +
                "  border-radius: 0.2857rem;" +
                "}" +
                ".ui.basic.buttons .button {" +
                "  border-radius: 0em;" +
                "}" +
                ".ui.basic.buttons .button:hover," +
                ".ui.basic.button:hover {" +
                "  background: #fafafa !important;" +
                "  color: rgba(0, 0, 0, 0.8) !important;" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) inset, 0px 0px 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.basic.buttons .button:active," +
                ".ui.basic.button:active {" +
                "  background: #f8f8f8 !important;" +
                "  color: rgba(0, 0, 0, 0.8) !important;" +
                "  box-shadow: 0px 0px 0px 1px rgba(0, 0, 0, 0.15) inset, 0px 1px 4px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.basic.buttons .button.active," +
                ".ui.basic.button.active {" +
                "  background: rgba(0, 0, 0, 0.05) !important;" +
                "  box-shadow: '' !important;" +
                "  color: rgba(0, 0, 0, 0.8);" +
                "  box-shadow: rgba(39, 41, 43, 0.3);" +
                "}" +
                ".ui.basic.buttons .button.active:hover," +
                ".ui.basic.button.active:hover {" +
                "  background-color: rgba(0, 0, 0, 0.05);" +
                "}" +
                "" +
                "/* Vertical */" +
                ".ui.basic.buttons .button:hover {" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) inset, 0px 0px 0px 0px rgba(39, 41, 43, 0.15) inset inset;" +
                "}" +
                ".ui.basic.buttons .button:active {" +
                "  box-shadow: 0px 0px 0px 1px rgba(0, 0, 0, 0.15) inset, 0px 1px 4px 0px rgba(39, 41, 43, 0.15) inset inset;" +
                "}" +
                ".ui.basic.buttons .button.active {" +
                "  box-shadow: rgba(39, 41, 43, 0.3) inset;" +
                "}" +
                "" +
                "/* Standard Basic Inverted */" +
                ".ui.basic.inverted.buttons .button," +
                ".ui.basic.inverted.button {" +
                "  background-color: transparent !important;" +
                "  color: #fafafa !important;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "}" +
                ".ui.basic.inverted.buttons .button:hover," +
                ".ui.basic.inverted.button:hover {" +
                "  color: #ffffff !important;" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;" +
                "}" +
                ".ui.basic.inverted.buttons .button:active," +
                ".ui.basic.inverted.button:active {" +
                "  background-color: rgba(255, 255, 255, 0.05) !important;" +
                "  color: #ffffff !important;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.9) inset !important;" +
                "}" +
                ".ui.basic.inverted.buttons .button.active," +
                ".ui.basic.inverted.button.active {" +
                "  background-color: rgba(255, 255, 255, 0.05);" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.7) inset;" +
                "}" +
                ".ui.basic.inverted.buttons .button.active:hover," +
                ".ui.basic.inverted.button.active:hover {" +
                "  background-color: rgba(255, 255, 255, 0.07);" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;" +
                "}" +
                "" +
                "/* Basic Group */" +
                ".ui.basic.buttons .button {" +
                "  border-left: 1px solid rgba(39, 41, 43, 0.15);" +
                "  box-shadow: none;" +
                "}" +
                ".ui.basic.vertical.buttons .button {" +
                "  border-left: none;" +
                "}" +
                "" +
                "/*--------------" +
                "  Labeled Icon" +
                "---------------*/" +
                "" +
                ".ui.labeled.icon.buttons .button," +
                ".ui.labeled.icon.button {" +
                "  position: relative;" +
                "  padding-left: 4.1em !important;" +
                "  padding-right: 1.5em !important;" +
                "}" +
                "" +
                "/* Left Labeled */" +
                ".ui.labeled.icon.buttons > .button > .icon," +
                ".ui.labeled.icon.button > .icon {" +
                "  position: absolute;" +
                "  width: 2.6em;" +
                "  height: 100%;" +
                "  background-color: rgba(0, 0, 0, 0.05);" +
                "  text-align: center;" +
                "  color: '';" +
                "  border-radius: 0.2857rem 0px 0px 0.2857rem;" +
                "  line-height: 1;" +
                "  box-shadow: -1px 0px 0px 0px transparent inset;" +
                "}" +
                "" +
                "/* Left Labeled */" +
                ".ui.labeled.icon.buttons > .button > .icon," +
                ".ui.labeled.icon.button > .icon {" +
                "  top: 0em;" +
                "  left: 0em;" +
                "}" +
                "" +
                "/* Right Labeled */" +
                ".ui[class*=\"right labeled\"].icon.button {" +
                "  padding-right: 4.1em !important;" +
                "  padding-left: 1.5em !important;" +
                "}" +
                ".ui[class*=\"right labeled\"].icon.button > .icon {" +
                "  left: auto;" +
                "  right: 0em;" +
                "  border-radius: 0em 0.2857rem 0.2857rem 0em;" +
                "  box-shadow: 1px 0px 0px 0px transparent inset;" +
                "}" +
                ".ui.labeled.icon.buttons > .button > .icon:before," +
                ".ui.labeled.icon.button > .icon:before," +
                ".ui.labeled.icon.buttons > .button > .icon:after," +
                ".ui.labeled.icon.button > .icon:after {" +
                "  display: block;" +
                "  position: absolute;" +
                "  width: 100%;" +
                "  top: 50%;" +
                "  text-align: center;" +
                "  margin-top: -0.5em;" +
                "}" +
                ".ui.labeled.icon.buttons .button > .icon {" +
                "  border-radius: 0em;" +
                "}" +
                ".ui.labeled.icon.buttons .button:first-child > .icon {" +
                "  border-top-left-radius: 0.2857rem;" +
                "  border-bottom-left-radius: 0.2857rem;" +
                "}" +
                ".ui.labeled.icon.buttons .button:last-child > .icon {" +
                "  border-top-right-radius: 0.2857rem;" +
                "  border-bottom-right-radius: 0.2857rem;" +
                "}" +
                ".ui.vertical.labeled.icon.buttons .button:first-child > .icon {" +
                "  border-radius: 0em;" +
                "  border-top-left-radius: 0.2857rem;" +
                "}" +
                ".ui.vertical.labeled.icon.buttons .button:last-child > .icon {" +
                "  border-radius: 0em;" +
                "  border-bottom-left-radius: 0.2857rem;" +
                "}" +
                "" +
                "/* Fluid Labeled */" +
                ".ui.fluid[class*=\"left labeled\"].icon.button," +
                ".ui.fluid[class*=\"right labeled\"].icon.button {" +
                "  padding-left: 1.5em !important;" +
                "  padding-right: 1.5em !important;" +
                "}" +
                "" +
                "/*--------------" +
                "     Toggle" +
                "---------------*/" +
                "" +
                "" +
                "/* Toggle (Modifies active state to give affordances) */" +
                ".ui.toggle.buttons .active.button," +
                ".ui.buttons .button.toggle.active," +
                ".ui.button.toggle.active {" +
                "  background-color: #5bbd72 !important;" +
                "  box-shadow: none !important;" +
                "  text-shadow: none;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.button.toggle.active:hover {" +
                "  background-color: #66c17b !important;" +
                "  text-shadow: none;" +
                "  color: #ffffff !important;" +
                "}" +
                "" +
                "/*--------------" +
                "    Circular" +
                "---------------*/" +
                "" +
                ".ui.circular.button {" +
                "  border-radius: 10em;" +
                "}" +
                ".ui.circular.button > .icon {" +
                "  width: 1em;" +
                "  vertical-align: baseline;" +
                "}" +
                "" +
                "/*--------------" +
                "     Attached" +
                "---------------*/" +
                "" +
                ".ui.attached.button {" +
                "  display: block;" +
                "  margin: 0em;" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) !important;" +
                "  border-radius: 0em;" +
                "}" +
                ".ui.attached.top.button {" +
                "  border-radius: 0.2857rem 0.2857rem 0em 0em;" +
                "}" +
                ".ui.attached.bottom.button {" +
                "  border-radius: 0em 0em 0.2857rem 0.2857rem;" +
                "}" +
                ".ui.attached.left.button {" +
                "  display: inline-block;" +
                "  border-left: none;" +
                "  padding-right: 0.75em;" +
                "  text-align: right;" +
                "  border-radius: 0.2857rem 0em 0em 0.2857rem;" +
                "}" +
                ".ui.attached.right.button {" +
                "  display: inline-block;" +
                "  padding-left: 0.75em;" +
                "  text-align: left;" +
                "  border-radius: 0em 0.2857rem 0.2857rem 0em;" +
                "}" +
                "" +
                "/*-------------------" +
                "      Or Buttons" +
                "--------------------*/" +
                "" +
                ".ui.buttons .or {" +
                "  position: relative;" +
                "  float: left;" +
                "  width: 0.3em;" +
                "  height: 2.6em;" +
                "  z-index: 3;" +
                "}" +
                ".ui.buttons .or:before {" +
                "  position: absolute;" +
                "  content: 'or';" +
                "  top: 50%;" +
                "  left: 50%;" +
                "  background-color: #ffffff;" +
                "  text-shadow: none;" +
                "  margin-top: -0.9em;" +
                "  margin-left: -0.9em;" +
                "  width: 1.8em;" +
                "  height: 1.8em;" +
                "  line-height: 1.6em;" +
                "  color: rgba(0, 0, 0, 0.4);" +
                "  font-style: normal;" +
                "  font-weight: bold;" +
                "  text-align: center;" +
                "  border-radius: 500em;" +
                "  box-shadow: 0px 0px 0px 1px transparent inset;" +
                "}" +
                ".ui.buttons .or[data-text]:before {" +
                "  content: attr(data-text);" +
                "}" +
                "" +
                "/* Fluid Or */" +
                ".ui.fluid.buttons .or {" +
                "  width: 0em !important;" +
                "}" +
                ".ui.fluid.buttons .or:after {" +
                "  display: none;" +
                "}" +
                "" +
                "/*-------------------" +
                "       Attached" +
                "--------------------*/" +
                "" +
                "" +
                "/* Plural Attached */" +
                ".attached.ui.buttons {" +
                "  margin: 0px;" +
                "  border-radius: 0em 0em 0em 0em;" +
                "}" +
                ".attached.ui.buttons .button {" +
                "  margin: 0em;" +
                "}" +
                ".attached.ui.buttons .button:first-child {" +
                "  border-radius: 0em 0em 0em 0em;" +
                "}" +
                ".attached.ui.buttons .button:last-child {" +
                "  border-radius: 0em 0em 0em 0em;" +
                "}" +
                "" +
                "/* Top Side */" +
                "[class*=\"top attached\"].ui.buttons {" +
                "  margin-bottom: -1px;" +
                "  border-radius: 0.2857rem 0.2857rem 0em 0em;" +
                "}" +
                "[class*=\"top attached\"].ui.buttons .button:first-child {" +
                "  border-radius: 0.2857rem 0em 0em 0em;" +
                "}" +
                "[class*=\"top attached\"].ui.buttons .button:last-child {" +
                "  border-radius: 0em 0.2857rem 0em 0em;" +
                "}" +
                "" +
                "/* Bottom Side */" +
                "[class*=\"bottom attached\"].ui.buttons {" +
                "  margin-top: -1px;" +
                "  border-radius: 0em 0em 0.2857rem 0.2857rem;" +
                "}" +
                "[class*=\"bottom attached\"].ui.buttons .button:first-child {" +
                "  border-radius: 0em 0em 0em 0.2857rem;" +
                "}" +
                "[class*=\"bottom attached\"].ui.buttons .button:last-child {" +
                "  border-radius: 0em 0em 0.2857rem 0em;" +
                "}" +
                "" +
                "/* Left Side */" +
                "[class*=\"left attached\"].ui.buttons {" +
                "  margin-left: -1px;" +
                "  border-radius: 0em 0.2857rem 0.2857rem 0em;" +
                "}" +
                "[class*=\"left attached\"].ui.buttons .button:first-child {" +
                "  margin-left: -1px;" +
                "  border-radius: 0em 0.2857rem 0em 0em;" +
                "}" +
                "[class*=\"left attached\"].ui.buttons .button:last-child {" +
                "  margin-left: -1px;" +
                "  border-radius: 0em 0em 0.2857rem 0em;" +
                "}" +
                "" +
                "/* Right Side */" +
                "[class*=\"right attached\"].ui.buttons," +
                "[class*=\"right attached\"].ui.buttons .button {" +
                "  margin-right: -1px;" +
                "  border-radius: 0.2857rem 0em 0em 0.2857rem;" +
                "}" +
                "[class*=\"right attached\"].ui.buttons .button:first-child {" +
                "  margin-left: -1px;" +
                "  border-radius: 0.2857rem 0em 0em 0em;" +
                "}" +
                "[class*=\"right attached\"].ui.buttons .button:last-child {" +
                "  margin-left: -1px;" +
                "  border-radius: 0em 0em 0em 0.2857rem;" +
                "}" +
                "" +
                "/* Fluid */" +
                ".ui.fluid.buttons," +
                ".ui.button.fluid," +
                ".ui.fluid.buttons > .button {" +
                "  display: block;" +
                "  width: 100%;" +
                "}" +
                ".ui.\\32.buttons," +
                ".ui.two.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\32.buttons > .button," +
                ".ui.two.buttons > .button {" +
                "  width: 50%;" +
                "}" +
                ".ui.\\33.buttons," +
                ".ui.three.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\33.buttons > .button," +
                ".ui.three.buttons > .button {" +
                "  width: 33.333%;" +
                "}" +
                ".ui.\\34.buttons," +
                ".ui.four.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\34.buttons > .button," +
                ".ui.four.buttons > .button {" +
                "  width: 25%;" +
                "}" +
                ".ui.\\35.buttons," +
                ".ui.five.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\35.buttons > .button," +
                ".ui.five.buttons > .button {" +
                "  width: 20%;" +
                "}" +
                ".ui.\\36.buttons," +
                ".ui.six.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\36.buttons > .button," +
                ".ui.six.buttons > .button {" +
                "  width: 16.666%;" +
                "}" +
                ".ui.\\37.buttons," +
                ".ui.seven.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\37.buttons > .button," +
                ".ui.seven.buttons > .button {" +
                "  width: 14.285%;" +
                "}" +
                ".ui.\\38.buttons," +
                ".ui.eight.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\38.buttons > .button," +
                ".ui.eight.buttons > .button {" +
                "  width: 12.500%;" +
                "}" +
                ".ui.\\39.buttons," +
                ".ui.nine.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\39.buttons > .button," +
                ".ui.nine.buttons > .button {" +
                "  width: 11.11%;" +
                "}" +
                ".ui.\\31\\30.buttons," +
                ".ui.ten.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\31\\30.buttons > .button," +
                ".ui.ten.buttons > .button {" +
                "  width: 10%;" +
                "}" +
                ".ui.\\31\\31.buttons," +
                ".ui.eleven.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\31\\31.buttons > .button," +
                ".ui.eleven.buttons > .button {" +
                "  width: 9.09%;" +
                "}" +
                ".ui.\\31\\32.buttons," +
                ".ui.twelve.buttons {" +
                "  width: 100%;" +
                "}" +
                ".ui.\\31\\32.buttons > .button," +
                ".ui.twelve.buttons > .button {" +
                "  width: 8.3333%;" +
                "}" +
                "" +
                "/* Fluid Vertical Buttons */" +
                ".ui.fluid.vertical.buttons," +
                ".ui.fluid.vertical.buttons > .button {" +
                "  display: block;" +
                "  width: auto;" +
                "}" +
                ".ui.\\32.vertical.buttons > .button," +
                ".ui.two.vertical.buttons > .button {" +
                "  height: 50%;" +
                "}" +
                ".ui.\\33.vertical.buttons > .button," +
                ".ui.three.vertical.buttons > .button {" +
                "  height: 33.333%;" +
                "}" +
                ".ui.\\34.vertical.buttons > .button," +
                ".ui.four.vertical.buttons > .button {" +
                "  height: 25%;" +
                "}" +
                ".ui.\\35.vertical.buttons > .button," +
                ".ui.five.vertical.buttons > .button {" +
                "  height: 20%;" +
                "}" +
                ".ui.\\36.vertical.buttons > .button," +
                ".ui.six.vertical.buttons > .button {" +
                "  height: 16.666%;" +
                "}" +
                ".ui.\\37.vertical.buttons > .button," +
                ".ui.seven.vertical.buttons > .button {" +
                "  height: 14.285%;" +
                "}" +
                ".ui.\\38.vertical.buttons > .button," +
                ".ui.eight.vertical.buttons > .button {" +
                "  height: 12.500%;" +
                "}" +
                ".ui.\\39.vertical.buttons > .button," +
                ".ui.nine.vertical.buttons > .button {" +
                "  height: 11.11%;" +
                "}" +
                ".ui.\\31\\30.vertical.buttons > .button," +
                ".ui.ten.vertical.buttons > .button {" +
                "  height: 10%;" +
                "}" +
                ".ui.\\31\\31.vertical.buttons > .button," +
                ".ui.eleven.vertical.buttons > .button {" +
                "  height: 9.09%;" +
                "}" +
                ".ui.\\31\\32.vertical.buttons > .button," +
                ".ui.twelve.vertical.buttons > .button {" +
                "  height: 8.3333%;" +
                "}" +
                "" +
                "/*-------------------" +
                "       Colors" +
                "--------------------*/" +
                "" +
                "" +
                "/*--- Black ---*/" +
                "" +
                ".ui.black.buttons .button," +
                ".ui.black.button {" +
                "  background-color: #1b1c1d;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.black.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.black.buttons .button:hover," +
                ".ui.black.button:hover {" +
                "  background-color: #1b1c1d;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.black.buttons .button:active," +
                ".ui.black.button:active {" +
                "  background-color: #0a0a0b;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.black.buttons .button.active," +
                ".ui.black.buttons .button.active:active," +
                ".ui.black.button.active," +
                ".ui.black.button .button.active:active {" +
                "  background-color: #0f0f10;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.black.buttons .button," +
                ".ui.basic.black.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.black.buttons .button:hover," +
                ".ui.basic.black.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #1b1c1d inset !important;" +
                "  color: #1b1c1d !important;" +
                "}" +
                ".ui.basic.black.buttons .button:active," +
                ".ui.basic.black.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #0a0a0b inset !important;" +
                "  color: #0a0a0b !important;" +
                "}" +
                ".ui.basic.black.buttons .button.active," +
                ".ui.basic.black.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #0a0a0b inset !important;" +
                "  color: #0a0a0b !important;" +
                "}" +
                ".ui.buttons > .basic.black.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.black.buttons .button," +
                ".ui.inverted.black.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #d4d4d5 inset !important;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.black.buttons .button:hover," +
                ".ui.inverted.black.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;" +
                "  background-color: #333333;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.black.buttons .button.active," +
                ".ui.inverted.black.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;" +
                "  background-color: #333333;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.black.buttons .button:active," +
                ".ui.inverted.black.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #212121 inset !important;" +
                "  background-color: #212121;" +
                "  color: #ffffff;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.black.basic.buttons .button," +
                ".ui.inverted.black.buttons .basic.button," +
                ".ui.inverted.black.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.black.basic.buttons .button:hover," +
                ".ui.inverted.black.buttons .basic.button:hover," +
                ".ui.inverted.black.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.black.basic.buttons .button.active," +
                ".ui.inverted.black.buttons .basic.button.active," +
                ".ui.inverted.black.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.black.basic.buttons .button:active," +
                ".ui.inverted.black.buttons .basic.button:active," +
                ".ui.inverted.black.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #212121 inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                "" +
                "/*--- Blue ---*/" +
                "" +
                ".ui.blue.buttons .button," +
                ".ui.blue.button {" +
                "  background-color: #3b83c0;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.blue.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.blue.buttons .button:hover," +
                ".ui.blue.button:hover {" +
                "  background-color: #458ac6;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.blue.buttons .button:active," +
                ".ui.blue.button:active {" +
                "  background-color: #3370a5;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.blue.buttons .button.active," +
                ".ui.blue.buttons .button.active:active," +
                ".ui.blue.button.active," +
                ".ui.blue.button .button.active:active {" +
                "  background-color: #3576ac;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.blue.buttons .button," +
                ".ui.basic.blue.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.blue.buttons .button:hover," +
                ".ui.basic.blue.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #458ac6 inset !important;" +
                "  color: #458ac6 !important;" +
                "}" +
                ".ui.basic.blue.buttons .button:active," +
                ".ui.basic.blue.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #3370a5 inset !important;" +
                "  color: #3370a5 !important;" +
                "}" +
                ".ui.basic.blue.buttons .button.active," +
                ".ui.basic.blue.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #3370a5 inset !important;" +
                "  color: #3370a5 !important;" +
                "}" +
                ".ui.buttons > .basic.blue.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.blue.buttons .button," +
                ".ui.inverted.blue.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;" +
                "  color: #54c8ff;" +
                "}" +
                ".ui.inverted.blue.buttons .button:hover," +
                ".ui.inverted.blue.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;" +
                "  background-color: #54c8ff;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.blue.buttons .button.active," +
                ".ui.inverted.blue.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;" +
                "  background-color: #54c8ff;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.blue.buttons .button:active," +
                ".ui.inverted.blue.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #30bdff inset !important;" +
                "  background-color: #30bdff;" +
                "  color: #ffffff;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.blue.basic.buttons .button," +
                ".ui.inverted.blue.buttons .basic.button," +
                ".ui.inverted.blue.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.blue.basic.buttons .button:hover," +
                ".ui.inverted.blue.buttons .basic.button:hover," +
                ".ui.inverted.blue.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;" +
                "  color: #54c8ff !important;" +
                "}" +
                ".ui.inverted.blue.basic.buttons .button.active," +
                ".ui.inverted.blue.buttons .basic.button.active," +
                ".ui.inverted.blue.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;" +
                "  color: #54c8ff !important;" +
                "}" +
                ".ui.inverted.blue.basic.buttons .button:active," +
                ".ui.inverted.blue.buttons .basic.button:active," +
                ".ui.inverted.blue.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #30bdff inset !important;" +
                "  color: #54c8ff !important;" +
                "}" +
                "" +
                "/*--- Green ---*/" +
                "" +
                ".ui.green.buttons .button," +
                ".ui.green.button {" +
                "  background-color: #5bbd72;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.green.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.green.buttons .button:hover," +
                ".ui.green.button:hover {" +
                "  background-color: #66c17b;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.green.buttons .button:active," +
                ".ui.green.button:active {" +
                "  background-color: #46ae5f;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.green.buttons .button.active," +
                ".ui.green.buttons .button.active:active," +
                ".ui.green.button.active," +
                ".ui.green.button .button.active:active {" +
                "  background-color: #49b562;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.green.buttons .button," +
                ".ui.basic.green.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.green.buttons .button:hover," +
                ".ui.basic.green.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #66c17b inset !important;" +
                "  color: #66c17b !important;" +
                "}" +
                ".ui.basic.green.buttons .button:active," +
                ".ui.basic.green.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #46ae5f inset !important;" +
                "  color: #46ae5f !important;" +
                "}" +
                ".ui.basic.green.buttons .button.active," +
                ".ui.basic.green.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #46ae5f inset !important;" +
                "  color: #46ae5f !important;" +
                "}" +
                ".ui.buttons > .basic.green.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.green.buttons .button," +
                ".ui.inverted.green.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;" +
                "  color: #2ecc40;" +
                "}" +
                ".ui.inverted.green.buttons .button:hover," +
                ".ui.inverted.green.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;" +
                "  background-color: #2ecc40;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.green.buttons .button.active," +
                ".ui.inverted.green.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;" +
                "  background-color: #2ecc40;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.green.buttons .button:active," +
                ".ui.inverted.green.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #27af37 inset !important;" +
                "  background-color: #27af37;" +
                "  color: #ffffff;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.green.basic.buttons .button," +
                ".ui.inverted.green.buttons .basic.button," +
                ".ui.inverted.green.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.green.basic.buttons .button:hover," +
                ".ui.inverted.green.buttons .basic.button:hover," +
                ".ui.inverted.green.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;" +
                "  color: #2ecc40 !important;" +
                "}" +
                ".ui.inverted.green.basic.buttons .button.active," +
                ".ui.inverted.green.buttons .basic.button.active," +
                ".ui.inverted.green.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;" +
                "  color: #2ecc40 !important;" +
                "}" +
                ".ui.inverted.green.basic.buttons .button:active," +
                ".ui.inverted.green.buttons .basic.button:active," +
                ".ui.inverted.green.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #27af37 inset !important;" +
                "  color: #2ecc40 !important;" +
                "}" +
                "" +
                "/*--- Orange ---*/" +
                "" +
                ".ui.orange.buttons .button," +
                ".ui.orange.button {" +
                "  background-color: $orange;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.orange.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.orange.buttons .button:hover," +
                ".ui.orange.button:hover {" +
                "  background-color: $orange_dark;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.orange.buttons .button:active," +
                ".ui.orange.button:active {" +
                "  background-color: $orange_dark;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.orange.buttons .button.active," +
                ".ui.orange.buttons .button.active:active," +
                ".ui.orange.button.active," +
                ".ui.orange.button .button.active:active {" +
                "  background-color: #0f0f10;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.orange.buttons .button," +
                ".ui.basic.orange.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.orange.buttons .button:hover," +
                ".ui.basic.orange.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #e28560 inset !important;" +
                "  color: #e28560 !important;" +
                "}" +
                ".ui.basic.orange.buttons .button:active," +
                ".ui.basic.orange.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #db6435 inset !important;" +
                "  color: #db6435 !important;" +
                "}" +
                ".ui.basic.orange.buttons .button.active," +
                ".ui.basic.orange.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #db6435 inset !important;" +
                "  color: #db6435 !important;" +
                "}" +
                ".ui.buttons > .basic.orange.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.orange.buttons .button," +
                ".ui.inverted.orange.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;" +
                "  color: #ff851b;" +
                "}" +
                ".ui.inverted.orange.buttons .button:hover," +
                ".ui.inverted.orange.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;" +
                "  background-color: #ff851b;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.orange.buttons .button.active," +
                ".ui.inverted.orange.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;" +
                "  background-color: #ff851b;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.orange.buttons .button:active," +
                ".ui.inverted.orange.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #f67300 inset !important;" +
                "  background-color: #f67300;" +
                "  color: #ffffff;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.orange.basic.buttons .button," +
                ".ui.inverted.orange.buttons .basic.button," +
                ".ui.inverted.orange.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.orange.basic.buttons .button:hover," +
                ".ui.inverted.orange.buttons .basic.button:hover," +
                ".ui.inverted.orange.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;" +
                "  color: #ff851b !important;" +
                "}" +
                ".ui.inverted.orange.basic.buttons .button.active," +
                ".ui.inverted.orange.buttons .basic.button.active," +
                ".ui.inverted.orange.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;" +
                "  color: #ff851b !important;" +
                "}" +
                ".ui.inverted.orange.basic.buttons .button:active," +
                ".ui.inverted.orange.buttons .basic.button:active," +
                ".ui.inverted.orange.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #f67300 inset !important;" +
                "  color: #ff851b !important;" +
                "}" +
                "" +
                "/*--- Pink ---*/" +
                "" +
                ".ui.pink.buttons .button," +
                ".ui.pink.button {" +
                "  background-color: #d9499a;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.pink.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.pink.buttons .button:hover," +
                ".ui.pink.button:hover {" +
                "  background-color: #dc56a1;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.pink.buttons .button:active," +
                ".ui.pink.button:active {" +
                "  background-color: #d22c8a;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.pink.buttons .button.active," +
                ".ui.pink.buttons .button.active:active," +
                ".ui.pink.button.active," +
                ".ui.pink.button .button.active:active {" +
                "  background-color: #d5348e;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.pink.buttons .button," +
                ".ui.basic.pink.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.pink.buttons .button:hover," +
                ".ui.basic.pink.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #dc56a1 inset !important;" +
                "  color: #dc56a1 !important;" +
                "}" +
                ".ui.basic.pink.buttons .button:active," +
                ".ui.basic.pink.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #d22c8a inset !important;" +
                "  color: #d22c8a !important;" +
                "}" +
                ".ui.basic.pink.buttons .button.active," +
                ".ui.basic.pink.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #d22c8a inset !important;" +
                "  color: #d22c8a !important;" +
                "}" +
                ".ui.buttons > .basic.pink.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.pink.buttons .button," +
                ".ui.inverted.pink.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;" +
                "  color: #ff8edf;" +
                "}" +
                ".ui.inverted.pink.buttons .button:hover," +
                ".ui.inverted.pink.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;" +
                "  background-color: #ff8edf;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.pink.buttons .button.active," +
                ".ui.inverted.pink.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;" +
                "  background-color: #ff8edf;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.pink.buttons .button:active," +
                ".ui.inverted.pink.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #ff6ad5 inset !important;" +
                "  background-color: #ff6ad5;" +
                "  color: #ffffff;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.pink.basic.buttons .button," +
                ".ui.inverted.pink.buttons .basic.button," +
                ".ui.inverted.pink.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.pink.basic.buttons .button:hover," +
                ".ui.inverted.pink.buttons .basic.button:hover," +
                ".ui.inverted.pink.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;" +
                "  color: #ff8edf !important;" +
                "}" +
                ".ui.inverted.pink.basic.buttons .button.active," +
                ".ui.inverted.pink.buttons .basic.button.active," +
                ".ui.inverted.pink.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;" +
                "  color: #ff8edf !important;" +
                "}" +
                ".ui.inverted.pink.basic.buttons .button:active," +
                ".ui.inverted.pink.buttons .basic.button:active," +
                ".ui.inverted.pink.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #ff6ad5 inset !important;" +
                "  color: #ff8edf !important;" +
                "}" +
                "" +
                "/*--- Purple ---*/" +
                "" +
                ".ui.purple.buttons .button," +
                ".ui.purple.button {" +
                "  background-color: #95278a;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.purple.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.purple.buttons .button:hover," +
                ".ui.purple.button:hover {" +
                "  background-color: #7e1275;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.purple.buttons .button:active," +
                ".ui.purple.button:active {" +
                "  background-color: #64045c;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.purple.buttons .button.active," +
                ".ui.purple.buttons .button.active:active," +
                ".ui.purple.button.active," +
                ".ui.purple.button .button.active:active {" +
                "  background-color: #4c467a;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.purple.buttons .button," +
                ".ui.basic.purple.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.purple.buttons .button:hover," +
                ".ui.basic.purple.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #5c5594 inset !important;" +
                "  color: #5c5594 !important;" +
                "}" +
                ".ui.basic.purple.buttons .button:active," +
                ".ui.basic.purple.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #484273 inset !important;" +
                "  color: #484273 !important;" +
                "}" +
                ".ui.basic.purple.buttons .button.active," +
                ".ui.basic.purple.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #484273 inset !important;" +
                "  color: #484273 !important;" +
                "}" +
                ".ui.buttons > .basic.purple.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.purple.buttons .button," +
                ".ui.inverted.purple.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;" +
                "  color: #cdc6ff;" +
                "}" +
                ".ui.inverted.purple.buttons .button:hover," +
                ".ui.inverted.purple.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;" +
                "  background-color: #cdc6ff;" +
                "  color: #1b1c1d;" +
                "}" +
                ".ui.inverted.purple.buttons .button.active," +
                ".ui.inverted.purple.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;" +
                "  background-color: #cdc6ff;" +
                "  color: #1b1c1d;" +
                "}" +
                ".ui.inverted.purple.buttons .button:active," +
                ".ui.inverted.purple.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #aea2ff inset !important;" +
                "  background-color: #aea2ff;" +
                "  color: #1b1c1d;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.purple.basic.buttons .button," +
                ".ui.inverted.purple.buttons .basic.button," +
                ".ui.inverted.purple.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.purple.basic.buttons .button:hover," +
                ".ui.inverted.purple.buttons .basic.button:hover," +
                ".ui.inverted.purple.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;" +
                "  color: #cdc6ff !important;" +
                "}" +
                ".ui.inverted.purple.basic.buttons .button.active," +
                ".ui.inverted.purple.buttons .basic.button.active," +
                ".ui.inverted.purple.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;" +
                "  color: #cdc6ff !important;" +
                "}" +
                ".ui.inverted.purple.basic.buttons .button:active," +
                ".ui.inverted.purple.buttons .basic.button:active," +
                ".ui.inverted.purple.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #aea2ff inset !important;" +
                "  color: #cdc6ff !important;" +
                "}" +
                "" +
                "/*--- Red ---*/" +
                "" +
                ".ui.red.buttons .button," +
                ".ui.red.button {" +
                "  background-color: #d95c5c;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.red.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.red.buttons .button:hover," +
                ".ui.red.button:hover {" +
                "  background-color: #dc6868;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.red.buttons .button:active," +
                ".ui.red.button:active {" +
                "  background-color: #d23f3f;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.red.buttons .button.active," +
                ".ui.red.buttons .button.active:active," +
                ".ui.red.button.active," +
                ".ui.red.button .button.active:active {" +
                "  background-color: #d44747;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.red.buttons .button," +
                ".ui.basic.red.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.red.buttons .button:hover," +
                ".ui.basic.red.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #dc6868 inset !important;" +
                "  color: #dc6868 !important;" +
                "}" +
                ".ui.basic.red.buttons .button:active," +
                ".ui.basic.red.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #d23f3f inset !important;" +
                "  color: #d23f3f !important;" +
                "}" +
                ".ui.basic.red.buttons .button.active," +
                ".ui.basic.red.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #d23f3f inset !important;" +
                "  color: #d23f3f !important;" +
                "}" +
                ".ui.buttons > .basic.red.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.red.buttons .button," +
                ".ui.inverted.red.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;" +
                "  color: #ff695e;" +
                "}" +
                ".ui.inverted.red.buttons .button:hover," +
                ".ui.inverted.red.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;" +
                "  background-color: #ff695e;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.red.buttons .button.active," +
                ".ui.inverted.red.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;" +
                "  background-color: #ff695e;" +
                "  color: #ffffff;" +
                "}" +
                ".ui.inverted.red.buttons .button:active," +
                ".ui.inverted.red.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #ff483a inset !important;" +
                "  background-color: #ff483a;" +
                "  color: #ffffff;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.red.basic.buttons .button," +
                ".ui.inverted.red.buttons .basic.button," +
                ".ui.inverted.red.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.red.basic.buttons .button:hover," +
                ".ui.inverted.red.buttons .basic.button:hover," +
                ".ui.inverted.red.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;" +
                "  color: #ff695e !important;" +
                "}" +
                ".ui.inverted.red.basic.buttons .button.active," +
                ".ui.inverted.red.buttons .basic.button.active," +
                ".ui.inverted.red.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;" +
                "  color: #ff695e !important;" +
                "}" +
                ".ui.inverted.red.basic.buttons .button:active," +
                ".ui.inverted.red.buttons .basic.button:active," +
                ".ui.inverted.red.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #ff483a inset !important;" +
                "  color: #ff695e !important;" +
                "}" +
                "" +
                "/*--- Teal ---*/" +
                "" +
                ".ui.teal.buttons .button," +
                ".ui.teal.button {" +
                "  background-color: #00b5ad;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.teal.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.teal.buttons .button:hover," +
                ".ui.teal.button:hover {" +
                "  background-color: #00c4bc;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.teal.buttons .button:active," +
                ".ui.teal.button:active {" +
                "  background-color: #00918b;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.teal.buttons .button.active," +
                ".ui.teal.buttons .button.active:active," +
                ".ui.teal.button.active," +
                ".ui.teal.button .button.active:active {" +
                "  background-color: #009c95;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.teal.buttons .button," +
                ".ui.basic.teal.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.teal.buttons .button:hover," +
                ".ui.basic.teal.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #00c4bc inset !important;" +
                "  color: #00c4bc !important;" +
                "}" +
                ".ui.basic.teal.buttons .button:active," +
                ".ui.basic.teal.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #00918b inset !important;" +
                "  color: #00918b !important;" +
                "}" +
                ".ui.basic.teal.buttons .button.active," +
                ".ui.basic.teal.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #00918b inset !important;" +
                "  color: #00918b !important;" +
                "}" +
                ".ui.buttons > .basic.teal.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.teal.buttons .button," +
                ".ui.inverted.teal.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;" +
                "  color: #6dffff;" +
                "}" +
                ".ui.inverted.teal.buttons .button:hover," +
                ".ui.inverted.teal.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;" +
                "  background-color: #6dffff;" +
                "  color: #1b1c1d;" +
                "}" +
                ".ui.inverted.teal.buttons .button.active," +
                ".ui.inverted.teal.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;" +
                "  background-color: #6dffff;" +
                "  color: #1b1c1d;" +
                "}" +
                ".ui.inverted.teal.buttons .button:active," +
                ".ui.inverted.teal.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #49ffff inset !important;" +
                "  background-color: #49ffff;" +
                "  color: #1b1c1d;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.teal.basic.buttons .button," +
                ".ui.inverted.teal.buttons .basic.button," +
                ".ui.inverted.teal.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.teal.basic.buttons .button:hover," +
                ".ui.inverted.teal.buttons .basic.button:hover," +
                ".ui.inverted.teal.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;" +
                "  color: #6dffff !important;" +
                "}" +
                ".ui.inverted.teal.basic.buttons .button.active," +
                ".ui.inverted.teal.buttons .basic.button.active," +
                ".ui.inverted.teal.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;" +
                "  color: #6dffff !important;" +
                "}" +
                ".ui.inverted.teal.basic.buttons .button:active," +
                ".ui.inverted.teal.buttons .basic.button:active," +
                ".ui.inverted.teal.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #49ffff inset !important;" +
                "  color: #6dffff !important;" +
                "}" +
                "" +
                "/*--- Yellow ---*/" +
                "" +
                ".ui.yellow.buttons .button," +
                ".ui.yellow.button {" +
                "  background-color: #f2c61f;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.yellow.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.yellow.buttons .button:hover," +
                ".ui.yellow.button:hover {" +
                "  background-color: #f3ca2d;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.yellow.buttons .button:active," +
                ".ui.yellow.button:active {" +
                "  background-color: #e0b40d;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.yellow.buttons .button.active," +
                ".ui.yellow.buttons .button.active:active," +
                ".ui.yellow.button.active," +
                ".ui.yellow.button .button.active:active {" +
                "  background-color: #eabc0e;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/* Basic */" +
                ".ui.basic.yellow.buttons .button," +
                ".ui.basic.yellow.button {" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;" +
                "  color: rgba(0, 0, 0, 0.6) !important;" +
                "}" +
                ".ui.basic.yellow.buttons .button:hover," +
                ".ui.basic.yellow.button:hover {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #f3ca2d inset !important;" +
                "  color: #f3ca2d !important;" +
                "}" +
                ".ui.basic.yellow.buttons .button:active," +
                ".ui.basic.yellow.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #e0b40d inset !important;" +
                "  color: #e0b40d !important;" +
                "}" +
                ".ui.basic.yellow.buttons .button.active," +
                ".ui.basic.yellow.button.active {" +
                "  background: transparent !important;" +
                "  box-shadow: 0px 0px 0px 2px #e0b40d inset !important;" +
                "  color: #e0b40d !important;" +
                "}" +
                ".ui.buttons > .basic.yellow.button:not(:first-child) {" +
                "  margin-left: -2px;" +
                "}" +
                "" +
                "/* Inverted */" +
                ".ui.inverted.yellow.buttons .button," +
                ".ui.inverted.yellow.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;" +
                "  color: #ffe21f;" +
                "}" +
                ".ui.inverted.yellow.buttons .button:hover," +
                ".ui.inverted.yellow.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;" +
                "  background-color: #ffe21f;" +
                "  color: #1b1c1d;" +
                "}" +
                ".ui.inverted.yellow.buttons .button.active," +
                ".ui.inverted.yellow.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;" +
                "  background-color: #ffe21f;" +
                "  color: #1b1c1d;" +
                "}" +
                ".ui.inverted.yellow.buttons .button:active," +
                ".ui.inverted.yellow.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #fada00 inset !important;" +
                "  background-color: #fada00;" +
                "  color: #1b1c1d;" +
                "}" +
                "" +
                "/* Inverted Basic */" +
                ".ui.inverted.yellow.basic.buttons .button," +
                ".ui.inverted.yellow.buttons .basic.button," +
                ".ui.inverted.yellow.basic.button {" +
                "  background-color: transparent;" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;" +
                "  color: #ffffff !important;" +
                "}" +
                ".ui.inverted.yellow.basic.buttons .button:hover," +
                ".ui.inverted.yellow.buttons .basic.button:hover," +
                ".ui.inverted.yellow.basic.button:hover {" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;" +
                "  color: #ffe21f !important;" +
                "}" +
                ".ui.inverted.yellow.basic.buttons .button.active," +
                ".ui.inverted.yellow.buttons .basic.button.active," +
                ".ui.inverted.yellow.basic.button.active {" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;" +
                "  color: #ffe21f !important;" +
                "}" +
                ".ui.inverted.yellow.basic.buttons .button:active," +
                ".ui.inverted.yellow.buttons .basic.button:active," +
                ".ui.inverted.yellow.basic.button:active {" +
                "  box-shadow: 0px 0px 0px 2px #fada00 inset !important;" +
                "  color: #ffe21f !important;" +
                "}" +
                "" +
                "/*-------------------" +
                "       Primary" +
                "--------------------*/" +
                "" +
                ".ui.primary.buttons .button," +
                ".ui.primary.button {" +
                "  background-color: #3b83c0;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.primary.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.primary.buttons .button:hover," +
                ".ui.primary.button:hover {" +
                "  background-color: #458ac6;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.primary.buttons .button:active," +
                ".ui.primary.button:active {" +
                "  background-color: #3370a5;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.primary.buttons .active.button," +
                ".ui.primary.button.active {" +
                "  background-color: #3576ac;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/*-------------------" +
                "      Secondary" +
                "--------------------*/" +
                "" +
                ".ui.secondary.buttons .button," +
                ".ui.secondary.button {" +
                "  background-color: #1b1c1d;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.secondary.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.secondary.buttons .button:hover," +
                ".ui.secondary.button:hover {" +
                "  background-color: #222425;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.secondary.buttons .button:active," +
                ".ui.secondary.button:active {" +
                "  background-color: #0a0a0b;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.secondary.buttons .active.button," +
                ".ui.secondary.button.active {" +
                "  background-color: #0f0f10;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/*---------------" +
                "    Positive" +
                "----------------*/" +
                "" +
                ".ui.positive.buttons .button," +
                ".ui.positive.button {" +
                "  background-color: #5bbd72 !important;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.positive.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.positive.buttons .button:hover," +
                ".ui.positive.button:hover," +
                ".ui.positive.buttons .active.button," +
                ".ui.positive.button.active {" +
                "  background-color: #66c17b !important;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.positive.buttons .button:active," +
                ".ui.positive.button:active {" +
                "  background-color: #46ae5f !important;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.positive.buttons .button.active," +
                ".ui.positive.buttons .button.active:active," +
                ".ui.positive.button.active," +
                ".ui.positive.button .button.active:active {" +
                "  background-color: #49b562;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "/*---------------" +
                "     Negative" +
                "----------------*/" +
                "" +
                ".ui.negative.buttons .button," +
                ".ui.negative.button {" +
                "  background-color: #d95c5c !important;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "  background-image: none;" +
                "}" +
                ".ui.negative.button {" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.negative.buttons .button:hover," +
                ".ui.negative.button:hover," +
                ".ui.negative.buttons .active.button," +
                ".ui.negative.button.active {" +
                "  background-color: #dc6868 !important;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.negative.buttons .button:active," +
                ".ui.negative.button:active {" +
                "  background-color: #d23f3f !important;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                ".ui.negative.buttons .button.active," +
                ".ui.negative.buttons .button.active:active," +
                ".ui.negative.button.active," +
                ".ui.negative.button .button.active:active {" +
                "  background-color: #d44747;" +
                "  color: #ffffff;" +
                "  text-shadow: none;" +
                "}" +
                "" +
                "" +
                "/*******************************" +
                "            Groups" +
                "*******************************/" +
                "" +
                ".ui.buttons {" +
                "  display: inline-block;" +
                "  vertical-align: middle;" +
                "  margin: 0em 0.25em 0em 0em;" +
                "}" +
                ".ui.buttons > .button:hover," +
                ".ui.buttons > .button.active {" +
                "  position: relative;" +
                "}" +
                ".ui.buttons:after {" +
                "  content: \".\";" +
                "  display: block;" +
                "  height: 0;" +
                "  clear: both;" +
                "  visibility: hidden;" +
                "}" +
                ".ui.buttons .button:first-child {" +
                "  border-left: none;" +
                "}" +
                ".ui.buttons:not(.basic):not(.inverted) {" +
                "  box-shadow: none;" +
                "}" +
                ".ui.buttons > .ui.button:not(.basic):not(.inverted)," +
                ".ui.buttons:not(.basic):not(.inverted) > .button {" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;" +
                "}" +
                ".ui.buttons .button {" +
                "  margin: 0em;" +
                "  float: left;" +
                "  border-radius: 0em;" +
                "  margin: 0px 0px 0px 0px;" +
                "}" +
                ".ui.buttons .button:first-child {" +
                "  margin-left: 0em;" +
                "  border-top-left-radius: 0.2857rem;" +
                "  border-bottom-left-radius: 0.2857rem;" +
                "}" +
                ".ui.buttons .button:last-child {" +
                "  border-top-right-radius: 0.2857rem;" +
                "  border-bottom-right-radius: 0.2857rem;" +
                "}" +
                "" +
                "/* Vertical  Style */" +
                ".ui.vertical.buttons {" +
                "  display: inline-block;" +
                "}" +
                ".ui.vertical.buttons .button {" +
                "  display: block;" +
                "  float: none;" +
                "  margin: 0px 0px 0px 0px;" +
                "  box-shadow: none;" +
                "}" +
                ".ui.vertical.buttons .button:first-child," +
                ".ui.vertical.buttons .mini.button:first-child," +
                ".ui.vertical.buttons .tiny.button:first-child," +
                ".ui.vertical.buttons .small.button:first-child," +
                ".ui.vertical.buttons .massive.button:first-child," +
                ".ui.vertical.buttons .huge.button:first-child {" +
                "  border-radius: 0.2857rem 0.2857rem 0px 0px;" +
                "}" +
                ".ui.vertical.buttons .button:last-child," +
                ".ui.vertical.buttons .mini.button:last-child," +
                ".ui.vertical.buttons .tiny.button:last-child," +
                ".ui.vertical.buttons .small.button:last-child," +
                ".ui.vertical.buttons .massive.button:last-child," +
                ".ui.vertical.buttons .huge.button:last-child," +
                ".ui.vertical.buttons .gigantic.button:last-child {" +
                "  margin-bottom: 0px;" +
                "  border-radius: 0px 0px 0.2857rem 0.2857rem;" +
                "}" +
                "" +
                "    .g_modal {" +
                "        position: fixed;" +
                "        display: table;" +
                "        width: 100%;" +
                "        height: 100%;" +
                "        top: 0;" +
                "        left: 0;" +
                "        background-color: rgba(0, 0, 0, .75);" +
                "        text-align: center;" +
                "" +
                "        -webkit-transition: all 0.3s;" +
                "        -moz-transition: all 0.3s;" +
                "        -ms-transition: all 0.3s;" +
                "        transition: all 0.3s;" +
                "        animation: g_modal_fade .3s;" +
                "        -webkit-animation: g_modal_fade .3s;" +
                "        -moz-animation: g_modal_fade .3s;" +
                "        -ms-animation: g_modal_fade .3s;" +
                "    }" +
                "    .g_modal.g_modal_scroll {" +
                "        overflow-y: scroll;" +
                "        display: block;" +
                "    }" +
                "    .g_modal.g_modal_scroll .g_modal_cell {" +
                "        display: block;" +
                "    }" +
                "    .g_modal .g_modal_closeBtn {" +
                "        position: absolute;" +
                "        right: 5px;" +
                "        top: 5px;" +
                "        cursor: pointer;" +
                "        width: 38px;" +
                "        height: 38px;" +
                "        border-radius: 2px;" +
                "        background: #FFF;" +
                "        font-family: \"xt\";" +
                "        text-align: center;" +
                "        line-height: 38px;" +
                "        font-size: 30px;" +
                "        color: #CCC;" +
                "    }" +
                "    .g_modal .g_modal_closeBtn:hover {" +
                "        font-size: 32px;" +
                "    }" +
                "    .g_modal .g_modal_closeBtn:before {" +
                "        content: \"k\";" +
                "    }" +
                "    .g_modal.g_modal_remove {" +
                "        background-color: rgba(0, 0, 0, 0);" +
                "    }" +
                "    .g_modal .g_modal_cell {" +
                "        display: table-cell;" +
                "        vertical-align: middle;" +
                "    }" +
                "    .g_modal .g_modal_wrap {" +
                "        animation: g_modal_move .3s;" +
                "        -webkit-animation: g_modal_move .3s;" +
                "        -moz-animation: g_modal_move .3s;" +
                "        -ms-animation: g_modal_move .3s;" +
                "        -webkit-transition: all 0.3s;" +
                "        -moz-transition: all 0.3s;" +
                "        -ms-transition: all 0.3s;" +
                "        transition: all 0.3s;" +
                "        background: #FFF;" +
                "        border-radius: 3px;" +
                "        max-width: 720px;" +
                "        margin: 0 auto;" +
                "        cursor: auto;" +
                "        position: relative;" +
                "        overflow: hidden;" +
                "        text-align: left;" +
                "    }" +
                "    .g_modal.g_modal_remove .g_modal_wrap {" +
                "        -webkit-transform: translate3d(0, -100%, 0);" +
                "        -moz-transform: translate3d(0, -100%, 0);" +
                "        -ms-transform: translate3d(0, -100%, 0);" +
                "        transform: translate3d(0, -100%, 0);" +
                "        opacity: 0;" +
                "    }" +
                "    @-webkit-keyframes g_modal_move {" +
                "        0% {" +
                "            -webkit-transform: translate3d(0, 100%, 0);" +
                "            -moz-transform: translate3d(0, 100%, 0);" +
                "            -ms-transform: translate3d(0, 100%, 0);" +
                "            transform: translate3d(0, 100%, 0);" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            -webkit-transform: translate3d(0, 0, 0);" +
                "            -moz-transform: translate3d(0, 0, 0);" +
                "            -ms-transform: translate3d(0, 0, 0);" +
                "            transform: translate3d(0, 0, 0);" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "    @-moz-keyframes g_modal_move {" +
                "        0% {" +
                "            -webkit-transform: translate3d(0, 100%, 0);" +
                "            -moz-transform: translate3d(0, 100%, 0);" +
                "            -ms-transform: translate3d(0, 100%, 0);" +
                "            transform: translate3d(0, 100%, 0);" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            -webkit-transform: translate3d(0, 0, 0);" +
                "            -moz-transform: translate3d(0, 0, 0);" +
                "            -ms-transform: translate3d(0, 0, 0);" +
                "            transform: translate3d(0, 0, 0);" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "    @-ms-keyframes g_modal_move {" +
                "        0% {" +
                "            -webkit-transform: translate3d(0, 100%, 0);" +
                "            -moz-transform: translate3d(0, 100%, 0);" +
                "            -ms-transform: translate3d(0, 100%, 0);" +
                "            transform: translate3d(0, 100%, 0);" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            -webkit-transform: translate3d(0, 0, 0);" +
                "            -moz-transform: translate3d(0, 0, 0);" +
                "            -ms-transform: translate3d(0, 0, 0);" +
                "            transform: translate3d(0, 0, 0);" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "    @keyframes g_modal_move {" +
                "        0% {" +
                "            -webkit-transform: translate3d(0, 100%, 0);" +
                "            -moz-transform: translate3d(0, 100%, 0);" +
                "            -ms-transform: translate3d(0, 100%, 0);" +
                "            transform: translate3d(0, 100%, 0);" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            -webkit-transform: translate3d(0, 0, 0);" +
                "            -moz-transform: translate3d(0, 0, 0);" +
                "            -ms-transform: translate3d(0, 0, 0);" +
                "            transform: translate3d(0, 0, 0);" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "    @-ms-keyframes g_modal_fade {" +
                "        0% {" +
                "            background: rgba(0, 0, 0, 0);" +
                "        }" +
                "        100% {" +
                "            background: rgba(0, 0, 0, .6);" +
                "        }" +
                "    }" +
                "    @-webkit-keyframes g_modal_fade {" +
                "        0% {" +
                "            background: rgba(0, 0, 0, 0);" +
                "        }" +
                "        100% {" +
                "            background: rgba(0, 0, 0, .6);" +
                "        }" +
                "    }" +
                "    @-moz-keyframes g_modal_fade {" +
                "        0% {" +
                "            background: rgba(0, 0, 0, 0);" +
                "        }" +
                "        100% {" +
                "            background: rgba(0, 0, 0, .6);" +
                "        }" +
                "    }" +
                "    @keyframes g_modal_fade {" +
                "        0% {" +
                "            background: rgba(0, 0, 0, 0);" +
                "        }" +
                "        100% {" +
                "            background: rgba(0, 0, 0, .6);" +
                "        }" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_purple {" +
                "        border-top: 8px solid #95278a;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_green {" +
                "        border-top: 8px solid #09b673;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_red {" +
                "        border-top: 8px solid #ce2432;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_purple .g_modal_plus_title {" +
                "        color: #95278a;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_green .g_modal_plus_title {" +
                "        color: #09b673;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_red .g_modal_plus_title {" +
                "        color: #ce2432;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_purple .g_modal_plus_title span {" +
                "        background: #95278a;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_purple .g_modal_plus_title span:before {" +
                "        content: \"l\";" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_green .g_modal_plus_title span {" +
                "        background: #09b673;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_green .g_modal_plus_title span:before {" +
                "        content: \"s\";" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_red .g_modal_plus_title span {" +
                "        background: #ce2432;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_red .g_modal_plus_title span:before {" +
                "        content: \"b\";" +
                "    }" +
                "    .g_modal_plus .g_modal_wrap {" +
                "        border-radius: 3px;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_title {" +
                "        height: 60px;" +
                "        line-height: 60px;" +
                "        font-size: 22px;" +
                "        overflow: hidden;" +
                "        padding-right: 60px;" +
                "        color: #95278a;" +
                "    }" +
                "    .g_modal_plus .g_modal_plus_title span {" +
                "        font-family: \"xt\";" +
                "        font-size: 28px;" +
                "        display:inline-block;" +
                "        width: 35px;" +
                "        height: 35px;" +
                "        line-height:35px;" +
                "        overflow: hidden;" +
                "        background: #95278a;" +
                "        border-radius: 50%;" +
                "        text-align: center;" +
                "        margin: 0 20px;" +
                "        color: #FFF;" +
                "        transform: translate(0, 20%);" +
                "        -webkit-transform: translate(0, 20%);" +
                "        -moz-transform: translate(0, 20%);" +
                "        -ms-transform: translate(0, 20%);" +
                "    }" +
                "    .g_modal_plus .g_modal_closeBtn {" +
                "        background: #f6f3f3;" +
                "        right: 10px;" +
                "        top: 10px;" +
                "    }" +
                "    .g_modal_plus_btns_wrap {" +
                "        text-align:center;" +
                "        padding: 25px 10px;" +
                "    }" +
                "    .g_modal_plus_btns_wrap .button {" +
                "        margin-left: 1em;" +
                "    }" +
                "    .g_modal_plus_alert_text {" +
                "        font-size: 16px;" +
                "        color: #818181;" +
                "        padding: 20px 0 20px 75px;" +
                "    }" +
                "    .g_modal_hint {" +
                "        padding: 25px 50px;" +
                "        position: fixed;" +
                "        z-index: 151;" +
                "        top: 50%;" +
                "        left: 50%;" +
                "        color: #FFF;" +
                "        transform: translate(-50%, -50%);" +
                "        -webkit-transform: translate(-50%, -50%);" +
                "        -moz-transform: translate(-50%, -50%);" +
                "        -ms-transform: translate(-50%, -50%);" +
                "        background: rgba(0, 0, 0, .7);" +
                "        border-radius: 3px;" +
                "        font-size: 16px;" +
                "        animation: g_modal_hint .3s;" +
                "        -webkit-animation: g_modal_hint .3s;" +
                "        -moz-animation: g_modal_hint .3s;" +
                "        -ms-animation: g_modal_hint .3s;" +
                "        box-shadow: 0 0 10px 0 rgba(0, 0, 0, .6);" +
                "    }" +
                "    @-ms-keyframes g_modal_hint {" +
                "        0% {" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "    @-webkit-keyframes g_modal_hint {" +
                "        0% {" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "    @-moz-keyframes g_modal_hint {" +
                "        0% {" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "    @keyframes g_modal_hint {" +
                "        0% {" +
                "            opacity: 0;" +
                "        }" +
                "        100% {" +
                "            opacity: 1;" +
                "        }" +
                "    }" +
                "" +
                "</style>" +
                "" +
                "<script type=\"text/javascript\">" +
                "(function() {" +
                "" +
                "    var transitionfn = function() {" +
                "        // Bootstrap: transition.js v3.2.0" +
                "" +
                "        // console.log($.support.transition); 浏览器是否支持transition" +
                "" +
                "        // 兼容的transitionend 事件写法" +
                "        // $('.aaa1').on('bsTransitionEnd',function() {" +
                "        //   alert(1);" +
                "        // });" +
                "        function transitionEnd() {" +
                "            var el = document.createElement('div')" +
                "" +
                "            var transEndEventNames = {" +
                "                WebkitTransition: 'webkitTransitionEnd'," +
                "                MozTransition: 'transitionend'," +
                "                OTransition: 'oTransitionEnd otransitionend'," +
                "                transition: 'transitionend'" +
                "            }" +
                "" +
                "            for (var name in transEndEventNames) {" +
                "                if (el.style[name] !== undefined) {" +
                "                    return {" +
                "                        end: transEndEventNames[name]" +
                "                    }" +
                "                }" +
                "            }" +
                "" +
                "            return false // explicit for ie8 (  ._.)" +
                "        }" +
                "" +
                "        // http://blog.alexmaccaw.com/css-transitions" +
                "        $.fn.emulateTransitionEnd = function(duration) {" +
                "            var called = false" +
                "            var $el = this" +
                "            $(this).one('bsTransitionEnd', function() {" +
                "                called = true" +
                "            })" +
                "            var callback = function() {" +
                "                if (!called) $($el).trigger($.support.transition.end)" +
                "            }" +
                "            setTimeout(callback, duration)" +
                "            return this" +
                "        }" +
                "" +
                "" +
                "        $.support.transition = transitionEnd()" +
                "" +
                "        if (!$.support.transition) return" +
                "" +
                "        $.event.special.bsTransitionEnd = {" +
                "            bindType: $.support.transition.end," +
                "            delegateType: $.support.transition.end," +
                "            handle: function(e) {" +
                "                if ($(e.target).is(this)) return e.handleObj.handler.apply(this, arguments)" +
                "            }" +
                "        }" +
                "    };" +
                "    transitionfn();" +
                "" +
                "    var $doc = $(document);" +
                "    var $win = $(window);" +
                "    var $body = $('body');" +
                "    var $backupCss = $body.css('overflow');" +
                "" +
                "    $.modalPlus = function(option) {" +
                "" +
                "        // 如果传入的不是json，就remove对话框" +
                "        if (!$.isPlainObject(option)) {" +
                "" +
                "            var $modal = $('#g_modal').addClass('g_modal_remove');" +
                "" +
                "            if ($.support.transition) {" +
                "                $modal.on('bsTransitionEnd', function() {" +
                "                    $doc.trigger('modal.remove', $modal);" +
                "                    $modal.remove();" +
                "                    $doc.trigger('modal.removed', $modal);" +
                "                });" +
                "            } else {" +
                "                $doc.trigger('modal.remove', $modal);" +
                "                $modal.remove();" +
                "                $doc.trigger('modal.removed', $modal);" +
                "            }" +
                "" +
                "            return false;" +
                "        }" +
                "" +
                "        // 主参数" +
                "        var opt = $.extend({" +
                "            title: ''," +
                "            HTML: '做本次习题前，请先完成身份验证。'," +
                "            type: 'normal',  // normal=>正常, confirm=>确认， alert=>提示， hint=> 自动消失的提示" +
                "            color: 'purple', // purple, red, green" +
                "            btns: {}, // {color: red, text: '确定'} 多个按钮用数组" +
                "            minHeight: 100, // 最小高度" +
                "            zIndex: 151, // 默认zIndex" +
                "            className: '' // 会加在最外层的div上，供自定义样式" +
                "        }, option || {});" +
                "" +
                "" +
                "        if (opt.type === 'confirm') {" +
                "            opt.title = '提示信息';" +
                "            opt.btns = [{" +
                "                color: ''," +
                "                text: '取消'" +
                "            }, {" +
                "                color: 'purple'," +
                "                text: '确定'" +
                "            }];" +
                "            opt.HTML = '<div class=\"g_modal_plus_alert_text\">' + opt.HTML + '</div>';" +
                "        } else if (opt.type === 'alert') {" +
                "            opt.title = '提示信息';" +
                "            opt.btns = [{" +
                "                color: 'purple'," +
                "                text: '确定'" +
                "            }];" +
                "            opt.HTML = '<div class=\"g_modal_plus_alert_text\">' + opt.HTML + '</div>';" +
                "        } else if (opt.type === 'hint') {" +
                "            var hintHTML = '<div class=\"g_modal_hint\">' + opt.HTML + '</div>';" +
                "" +
                "            var $hint = $(hintHTML).appendTo('body');" +
                "" +
                "            setTimeout(function() {" +
                "                $hint.stop().animate({" +
                "                    opacity: 0" +
                "                }, function() {" +
                "                    $hint.remove();" +
                "                });" +
                "            }, 2500);" +
                "" +
                "            return $hint;" +
                "        }" +
                "" +
                "        // 主HTML代码" +
                "        if (!$.isArray(opt.btns)) {" +
                "            opt.btns = [opt.btns];" +
                "        }" +
                "" +
                "        var HTMLBtn = '';" +
                "" +
                "        if (opt.btns[0].text) {" +
                "            HTMLBtn += '<div class=\"g_modal_plus_btns_wrap\">';" +
                "            for (var i = 0, l=opt.btns.length; i < l; i++) {" +
                "                HTMLBtn += '<div class=\"ui button ' + opt.btns[i].color + '\">' + opt.btns[i].text + '</div>';" +
                "            }" +
                "            HTMLBtn += '</div>';" +
                "        }" +
                "" +
                "        var HTML = '<div class=\"g_modal g_modal_plus ' + opt.className + '\" id=\"g_modal\" style=\"z-index: ' + opt.zIndex + '\">' +" +
                "                '<div class=\"g_modal_cell\">' +" +
                "                    '<div class=\"g_modal_wrap ' + 'g_modal_plus_' + opt.color + '\">' +" +
                "                        '<div class=\"g_modal_plus_title\"><span class=\"anti_sawtooth\"></span>' + opt.title + '</div>' +" +
                "                        '<div>' + opt.HTML + '</div>' +" +
                "                        '<div class=\"g_modal_plus_btns\">' + HTMLBtn + '</div>' +" +
                "                        '<div class=\"g_modal_closeBtn\" title=\"关闭\"></div>' +" +
                "                    '</div>' +" +
                "                '</div>' +" +
                "            '</div>';" +
                "" +
                "        var $modal = $(HTML);" +
                "" +
                "        // 屏幕大于最小高度的自定义事件" +
                "        $modal.on('taller', function() {" +
                "            $modal.removeClass('g_modal_scroll');" +
                "            $modal.height('100%');" +
                "        });" +
                "" +
                "        // 屏幕小于最小高度的自定义事件" +
                "        $modal.on('untaller', function() {" +
                "            var $modalWrap = $modal.find('.g_modal_wrap');" +
                "            $modal.addClass('g_modal_scroll').height($win.height()).find('.g_modal_cell').add($modalWrap).css({" +
                "                'min-height': opt.minHeight + 'px'" +
                "            });" +
                "        });" +
                "" +
                "        // 触发自定义事件的事件" +
                "        $modal.on('changeStatus', function() {" +
                "            if (parseInt($win.height()) >= opt.minHeight) {" +
                "                $modal.trigger(\"taller\");" +
                "            } else {" +
                "                $modal.trigger(\"untaller\");" +
                "            }" +
                "        });" +
                "" +
                "        // 触发一次自定义事件的事件" +
                "        $modal.trigger(\"changeStatus\");" +
                "" +
                "        // 当浏览器大小改变时再次触发" +
                "        $win.on('resize', function() {" +
                "            $modal.trigger(\"changeStatus\");" +
                "        });" +
                "" +
                "        // 触发模态框创建前的回调" +
                "        $doc.trigger(\"modal.create\", $modal);" +
                "" +
                "        $modal.appendTo(\"body\");" +
                "" +
                "        // 触发模态框创建成功的回调" +
                "        $doc.trigger(\"modal.created\", $modal);" +
                "" +
                "        var $closeBtn = $modal.find(\".g_modal_closeBtn\");" +
                "        var $wrap = $modal.find(\".g_modal_wrap\");" +
                "" +
                "        // 关闭按钮事件" +
                "        $closeBtn.on('click', function(event) {" +
                "            event.stopPropagation();" +
                "            $.modalPlus();" +
                "        });" +
                "" +
                "        // 点击遮罩层， 关闭modal" +
                "        $modal.on(\"click\", function() {" +
                "            $.modalPlus();" +
                "        });" +
                "" +
                "        // 点击内容区域 不关闭modal" +
                "        $wrap.on(\"click\", function() {" +
                "            event.stopPropagation();" +
                "        });" +
                "" +
                "        // 按钮点击事件" +
                "        var $btns = $modal.find('.g_modal_plus_btns_wrap').eq(0).find('.button');" +
                "        if ($btns.length) {" +
                "            $btns.on('click', function() {" +
                "                $modal.trigger('modal.btn' + $(this).index() + '.click', $(this));" +
                "            });" +
                "        }" +
                "" +
                "        // modal为 confirm或alert时，点击取消按钮时的事件" +
                "        if (opt.type === 'confirm' || opt.type === 'alert') {" +
                "            $modal.on('modal.btn0.click', function() {" +
                "                $.modalPlus();" +
                "            });" +
                "        }" +
                "" +
                "        return $modal;" +
                "    };" +
                "" +
                "    $doc.on('modal.created', function() {" +
                "        $body.css({" +
                "            overflow: 'hidden'" +
                "        });" +
                "    });" +
                "" +
                "    $doc.on('modal.removed', function() {" +
                "        $body.css({" +
                "            overflow: $backupCss" +
                "        });" +
                "    });" +
                "" +
                "    $('body').on('click', '.course-wrapper a[href!=\"#\"]', function(event) {" +
                "        var $t = $(this);" +
                "        var href = $t.attr('href');" +
                "        var index = href.search(/\\/courseware\\/\\w+\\/\\w+\\//i);" +
                "        if( index > 0) {" +
                "            var section_location = href.substring(index);" +
                "            event.preventDefault();" +
                "            $.ajax({" +
                "                url: \"/verify_student/reverification/check/course/course-v1:TsinghuaX+hbu_2018031901X+2018_T2\" + section_location," +
                "                data: {}," +
                "                type: 'get'," +
                "                dataType: 'json'" +
                "            }).then(function(res) {" +
                "                if (res.reverify) {" +
                "                     $.modalPlus({" +
                "                        type: 'confirm'," +
                "                        HTML: res.value" +
                "                    }).on('modal.btn1.click', function() {" +
                "                        location.href = res.redirect;" +
                "                    });" +
                "                } else {" +
                "                    location.href = href;" +
                "                }" +
                "            }, function() {" +
                "                $.modalPlus({" +
                "                    type: 'alert'," +
                "                    color: 'red'," +
                "                    HTML: '网络链接失败！'" +
                "                });" +
                "            });" +
                "        }" +
                "    });" +
                "" +
                "$('body').on('click', '.judgeverify', function(event) {" +
                "        var $t = $(this);" +
                "        var vhref = $t.attr('data-verifyurl');" +
                "        var thref = $t.attr('data-testurl');" +
                "" +
                "        $.modalPlus({" +
                "        color: 'purple'," +
                "        title: '考试说明'," +
                "        HTML: \"<div class='g_modal_plus_alert_text'><span style='color:#818181;'>1.本场考试仅能参加一次，提交试卷或倒计时结束后，将无法再进入考试；</span></br><span style='color:#818181;'>2.考试过程中可多次保存考试答案，请务必在倒计时结束前及时交卷；</span></br>3.<span style='color:#818181;'>若考试未交卷，且倒计时未结束，仍可回到考试页面继续考试；</span></br>4.<span style='color:#818181;'>开始考试后系统将开始计时，关闭考试界面倒计时不会停止。</span></div>\"," +
                "        btns: [{" +
                "            color: ''," +
                "            text: '还没准备好，再等等'" +
                "        }, {" +
                "            color: 'purple'," +
                "            text: '准备好了，开始考试'" +
                "        }]" +
                "" +
                "        }).on('modal.btn0.click', function() {" +
                "            $.modalPlus();" +
                "        }).on(\"modal.btn1.click\", function() {" +
                "            $.ajax({" +
                "                url: \"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/get_exam_wait\"," +
                "                data: {}," +
                "                type: 'get'," +
                "                dataType: 'json'" +
                "              }).then(function(res){" +
                "                  if(res.exam_wait > 0) {" +
                "                    $.modalPlus();" +
                "                    $.modalPlus({" +
                "                      color: 'purple'," +
                "                      title: '考试说明'," +
                "                      HTML: \"<div class='g_modal_plus_alert_text'><span style='color:#818181;'>由于当前参加考试的人数过多，请您\" + res.exam_wait + \"分钟后再来考试。</span></div>\"," +
                "                      btns: [{" +
                "                          color: 'purple'," +
                "                          text: '稍后再来考试'" +
                "                      }]" +
                "                    }).on('modal.btn0.click', function() {" +
                "                      $.modalPlus();" +
                "                    });" +
                "                  }else {" +
                "                    location.href = \"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/exam/\" + thref;" +
                "                  }" +
                "                });" +
                "        });" +
                "                " +
                "    });" +
                "})();" +
                "</script>" +
                "" +
                "" +
                "<div class=\"container\">" +
                "  <div class=\"course-wrapper\">" +
                "" +
                "    <div class=\"course-index\" role=\"navigation\">" +
                "      <header id=\"open_close_accordion\">" +
                "        <a href=\"#\">关闭</a>" +
                "      </header>" +
                "" +
                "      <div id=\"accordion\" style=\"display: none\">" +
                "        <nav aria-label=\"课程导航\">" +
                "            " +
                "" +
                "" +
                "" +
                "    " +
                "  <div class=\"chapter\">" +
                "      " +
                "      <h3  class=\"active\" aria-label=\"第一讲 以人民为中心的发展思想, 当前章节\">" +
                "        <a href=\"#\">" +
                "          第一讲 以人民为中心的发展思想" +
                "        </a>" +
                "      </h3>" +
                "" +
                "    <ul>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/8de5390cc0d241c1a59aec7e1f0ba2c6/\">" +
                "              <p>1.1 以人民为中心成为国内外关注焦点 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/a3eee1174a454c8595b0bbac0e912924/\">" +
                "              <p>1.2 以人民为中心始终是党的核心思想 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/534cf6bff9db4573adff9134b2a228d5/\">" +
                "              <p>1.3 以人民为中心的社会主义现代化内涵 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/b63bbcfb8db5420fa4c12aa44801064b/\">" +
                "              <p>1.4 新时代中国社会主要矛盾与今后方向 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/7c7eecb8b4dd46d290f23de40aea2adc/\">" +
                "              <p>1.5 以人民为中心的五大发展、五大生产力 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/991928bb4bef4973a619da30ba709bb1/\">" +
                "              <p>1.6 如何以人民为中心：健康中国为例 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/d3b193752c91481fa75cbb5c962b5891/\">" +
                "              <p>1.7 小结：世间一切事务中，人是第一个宝贵的 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" graded\">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/a4577446985048fdb196a1721b622938/\">" +
                "              <p>第一讲测试 </p>" +
                "              " +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>" +
                "" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">" +
                "            </a>" +
                "          </li>" +
                "    </ul>" +
                "  </div>" +
                "" +
                "    " +
                "  <div class=\"chapter\">" +
                "      " +
                "      <h3  aria-label=\"第二讲 创新发展\">" +
                "        <a href=\"#\">" +
                "          第二讲 创新发展" +
                "        </a>" +
                "      </h3>" +
                "" +
                "    <ul>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/ee7cfa64eff04648877f7d6f3745de2b/\">" +
                "              <p>2.1 新时代：中国迈向创新强国时代 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/f0e53f80ea8e4e9390aa7bad615e1e04/\">" +
                "              <p>2.2 新跨越：科技实力跃居世界前列 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/8e4a7e7cbb30482ba2663cc6ddb5599b/\">" +
                "              <p>2.3 新机制：中国创新的“5T+1”模式 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/3e823af7b4a944118f47dcbc08aed5e6/\">" +
                "              <p>2.4 新工程：2017年中国十大科技工程 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/34ac06be23464ac28e862068b6690b92/\">" +
                "              <p>2.5 新战略：中国科技创新顶层设计 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" graded\">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/09e2a3a4697c43dfa19c118628b69413/\">" +
                "              <p>第二讲测试 </p>" +
                "              " +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>" +
                "" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">" +
                "            </a>" +
                "          </li>" +
                "    </ul>" +
                "  </div>" +
                "" +
                "    " +
                "  <div class=\"chapter\">" +
                "      " +
                "      <h3  aria-label=\"第三讲 绿色发展\">" +
                "        <a href=\"#\">" +
                "          第三讲 绿色发展" +
                "        </a>" +
                "      </h3>" +
                "" +
                "    <ul>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/5149bc45a03d4e8e9f72931cb58ef99f/\">" +
                "              <p>3.1 十九大报告与绿色发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/7c027fc381564a7b9a85fd23ade793b4/\">" +
                "              <p>3.2 习近平谈绿色发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/cdd6fc51a54144038b38cbb15c81aff1/\">" +
                "              <p>3.3 绿色发展的溯源和实践 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/c7997ee356b14e2aa229720a42ef5715/\">" +
                "              <p>3.4 绿色发展的本质和内涵 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/bf4b601aced24f029d25ebef44f280b1/\">" +
                "              <p>3.5 “十三五”规划促进绿色发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/1b04d30594f74d3a851cdf85a62a342a/\">" +
                "              <p>3.6 中国的绿色发展成就 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/cba92564bbfd4b7fb9139835f3f67fe4/\">" +
                "              <p>3.7 中国对世界的绿色贡献 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/53d4ce883c384a45acbaa9c762566750/\">" +
                "              <p>3.8 小结：生态兴则文明兴，生态衰则文明衰 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" graded\">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/2645a520388d4777aef17fa569316214/\">" +
                "              <p>第三讲测试 </p>" +
                "              " +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>" +
                "" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">" +
                "            </a>" +
                "          </li>" +
                "    </ul>" +
                "  </div>" +
                "" +
                "    " +
                "  <div class=\"chapter\">" +
                "      " +
                "      <h3  aria-label=\"第四讲 协调发展\">" +
                "        <a href=\"#\">" +
                "          第四讲 协调发展" +
                "        </a>" +
                "      </h3>" +
                "" +
                "    <ul>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/7b0428c7707b44f3ba659bc64d6fabef/\">" +
                "              <p>4.1 十九大报告与协调发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/a4a416f2ede8470e851ad6ff10f83c07/\">" +
                "              <p>4.2 习近平谈协调发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/78c45182e3c64060819ad9f8013208de/\">" +
                "              <p>4.3 协调发展的溯源和实践 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/66a4084f88e747dda928f8ed6c624abf/\">" +
                "              <p>4.4 协调发展的本质和内涵 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/88325f2ae12e4b08b1665a869ed57592/\">" +
                "              <p>4.5 协调发展之区域协调发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/2f0299000f054481a731b4f4d0cfe2c3/\">" +
                "              <p>4.6 协调发展之城乡协调发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/2f1ff1eb6c494b3e82768b73be6cff38/\">" +
                "              <p>4.7 小结：形成平衡有序稳定的发展体系 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" graded\">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/cf55efab6ca0412b86a9b19e68c086e5/\">" +
                "              <p>第四讲测试 </p>" +
                "              " +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>" +
                "" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">" +
                "            </a>" +
                "          </li>" +
                "    </ul>" +
                "  </div>" +
                "" +
                "    " +
                "  <div class=\"chapter\">" +
                "      " +
                "      <h3  aria-label=\"第五讲 开放发展\">" +
                "        <a href=\"#\">" +
                "          第五讲 开放发展" +
                "        </a>" +
                "      </h3>" +
                "" +
                "    <ul>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/b545c1b387094eea8d94b6479219435c/\">" +
                "              <p>5.1 十九大报告与开放发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/9cf5a70e738245f9acb3652206485cd8/\">" +
                "              <p>5.2 习近平谈开放发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/41cfa801753b4a149f13e83ac8b3b03b/\">" +
                "              <p>5.3 开放发展的溯源和实践 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/2950f936a7b84c49a2c192bfb1d46c6a/\">" +
                "              <p>5.4 开放发展的本质和内涵 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/ac4c0a91b9ef4d8e8c8189ad43508a42/\">" +
                "              <p>5.5 中国在世界的位置 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/a5a123f7a03745ff9498a29dbfb0912c/\">" +
                "              <p>5.6 一带一路：从战略构想到战略行动 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/145f85b62031412480638ea3cbdc64e3/\">" +
                "              <p>5.7 从“逆全球化”到“新全球化” </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/e6a957bd079a46229559928bf37b1590/\">" +
                "              <p>5.8 小结：构建人类命运共同体 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" graded\">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/ec58c21be941437d87352b008337659e/\">" +
                "              <p>第五讲测试 </p>" +
                "              " +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>" +
                "" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">" +
                "            </a>" +
                "          </li>" +
                "    </ul>" +
                "  </div>" +
                "" +
                "    " +
                "  <div class=\"chapter\">" +
                "      " +
                "      <h3  aria-label=\"第六讲 共享发展\">" +
                "        <a href=\"#\">" +
                "          第六讲 共享发展" +
                "        </a>" +
                "      </h3>" +
                "" +
                "    <ul>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/da2f690398fb4d7fb81b059752c0f324/\">" +
                "              <p>6.1 十九大报告与共享发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/56bba7420a1f441cbf044542079efb21/\">" +
                "              <p>6.2 习近平谈共享发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/cdcd4e391f7440c1a3b11cf6da563031/\">" +
                "              <p>6.3 共享发展的溯源和实践 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/da90c2a4db1c43c6af629ccd7b51cad4/\">" +
                "              <p>6.4 共享发展的本质和内涵 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/ff36762f634c477d9319c5f2104aed5e/\">" +
                "              <p>6.5 坚决打赢脱贫攻坚战 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/6c62b5a6a8234205946a9a7b3a920c41/\">" +
                "              <p>6.6 实施就业优先战略 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/639f3444c5fb4939894e8e58be9467d4/\">" +
                "              <p>6.7 推进教育现代化 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/42b284c73d074b9d9a2f7d306e9a3e0c/\">" +
                "              <p>6.8 中国推动全球包容共享发展 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" \">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/708b9e04745b4bb09a82a9e22f0960d1/\">" +
                "              <p>6.9 小结：中国共享发展之路 </p>" +
                "              " +
                "              <p class=\"subtitle\"> </p>" +
                "" +
                "            </a>" +
                "          </li>" +
                "          <li class=\" graded\">" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/df53f4c90fbd4f9187634aa291aec2b4/\">" +
                "              <p>第六讲测试 </p>" +
                "              " +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>" +
                "" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">" +
                "            </a>" +
                "          </li>" +
                "    </ul>" +
                "  </div>" +
                "" +
                "" +
                "        </nav>" +
                "      </div>" +
                "    </div>" +
                "" +
                "    <section class=\"course-content\" id=\"course-content\">" +
                "      " +
                "<h2>第一讲 以人民为中心的发展思想</h2>" +
                "" +
                "<p>您最近在<a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/8de5390cc0d241c1a59aec7e1f0ba2c6/\">1.1 以人民为中心成为国内外关注焦点</a>。如果您已经完成此章节，请选择左侧的另一个章节。</p>" +
                "" +
                "    </section>" +
                "  </div>" +
                "</div>" +
                "" +
                "<nav class=\"nav-utilities \">" +
                "  <h2 class=\"sr nav-utilities-title\">课程工具引导</h2>" +
                "" +
                "" +
                "" +
                "</nav>" +
                "" +
                "" +
                "<div id=\"accessibile-confirm-modal\" class=\"modal\" aria-hidden=\"true\">" +
                "  <div class=\"inner-wrapper\" role=\"dialog\" aria-labelledby=\"accessibile-confirm-title\">" +
                "    <button class=\"close-modal\">" +
                "      <i class=\"icon fa fa-remove\"></i>" +
                "      <span class=\"sr\">" +
                "        关闭" +
                "      </span>" +
                "    </button>" +
                "" +
                "    <header>" +
                "      <h2 id=\"accessibile-confirm-title\">" +
                "          确认" +
                "        <span class=\"sr\">," +
                "          模式打开" +
                "        </span>" +
                "      </h2>" +
                "    </header>" +
                "    <div role=\"dialogalert\" class=\"status message\" tabindex=\"-1\">" +
                "        <p class=\"message-title\"></p>" +
                "    </div>" +
                "    <hr aria-hidden=\"true\" />" +
                "    <div class=\"actions\">" +
                "        <button class=\"dismiss ok-button\">是的</button>" +
                "        <button class=\"dismiss cancel-button\" data-dismiss=\"leanModal\">取消</button>" +
                "    </div>" +
                "  </div>" +
                "  <a href=\"#accessibile-confirm-modal\" rel=\"leanModal\" id=\"confirm_open_button\" style=\"display:none\">打开</a>" +
                "</div>" +
                "" +
                "<script type=\"text/javascript\">" +
                "var accessible_confirm = function(message, callback) {" +
                "    $(\"#accessibile-confirm-modal .cancel-button\").click(function(){" +
                "        $(\"#accessibile-confirm-modal .close-modal\").click();" +
                "    });" +
                "    $(\"#accessibile-confirm-modal .ok-button\").click(function(){" +
                "        $(\"#accessibile-confirm-modal .close-modal\").click();" +
                "        callback();" +
                "    });" +
                "" +
                "    accessible_modal(\"#accessibile-confirm-modal #confirm_open_button\", \"#accessibile-confirm-modal .close-modal\", \"#accessibile-confirm-modal\", \".content-wrapper\");" +
                "    $(\"#accessibile-confirm-modal #confirm_open_button\").click();" +
                "    $(\"#accessibile-confirm-modal .message-title\").html(message);" +
                "};" +
                "</script>" +
                "" +
                "" +
                "      " +
                "    </div>" +
                "" +
                "    " +
                "      " +
                "  " +
                "      " +
                "" +
                "" +
                "" +
                "" +
                "<div class=\"wrapper-footer\">" +
                "  <style tyep=\"text/css\">" +
                "        cite.intro_data{" +
                "        display: none;" +
                "        }" +
                "        .follow_name.name_bold{" +
                "        margin-top: 2px;" +
                "        }" +
                "        iframe#sina-btn{" +
                "        margin-top: -10px;" +
                "        margin-right: -95px;" +
                "        height: 30px;" +
                "        float: right;" +
                "        }" +
                "  </style>" +
                "" +
                "  <footer>" +
                "    <div class=\"colophon\" style=\"width:100%;\">" +
                "      <nav class=\"nav-colophon\">" +
                "        <ol>" +
                "        </ol>" +
                "      </nav>" +
                "    </div>" +
                "  </footer>" +
                "</div>" +
                "" +
                "<div id=\"tu-footer\">" +
                "  <div class=\"tu-container\">" +
                "        <!--" +
                "    <div class=\"pull-left\">" +
                "        <img src=\"http://storage.xuetangx.com/spoc/hbu/logo-header.png\" height=\"60\" alt=\"Home Page\" />" +
                "    </div>" +
                "    -->" +
                "    <div class=\"pull-right\">" +
                "        <span>地址：保定市莲池区五四东路180号</span><br/>" +
                "        <span>版权所有：河北大学学堂云</span>" +
                "    </div>" +
                "  </div>" +
                "</div>" +
                "" +
                "" +
                "    " +
                "" +
                "  </div>" +
                "" +
                "    " +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-application.cc77fbdbd1fa.js\" charset=\"utf-8\"></script>" +
                "" +
                "" +
                "    " +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-modules.22cdd9bba76b.js\" charset=\"utf-8\"></script>" +
                "" +
                "" +
                "" +
                "  " +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/jquery.scrollTo-1.4.2-min.4aa3e2dfa312.js\"></script>" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/flot/jquery.flot.d3d45ff0c6a8.js\"></script>" +
                "" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/codemirror-compressed.dd4b74f7c5fe.js\"></script>" +
                "" +
                "  " +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-courseware.76c6a3e1b737.js\" charset=\"utf-8\"></script>" +
                "" +
                "" +
                "  " +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/discussion.a79d1c4307d4.js\" charset=\"utf-8\"></script>" +
                "" +
                "" +
                "" +
                "  " +
                "" +
                "" +
                "" +
                "<script type=\"text/x-mathjax-config\">" +
                "  MathJax.Hub.Config({" +
                "    tex2jax: {" +
                "      inlineMath: [" +
                "        [\"\\\\(\",\"\\\\)\"]," +
                "        ['[mathjaxinline]','[/mathjaxinline]']" +
                "      ]," +
                "      displayMath: [" +
                "        [\"\\\\[\",\"\\\\]\"]," +
                "        ['[mathjax]','[/mathjax]']" +
                "      ]" +
                "    }" +
                "  });" +
                "</script>" +
                "" +
                "<!-- This must appear after all mathjax-config blocks, so it is after the imports from the other templates." +
                "     It can't be run through static.url because MathJax uses crazy url introspection to do lazy loading of" +
                "     MathJax extension libraries -->" +
                "<script type=\"text/javascript\" src=\"//s.xuetangx.com/resource/mathjax-MathJax-727332c/MathJax.js?config=TeX-MML-AM_HTMLorMML-full\"></script>" +
                "" +
                "<script type='text/template' id='_profile_thread'>" +
                "" +
                "<article class=\"discussion-article\" data-id=\"{{id}}\">" +
                "    <div class=\"discussion-post\">" +
                "        <header>" +
                "            <h3>{{title}}</h3>" +
                "            <p class=\"posted-details\">                " +
                "                {{#user}}" +
                "                <a href=\"{{user_url}}\" class=\"username\">{{username}}</a>" +
                "                {{/user}}" +
                "                {{^user}}" +
                "                匿名" +
                "                {{/user}}" +
                "" +
                "                <span class=\"timeago\" title=\"{{created_at}}\">{{created_at}}</span>" +
                "                <span class=\"post-status-closed top-post-status\" style=\"display: none\">" +
                "                    &bull; 这个帖子已经关闭。" +
                "                </span>" +
                "            </p>" +
                "        </header>" +
                "        <div class=\"post-body\">{{abbreviatedBody}}</div>" +
                "        <div class=\"my-reply-body\">" +
                "            <h4>回复</h4>" +
                "            <ul><ul>" +
                "        </div>" +
                "    </div>" +
                "    <div class=\"post-tools\">" +
                "        <a href=\"{{permalink}}\">查看讨论</a>" +
                "    </div>" +
                "" +
                "</article>" +
                "</script>" +
                "<script type='text/template' id='_user_profile'>" +
                "" +
                "<h2>活动的帖子</h2>" +
                "<section class=\"discussion\">" +
                "    {{#threads}}" +
                "        <article class=\"discussion-thread\" id=\"thread_{{id}}\"/>" +
                "    {{/threads}}" +
                "</section>" +
                "<section class=\"pagination\"/>" +
                "</script>" +
                "<script type='text/template' id='_inline_discussion'>" +
                "" +
                "<section class=\"discussion\" data-discussion-id=\"{{discussionId}}\">" +
                "    <article class=\"new-post-article\"></article>" +
                "" +
                "    <section class=\"threads\">" +
                "        {{#threads}}" +
                "            <article class=\"discussion-thread\" id=\"thread_{{id}}\">" +
                "            </article>" +
                "        {{/threads}}" +
                "    </section>" +
                "" +
                "    <section class=\"pagination\">" +
                "    </section>" +
                "</section>" +
                "</script>" +
                "<script type='text/template' id='_pagination'>" +
                "" +
                "<nav class=\"discussion-{{discussiontype}}-paginator discussion-paginator\">" +
                "    <ol>" +
                "        {{#previous}}" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">&lt; 上一个</a></li>" +
                "        {{/previous}}" +
                "        {{#first}}" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"1\">1</a></li>" +
                "        {{/first}}" +
                "        {{#leftdots}}" +
                "        <li>…</li>" +
                "        {{/leftdots}}" +
                "" +
                "        {{#lowPages}}" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">{{number}}</a></li>" +
                "        {{/lowPages}}" +
                "        <li class=\"current-page\"><span>{{page}}</span></li>" +
                "        {{#highPages}}" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">{{number}}</a></li>" +
                "        {{/highPages}}" +
                "" +
                "        {{#rightdots}}" +
                "        <li>…</li>" +
                "        {{/rightdots}}" +
                "        {{#last}}" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">{{number}}</a></li>" +
                "        {{/last}}" +
                "        {{#next}}" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">下一个 &gt;</a></li>" +
                "        {{/next}}" +
                "    </ol>" +
                "</nav>" +
                "" +
                "</script>" +
                "" +
                "" +
                "  <!-- TODO: http://docs.jquery.com/Plugins/Validation -->" +
                "  <script type=\"text/javascript\">" +
                "    \t//document.write('\\x3Cscript type=\"text/javascript\" src=\"' +" +
                "        //document.location.protocol + '//www.youtube.com/iframe_api\">\\x3C/script>');" +
                "  </script>" +
                "" +
                "  <script type=\"text/javascript\">" +
                "    var $$course_id = \"course\\u002Dv1:TsinghuaX+hbu_2018031901X+2018_T2\";" +
                "" +
                "    $(function(){" +
                "        $(\".ui-accordion-header a, .ui-accordion-content .subtitle\").each(function() {" +
                "          var elemText = $(this).text().replace(/^\\s+|\\s+$/g,''); // Strip leading and trailing whitespace" +
                "          var wordArray = elemText.split(\" \");" +
                "          var finalTitle = \"\";" +
                "          if (wordArray.length > 0) {" +
                "            for (i=0;i<=wordArray.length-1;i++) {" +
                "              finalTitle += wordArray[i];" +
                "              if (i == (wordArray.length-2)) {" +
                "                finalTitle += \"&nbsp;\";" +
                "              } else if (i == (wordArray.length-1)) {" +
                "                // Do nothing" +
                "              } else {" +
                "                finalTitle += \" \";" +
                "              }" +
                "            }" +
                "          }" +
                "          $(this).html(finalTitle);" +
                "        });" +
                "      });" +
                "  </script>" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "  " +
                "  <div style=\"display:none;\"><script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/analyse.1a5d505ceb2d.js\"></script></div> " +
                "" +
                "</body>" +
                "</html>" +
                "" +
                "";
        Document doc = Jsoup.parse(html);
        Elements eles = doc.select("li a[href~=courseware/]");
        if(eles != null && eles.size() != 0){
            for(Element ele : eles){
                System.out.println(ele.attr("href"));
            }

        }
    }
}
