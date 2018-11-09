package com.xuetangx.zidongdati.xuetangyun;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class CoursewareDetailPageTests {
    @Test
    public void test(){
        String html = "<!DOCTYPE html>\n" +
                "<!--[if IE 7]><html class=\"ie ie7 lte9 lte8 lte7\" lang=\"zh-cn\"><![endif]-->\n" +
                "<!--[if IE 8]><html class=\"ie ie8 lte9 lte8\" lang=\"zh-cn\"><![endif]-->\n" +
                "<!--[if IE 9]><html class=\"ie ie9 lte9\" lang=\"zh-cn\"><![endif]-->\n" +
                "<!--[if gt IE 9]><!--><html lang=\"zh-cn\"><!--<![endif]-->\n" +
                "\n" +
                "<head dir=\"ltr\">\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <title>\n" +
                "\n" +
                " 第三讲测试 | hbu_2018031901X 课件 | 河北大学学堂云\n" +
                "</title>\n" +
                "\n" +
                "  <script type=\"text/javascript\">\n" +
                "    /* immediately break out of an iframe if coming from the marketing website */\n" +
                "    (function(window) {\n" +
                "      if (window.location !== window.top.location) {\n" +
                "        window.top.location = window.location;\n" +
                "      }\n" +
                "    })(this);\n" +
                "  </script>\n" +
                "\n" +
                "  <script type=\"text/javascript\" src=\"/jsi18n/\"></script>\n" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/player/jquery.min.397754ba49e9.js\"></script>\n" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/user_track.7b0c8318d1ba.js\"></script>\n" +
                "\n" +
                "  <link rel=\"icon\" type=\"image/x-icon\" href=\"http://storage.xuetangx.com/spoc/hbu/favicon.ico\" />\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-vendor.f514c2e00e9f.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-app.abbd1d326a45.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-app-extend1.dc4f981d2e3e.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "  \n" +
                "\n" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-app-extend2.a4aabe189aff.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "<style>\n" +
                "  html,body,h1,h2,h3,h4,h5,p,span {text-transform: none!important;}\n" +
                "</style>\n" +
                "    \n" +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-main_vendor.c1170b9488ac.js\" charset=\"utf-8\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <script>\n" +
                "    window.baseUrl = \"//vpc-static-cdn.xuetangx.com/static/\";\n" +
                "    (function (require) {\n" +
                "        var urlArgs = \"v=4f9cf36\";\n" +
                "      require.config({\n" +
                "          baseUrl: baseUrl,\n" +
                "          urlArgs: urlArgs\n" +
                "      });\n" +
                "    }).call(this, require || RequireJS.require);\n" +
                "  </script>\n" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/require-config-lms.da42d4d4e28b.js\"></script>\n" +
                "\n" +
                "  \n" +
                "\n" +
                "  \n" +
                "\n" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-course-vendor.b7ecded0fc78.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "    <link href=\"//vpc-static-cdn.xuetangx.com/static/css/lms-style-course.427d7c943b58.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/split.1e256a271150.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/jquery.truncate.b81308a54759.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/jquery.ajaxfileupload.27e7569a4c1e.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/Markdown.Converter.33f02cbe2eb8.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/Markdown.Sanitizer.253c591d1f95.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/Markdown.Editor.dd676cbe4563.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/jquery.autocomplete.3bd10d7510d2.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/jquery.timeago.9605aaf0437d.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/src/jquery.timeago.locale.b54a9c010cd6.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/mustache.2aa68bb79181.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/URI.min.03b89112e46e.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/backbone-min.752b6162850f.js\"></script>\n" +
                "<script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/src/tooltip_manager.0df6414b1730.js\"></script>\n" +
                "\n" +
                "<link href=\"//vpc-static-cdn.xuetangx.com/static/css/vendor/jquery.autocomplete.09a0b34739a2.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "  <!--[if lt IE 9]>\n" +
                "    <script src=\"//vpc-static-cdn.xuetangx.com/static/js/html5shiv.0ce8f355891c.js\"></script>\n" +
                "  <![endif]-->\n" +
                "\n" +
                "  \n" +
                "  <!-- dummy segment.io -->\n" +
                "<script type=\"text/javascript\">\n" +
                "  var analytics = {\n" +
                "    track: function() { return; },\n" +
                "    trackLink: function() { return; },\n" +
                "    pageview: function() { return; },\n" +
                "    page: function() { return; }\n" +
                "  };\n" +
                "</script>\n" +
                "<!-- end dummy segment.io -->\n" +
                "\n" +
                "\n" +
                "  <meta name=\"path_prefix\" content=\"\">\n" +
                "\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"http://storage.xuetangx.com/spoc/public/overrides/new/hbu.css\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"ltr courseware  lang_zh-cn\">\n" +
                "  <div class=\"window-wrap\" dir=\"ltr\">\n" +
                "    <a class=\"nav-skip\" href=\"#seq_content\">跳过本内容页</a>\n" +
                "\n" +
                "    \n" +
                "<!--[if IE]>\n" +
                "<div class=\"sr message-accessibility message\" id=\"mathjax-accessibility-message\" aria-hidden=\"true\">\n" +
                "\t<p class=\"copy\">这个页面采用MathJax技术来显示数学公式。为了使数学式可用，我们建议使用MathPlayer插件。请访问<a href=\"//www.dessci.com/en/products/mathplayer/download.htm\">MathPlayer下载页面</a> 来为你的浏览器下载插件。</p>\n" +
                "</div>\n" +
                "<div class=\"sr message-accessibility message\" id=\"mathplayer-browser-message\" aria-hidden=\"true\">\n" +
                "\t<p class=\"copy\">\n" +
                "\t 你的浏览器不支持MathPlayer插件。为了使用MathPlayer，请使用IE6到9兼容浏览器。\n" +
                "\t </p>\n" +
                "</div>\n" +
                "<![endif]-->\n" +
                "\n" +
                "\n" +
                "    \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <header class=\"global slim\" aria-label=\"全局导航\">\n" +
                "    <nav>\n" +
                "    <h1 class=\"logo\">\n" +
                "      <a href=\"/\">\n" +
                "        \n" +
                "            <img src=\"http://storage.xuetangx.com/spoc/hbu/logo-header.png\" alt=\"河北大学学堂云\"/>\n" +
                "        \n" +
                "      </a>\n" +
                "    </h1>\n" +
                "\n" +
                "        <h2>\n" +
                "            <span class=\"provider\">TsinghuaX:</span> hbu_2018031901X 习近平新时代中国特色社会主义思想\n" +
                "        </h2>\n" +
                "\n" +
                "    <ol class=\"left nav-global authenticated\">\n" +
                "      \n" +
                "          <li class=\"nav-global-01\">\n" +
                "              <a href=\"/\">查找课程</a>\n" +
                "          </li>\n" +
                "      \n" +
                "    </ol>\n" +
                "    <ol class=\"user\">\n" +
                "      <li class=\"primary\">\n" +
                "        <a href=\"/dashboard\" class=\"user-link\">\n" +
                "          <span class=\"avatar\"></span>\n" +
                "          <span class=\"sr\">控制面板： </span> hbu_20182306005\n" +
                "        </a>\n" +
                "      </li>\n" +
                "      <li class=\"primary\">\n" +
                "        <a href=\"#\" class=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"sr\">更多选择下拉列表</span> &#9662;</a>\n" +
                "        <ul class=\"dropdown-menu\" aria-label=\"More Options\" role=\"menu\">\n" +
                "          \n" +
                "              <li><a href=\"/faq\">帮助</a></li>\n" +
                "          \n" +
                "          <li><a href=\"/logout\" role=\"menuitem\">登出</a></li>\n" +
                "        </ul>\n" +
                "      </li>\n" +
                "    </ol>\n" +
                "  </nav>\n" +
                "</header>\n" +
                "<!--[if lte IE 8]>\n" +
                "<div class=\"ie-banner\" aria-hidden=\"true\"><strong>警告:</strong> 你的浏览器不能完全支持全部功能. 我们强烈建议您使用 <a href=\"https://www.google.com/intl/en/chrome/browser/\" target=\"_blank\">Chrome</a> 或 <a href=\"http://www.mozilla.org/en-US/firefox/new/\" target=\"_blank\">Firefox</a>. 并使用windows 7 以上的系统.</div>\n" +
                "<![endif]-->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    <div class=\"content-wrapper\" id=\"content\">\n" +
                "      \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<input type=\"hidden\" value=\"您的账号在其他设备或浏览器已登录，请重新登录后学习\" id=\"logged_out_msg\">\n" +
                "\n" +
                "\n" +
                "<script type=\"text/template\" id=\"image-modal-tpl\">\n" +
                "    <div class=\"wrapper-modal wrapper-modal-image\">\n" +
                "  <section class=\"image-link\">\n" +
                "    <%= smallHTML%>\n" +
                "    <a href=\"#\" class=\"modal-ui-icon action-fullscreen\" role=\"button\">\n" +
                "      <span class=\"label\">\n" +
                "        <i class=\"icon fa fa-arrows-alt fa-large\"></i> <%= gettext(\"Fullscreen\") %>\n" +
                "      </span>\n" +
                "    </a>\n" +
                "  </section>\n" +
                "\n" +
                "  <section class=\"image-modal\">\n" +
                "    <section class=\"image-content\">\n" +
                "      <div class=\"image-wrapper\">\n" +
                "        <img alt=\"<%= largeALT %>, <%= gettext('Large') %>\" src=\"<%= largeSRC %>\" />\n" +
                "      </div>\n" +
                "\n" +
                "      <a href=\"#\" class=\"modal-ui-icon action-close\" role=\"button\">\n" +
                "        <span class=\"label\">\n" +
                "          <i class=\"icon fa fa-remove fa-large\"></i> <%= gettext(\"Close\") %>\n" +
                "        </span>\n" +
                "      </a>\n" +
                "\n" +
                "      <ul class=\"image-controls\">\n" +
                "        <li class=\"image-control\">\n" +
                "          <a href=\"#\" class=\"modal-ui-icon action-zoom-in\" role=\"button\">\n" +
                "            <span class=\"label\">\n" +
                "              <i class=\"icon fa fa fa-search-plus fa-large\"></i> <%= gettext(\"Zoom In\") %>\n" +
                "            </span>\n" +
                "          </a>\n" +
                "        </li>\n" +
                "\n" +
                "        <li class=\"image-control\">\n" +
                "          <a href=\"#\" class=\"modal-ui-icon action-zoom-out is-disabled\" aria-disabled=\"true\" role=\"button\">\n" +
                "            <span class=\"label\">\n" +
                "              <i class=\"icon fa fa fa-search-minus fa-large\"></i> <%= gettext(\"Zoom Out\") %>\n" +
                "            </span>\n" +
                "          </a>\n" +
                "        </li>\n" +
                "      </ul>\n" +
                "    </section>\n" +
                "  </section>\n" +
                "</div>\n" +
                "\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "    \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<nav class=\"courseware wrapper-course-material\">\n" +
                "  <div class=\"course-material\">\n" +
                "    <ol class=\"course-tabs\" course_id=\"course-v1:TsinghuaX+hbu_2018031901X+2018_T2\">\n" +
                "        \n" +
                "          <li>\n" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware\" class=\"active\">\n" +
                "                 课件\n" +
                "                   <span class=\"sr\">, current location</span>\n" +
                "             </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li>\n" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/info\" class=\"\">\n" +
                "                 课程公告\n" +
                "             </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li>\n" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/discussion/forum\" class=\"\">\n" +
                "                 讨论区\n" +
                "             </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li>\n" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/course_wiki\" class=\"\">\n" +
                "                 Wiki\n" +
                "             </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li>\n" +
                "             <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/progress\" class=\"\">\n" +
                "                 学习进度\n" +
                "             </a>\n" +
                "          </li>\n" +
                "      \n" +
                "    </ol>\n" +
                "  </div>\n" +
                "</nav>\n" +
                "\n" +
                "<div id=\"qarobot\"></div>\n" +
                "<script src=\"//storage.xuetangx.com/public_assets/xuetangx/course/qa-robot.190034b7c0af2d862b87.js\" type=\"text/javascript\"></script>\n" +
                "\n" +
                "\n" +
                "<script type=\"text/javascript\">\n" +
                "  (function(){\n" +
                "    var courseId = 'course-v1:TsinghuaX+hbu_2018031901X+2018_T2';\n" +
                "    var showCoursesList = ['course-v1:TsinghuaX+iceeikcest_302401842x+2018_T1', \n" +
                "                            'course-v1:iceeikcest_MITX+CTDS101+2017_T2', \n" +
                "                            'course-v1:iceeikcest_MITx+CS_Python101+2017_T1', \n" +
                "                            'course-v1:UC_Berkeley+CS169_1x+2017_T2'];\n" +
                "    if(showCoursesList.indexOf(courseId) != -1 && window.location.hostname === \"mooc.engedu.ikcest.org\"){\n" +
                "        var layerFragment = document.createDocumentFragment();\n" +
                "        var layerLink = document.createElement(\"a\");\n" +
                "        layerFragment.appendChild(layerLink);\n" +
                "        layerLink.href = \"http://micro-diploma.mikecrm.com/FBykBzn\";\n" +
                "        layerLink.target = \"_blank\";\n" +
                "        layerLink.style = \"position:fixed;display:block;z-index:999999;width:114px;height:132px;right: 30px;top:50%;margin-top:-80px;\";\n" +
                "        var layerBOX = document.createElement(\"div\");\n" +
                "        layerBOX.setAttribute(\"style\", \"position:relative;width:114px;height:132px;background:url(//storagecdn.xuetangx.com/public_assets/xuetangx/UNESCO-spoc/dd9b23d58471efa75136f75b52525b6b.form-entry-114x132.png) center center no-repeat;background-size:100% auto;\");\n" +
                "        layerLink.appendChild(layerBOX);\n" +
                "        document.body.appendChild(layerFragment);\n" +
                "    }\n" +
                "  })();\n" +
                "</script>\n" +
                "\n" +
                "    \n" +
                "\n" +
                "\n" +
                "<style type=\"text/css\">\n" +
                "\n" +
                "/*******************************\n" +
                "            Button\n" +
                "*******************************/\n" +
                "\n" +
                ".ui.button {\n" +
                "  cursor: pointer;\n" +
                "  display: inline-block;\n" +
                "  min-height: 1em;\n" +
                "  outline: none;\n" +
                "  border: none;\n" +
                "  vertical-align: baseline;\n" +
                "  background-color: #e0e0e0;\n" +
                "  color: rgba(0, 0, 0, 0.6);\n" +
                "  font-family: 'Lato', 'Helvetica Neue', Arial, Helvetica, sans-serif;\n" +
                "  margin: 0em 0.25em 0em 0em;\n" +
                "  padding: 0.8em 1.5em 0.8em;\n" +
                "  text-transform: none;\n" +
                "  text-shadow: none;\n" +
                "  font-weight: bold;\n" +
                "  line-height: 1;\n" +
                "  font-style: normal;\n" +
                "  text-align: center;\n" +
                "  text-decoration: none;\n" +
                "  background-image: none;\n" +
                "  border-radius: 0.2857rem;\n" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "  -webkit-user-select: none;\n" +
                "     -moz-user-select: none;\n" +
                "      -ms-user-select: none;\n" +
                "          user-select: none;\n" +
                "  -webkit-transition: opacity 0.1s ease, background-color 0.1s ease, color 0.1s ease, box-shadow 0.1s ease, background 0.1s ease;\n" +
                "          transition: opacity 0.1s ease, background-color 0.1s ease, color 0.1s ease, box-shadow 0.1s ease, background 0.1s ease;\n" +
                "  -webkit-tap-highlight-color: transparent;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/*******************************\n" +
                "            States\n" +
                "*******************************/\n" +
                "\n" +
                "\n" +
                "/*--------------\n" +
                "      Hover\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.button:hover {\n" +
                "  background-color: #e8e8e8;\n" +
                "  background-image: none;\n" +
                "  box-shadow: '';\n" +
                "  color: rgba(0, 0, 0, 0.8);\n" +
                "}\n" +
                ".ui.button:hover .icon {\n" +
                "  opacity: 0.85;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "      Focus\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.button:focus {\n" +
                "  background-color: '';\n" +
                "  background-image: '';\n" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 0px 1px rgba(81, 167, 232, 0.8) inset, 0px 0px 3px 2px rgba(81, 167, 232, 0.8);\n" +
                "  color: rgba(0, 0, 0, 0.8);\n" +
                "}\n" +
                ".ui.button:focus .icon {\n" +
                "  opacity: 0.85;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "      Down\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.button:active,\n" +
                ".ui.active.button:active {\n" +
                "  background-color: #cccccc;\n" +
                "  background-image: '';\n" +
                "  color: rgba(0, 0, 0, 0.8);\n" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 1px 4px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "     Active\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.active.button {\n" +
                "  background-color: #d0d0d0;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0px 0px 1px transparent inset;\n" +
                "  color: rgba(0, 0, 0, 0.8);\n" +
                "}\n" +
                ".ui.button.active:hover {\n" +
                "  background-color: #d0d0d0;\n" +
                "  background-image: none;\n" +
                "  color: rgba(0, 0, 0, 0.8);\n" +
                "}\n" +
                ".ui.button.active:active {\n" +
                "  background-color: #d0d0d0;\n" +
                "  background-image: none;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "    Loading\n" +
                "---------------*/\n" +
                "\n" +
                "\n" +
                "/* Specificity hack */\n" +
                ".ui.loading.loading.loading.loading.loading.loading.button {\n" +
                "  position: relative;\n" +
                "  cursor: default;\n" +
                "  point-events: none;\n" +
                "  text-shadow: none !important;\n" +
                "  color: transparent !important;\n" +
                "  -webkit-transition: all 0s linear;\n" +
                "          transition: all 0s linear;\n" +
                "}\n" +
                ".ui.loading.button:before {\n" +
                "  position: absolute;\n" +
                "  content: '';\n" +
                "  top: 50%;\n" +
                "  left: 50%;\n" +
                "  margin: -0.64285em 0em 0em -0.64285em;\n" +
                "  width: 1.2857em;\n" +
                "  height: 1.2857em;\n" +
                "  border-radius: 500rem;\n" +
                "  border: 0.2em solid rgba(0, 0, 0, 0.15);\n" +
                "}\n" +
                ".ui.loading.button:after {\n" +
                "  position: absolute;\n" +
                "  content: '';\n" +
                "  top: 50%;\n" +
                "  left: 50%;\n" +
                "  margin: -0.64285em 0em 0em -0.64285em;\n" +
                "  width: 1.2857em;\n" +
                "  height: 1.2857em;\n" +
                "  -webkit-animation: button-spin 0.6s linear;\n" +
                "          animation: button-spin 0.6s linear;\n" +
                "  -webkit-animation-iteration-count: infinite;\n" +
                "          animation-iteration-count: infinite;\n" +
                "  border-radius: 500rem;\n" +
                "  border-color: #ffffff transparent transparent;\n" +
                "  border-style: solid;\n" +
                "  border-width: 0.2em;\n" +
                "  box-shadow: 0px 0px 0px 1px transparent;\n" +
                "}\n" +
                ".ui.labeled.icon.loading.button .icon {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: none;\n" +
                "}\n" +
                "@-webkit-keyframes button-spin {\n" +
                "  from {\n" +
                "    -webkit-transform: rotate(0deg);\n" +
                "            transform: rotate(0deg);\n" +
                "  }\n" +
                "  to {\n" +
                "    -webkit-transform: rotate(360deg);\n" +
                "            transform: rotate(360deg);\n" +
                "  }\n" +
                "}\n" +
                "@keyframes button-spin {\n" +
                "  from {\n" +
                "    -webkit-transform: rotate(0deg);\n" +
                "            transform: rotate(0deg);\n" +
                "  }\n" +
                "  to {\n" +
                "    -webkit-transform: rotate(360deg);\n" +
                "            transform: rotate(360deg);\n" +
                "  }\n" +
                "}\n" +
                ".ui.basic.loading.button:not(.inverted):before {\n" +
                "  border-color: rgba(0, 0, 0, 0.1);\n" +
                "}\n" +
                ".ui.basic.loading.button:not(.inverted):after {\n" +
                "  border-top-color: #aaaaaa;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "      Disabled\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.buttons .disabled.button,\n" +
                ".ui.disabled.button,\n" +
                ".ui.disabled.button:hover,\n" +
                ".ui.disabled.button.active {\n" +
                "  cursor: default;\n" +
                "  background-color: #dcddde !important;\n" +
                "  color: rgba(0, 0, 0, 0.4) !important;\n" +
                "  opacity: 0.3 !important;\n" +
                "  background-image: none !important;\n" +
                "  box-shadow: none !important;\n" +
                "  pointer-events: none;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/*******************************\n" +
                "             Types\n" +
                "*******************************/\n" +
                "\n" +
                "\n" +
                "/*-------------------\n" +
                "       Animated\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.animated.button {\n" +
                "  position: relative;\n" +
                "  overflow: hidden;\n" +
                "  padding-right: 0em !important;\n" +
                "}\n" +
                ".ui.animated.button .content {\n" +
                "  will-change: transform, opacity;\n" +
                "}\n" +
                ".ui.animated.button .visible.content {\n" +
                "  position: relative;\n" +
                "  margin-right: 1.5em;\n" +
                "}\n" +
                ".ui.animated.button .hidden.content {\n" +
                "  position: absolute;\n" +
                "  width: 100%;\n" +
                "}\n" +
                "\n" +
                "/* Horizontal */\n" +
                ".ui.animated.button .visible.content,\n" +
                ".ui.animated.button .hidden.content {\n" +
                "  -webkit-transition: right 0.3s ease 0s;\n" +
                "          transition: right 0.3s ease 0s;\n" +
                "}\n" +
                ".ui.animated.button .visible.content {\n" +
                "  left: auto;\n" +
                "  right: 0%;\n" +
                "}\n" +
                ".ui.animated.button .hidden.content {\n" +
                "  top: 50%;\n" +
                "  left: auto;\n" +
                "  right: -100%;\n" +
                "  margin-top: -0.5em;\n" +
                "}\n" +
                ".ui.animated.button:hover .visible.content {\n" +
                "  left: auto;\n" +
                "  right: 200%;\n" +
                "}\n" +
                ".ui.animated.button:hover .hidden.content {\n" +
                "  left: auto;\n" +
                "  right: 0%;\n" +
                "}\n" +
                "\n" +
                "/* Vertical */\n" +
                ".ui.vertical.animated.button .visible.content,\n" +
                ".ui.vertical.animated.button .hidden.content {\n" +
                "  -webkit-transition: top 0.3s ease, -webkit-transform 0.3s ease;\n" +
                "          transition: top 0.3s ease, transform 0.3s ease;\n" +
                "}\n" +
                ".ui.vertical.animated.button .visible.content {\n" +
                "  -webkit-transform: translateY(0%);\n" +
                "      -ms-transform: translateY(0%);\n" +
                "          transform: translateY(0%);\n" +
                "  right: auto;\n" +
                "}\n" +
                ".ui.vertical.animated.button .hidden.content {\n" +
                "  top: -50%;\n" +
                "  left: 0%;\n" +
                "  right: auto;\n" +
                "}\n" +
                ".ui.vertical.animated.button:hover .visible.content {\n" +
                "  -webkit-transform: translateY(200%);\n" +
                "      -ms-transform: translateY(200%);\n" +
                "          transform: translateY(200%);\n" +
                "  right: auto;\n" +
                "}\n" +
                ".ui.vertical.animated.button:hover .hidden.content {\n" +
                "  top: 50%;\n" +
                "  right: auto;\n" +
                "}\n" +
                "\n" +
                "/* Fade */\n" +
                ".ui.fade.animated.button .visible.content,\n" +
                ".ui.fade.animated.button .hidden.content {\n" +
                "  -webkit-transition: opacity 0.3s ease, -webkit-transform 0.3s ease;\n" +
                "          transition: opacity 0.3s ease, transform 0.3s ease;\n" +
                "}\n" +
                ".ui.fade.animated.button .visible.content {\n" +
                "  left: auto;\n" +
                "  right: auto;\n" +
                "  opacity: 1;\n" +
                "  -webkit-transform: scale(1);\n" +
                "      -ms-transform: scale(1);\n" +
                "          transform: scale(1);\n" +
                "}\n" +
                ".ui.fade.animated.button .hidden.content {\n" +
                "  opacity: 0;\n" +
                "  left: 0%;\n" +
                "  right: auto;\n" +
                "  -webkit-transform: scale(1.5);\n" +
                "      -ms-transform: scale(1.5);\n" +
                "          transform: scale(1.5);\n" +
                "}\n" +
                ".ui.fade.animated.button:hover .visible.content {\n" +
                "  left: auto;\n" +
                "  right: auto;\n" +
                "  opacity: 0;\n" +
                "  -webkit-transform: scale(0.75);\n" +
                "      -ms-transform: scale(0.75);\n" +
                "          transform: scale(0.75);\n" +
                "}\n" +
                ".ui.fade.animated.button:hover .hidden.content {\n" +
                "  left: 0%;\n" +
                "  right: auto;\n" +
                "  opacity: 1;\n" +
                "  -webkit-transform: scale(1);\n" +
                "      -ms-transform: scale(1);\n" +
                "          transform: scale(1);\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "       Inverted\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.inverted.button {\n" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;\n" +
                "  background: transparent none;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none !important;\n" +
                "}\n" +
                ".ui.inverted.buttons .button {\n" +
                "  margin: 0px 0px 0px -2px;\n" +
                "}\n" +
                ".ui.inverted.buttons .button:first-child {\n" +
                "  margin-left: 0em;\n" +
                "}\n" +
                ".ui.inverted.vertical.buttons .button {\n" +
                "  margin: 0px 0px -2px 0px;\n" +
                "}\n" +
                ".ui.inverted.vertical.buttons .button:first-child {\n" +
                "  margin-top: 0em;\n" +
                "}\n" +
                ".ui.inverted.buttons .button:hover {\n" +
                "  position: relative;\n" +
                "}\n" +
                ".ui.inverted.button:hover {\n" +
                "  background: #ffffff;\n" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.8);\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "       Social\n" +
                "--------------------*/\n" +
                "\n" +
                "\n" +
                "/* Facebook */\n" +
                ".ui.facebook.button {\n" +
                "  background-color: #3b579d;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.facebook.button:hover {\n" +
                "  background-color: #3f5da8;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.facebook.button:active {\n" +
                "  background-color: #314983;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Twitter */\n" +
                ".ui.twitter.button {\n" +
                "  background-color: #4092cc;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.twitter.button:hover {\n" +
                "  background-color: #4c99cf;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.twitter.button:active {\n" +
                "  background-color: #3180b7;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Google Plus */\n" +
                ".ui.google.plus.button {\n" +
                "  background-color: #d34836;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.google.plus.button:hover {\n" +
                "  background-color: #d65343;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.google.plus.button:active {\n" +
                "  background-color: #bc3a29;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Linked In */\n" +
                ".ui.linkedin.button {\n" +
                "  background-color: #1f88be;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.linkedin.button:hover {\n" +
                "  background-color: #2191cb;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.linkedin.button:active {\n" +
                "  background-color: #1a729f;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* YouTube */\n" +
                ".ui.youtube.button {\n" +
                "  background-color: #cc181e;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.youtube.button:hover {\n" +
                "  background-color: #da1a20;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.youtube.button:active {\n" +
                "  background-color: #ac1419;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Instagram */\n" +
                ".ui.instagram.button {\n" +
                "  background-color: #49769c;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.instagram.button:hover {\n" +
                "  background-color: #4e7ea6;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.instagram.button:active {\n" +
                "  background-color: #3e6484;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Pinterest */\n" +
                ".ui.pinterest.button {\n" +
                "  background-color: #00aced;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.pinterest.button:hover {\n" +
                "  background-color: #00b7fc;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.pinterest.button:active {\n" +
                "  background-color: #0092c9;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* VK */\n" +
                ".ui.vk.button {\n" +
                "  background-color: #4D7198;\n" +
                "  color: #ffffff;\n" +
                "  background-image: none;\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.vk.button:hover {\n" +
                "  background-color: #5279a2;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.vk.button:active {\n" +
                "  background-color: #415f80;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "     Icon\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.button > .icon {\n" +
                "  opacity: 0.8;\n" +
                "  margin: 0em 0.4em 0em -0.2em;\n" +
                "  -webkit-transition: opacity 0.2s ease;\n" +
                "          transition: opacity 0.2s ease;\n" +
                "  vertical-align: baseline;\n" +
                "  color: '';\n" +
                "}\n" +
                ".ui.button > .right.icon {\n" +
                "  margin: 0em -0.2em 0em 0.4em;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/*******************************\n" +
                "           Variations\n" +
                "*******************************/\n" +
                "\n" +
                "\n" +
                "/*-------------------\n" +
                "       Floated\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui[class*=\"left floated\"].buttons,\n" +
                ".ui[class*=\"left floated\"].button {\n" +
                "  float: left;\n" +
                "  margin-left: 0em;\n" +
                "  margin-right: 0.25em;\n" +
                "}\n" +
                ".ui[class*=\"right floated\"].buttons,\n" +
                ".ui[class*=\"right floated\"].button {\n" +
                "  float: right;\n" +
                "  margin-right: 0em;\n" +
                "  margin-left: 0.25em;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "       Compact\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.compact.buttons .button,\n" +
                ".ui.compact.button {\n" +
                "  padding: 0.6em 1.125em 0.6em;\n" +
                "}\n" +
                ".ui.compact.icon.buttons .button,\n" +
                ".ui.compact.icon.button {\n" +
                "  padding: 0.6em 0.6em 0.6em;\n" +
                "}\n" +
                ".ui.compact.labeled.icon.buttons .button,\n" +
                ".ui.compact.labeled.icon.button {\n" +
                "  padding: 0.6em 3.725em 0.6em;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "        Sizes\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.mini.buttons .button,\n" +
                ".ui.mini.buttons .or,\n" +
                ".ui.mini.button {\n" +
                "  font-size: 0.71428571rem;\n" +
                "}\n" +
                ".ui.tiny.buttons .button,\n" +
                ".ui.tiny.buttons .or,\n" +
                ".ui.tiny.button {\n" +
                "  font-size: 0.85714286rem;\n" +
                "}\n" +
                ".ui.small.buttons .button,\n" +
                ".ui.small.buttons .or,\n" +
                ".ui.small.button {\n" +
                "  font-size: 0.92857143rem;\n" +
                "}\n" +
                ".ui.buttons .button,\n" +
                ".ui.buttons .or,\n" +
                ".ui.button {\n" +
                "  font-size: 1rem;\n" +
                "}\n" +
                ".ui.large.buttons .button,\n" +
                ".ui.large.buttons .or,\n" +
                ".ui.large.button {\n" +
                "  font-size: 1.14285714rem;\n" +
                "}\n" +
                ".ui.big.buttons .button,\n" +
                ".ui.big.buttons .or,\n" +
                ".ui.big.button {\n" +
                "  font-size: 1.28571429rem;\n" +
                "}\n" +
                ".ui.huge.buttons .button,\n" +
                ".ui.huge.buttons .or,\n" +
                ".ui.huge.button {\n" +
                "  font-size: 1.42857143rem;\n" +
                "}\n" +
                ".ui.massive.buttons .button,\n" +
                ".ui.massive.buttons .or,\n" +
                ".ui.massive.button {\n" +
                "  font-size: 1.71428571rem;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "    Icon Only\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.icon.buttons .button,\n" +
                ".ui.icon.button {\n" +
                "  padding: 0.8em 0.8em 0.8em;\n" +
                "}\n" +
                ".ui.icon.buttons .button > .icon,\n" +
                ".ui.icon.button > .icon {\n" +
                "  opacity: 0.9;\n" +
                "  margin: 0em;\n" +
                "  vertical-align: top;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "        Basic\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.basic.buttons .button,\n" +
                ".ui.basic.button {\n" +
                "  background: transparent !important;\n" +
                "  background-image: none;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "  font-weight: normal;\n" +
                "  border-radius: 0.2857rem;\n" +
                "  text-transform: none;\n" +
                "  text-shadow: none !important;\n" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.basic.buttons {\n" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15);\n" +
                "  border-radius: 0.2857rem;\n" +
                "}\n" +
                ".ui.basic.buttons .button {\n" +
                "  border-radius: 0em;\n" +
                "}\n" +
                ".ui.basic.buttons .button:hover,\n" +
                ".ui.basic.button:hover {\n" +
                "  background: #fafafa !important;\n" +
                "  color: rgba(0, 0, 0, 0.8) !important;\n" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) inset, 0px 0px 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.basic.buttons .button:active,\n" +
                ".ui.basic.button:active {\n" +
                "  background: #f8f8f8 !important;\n" +
                "  color: rgba(0, 0, 0, 0.8) !important;\n" +
                "  box-shadow: 0px 0px 0px 1px rgba(0, 0, 0, 0.15) inset, 0px 1px 4px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.basic.buttons .button.active,\n" +
                ".ui.basic.button.active {\n" +
                "  background: rgba(0, 0, 0, 0.05) !important;\n" +
                "  box-shadow: '' !important;\n" +
                "  color: rgba(0, 0, 0, 0.8);\n" +
                "  box-shadow: rgba(39, 41, 43, 0.3);\n" +
                "}\n" +
                ".ui.basic.buttons .button.active:hover,\n" +
                ".ui.basic.button.active:hover {\n" +
                "  background-color: rgba(0, 0, 0, 0.05);\n" +
                "}\n" +
                "\n" +
                "/* Vertical */\n" +
                ".ui.basic.buttons .button:hover {\n" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) inset, 0px 0px 0px 0px rgba(39, 41, 43, 0.15) inset inset;\n" +
                "}\n" +
                ".ui.basic.buttons .button:active {\n" +
                "  box-shadow: 0px 0px 0px 1px rgba(0, 0, 0, 0.15) inset, 0px 1px 4px 0px rgba(39, 41, 43, 0.15) inset inset;\n" +
                "}\n" +
                ".ui.basic.buttons .button.active {\n" +
                "  box-shadow: rgba(39, 41, 43, 0.3) inset;\n" +
                "}\n" +
                "\n" +
                "/* Standard Basic Inverted */\n" +
                ".ui.basic.inverted.buttons .button,\n" +
                ".ui.basic.inverted.button {\n" +
                "  background-color: transparent !important;\n" +
                "  color: #fafafa !important;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "}\n" +
                ".ui.basic.inverted.buttons .button:hover,\n" +
                ".ui.basic.inverted.button:hover {\n" +
                "  color: #ffffff !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;\n" +
                "}\n" +
                ".ui.basic.inverted.buttons .button:active,\n" +
                ".ui.basic.inverted.button:active {\n" +
                "  background-color: rgba(255, 255, 255, 0.05) !important;\n" +
                "  color: #ffffff !important;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.9) inset !important;\n" +
                "}\n" +
                ".ui.basic.inverted.buttons .button.active,\n" +
                ".ui.basic.inverted.button.active {\n" +
                "  background-color: rgba(255, 255, 255, 0.05);\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.7) inset;\n" +
                "}\n" +
                ".ui.basic.inverted.buttons .button.active:hover,\n" +
                ".ui.basic.inverted.button.active:hover {\n" +
                "  background-color: rgba(255, 255, 255, 0.07);\n" +
                "  box-shadow: 0px 0px 0px 2px #ffffff inset !important;\n" +
                "}\n" +
                "\n" +
                "/* Basic Group */\n" +
                ".ui.basic.buttons .button {\n" +
                "  border-left: 1px solid rgba(39, 41, 43, 0.15);\n" +
                "  box-shadow: none;\n" +
                "}\n" +
                ".ui.basic.vertical.buttons .button {\n" +
                "  border-left: none;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "  Labeled Icon\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.labeled.icon.buttons .button,\n" +
                ".ui.labeled.icon.button {\n" +
                "  position: relative;\n" +
                "  padding-left: 4.1em !important;\n" +
                "  padding-right: 1.5em !important;\n" +
                "}\n" +
                "\n" +
                "/* Left Labeled */\n" +
                ".ui.labeled.icon.buttons > .button > .icon,\n" +
                ".ui.labeled.icon.button > .icon {\n" +
                "  position: absolute;\n" +
                "  width: 2.6em;\n" +
                "  height: 100%;\n" +
                "  background-color: rgba(0, 0, 0, 0.05);\n" +
                "  text-align: center;\n" +
                "  color: '';\n" +
                "  border-radius: 0.2857rem 0px 0px 0.2857rem;\n" +
                "  line-height: 1;\n" +
                "  box-shadow: -1px 0px 0px 0px transparent inset;\n" +
                "}\n" +
                "\n" +
                "/* Left Labeled */\n" +
                ".ui.labeled.icon.buttons > .button > .icon,\n" +
                ".ui.labeled.icon.button > .icon {\n" +
                "  top: 0em;\n" +
                "  left: 0em;\n" +
                "}\n" +
                "\n" +
                "/* Right Labeled */\n" +
                ".ui[class*=\"right labeled\"].icon.button {\n" +
                "  padding-right: 4.1em !important;\n" +
                "  padding-left: 1.5em !important;\n" +
                "}\n" +
                ".ui[class*=\"right labeled\"].icon.button > .icon {\n" +
                "  left: auto;\n" +
                "  right: 0em;\n" +
                "  border-radius: 0em 0.2857rem 0.2857rem 0em;\n" +
                "  box-shadow: 1px 0px 0px 0px transparent inset;\n" +
                "}\n" +
                ".ui.labeled.icon.buttons > .button > .icon:before,\n" +
                ".ui.labeled.icon.button > .icon:before,\n" +
                ".ui.labeled.icon.buttons > .button > .icon:after,\n" +
                ".ui.labeled.icon.button > .icon:after {\n" +
                "  display: block;\n" +
                "  position: absolute;\n" +
                "  width: 100%;\n" +
                "  top: 50%;\n" +
                "  text-align: center;\n" +
                "  margin-top: -0.5em;\n" +
                "}\n" +
                ".ui.labeled.icon.buttons .button > .icon {\n" +
                "  border-radius: 0em;\n" +
                "}\n" +
                ".ui.labeled.icon.buttons .button:first-child > .icon {\n" +
                "  border-top-left-radius: 0.2857rem;\n" +
                "  border-bottom-left-radius: 0.2857rem;\n" +
                "}\n" +
                ".ui.labeled.icon.buttons .button:last-child > .icon {\n" +
                "  border-top-right-radius: 0.2857rem;\n" +
                "  border-bottom-right-radius: 0.2857rem;\n" +
                "}\n" +
                ".ui.vertical.labeled.icon.buttons .button:first-child > .icon {\n" +
                "  border-radius: 0em;\n" +
                "  border-top-left-radius: 0.2857rem;\n" +
                "}\n" +
                ".ui.vertical.labeled.icon.buttons .button:last-child > .icon {\n" +
                "  border-radius: 0em;\n" +
                "  border-bottom-left-radius: 0.2857rem;\n" +
                "}\n" +
                "\n" +
                "/* Fluid Labeled */\n" +
                ".ui.fluid[class*=\"left labeled\"].icon.button,\n" +
                ".ui.fluid[class*=\"right labeled\"].icon.button {\n" +
                "  padding-left: 1.5em !important;\n" +
                "  padding-right: 1.5em !important;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "     Toggle\n" +
                "---------------*/\n" +
                "\n" +
                "\n" +
                "/* Toggle (Modifies active state to give affordances) */\n" +
                ".ui.toggle.buttons .active.button,\n" +
                ".ui.buttons .button.toggle.active,\n" +
                ".ui.button.toggle.active {\n" +
                "  background-color: #5bbd72 !important;\n" +
                "  box-shadow: none !important;\n" +
                "  text-shadow: none;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.button.toggle.active:hover {\n" +
                "  background-color: #66c17b !important;\n" +
                "  text-shadow: none;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "    Circular\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.circular.button {\n" +
                "  border-radius: 10em;\n" +
                "}\n" +
                ".ui.circular.button > .icon {\n" +
                "  width: 1em;\n" +
                "  vertical-align: baseline;\n" +
                "}\n" +
                "\n" +
                "/*--------------\n" +
                "     Attached\n" +
                "---------------*/\n" +
                "\n" +
                ".ui.attached.button {\n" +
                "  display: block;\n" +
                "  margin: 0em;\n" +
                "  box-shadow: 0px 0px 0px 1px rgba(39, 41, 43, 0.15) !important;\n" +
                "  border-radius: 0em;\n" +
                "}\n" +
                ".ui.attached.top.button {\n" +
                "  border-radius: 0.2857rem 0.2857rem 0em 0em;\n" +
                "}\n" +
                ".ui.attached.bottom.button {\n" +
                "  border-radius: 0em 0em 0.2857rem 0.2857rem;\n" +
                "}\n" +
                ".ui.attached.left.button {\n" +
                "  display: inline-block;\n" +
                "  border-left: none;\n" +
                "  padding-right: 0.75em;\n" +
                "  text-align: right;\n" +
                "  border-radius: 0.2857rem 0em 0em 0.2857rem;\n" +
                "}\n" +
                ".ui.attached.right.button {\n" +
                "  display: inline-block;\n" +
                "  padding-left: 0.75em;\n" +
                "  text-align: left;\n" +
                "  border-radius: 0em 0.2857rem 0.2857rem 0em;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "      Or Buttons\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.buttons .or {\n" +
                "  position: relative;\n" +
                "  float: left;\n" +
                "  width: 0.3em;\n" +
                "  height: 2.6em;\n" +
                "  z-index: 3;\n" +
                "}\n" +
                ".ui.buttons .or:before {\n" +
                "  position: absolute;\n" +
                "  content: 'or';\n" +
                "  top: 50%;\n" +
                "  left: 50%;\n" +
                "  background-color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  margin-top: -0.9em;\n" +
                "  margin-left: -0.9em;\n" +
                "  width: 1.8em;\n" +
                "  height: 1.8em;\n" +
                "  line-height: 1.6em;\n" +
                "  color: rgba(0, 0, 0, 0.4);\n" +
                "  font-style: normal;\n" +
                "  font-weight: bold;\n" +
                "  text-align: center;\n" +
                "  border-radius: 500em;\n" +
                "  box-shadow: 0px 0px 0px 1px transparent inset;\n" +
                "}\n" +
                ".ui.buttons .or[data-text]:before {\n" +
                "  content: attr(data-text);\n" +
                "}\n" +
                "\n" +
                "/* Fluid Or */\n" +
                ".ui.fluid.buttons .or {\n" +
                "  width: 0em !important;\n" +
                "}\n" +
                ".ui.fluid.buttons .or:after {\n" +
                "  display: none;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "       Attached\n" +
                "--------------------*/\n" +
                "\n" +
                "\n" +
                "/* Plural Attached */\n" +
                ".attached.ui.buttons {\n" +
                "  margin: 0px;\n" +
                "  border-radius: 0em 0em 0em 0em;\n" +
                "}\n" +
                ".attached.ui.buttons .button {\n" +
                "  margin: 0em;\n" +
                "}\n" +
                ".attached.ui.buttons .button:first-child {\n" +
                "  border-radius: 0em 0em 0em 0em;\n" +
                "}\n" +
                ".attached.ui.buttons .button:last-child {\n" +
                "  border-radius: 0em 0em 0em 0em;\n" +
                "}\n" +
                "\n" +
                "/* Top Side */\n" +
                "[class*=\"top attached\"].ui.buttons {\n" +
                "  margin-bottom: -1px;\n" +
                "  border-radius: 0.2857rem 0.2857rem 0em 0em;\n" +
                "}\n" +
                "[class*=\"top attached\"].ui.buttons .button:first-child {\n" +
                "  border-radius: 0.2857rem 0em 0em 0em;\n" +
                "}\n" +
                "[class*=\"top attached\"].ui.buttons .button:last-child {\n" +
                "  border-radius: 0em 0.2857rem 0em 0em;\n" +
                "}\n" +
                "\n" +
                "/* Bottom Side */\n" +
                "[class*=\"bottom attached\"].ui.buttons {\n" +
                "  margin-top: -1px;\n" +
                "  border-radius: 0em 0em 0.2857rem 0.2857rem;\n" +
                "}\n" +
                "[class*=\"bottom attached\"].ui.buttons .button:first-child {\n" +
                "  border-radius: 0em 0em 0em 0.2857rem;\n" +
                "}\n" +
                "[class*=\"bottom attached\"].ui.buttons .button:last-child {\n" +
                "  border-radius: 0em 0em 0.2857rem 0em;\n" +
                "}\n" +
                "\n" +
                "/* Left Side */\n" +
                "[class*=\"left attached\"].ui.buttons {\n" +
                "  margin-left: -1px;\n" +
                "  border-radius: 0em 0.2857rem 0.2857rem 0em;\n" +
                "}\n" +
                "[class*=\"left attached\"].ui.buttons .button:first-child {\n" +
                "  margin-left: -1px;\n" +
                "  border-radius: 0em 0.2857rem 0em 0em;\n" +
                "}\n" +
                "[class*=\"left attached\"].ui.buttons .button:last-child {\n" +
                "  margin-left: -1px;\n" +
                "  border-radius: 0em 0em 0.2857rem 0em;\n" +
                "}\n" +
                "\n" +
                "/* Right Side */\n" +
                "[class*=\"right attached\"].ui.buttons,\n" +
                "[class*=\"right attached\"].ui.buttons .button {\n" +
                "  margin-right: -1px;\n" +
                "  border-radius: 0.2857rem 0em 0em 0.2857rem;\n" +
                "}\n" +
                "[class*=\"right attached\"].ui.buttons .button:first-child {\n" +
                "  margin-left: -1px;\n" +
                "  border-radius: 0.2857rem 0em 0em 0em;\n" +
                "}\n" +
                "[class*=\"right attached\"].ui.buttons .button:last-child {\n" +
                "  margin-left: -1px;\n" +
                "  border-radius: 0em 0em 0em 0.2857rem;\n" +
                "}\n" +
                "\n" +
                "/* Fluid */\n" +
                ".ui.fluid.buttons,\n" +
                ".ui.button.fluid,\n" +
                ".ui.fluid.buttons > .button {\n" +
                "  display: block;\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\32.buttons,\n" +
                ".ui.two.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\32.buttons > .button,\n" +
                ".ui.two.buttons > .button {\n" +
                "  width: 50%;\n" +
                "}\n" +
                ".ui.\\33.buttons,\n" +
                ".ui.three.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\33.buttons > .button,\n" +
                ".ui.three.buttons > .button {\n" +
                "  width: 33.333%;\n" +
                "}\n" +
                ".ui.\\34.buttons,\n" +
                ".ui.four.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\34.buttons > .button,\n" +
                ".ui.four.buttons > .button {\n" +
                "  width: 25%;\n" +
                "}\n" +
                ".ui.\\35.buttons,\n" +
                ".ui.five.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\35.buttons > .button,\n" +
                ".ui.five.buttons > .button {\n" +
                "  width: 20%;\n" +
                "}\n" +
                ".ui.\\36.buttons,\n" +
                ".ui.six.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\36.buttons > .button,\n" +
                ".ui.six.buttons > .button {\n" +
                "  width: 16.666%;\n" +
                "}\n" +
                ".ui.\\37.buttons,\n" +
                ".ui.seven.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\37.buttons > .button,\n" +
                ".ui.seven.buttons > .button {\n" +
                "  width: 14.285%;\n" +
                "}\n" +
                ".ui.\\38.buttons,\n" +
                ".ui.eight.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\38.buttons > .button,\n" +
                ".ui.eight.buttons > .button {\n" +
                "  width: 12.500%;\n" +
                "}\n" +
                ".ui.\\39.buttons,\n" +
                ".ui.nine.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\39.buttons > .button,\n" +
                ".ui.nine.buttons > .button {\n" +
                "  width: 11.11%;\n" +
                "}\n" +
                ".ui.\\31\\30.buttons,\n" +
                ".ui.ten.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\31\\30.buttons > .button,\n" +
                ".ui.ten.buttons > .button {\n" +
                "  width: 10%;\n" +
                "}\n" +
                ".ui.\\31\\31.buttons,\n" +
                ".ui.eleven.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\31\\31.buttons > .button,\n" +
                ".ui.eleven.buttons > .button {\n" +
                "  width: 9.09%;\n" +
                "}\n" +
                ".ui.\\31\\32.buttons,\n" +
                ".ui.twelve.buttons {\n" +
                "  width: 100%;\n" +
                "}\n" +
                ".ui.\\31\\32.buttons > .button,\n" +
                ".ui.twelve.buttons > .button {\n" +
                "  width: 8.3333%;\n" +
                "}\n" +
                "\n" +
                "/* Fluid Vertical Buttons */\n" +
                ".ui.fluid.vertical.buttons,\n" +
                ".ui.fluid.vertical.buttons > .button {\n" +
                "  display: block;\n" +
                "  width: auto;\n" +
                "}\n" +
                ".ui.\\32.vertical.buttons > .button,\n" +
                ".ui.two.vertical.buttons > .button {\n" +
                "  height: 50%;\n" +
                "}\n" +
                ".ui.\\33.vertical.buttons > .button,\n" +
                ".ui.three.vertical.buttons > .button {\n" +
                "  height: 33.333%;\n" +
                "}\n" +
                ".ui.\\34.vertical.buttons > .button,\n" +
                ".ui.four.vertical.buttons > .button {\n" +
                "  height: 25%;\n" +
                "}\n" +
                ".ui.\\35.vertical.buttons > .button,\n" +
                ".ui.five.vertical.buttons > .button {\n" +
                "  height: 20%;\n" +
                "}\n" +
                ".ui.\\36.vertical.buttons > .button,\n" +
                ".ui.six.vertical.buttons > .button {\n" +
                "  height: 16.666%;\n" +
                "}\n" +
                ".ui.\\37.vertical.buttons > .button,\n" +
                ".ui.seven.vertical.buttons > .button {\n" +
                "  height: 14.285%;\n" +
                "}\n" +
                ".ui.\\38.vertical.buttons > .button,\n" +
                ".ui.eight.vertical.buttons > .button {\n" +
                "  height: 12.500%;\n" +
                "}\n" +
                ".ui.\\39.vertical.buttons > .button,\n" +
                ".ui.nine.vertical.buttons > .button {\n" +
                "  height: 11.11%;\n" +
                "}\n" +
                ".ui.\\31\\30.vertical.buttons > .button,\n" +
                ".ui.ten.vertical.buttons > .button {\n" +
                "  height: 10%;\n" +
                "}\n" +
                ".ui.\\31\\31.vertical.buttons > .button,\n" +
                ".ui.eleven.vertical.buttons > .button {\n" +
                "  height: 9.09%;\n" +
                "}\n" +
                ".ui.\\31\\32.vertical.buttons > .button,\n" +
                ".ui.twelve.vertical.buttons > .button {\n" +
                "  height: 8.3333%;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "       Colors\n" +
                "--------------------*/\n" +
                "\n" +
                "\n" +
                "/*--- Black ---*/\n" +
                "\n" +
                ".ui.black.buttons .button,\n" +
                ".ui.black.button {\n" +
                "  background-color: #1b1c1d;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.black.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.black.buttons .button:hover,\n" +
                ".ui.black.button:hover {\n" +
                "  background-color: #1b1c1d;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.black.buttons .button:active,\n" +
                ".ui.black.button:active {\n" +
                "  background-color: #0a0a0b;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.black.buttons .button.active,\n" +
                ".ui.black.buttons .button.active:active,\n" +
                ".ui.black.button.active,\n" +
                ".ui.black.button .button.active:active {\n" +
                "  background-color: #0f0f10;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.black.buttons .button,\n" +
                ".ui.basic.black.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.black.buttons .button:hover,\n" +
                ".ui.basic.black.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #1b1c1d inset !important;\n" +
                "  color: #1b1c1d !important;\n" +
                "}\n" +
                ".ui.basic.black.buttons .button:active,\n" +
                ".ui.basic.black.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #0a0a0b inset !important;\n" +
                "  color: #0a0a0b !important;\n" +
                "}\n" +
                ".ui.basic.black.buttons .button.active,\n" +
                ".ui.basic.black.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #0a0a0b inset !important;\n" +
                "  color: #0a0a0b !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.black.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.black.buttons .button,\n" +
                ".ui.inverted.black.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #d4d4d5 inset !important;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.black.buttons .button:hover,\n" +
                ".ui.inverted.black.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;\n" +
                "  background-color: #333333;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.black.buttons .button.active,\n" +
                ".ui.inverted.black.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;\n" +
                "  background-color: #333333;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.black.buttons .button:active,\n" +
                ".ui.inverted.black.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #212121 inset !important;\n" +
                "  background-color: #212121;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.black.basic.buttons .button,\n" +
                ".ui.inverted.black.buttons .basic.button,\n" +
                ".ui.inverted.black.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.black.basic.buttons .button:hover,\n" +
                ".ui.inverted.black.buttons .basic.button:hover,\n" +
                ".ui.inverted.black.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.black.basic.buttons .button.active,\n" +
                ".ui.inverted.black.buttons .basic.button.active,\n" +
                ".ui.inverted.black.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #333333 inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.black.basic.buttons .button:active,\n" +
                ".ui.inverted.black.buttons .basic.button:active,\n" +
                ".ui.inverted.black.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #212121 inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Blue ---*/\n" +
                "\n" +
                ".ui.blue.buttons .button,\n" +
                ".ui.blue.button {\n" +
                "  background-color: #3b83c0;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.blue.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.blue.buttons .button:hover,\n" +
                ".ui.blue.button:hover {\n" +
                "  background-color: #458ac6;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.blue.buttons .button:active,\n" +
                ".ui.blue.button:active {\n" +
                "  background-color: #3370a5;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.blue.buttons .button.active,\n" +
                ".ui.blue.buttons .button.active:active,\n" +
                ".ui.blue.button.active,\n" +
                ".ui.blue.button .button.active:active {\n" +
                "  background-color: #3576ac;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.blue.buttons .button,\n" +
                ".ui.basic.blue.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.blue.buttons .button:hover,\n" +
                ".ui.basic.blue.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #458ac6 inset !important;\n" +
                "  color: #458ac6 !important;\n" +
                "}\n" +
                ".ui.basic.blue.buttons .button:active,\n" +
                ".ui.basic.blue.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #3370a5 inset !important;\n" +
                "  color: #3370a5 !important;\n" +
                "}\n" +
                ".ui.basic.blue.buttons .button.active,\n" +
                ".ui.basic.blue.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #3370a5 inset !important;\n" +
                "  color: #3370a5 !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.blue.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.blue.buttons .button,\n" +
                ".ui.inverted.blue.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;\n" +
                "  color: #54c8ff;\n" +
                "}\n" +
                ".ui.inverted.blue.buttons .button:hover,\n" +
                ".ui.inverted.blue.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;\n" +
                "  background-color: #54c8ff;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.blue.buttons .button.active,\n" +
                ".ui.inverted.blue.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;\n" +
                "  background-color: #54c8ff;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.blue.buttons .button:active,\n" +
                ".ui.inverted.blue.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #30bdff inset !important;\n" +
                "  background-color: #30bdff;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.blue.basic.buttons .button,\n" +
                ".ui.inverted.blue.buttons .basic.button,\n" +
                ".ui.inverted.blue.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.blue.basic.buttons .button:hover,\n" +
                ".ui.inverted.blue.buttons .basic.button:hover,\n" +
                ".ui.inverted.blue.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;\n" +
                "  color: #54c8ff !important;\n" +
                "}\n" +
                ".ui.inverted.blue.basic.buttons .button.active,\n" +
                ".ui.inverted.blue.buttons .basic.button.active,\n" +
                ".ui.inverted.blue.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #54c8ff inset !important;\n" +
                "  color: #54c8ff !important;\n" +
                "}\n" +
                ".ui.inverted.blue.basic.buttons .button:active,\n" +
                ".ui.inverted.blue.buttons .basic.button:active,\n" +
                ".ui.inverted.blue.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #30bdff inset !important;\n" +
                "  color: #54c8ff !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Green ---*/\n" +
                "\n" +
                ".ui.green.buttons .button,\n" +
                ".ui.green.button {\n" +
                "  background-color: #5bbd72;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.green.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.green.buttons .button:hover,\n" +
                ".ui.green.button:hover {\n" +
                "  background-color: #66c17b;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.green.buttons .button:active,\n" +
                ".ui.green.button:active {\n" +
                "  background-color: #46ae5f;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.green.buttons .button.active,\n" +
                ".ui.green.buttons .button.active:active,\n" +
                ".ui.green.button.active,\n" +
                ".ui.green.button .button.active:active {\n" +
                "  background-color: #49b562;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.green.buttons .button,\n" +
                ".ui.basic.green.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.green.buttons .button:hover,\n" +
                ".ui.basic.green.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #66c17b inset !important;\n" +
                "  color: #66c17b !important;\n" +
                "}\n" +
                ".ui.basic.green.buttons .button:active,\n" +
                ".ui.basic.green.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #46ae5f inset !important;\n" +
                "  color: #46ae5f !important;\n" +
                "}\n" +
                ".ui.basic.green.buttons .button.active,\n" +
                ".ui.basic.green.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #46ae5f inset !important;\n" +
                "  color: #46ae5f !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.green.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.green.buttons .button,\n" +
                ".ui.inverted.green.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;\n" +
                "  color: #2ecc40;\n" +
                "}\n" +
                ".ui.inverted.green.buttons .button:hover,\n" +
                ".ui.inverted.green.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;\n" +
                "  background-color: #2ecc40;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.green.buttons .button.active,\n" +
                ".ui.inverted.green.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;\n" +
                "  background-color: #2ecc40;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.green.buttons .button:active,\n" +
                ".ui.inverted.green.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #27af37 inset !important;\n" +
                "  background-color: #27af37;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.green.basic.buttons .button,\n" +
                ".ui.inverted.green.buttons .basic.button,\n" +
                ".ui.inverted.green.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.green.basic.buttons .button:hover,\n" +
                ".ui.inverted.green.buttons .basic.button:hover,\n" +
                ".ui.inverted.green.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;\n" +
                "  color: #2ecc40 !important;\n" +
                "}\n" +
                ".ui.inverted.green.basic.buttons .button.active,\n" +
                ".ui.inverted.green.buttons .basic.button.active,\n" +
                ".ui.inverted.green.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #2ecc40 inset !important;\n" +
                "  color: #2ecc40 !important;\n" +
                "}\n" +
                ".ui.inverted.green.basic.buttons .button:active,\n" +
                ".ui.inverted.green.buttons .basic.button:active,\n" +
                ".ui.inverted.green.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #27af37 inset !important;\n" +
                "  color: #2ecc40 !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Orange ---*/\n" +
                "\n" +
                ".ui.orange.buttons .button,\n" +
                ".ui.orange.button {\n" +
                "  background-color: $orange;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.orange.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.orange.buttons .button:hover,\n" +
                ".ui.orange.button:hover {\n" +
                "  background-color: $orange_dark;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.orange.buttons .button:active,\n" +
                ".ui.orange.button:active {\n" +
                "  background-color: $orange_dark;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.orange.buttons .button.active,\n" +
                ".ui.orange.buttons .button.active:active,\n" +
                ".ui.orange.button.active,\n" +
                ".ui.orange.button .button.active:active {\n" +
                "  background-color: #0f0f10;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.orange.buttons .button,\n" +
                ".ui.basic.orange.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.orange.buttons .button:hover,\n" +
                ".ui.basic.orange.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #e28560 inset !important;\n" +
                "  color: #e28560 !important;\n" +
                "}\n" +
                ".ui.basic.orange.buttons .button:active,\n" +
                ".ui.basic.orange.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #db6435 inset !important;\n" +
                "  color: #db6435 !important;\n" +
                "}\n" +
                ".ui.basic.orange.buttons .button.active,\n" +
                ".ui.basic.orange.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #db6435 inset !important;\n" +
                "  color: #db6435 !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.orange.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.orange.buttons .button,\n" +
                ".ui.inverted.orange.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;\n" +
                "  color: #ff851b;\n" +
                "}\n" +
                ".ui.inverted.orange.buttons .button:hover,\n" +
                ".ui.inverted.orange.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;\n" +
                "  background-color: #ff851b;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.orange.buttons .button.active,\n" +
                ".ui.inverted.orange.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;\n" +
                "  background-color: #ff851b;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.orange.buttons .button:active,\n" +
                ".ui.inverted.orange.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #f67300 inset !important;\n" +
                "  background-color: #f67300;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.orange.basic.buttons .button,\n" +
                ".ui.inverted.orange.buttons .basic.button,\n" +
                ".ui.inverted.orange.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.orange.basic.buttons .button:hover,\n" +
                ".ui.inverted.orange.buttons .basic.button:hover,\n" +
                ".ui.inverted.orange.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;\n" +
                "  color: #ff851b !important;\n" +
                "}\n" +
                ".ui.inverted.orange.basic.buttons .button.active,\n" +
                ".ui.inverted.orange.buttons .basic.button.active,\n" +
                ".ui.inverted.orange.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff851b inset !important;\n" +
                "  color: #ff851b !important;\n" +
                "}\n" +
                ".ui.inverted.orange.basic.buttons .button:active,\n" +
                ".ui.inverted.orange.buttons .basic.button:active,\n" +
                ".ui.inverted.orange.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #f67300 inset !important;\n" +
                "  color: #ff851b !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Pink ---*/\n" +
                "\n" +
                ".ui.pink.buttons .button,\n" +
                ".ui.pink.button {\n" +
                "  background-color: #d9499a;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.pink.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.pink.buttons .button:hover,\n" +
                ".ui.pink.button:hover {\n" +
                "  background-color: #dc56a1;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.pink.buttons .button:active,\n" +
                ".ui.pink.button:active {\n" +
                "  background-color: #d22c8a;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.pink.buttons .button.active,\n" +
                ".ui.pink.buttons .button.active:active,\n" +
                ".ui.pink.button.active,\n" +
                ".ui.pink.button .button.active:active {\n" +
                "  background-color: #d5348e;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.pink.buttons .button,\n" +
                ".ui.basic.pink.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.pink.buttons .button:hover,\n" +
                ".ui.basic.pink.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #dc56a1 inset !important;\n" +
                "  color: #dc56a1 !important;\n" +
                "}\n" +
                ".ui.basic.pink.buttons .button:active,\n" +
                ".ui.basic.pink.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #d22c8a inset !important;\n" +
                "  color: #d22c8a !important;\n" +
                "}\n" +
                ".ui.basic.pink.buttons .button.active,\n" +
                ".ui.basic.pink.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #d22c8a inset !important;\n" +
                "  color: #d22c8a !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.pink.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.pink.buttons .button,\n" +
                ".ui.inverted.pink.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;\n" +
                "  color: #ff8edf;\n" +
                "}\n" +
                ".ui.inverted.pink.buttons .button:hover,\n" +
                ".ui.inverted.pink.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;\n" +
                "  background-color: #ff8edf;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.pink.buttons .button.active,\n" +
                ".ui.inverted.pink.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;\n" +
                "  background-color: #ff8edf;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.pink.buttons .button:active,\n" +
                ".ui.inverted.pink.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff6ad5 inset !important;\n" +
                "  background-color: #ff6ad5;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.pink.basic.buttons .button,\n" +
                ".ui.inverted.pink.buttons .basic.button,\n" +
                ".ui.inverted.pink.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.pink.basic.buttons .button:hover,\n" +
                ".ui.inverted.pink.buttons .basic.button:hover,\n" +
                ".ui.inverted.pink.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;\n" +
                "  color: #ff8edf !important;\n" +
                "}\n" +
                ".ui.inverted.pink.basic.buttons .button.active,\n" +
                ".ui.inverted.pink.buttons .basic.button.active,\n" +
                ".ui.inverted.pink.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff8edf inset !important;\n" +
                "  color: #ff8edf !important;\n" +
                "}\n" +
                ".ui.inverted.pink.basic.buttons .button:active,\n" +
                ".ui.inverted.pink.buttons .basic.button:active,\n" +
                ".ui.inverted.pink.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff6ad5 inset !important;\n" +
                "  color: #ff8edf !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Purple ---*/\n" +
                "\n" +
                ".ui.purple.buttons .button,\n" +
                ".ui.purple.button {\n" +
                "  background-color: #95278a;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.purple.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.purple.buttons .button:hover,\n" +
                ".ui.purple.button:hover {\n" +
                "  background-color: #7e1275;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.purple.buttons .button:active,\n" +
                ".ui.purple.button:active {\n" +
                "  background-color: #64045c;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.purple.buttons .button.active,\n" +
                ".ui.purple.buttons .button.active:active,\n" +
                ".ui.purple.button.active,\n" +
                ".ui.purple.button .button.active:active {\n" +
                "  background-color: #4c467a;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.purple.buttons .button,\n" +
                ".ui.basic.purple.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.purple.buttons .button:hover,\n" +
                ".ui.basic.purple.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #5c5594 inset !important;\n" +
                "  color: #5c5594 !important;\n" +
                "}\n" +
                ".ui.basic.purple.buttons .button:active,\n" +
                ".ui.basic.purple.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #484273 inset !important;\n" +
                "  color: #484273 !important;\n" +
                "}\n" +
                ".ui.basic.purple.buttons .button.active,\n" +
                ".ui.basic.purple.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #484273 inset !important;\n" +
                "  color: #484273 !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.purple.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.purple.buttons .button,\n" +
                ".ui.inverted.purple.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;\n" +
                "  color: #cdc6ff;\n" +
                "}\n" +
                ".ui.inverted.purple.buttons .button:hover,\n" +
                ".ui.inverted.purple.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;\n" +
                "  background-color: #cdc6ff;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                ".ui.inverted.purple.buttons .button.active,\n" +
                ".ui.inverted.purple.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;\n" +
                "  background-color: #cdc6ff;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                ".ui.inverted.purple.buttons .button:active,\n" +
                ".ui.inverted.purple.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #aea2ff inset !important;\n" +
                "  background-color: #aea2ff;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.purple.basic.buttons .button,\n" +
                ".ui.inverted.purple.buttons .basic.button,\n" +
                ".ui.inverted.purple.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.purple.basic.buttons .button:hover,\n" +
                ".ui.inverted.purple.buttons .basic.button:hover,\n" +
                ".ui.inverted.purple.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;\n" +
                "  color: #cdc6ff !important;\n" +
                "}\n" +
                ".ui.inverted.purple.basic.buttons .button.active,\n" +
                ".ui.inverted.purple.buttons .basic.button.active,\n" +
                ".ui.inverted.purple.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #cdc6ff inset !important;\n" +
                "  color: #cdc6ff !important;\n" +
                "}\n" +
                ".ui.inverted.purple.basic.buttons .button:active,\n" +
                ".ui.inverted.purple.buttons .basic.button:active,\n" +
                ".ui.inverted.purple.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #aea2ff inset !important;\n" +
                "  color: #cdc6ff !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Red ---*/\n" +
                "\n" +
                ".ui.red.buttons .button,\n" +
                ".ui.red.button {\n" +
                "  background-color: #d95c5c;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.red.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.red.buttons .button:hover,\n" +
                ".ui.red.button:hover {\n" +
                "  background-color: #dc6868;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.red.buttons .button:active,\n" +
                ".ui.red.button:active {\n" +
                "  background-color: #d23f3f;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.red.buttons .button.active,\n" +
                ".ui.red.buttons .button.active:active,\n" +
                ".ui.red.button.active,\n" +
                ".ui.red.button .button.active:active {\n" +
                "  background-color: #d44747;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.red.buttons .button,\n" +
                ".ui.basic.red.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.red.buttons .button:hover,\n" +
                ".ui.basic.red.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #dc6868 inset !important;\n" +
                "  color: #dc6868 !important;\n" +
                "}\n" +
                ".ui.basic.red.buttons .button:active,\n" +
                ".ui.basic.red.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #d23f3f inset !important;\n" +
                "  color: #d23f3f !important;\n" +
                "}\n" +
                ".ui.basic.red.buttons .button.active,\n" +
                ".ui.basic.red.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #d23f3f inset !important;\n" +
                "  color: #d23f3f !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.red.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.red.buttons .button,\n" +
                ".ui.inverted.red.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;\n" +
                "  color: #ff695e;\n" +
                "}\n" +
                ".ui.inverted.red.buttons .button:hover,\n" +
                ".ui.inverted.red.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;\n" +
                "  background-color: #ff695e;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.red.buttons .button.active,\n" +
                ".ui.inverted.red.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;\n" +
                "  background-color: #ff695e;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                ".ui.inverted.red.buttons .button:active,\n" +
                ".ui.inverted.red.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff483a inset !important;\n" +
                "  background-color: #ff483a;\n" +
                "  color: #ffffff;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.red.basic.buttons .button,\n" +
                ".ui.inverted.red.buttons .basic.button,\n" +
                ".ui.inverted.red.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.red.basic.buttons .button:hover,\n" +
                ".ui.inverted.red.buttons .basic.button:hover,\n" +
                ".ui.inverted.red.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;\n" +
                "  color: #ff695e !important;\n" +
                "}\n" +
                ".ui.inverted.red.basic.buttons .button.active,\n" +
                ".ui.inverted.red.buttons .basic.button.active,\n" +
                ".ui.inverted.red.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff695e inset !important;\n" +
                "  color: #ff695e !important;\n" +
                "}\n" +
                ".ui.inverted.red.basic.buttons .button:active,\n" +
                ".ui.inverted.red.buttons .basic.button:active,\n" +
                ".ui.inverted.red.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ff483a inset !important;\n" +
                "  color: #ff695e !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Teal ---*/\n" +
                "\n" +
                ".ui.teal.buttons .button,\n" +
                ".ui.teal.button {\n" +
                "  background-color: #00b5ad;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.teal.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.teal.buttons .button:hover,\n" +
                ".ui.teal.button:hover {\n" +
                "  background-color: #00c4bc;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.teal.buttons .button:active,\n" +
                ".ui.teal.button:active {\n" +
                "  background-color: #00918b;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.teal.buttons .button.active,\n" +
                ".ui.teal.buttons .button.active:active,\n" +
                ".ui.teal.button.active,\n" +
                ".ui.teal.button .button.active:active {\n" +
                "  background-color: #009c95;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.teal.buttons .button,\n" +
                ".ui.basic.teal.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.teal.buttons .button:hover,\n" +
                ".ui.basic.teal.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #00c4bc inset !important;\n" +
                "  color: #00c4bc !important;\n" +
                "}\n" +
                ".ui.basic.teal.buttons .button:active,\n" +
                ".ui.basic.teal.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #00918b inset !important;\n" +
                "  color: #00918b !important;\n" +
                "}\n" +
                ".ui.basic.teal.buttons .button.active,\n" +
                ".ui.basic.teal.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #00918b inset !important;\n" +
                "  color: #00918b !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.teal.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.teal.buttons .button,\n" +
                ".ui.inverted.teal.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;\n" +
                "  color: #6dffff;\n" +
                "}\n" +
                ".ui.inverted.teal.buttons .button:hover,\n" +
                ".ui.inverted.teal.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;\n" +
                "  background-color: #6dffff;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                ".ui.inverted.teal.buttons .button.active,\n" +
                ".ui.inverted.teal.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;\n" +
                "  background-color: #6dffff;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                ".ui.inverted.teal.buttons .button:active,\n" +
                ".ui.inverted.teal.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #49ffff inset !important;\n" +
                "  background-color: #49ffff;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.teal.basic.buttons .button,\n" +
                ".ui.inverted.teal.buttons .basic.button,\n" +
                ".ui.inverted.teal.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.teal.basic.buttons .button:hover,\n" +
                ".ui.inverted.teal.buttons .basic.button:hover,\n" +
                ".ui.inverted.teal.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;\n" +
                "  color: #6dffff !important;\n" +
                "}\n" +
                ".ui.inverted.teal.basic.buttons .button.active,\n" +
                ".ui.inverted.teal.buttons .basic.button.active,\n" +
                ".ui.inverted.teal.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #6dffff inset !important;\n" +
                "  color: #6dffff !important;\n" +
                "}\n" +
                ".ui.inverted.teal.basic.buttons .button:active,\n" +
                ".ui.inverted.teal.buttons .basic.button:active,\n" +
                ".ui.inverted.teal.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #49ffff inset !important;\n" +
                "  color: #6dffff !important;\n" +
                "}\n" +
                "\n" +
                "/*--- Yellow ---*/\n" +
                "\n" +
                ".ui.yellow.buttons .button,\n" +
                ".ui.yellow.button {\n" +
                "  background-color: #f2c61f;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.yellow.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.yellow.buttons .button:hover,\n" +
                ".ui.yellow.button:hover {\n" +
                "  background-color: #f3ca2d;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.yellow.buttons .button:active,\n" +
                ".ui.yellow.button:active {\n" +
                "  background-color: #e0b40d;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.yellow.buttons .button.active,\n" +
                ".ui.yellow.buttons .button.active:active,\n" +
                ".ui.yellow.button.active,\n" +
                ".ui.yellow.button .button.active:active {\n" +
                "  background-color: #eabc0e;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Basic */\n" +
                ".ui.basic.yellow.buttons .button,\n" +
                ".ui.basic.yellow.button {\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(39, 41, 43, 0.15) inset !important;\n" +
                "  color: rgba(0, 0, 0, 0.6) !important;\n" +
                "}\n" +
                ".ui.basic.yellow.buttons .button:hover,\n" +
                ".ui.basic.yellow.button:hover {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #f3ca2d inset !important;\n" +
                "  color: #f3ca2d !important;\n" +
                "}\n" +
                ".ui.basic.yellow.buttons .button:active,\n" +
                ".ui.basic.yellow.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #e0b40d inset !important;\n" +
                "  color: #e0b40d !important;\n" +
                "}\n" +
                ".ui.basic.yellow.buttons .button.active,\n" +
                ".ui.basic.yellow.button.active {\n" +
                "  background: transparent !important;\n" +
                "  box-shadow: 0px 0px 0px 2px #e0b40d inset !important;\n" +
                "  color: #e0b40d !important;\n" +
                "}\n" +
                ".ui.buttons > .basic.yellow.button:not(:first-child) {\n" +
                "  margin-left: -2px;\n" +
                "}\n" +
                "\n" +
                "/* Inverted */\n" +
                ".ui.inverted.yellow.buttons .button,\n" +
                ".ui.inverted.yellow.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;\n" +
                "  color: #ffe21f;\n" +
                "}\n" +
                ".ui.inverted.yellow.buttons .button:hover,\n" +
                ".ui.inverted.yellow.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;\n" +
                "  background-color: #ffe21f;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                ".ui.inverted.yellow.buttons .button.active,\n" +
                ".ui.inverted.yellow.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;\n" +
                "  background-color: #ffe21f;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                ".ui.inverted.yellow.buttons .button:active,\n" +
                ".ui.inverted.yellow.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #fada00 inset !important;\n" +
                "  background-color: #fada00;\n" +
                "  color: #1b1c1d;\n" +
                "}\n" +
                "\n" +
                "/* Inverted Basic */\n" +
                ".ui.inverted.yellow.basic.buttons .button,\n" +
                ".ui.inverted.yellow.buttons .basic.button,\n" +
                ".ui.inverted.yellow.basic.button {\n" +
                "  background-color: transparent;\n" +
                "  box-shadow: 0px 0px 0px 2px rgba(255, 255, 255, 0.5) inset !important;\n" +
                "  color: #ffffff !important;\n" +
                "}\n" +
                ".ui.inverted.yellow.basic.buttons .button:hover,\n" +
                ".ui.inverted.yellow.buttons .basic.button:hover,\n" +
                ".ui.inverted.yellow.basic.button:hover {\n" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;\n" +
                "  color: #ffe21f !important;\n" +
                "}\n" +
                ".ui.inverted.yellow.basic.buttons .button.active,\n" +
                ".ui.inverted.yellow.buttons .basic.button.active,\n" +
                ".ui.inverted.yellow.basic.button.active {\n" +
                "  box-shadow: 0px 0px 0px 2px #ffe21f inset !important;\n" +
                "  color: #ffe21f !important;\n" +
                "}\n" +
                ".ui.inverted.yellow.basic.buttons .button:active,\n" +
                ".ui.inverted.yellow.buttons .basic.button:active,\n" +
                ".ui.inverted.yellow.basic.button:active {\n" +
                "  box-shadow: 0px 0px 0px 2px #fada00 inset !important;\n" +
                "  color: #ffe21f !important;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "       Primary\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.primary.buttons .button,\n" +
                ".ui.primary.button {\n" +
                "  background-color: #3b83c0;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.primary.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.primary.buttons .button:hover,\n" +
                ".ui.primary.button:hover {\n" +
                "  background-color: #458ac6;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.primary.buttons .button:active,\n" +
                ".ui.primary.button:active {\n" +
                "  background-color: #3370a5;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.primary.buttons .active.button,\n" +
                ".ui.primary.button.active {\n" +
                "  background-color: #3576ac;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/*-------------------\n" +
                "      Secondary\n" +
                "--------------------*/\n" +
                "\n" +
                ".ui.secondary.buttons .button,\n" +
                ".ui.secondary.button {\n" +
                "  background-color: #1b1c1d;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.secondary.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.secondary.buttons .button:hover,\n" +
                ".ui.secondary.button:hover {\n" +
                "  background-color: #222425;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.secondary.buttons .button:active,\n" +
                ".ui.secondary.button:active {\n" +
                "  background-color: #0a0a0b;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.secondary.buttons .active.button,\n" +
                ".ui.secondary.button.active {\n" +
                "  background-color: #0f0f10;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/*---------------\n" +
                "    Positive\n" +
                "----------------*/\n" +
                "\n" +
                ".ui.positive.buttons .button,\n" +
                ".ui.positive.button {\n" +
                "  background-color: #5bbd72 !important;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.positive.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.positive.buttons .button:hover,\n" +
                ".ui.positive.button:hover,\n" +
                ".ui.positive.buttons .active.button,\n" +
                ".ui.positive.button.active {\n" +
                "  background-color: #66c17b !important;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.positive.buttons .button:active,\n" +
                ".ui.positive.button:active {\n" +
                "  background-color: #46ae5f !important;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.positive.buttons .button.active,\n" +
                ".ui.positive.buttons .button.active:active,\n" +
                ".ui.positive.button.active,\n" +
                ".ui.positive.button .button.active:active {\n" +
                "  background-color: #49b562;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/*---------------\n" +
                "     Negative\n" +
                "----------------*/\n" +
                "\n" +
                ".ui.negative.buttons .button,\n" +
                ".ui.negative.button {\n" +
                "  background-color: #d95c5c !important;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "  background-image: none;\n" +
                "}\n" +
                ".ui.negative.button {\n" +
                "  box-shadow: 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.negative.buttons .button:hover,\n" +
                ".ui.negative.button:hover,\n" +
                ".ui.negative.buttons .active.button,\n" +
                ".ui.negative.button.active {\n" +
                "  background-color: #dc6868 !important;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.negative.buttons .button:active,\n" +
                ".ui.negative.button:active {\n" +
                "  background-color: #d23f3f !important;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                ".ui.negative.buttons .button.active,\n" +
                ".ui.negative.buttons .button.active:active,\n" +
                ".ui.negative.button.active,\n" +
                ".ui.negative.button .button.active:active {\n" +
                "  background-color: #d44747;\n" +
                "  color: #ffffff;\n" +
                "  text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/*******************************\n" +
                "            Groups\n" +
                "*******************************/\n" +
                "\n" +
                ".ui.buttons {\n" +
                "  display: inline-block;\n" +
                "  vertical-align: middle;\n" +
                "  margin: 0em 0.25em 0em 0em;\n" +
                "}\n" +
                ".ui.buttons > .button:hover,\n" +
                ".ui.buttons > .button.active {\n" +
                "  position: relative;\n" +
                "}\n" +
                ".ui.buttons:after {\n" +
                "  content: \".\";\n" +
                "  display: block;\n" +
                "  height: 0;\n" +
                "  clear: both;\n" +
                "  visibility: hidden;\n" +
                "}\n" +
                ".ui.buttons .button:first-child {\n" +
                "  border-left: none;\n" +
                "}\n" +
                ".ui.buttons:not(.basic):not(.inverted) {\n" +
                "  box-shadow: none;\n" +
                "}\n" +
                ".ui.buttons > .ui.button:not(.basic):not(.inverted),\n" +
                ".ui.buttons:not(.basic):not(.inverted) > .button {\n" +
                "  box-shadow: 0px 0px 0px 1px transparent inset, 0px 0em 0px 0px rgba(39, 41, 43, 0.15) inset;\n" +
                "}\n" +
                ".ui.buttons .button {\n" +
                "  margin: 0em;\n" +
                "  float: left;\n" +
                "  border-radius: 0em;\n" +
                "  margin: 0px 0px 0px 0px;\n" +
                "}\n" +
                ".ui.buttons .button:first-child {\n" +
                "  margin-left: 0em;\n" +
                "  border-top-left-radius: 0.2857rem;\n" +
                "  border-bottom-left-radius: 0.2857rem;\n" +
                "}\n" +
                ".ui.buttons .button:last-child {\n" +
                "  border-top-right-radius: 0.2857rem;\n" +
                "  border-bottom-right-radius: 0.2857rem;\n" +
                "}\n" +
                "\n" +
                "/* Vertical  Style */\n" +
                ".ui.vertical.buttons {\n" +
                "  display: inline-block;\n" +
                "}\n" +
                ".ui.vertical.buttons .button {\n" +
                "  display: block;\n" +
                "  float: none;\n" +
                "  margin: 0px 0px 0px 0px;\n" +
                "  box-shadow: none;\n" +
                "}\n" +
                ".ui.vertical.buttons .button:first-child,\n" +
                ".ui.vertical.buttons .mini.button:first-child,\n" +
                ".ui.vertical.buttons .tiny.button:first-child,\n" +
                ".ui.vertical.buttons .small.button:first-child,\n" +
                ".ui.vertical.buttons .massive.button:first-child,\n" +
                ".ui.vertical.buttons .huge.button:first-child {\n" +
                "  border-radius: 0.2857rem 0.2857rem 0px 0px;\n" +
                "}\n" +
                ".ui.vertical.buttons .button:last-child,\n" +
                ".ui.vertical.buttons .mini.button:last-child,\n" +
                ".ui.vertical.buttons .tiny.button:last-child,\n" +
                ".ui.vertical.buttons .small.button:last-child,\n" +
                ".ui.vertical.buttons .massive.button:last-child,\n" +
                ".ui.vertical.buttons .huge.button:last-child,\n" +
                ".ui.vertical.buttons .gigantic.button:last-child {\n" +
                "  margin-bottom: 0px;\n" +
                "  border-radius: 0px 0px 0.2857rem 0.2857rem;\n" +
                "}\n" +
                "\n" +
                "    .g_modal {\n" +
                "        position: fixed;\n" +
                "        display: table;\n" +
                "        width: 100%;\n" +
                "        height: 100%;\n" +
                "        top: 0;\n" +
                "        left: 0;\n" +
                "        background-color: rgba(0, 0, 0, .75);\n" +
                "        text-align: center;\n" +
                "\n" +
                "        -webkit-transition: all 0.3s;\n" +
                "        -moz-transition: all 0.3s;\n" +
                "        -ms-transition: all 0.3s;\n" +
                "        transition: all 0.3s;\n" +
                "        animation: g_modal_fade .3s;\n" +
                "        -webkit-animation: g_modal_fade .3s;\n" +
                "        -moz-animation: g_modal_fade .3s;\n" +
                "        -ms-animation: g_modal_fade .3s;\n" +
                "    }\n" +
                "    .g_modal.g_modal_scroll {\n" +
                "        overflow-y: scroll;\n" +
                "        display: block;\n" +
                "    }\n" +
                "    .g_modal.g_modal_scroll .g_modal_cell {\n" +
                "        display: block;\n" +
                "    }\n" +
                "    .g_modal .g_modal_closeBtn {\n" +
                "        position: absolute;\n" +
                "        right: 5px;\n" +
                "        top: 5px;\n" +
                "        cursor: pointer;\n" +
                "        width: 38px;\n" +
                "        height: 38px;\n" +
                "        border-radius: 2px;\n" +
                "        background: #FFF;\n" +
                "        font-family: \"xt\";\n" +
                "        text-align: center;\n" +
                "        line-height: 38px;\n" +
                "        font-size: 30px;\n" +
                "        color: #CCC;\n" +
                "    }\n" +
                "    .g_modal .g_modal_closeBtn:hover {\n" +
                "        font-size: 32px;\n" +
                "    }\n" +
                "    .g_modal .g_modal_closeBtn:before {\n" +
                "        content: \"k\";\n" +
                "    }\n" +
                "    .g_modal.g_modal_remove {\n" +
                "        background-color: rgba(0, 0, 0, 0);\n" +
                "    }\n" +
                "    .g_modal .g_modal_cell {\n" +
                "        display: table-cell;\n" +
                "        vertical-align: middle;\n" +
                "    }\n" +
                "    .g_modal .g_modal_wrap {\n" +
                "        animation: g_modal_move .3s;\n" +
                "        -webkit-animation: g_modal_move .3s;\n" +
                "        -moz-animation: g_modal_move .3s;\n" +
                "        -ms-animation: g_modal_move .3s;\n" +
                "        -webkit-transition: all 0.3s;\n" +
                "        -moz-transition: all 0.3s;\n" +
                "        -ms-transition: all 0.3s;\n" +
                "        transition: all 0.3s;\n" +
                "        background: #FFF;\n" +
                "        border-radius: 3px;\n" +
                "        max-width: 720px;\n" +
                "        margin: 0 auto;\n" +
                "        cursor: auto;\n" +
                "        position: relative;\n" +
                "        overflow: hidden;\n" +
                "        text-align: left;\n" +
                "    }\n" +
                "    .g_modal.g_modal_remove .g_modal_wrap {\n" +
                "        -webkit-transform: translate3d(0, -100%, 0);\n" +
                "        -moz-transform: translate3d(0, -100%, 0);\n" +
                "        -ms-transform: translate3d(0, -100%, 0);\n" +
                "        transform: translate3d(0, -100%, 0);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    @-webkit-keyframes g_modal_move {\n" +
                "        0% {\n" +
                "            -webkit-transform: translate3d(0, 100%, 0);\n" +
                "            -moz-transform: translate3d(0, 100%, 0);\n" +
                "            -ms-transform: translate3d(0, 100%, 0);\n" +
                "            transform: translate3d(0, 100%, 0);\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            -webkit-transform: translate3d(0, 0, 0);\n" +
                "            -moz-transform: translate3d(0, 0, 0);\n" +
                "            -ms-transform: translate3d(0, 0, 0);\n" +
                "            transform: translate3d(0, 0, 0);\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "    @-moz-keyframes g_modal_move {\n" +
                "        0% {\n" +
                "            -webkit-transform: translate3d(0, 100%, 0);\n" +
                "            -moz-transform: translate3d(0, 100%, 0);\n" +
                "            -ms-transform: translate3d(0, 100%, 0);\n" +
                "            transform: translate3d(0, 100%, 0);\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            -webkit-transform: translate3d(0, 0, 0);\n" +
                "            -moz-transform: translate3d(0, 0, 0);\n" +
                "            -ms-transform: translate3d(0, 0, 0);\n" +
                "            transform: translate3d(0, 0, 0);\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "    @-ms-keyframes g_modal_move {\n" +
                "        0% {\n" +
                "            -webkit-transform: translate3d(0, 100%, 0);\n" +
                "            -moz-transform: translate3d(0, 100%, 0);\n" +
                "            -ms-transform: translate3d(0, 100%, 0);\n" +
                "            transform: translate3d(0, 100%, 0);\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            -webkit-transform: translate3d(0, 0, 0);\n" +
                "            -moz-transform: translate3d(0, 0, 0);\n" +
                "            -ms-transform: translate3d(0, 0, 0);\n" +
                "            transform: translate3d(0, 0, 0);\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "    @keyframes g_modal_move {\n" +
                "        0% {\n" +
                "            -webkit-transform: translate3d(0, 100%, 0);\n" +
                "            -moz-transform: translate3d(0, 100%, 0);\n" +
                "            -ms-transform: translate3d(0, 100%, 0);\n" +
                "            transform: translate3d(0, 100%, 0);\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            -webkit-transform: translate3d(0, 0, 0);\n" +
                "            -moz-transform: translate3d(0, 0, 0);\n" +
                "            -ms-transform: translate3d(0, 0, 0);\n" +
                "            transform: translate3d(0, 0, 0);\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "    @-ms-keyframes g_modal_fade {\n" +
                "        0% {\n" +
                "            background: rgba(0, 0, 0, 0);\n" +
                "        }\n" +
                "        100% {\n" +
                "            background: rgba(0, 0, 0, .6);\n" +
                "        }\n" +
                "    }\n" +
                "    @-webkit-keyframes g_modal_fade {\n" +
                "        0% {\n" +
                "            background: rgba(0, 0, 0, 0);\n" +
                "        }\n" +
                "        100% {\n" +
                "            background: rgba(0, 0, 0, .6);\n" +
                "        }\n" +
                "    }\n" +
                "    @-moz-keyframes g_modal_fade {\n" +
                "        0% {\n" +
                "            background: rgba(0, 0, 0, 0);\n" +
                "        }\n" +
                "        100% {\n" +
                "            background: rgba(0, 0, 0, .6);\n" +
                "        }\n" +
                "    }\n" +
                "    @keyframes g_modal_fade {\n" +
                "        0% {\n" +
                "            background: rgba(0, 0, 0, 0);\n" +
                "        }\n" +
                "        100% {\n" +
                "            background: rgba(0, 0, 0, .6);\n" +
                "        }\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_purple {\n" +
                "        border-top: 8px solid #95278a;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_green {\n" +
                "        border-top: 8px solid #09b673;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_red {\n" +
                "        border-top: 8px solid #ce2432;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_purple .g_modal_plus_title {\n" +
                "        color: #95278a;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_green .g_modal_plus_title {\n" +
                "        color: #09b673;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_red .g_modal_plus_title {\n" +
                "        color: #ce2432;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_purple .g_modal_plus_title span {\n" +
                "        background: #95278a;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_purple .g_modal_plus_title span:before {\n" +
                "        content: \"l\";\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_green .g_modal_plus_title span {\n" +
                "        background: #09b673;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_green .g_modal_plus_title span:before {\n" +
                "        content: \"s\";\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_red .g_modal_plus_title span {\n" +
                "        background: #ce2432;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_red .g_modal_plus_title span:before {\n" +
                "        content: \"b\";\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_wrap {\n" +
                "        border-radius: 3px;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_title {\n" +
                "        height: 60px;\n" +
                "        line-height: 60px;\n" +
                "        font-size: 22px;\n" +
                "        overflow: hidden;\n" +
                "        padding-right: 60px;\n" +
                "        color: #95278a;\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_plus_title span {\n" +
                "        font-family: \"xt\";\n" +
                "        font-size: 28px;\n" +
                "        display:inline-block;\n" +
                "        width: 35px;\n" +
                "        height: 35px;\n" +
                "        line-height:35px;\n" +
                "        overflow: hidden;\n" +
                "        background: #95278a;\n" +
                "        border-radius: 50%;\n" +
                "        text-align: center;\n" +
                "        margin: 0 20px;\n" +
                "        color: #FFF;\n" +
                "        transform: translate(0, 20%);\n" +
                "        -webkit-transform: translate(0, 20%);\n" +
                "        -moz-transform: translate(0, 20%);\n" +
                "        -ms-transform: translate(0, 20%);\n" +
                "    }\n" +
                "    .g_modal_plus .g_modal_closeBtn {\n" +
                "        background: #f6f3f3;\n" +
                "        right: 10px;\n" +
                "        top: 10px;\n" +
                "    }\n" +
                "    .g_modal_plus_btns_wrap {\n" +
                "        text-align:center;\n" +
                "        padding: 25px 10px;\n" +
                "    }\n" +
                "    .g_modal_plus_btns_wrap .button {\n" +
                "        margin-left: 1em;\n" +
                "    }\n" +
                "    .g_modal_plus_alert_text {\n" +
                "        font-size: 16px;\n" +
                "        color: #818181;\n" +
                "        padding: 20px 0 20px 75px;\n" +
                "    }\n" +
                "    .g_modal_hint {\n" +
                "        padding: 25px 50px;\n" +
                "        position: fixed;\n" +
                "        z-index: 151;\n" +
                "        top: 50%;\n" +
                "        left: 50%;\n" +
                "        color: #FFF;\n" +
                "        transform: translate(-50%, -50%);\n" +
                "        -webkit-transform: translate(-50%, -50%);\n" +
                "        -moz-transform: translate(-50%, -50%);\n" +
                "        -ms-transform: translate(-50%, -50%);\n" +
                "        background: rgba(0, 0, 0, .7);\n" +
                "        border-radius: 3px;\n" +
                "        font-size: 16px;\n" +
                "        animation: g_modal_hint .3s;\n" +
                "        -webkit-animation: g_modal_hint .3s;\n" +
                "        -moz-animation: g_modal_hint .3s;\n" +
                "        -ms-animation: g_modal_hint .3s;\n" +
                "        box-shadow: 0 0 10px 0 rgba(0, 0, 0, .6);\n" +
                "    }\n" +
                "    @-ms-keyframes g_modal_hint {\n" +
                "        0% {\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "    @-webkit-keyframes g_modal_hint {\n" +
                "        0% {\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "    @-moz-keyframes g_modal_hint {\n" +
                "        0% {\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "    @keyframes g_modal_hint {\n" +
                "        0% {\n" +
                "            opacity: 0;\n" +
                "        }\n" +
                "        100% {\n" +
                "            opacity: 1;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "</style>\n" +
                "\n" +
                "<script type=\"text/javascript\">\n" +
                "(function() {\n" +
                "\n" +
                "    var transitionfn = function() {\n" +
                "        // Bootstrap: transition.js v3.2.0\n" +
                "\n" +
                "        // console.log($.support.transition); 浏览器是否支持transition\n" +
                "\n" +
                "        // 兼容的transitionend 事件写法\n" +
                "        // $('.aaa1').on('bsTransitionEnd',function() {\n" +
                "        //   alert(1);\n" +
                "        // });\n" +
                "        function transitionEnd() {\n" +
                "            var el = document.createElement('div')\n" +
                "\n" +
                "            var transEndEventNames = {\n" +
                "                WebkitTransition: 'webkitTransitionEnd',\n" +
                "                MozTransition: 'transitionend',\n" +
                "                OTransition: 'oTransitionEnd otransitionend',\n" +
                "                transition: 'transitionend'\n" +
                "            }\n" +
                "\n" +
                "            for (var name in transEndEventNames) {\n" +
                "                if (el.style[name] !== undefined) {\n" +
                "                    return {\n" +
                "                        end: transEndEventNames[name]\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "            return false // explicit for ie8 (  ._.)\n" +
                "        }\n" +
                "\n" +
                "        // http://blog.alexmaccaw.com/css-transitions\n" +
                "        $.fn.emulateTransitionEnd = function(duration) {\n" +
                "            var called = false\n" +
                "            var $el = this\n" +
                "            $(this).one('bsTransitionEnd', function() {\n" +
                "                called = true\n" +
                "            })\n" +
                "            var callback = function() {\n" +
                "                if (!called) $($el).trigger($.support.transition.end)\n" +
                "            }\n" +
                "            setTimeout(callback, duration)\n" +
                "            return this\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        $.support.transition = transitionEnd()\n" +
                "\n" +
                "        if (!$.support.transition) return\n" +
                "\n" +
                "        $.event.special.bsTransitionEnd = {\n" +
                "            bindType: $.support.transition.end,\n" +
                "            delegateType: $.support.transition.end,\n" +
                "            handle: function(e) {\n" +
                "                if ($(e.target).is(this)) return e.handleObj.handler.apply(this, arguments)\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    transitionfn();\n" +
                "\n" +
                "    var $doc = $(document);\n" +
                "    var $win = $(window);\n" +
                "    var $body = $('body');\n" +
                "    var $backupCss = $body.css('overflow');\n" +
                "\n" +
                "    $.modalPlus = function(option) {\n" +
                "\n" +
                "        // 如果传入的不是json，就remove对话框\n" +
                "        if (!$.isPlainObject(option)) {\n" +
                "\n" +
                "            var $modal = $('#g_modal').addClass('g_modal_remove');\n" +
                "\n" +
                "            if ($.support.transition) {\n" +
                "                $modal.on('bsTransitionEnd', function() {\n" +
                "                    $doc.trigger('modal.remove', $modal);\n" +
                "                    $modal.remove();\n" +
                "                    $doc.trigger('modal.removed', $modal);\n" +
                "                });\n" +
                "            } else {\n" +
                "                $doc.trigger('modal.remove', $modal);\n" +
                "                $modal.remove();\n" +
                "                $doc.trigger('modal.removed', $modal);\n" +
                "            }\n" +
                "\n" +
                "            return false;\n" +
                "        }\n" +
                "\n" +
                "        // 主参数\n" +
                "        var opt = $.extend({\n" +
                "            title: '',\n" +
                "            HTML: '做本次习题前，请先完成身份验证。',\n" +
                "            type: 'normal',  // normal=>正常, confirm=>确认， alert=>提示， hint=> 自动消失的提示\n" +
                "            color: 'purple', // purple, red, green\n" +
                "            btns: {}, // {color: red, text: '确定'} 多个按钮用数组\n" +
                "            minHeight: 100, // 最小高度\n" +
                "            zIndex: 151, // 默认zIndex\n" +
                "            className: '' // 会加在最外层的div上，供自定义样式\n" +
                "        }, option || {});\n" +
                "\n" +
                "\n" +
                "        if (opt.type === 'confirm') {\n" +
                "            opt.title = '提示信息';\n" +
                "            opt.btns = [{\n" +
                "                color: '',\n" +
                "                text: '取消'\n" +
                "            }, {\n" +
                "                color: 'purple',\n" +
                "                text: '确定'\n" +
                "            }];\n" +
                "            opt.HTML = '<div class=\"g_modal_plus_alert_text\">' + opt.HTML + '</div>';\n" +
                "        } else if (opt.type === 'alert') {\n" +
                "            opt.title = '提示信息';\n" +
                "            opt.btns = [{\n" +
                "                color: 'purple',\n" +
                "                text: '确定'\n" +
                "            }];\n" +
                "            opt.HTML = '<div class=\"g_modal_plus_alert_text\">' + opt.HTML + '</div>';\n" +
                "        } else if (opt.type === 'hint') {\n" +
                "            var hintHTML = '<div class=\"g_modal_hint\">' + opt.HTML + '</div>';\n" +
                "\n" +
                "            var $hint = $(hintHTML).appendTo('body');\n" +
                "\n" +
                "            setTimeout(function() {\n" +
                "                $hint.stop().animate({\n" +
                "                    opacity: 0\n" +
                "                }, function() {\n" +
                "                    $hint.remove();\n" +
                "                });\n" +
                "            }, 2500);\n" +
                "\n" +
                "            return $hint;\n" +
                "        }\n" +
                "\n" +
                "        // 主HTML代码\n" +
                "        if (!$.isArray(opt.btns)) {\n" +
                "            opt.btns = [opt.btns];\n" +
                "        }\n" +
                "\n" +
                "        var HTMLBtn = '';\n" +
                "\n" +
                "        if (opt.btns[0].text) {\n" +
                "            HTMLBtn += '<div class=\"g_modal_plus_btns_wrap\">';\n" +
                "            for (var i = 0, l=opt.btns.length; i < l; i++) {\n" +
                "                HTMLBtn += '<div class=\"ui button ' + opt.btns[i].color + '\">' + opt.btns[i].text + '</div>';\n" +
                "            }\n" +
                "            HTMLBtn += '</div>';\n" +
                "        }\n" +
                "\n" +
                "        var HTML = '<div class=\"g_modal g_modal_plus ' + opt.className + '\" id=\"g_modal\" style=\"z-index: ' + opt.zIndex + '\">' +\n" +
                "                '<div class=\"g_modal_cell\">' +\n" +
                "                    '<div class=\"g_modal_wrap ' + 'g_modal_plus_' + opt.color + '\">' +\n" +
                "                        '<div class=\"g_modal_plus_title\"><span class=\"anti_sawtooth\"></span>' + opt.title + '</div>' +\n" +
                "                        '<div>' + opt.HTML + '</div>' +\n" +
                "                        '<div class=\"g_modal_plus_btns\">' + HTMLBtn + '</div>' +\n" +
                "                        '<div class=\"g_modal_closeBtn\" title=\"关闭\"></div>' +\n" +
                "                    '</div>' +\n" +
                "                '</div>' +\n" +
                "            '</div>';\n" +
                "\n" +
                "        var $modal = $(HTML);\n" +
                "\n" +
                "        // 屏幕大于最小高度的自定义事件\n" +
                "        $modal.on('taller', function() {\n" +
                "            $modal.removeClass('g_modal_scroll');\n" +
                "            $modal.height('100%');\n" +
                "        });\n" +
                "\n" +
                "        // 屏幕小于最小高度的自定义事件\n" +
                "        $modal.on('untaller', function() {\n" +
                "            var $modalWrap = $modal.find('.g_modal_wrap');\n" +
                "            $modal.addClass('g_modal_scroll').height($win.height()).find('.g_modal_cell').add($modalWrap).css({\n" +
                "                'min-height': opt.minHeight + 'px'\n" +
                "            });\n" +
                "        });\n" +
                "\n" +
                "        // 触发自定义事件的事件\n" +
                "        $modal.on('changeStatus', function() {\n" +
                "            if (parseInt($win.height()) >= opt.minHeight) {\n" +
                "                $modal.trigger(\"taller\");\n" +
                "            } else {\n" +
                "                $modal.trigger(\"untaller\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        // 触发一次自定义事件的事件\n" +
                "        $modal.trigger(\"changeStatus\");\n" +
                "\n" +
                "        // 当浏览器大小改变时再次触发\n" +
                "        $win.on('resize', function() {\n" +
                "            $modal.trigger(\"changeStatus\");\n" +
                "        });\n" +
                "\n" +
                "        // 触发模态框创建前的回调\n" +
                "        $doc.trigger(\"modal.create\", $modal);\n" +
                "\n" +
                "        $modal.appendTo(\"body\");\n" +
                "\n" +
                "        // 触发模态框创建成功的回调\n" +
                "        $doc.trigger(\"modal.created\", $modal);\n" +
                "\n" +
                "        var $closeBtn = $modal.find(\".g_modal_closeBtn\");\n" +
                "        var $wrap = $modal.find(\".g_modal_wrap\");\n" +
                "\n" +
                "        // 关闭按钮事件\n" +
                "        $closeBtn.on('click', function(event) {\n" +
                "            event.stopPropagation();\n" +
                "            $.modalPlus();\n" +
                "        });\n" +
                "\n" +
                "        // 点击遮罩层， 关闭modal\n" +
                "        $modal.on(\"click\", function() {\n" +
                "            $.modalPlus();\n" +
                "        });\n" +
                "\n" +
                "        // 点击内容区域 不关闭modal\n" +
                "        $wrap.on(\"click\", function() {\n" +
                "            event.stopPropagation();\n" +
                "        });\n" +
                "\n" +
                "        // 按钮点击事件\n" +
                "        var $btns = $modal.find('.g_modal_plus_btns_wrap').eq(0).find('.button');\n" +
                "        if ($btns.length) {\n" +
                "            $btns.on('click', function() {\n" +
                "                $modal.trigger('modal.btn' + $(this).index() + '.click', $(this));\n" +
                "            });\n" +
                "        }\n" +
                "\n" +
                "        // modal为 confirm或alert时，点击取消按钮时的事件\n" +
                "        if (opt.type === 'confirm' || opt.type === 'alert') {\n" +
                "            $modal.on('modal.btn0.click', function() {\n" +
                "                $.modalPlus();\n" +
                "            });\n" +
                "        }\n" +
                "\n" +
                "        return $modal;\n" +
                "    };\n" +
                "\n" +
                "    $doc.on('modal.created', function() {\n" +
                "        $body.css({\n" +
                "            overflow: 'hidden'\n" +
                "        });\n" +
                "    });\n" +
                "\n" +
                "    $doc.on('modal.removed', function() {\n" +
                "        $body.css({\n" +
                "            overflow: $backupCss\n" +
                "        });\n" +
                "    });\n" +
                "\n" +
                "    $('body').on('click', '.course-wrapper a[href!=\"#\"]', function(event) {\n" +
                "        var $t = $(this);\n" +
                "        var href = $t.attr('href');\n" +
                "        var index = href.search(/\\/courseware\\/\\w+\\/\\w+\\//i);\n" +
                "        if( index > 0) {\n" +
                "            var section_location = href.substring(index);\n" +
                "            event.preventDefault();\n" +
                "            $.ajax({\n" +
                "                url: \"/verify_student/reverification/check/course/course-v1:TsinghuaX+hbu_2018031901X+2018_T2\" + section_location,\n" +
                "                data: {},\n" +
                "                type: 'get',\n" +
                "                dataType: 'json'\n" +
                "            }).then(function(res) {\n" +
                "                if (res.reverify) {\n" +
                "                     $.modalPlus({\n" +
                "                        type: 'confirm',\n" +
                "                        HTML: res.value\n" +
                "                    }).on('modal.btn1.click', function() {\n" +
                "                        location.href = res.redirect;\n" +
                "                    });\n" +
                "                } else {\n" +
                "                    location.href = href;\n" +
                "                }\n" +
                "            }, function() {\n" +
                "                $.modalPlus({\n" +
                "                    type: 'alert',\n" +
                "                    color: 'red',\n" +
                "                    HTML: '网络链接失败！'\n" +
                "                });\n" +
                "            });\n" +
                "        }\n" +
                "    });\n" +
                "\n" +
                "$('body').on('click', '.judgeverify', function(event) {\n" +
                "        var $t = $(this);\n" +
                "        var vhref = $t.attr('data-verifyurl');\n" +
                "        var thref = $t.attr('data-testurl');\n" +
                "\n" +
                "        $.modalPlus({\n" +
                "        color: 'purple',\n" +
                "        title: '考试说明',\n" +
                "        HTML: \"<div class='g_modal_plus_alert_text'><span style='color:#818181;'>1.本场考试仅能参加一次，提交试卷或倒计时结束后，将无法再进入考试；</span></br><span style='color:#818181;'>2.考试过程中可多次保存考试答案，请务必在倒计时结束前及时交卷；</span></br>3.<span style='color:#818181;'>若考试未交卷，且倒计时未结束，仍可回到考试页面继续考试；</span></br>4.<span style='color:#818181;'>开始考试后系统将开始计时，关闭考试界面倒计时不会停止。</span></div>\",\n" +
                "        btns: [{\n" +
                "            color: '',\n" +
                "            text: '还没准备好，再等等'\n" +
                "        }, {\n" +
                "            color: 'purple',\n" +
                "            text: '准备好了，开始考试'\n" +
                "        }]\n" +
                "\n" +
                "        }).on('modal.btn0.click', function() {\n" +
                "            $.modalPlus();\n" +
                "        }).on(\"modal.btn1.click\", function() {\n" +
                "            $.ajax({\n" +
                "                url: \"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/get_exam_wait\",\n" +
                "                data: {},\n" +
                "                type: 'get',\n" +
                "                dataType: 'json'\n" +
                "              }).then(function(res){\n" +
                "                  if(res.exam_wait > 0) {\n" +
                "                    $.modalPlus();\n" +
                "                    $.modalPlus({\n" +
                "                      color: 'purple',\n" +
                "                      title: '考试说明',\n" +
                "                      HTML: \"<div class='g_modal_plus_alert_text'><span style='color:#818181;'>由于当前参加考试的人数过多，请您\" + res.exam_wait + \"分钟后再来考试。</span></div>\",\n" +
                "                      btns: [{\n" +
                "                          color: 'purple',\n" +
                "                          text: '稍后再来考试'\n" +
                "                      }]\n" +
                "                    }).on('modal.btn0.click', function() {\n" +
                "                      $.modalPlus();\n" +
                "                    });\n" +
                "                  }else {\n" +
                "                    location.href = \"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/exam/\" + thref;\n" +
                "                  }\n" +
                "                });\n" +
                "        });\n" +
                "                \n" +
                "    });\n" +
                "})();\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "  <div class=\"course-wrapper\">\n" +
                "\n" +
                "    <div class=\"course-index\" role=\"navigation\">\n" +
                "      <header id=\"open_close_accordion\">\n" +
                "        <a href=\"#\">关闭</a>\n" +
                "      </header>\n" +
                "\n" +
                "      <div id=\"accordion\" style=\"display: none\">\n" +
                "        <nav aria-label=\"课程导航\">\n" +
                "            \n" +
                "\n" +
                "\n" +
                "\n" +
                "    \n" +
                "  <div class=\"chapter\">\n" +
                "      \n" +
                "      <h3  aria-label=\"第一讲 以人民为中心的发展思想\">\n" +
                "        <a href=\"#\">\n" +
                "          第一讲 以人民为中心的发展思想\n" +
                "        </a>\n" +
                "      </h3>\n" +
                "\n" +
                "    <ul>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/8de5390cc0d241c1a59aec7e1f0ba2c6/\">\n" +
                "              <p>1.1 以人民为中心成为国内外关注焦点 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/a3eee1174a454c8595b0bbac0e912924/\">\n" +
                "              <p>1.2 以人民为中心始终是党的核心思想 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/534cf6bff9db4573adff9134b2a228d5/\">\n" +
                "              <p>1.3 以人民为中心的社会主义现代化内涵 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/b63bbcfb8db5420fa4c12aa44801064b/\">\n" +
                "              <p>1.4 新时代中国社会主要矛盾与今后方向 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/7c7eecb8b4dd46d290f23de40aea2adc/\">\n" +
                "              <p>1.5 以人民为中心的五大发展、五大生产力 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/991928bb4bef4973a619da30ba709bb1/\">\n" +
                "              <p>1.6 如何以人民为中心：健康中国为例 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/d3b193752c91481fa75cbb5c962b5891/\">\n" +
                "              <p>1.7 小结：世间一切事务中，人是第一个宝贵的 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" graded\">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/32d3711bfc284d47b132fffeb507d1c6/a4577446985048fdb196a1721b622938/\">\n" +
                "              <p>第一讲测试 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>\n" +
                "\n" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">\n" +
                "            </a>\n" +
                "          </li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "\n" +
                "    \n" +
                "  <div class=\"chapter\">\n" +
                "      \n" +
                "      <h3  aria-label=\"第二讲 创新发展\">\n" +
                "        <a href=\"#\">\n" +
                "          第二讲 创新发展\n" +
                "        </a>\n" +
                "      </h3>\n" +
                "\n" +
                "    <ul>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/ee7cfa64eff04648877f7d6f3745de2b/\">\n" +
                "              <p>2.1 新时代：中国迈向创新强国时代 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/f0e53f80ea8e4e9390aa7bad615e1e04/\">\n" +
                "              <p>2.2 新跨越：科技实力跃居世界前列 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/8e4a7e7cbb30482ba2663cc6ddb5599b/\">\n" +
                "              <p>2.3 新机制：中国创新的“5T+1”模式 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/3e823af7b4a944118f47dcbc08aed5e6/\">\n" +
                "              <p>2.4 新工程：2017年中国十大科技工程 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/34ac06be23464ac28e862068b6690b92/\">\n" +
                "              <p>2.5 新战略：中国科技创新顶层设计 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" graded\">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/85ab7fd74f9645558a898452f91e1b76/09e2a3a4697c43dfa19c118628b69413/\">\n" +
                "              <p>第二讲测试 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>\n" +
                "\n" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">\n" +
                "            </a>\n" +
                "          </li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "\n" +
                "    \n" +
                "  <div class=\"chapter\">\n" +
                "      \n" +
                "      <h3  class=\"active\" aria-label=\"第三讲 绿色发展, 当前章节\">\n" +
                "        <a href=\"#\">\n" +
                "          第三讲 绿色发展\n" +
                "        </a>\n" +
                "      </h3>\n" +
                "\n" +
                "    <ul>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/5149bc45a03d4e8e9f72931cb58ef99f/\">\n" +
                "              <p>3.1 十九大报告与绿色发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/7c027fc381564a7b9a85fd23ade793b4/\">\n" +
                "              <p>3.2 习近平谈绿色发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/cdd6fc51a54144038b38cbb15c81aff1/\">\n" +
                "              <p>3.3 绿色发展的溯源和实践 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/c7997ee356b14e2aa229720a42ef5715/\">\n" +
                "              <p>3.4 绿色发展的本质和内涵 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/bf4b601aced24f029d25ebef44f280b1/\">\n" +
                "              <p>3.5 “十三五”规划促进绿色发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/1b04d30594f74d3a851cdf85a62a342a/\">\n" +
                "              <p>3.6 中国的绿色发展成就 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/cba92564bbfd4b7fb9139835f3f67fe4/\">\n" +
                "              <p>3.7 中国对世界的绿色贡献 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/53d4ce883c384a45acbaa9c762566750/\">\n" +
                "              <p>3.8 小结：生态兴则文明兴，生态衰则文明衰 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\"active graded\">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/88bf9ebeb362482b8d85c8e6cb979a29/2645a520388d4777aef17fa569316214/\">\n" +
                "              <p>第三讲测试 <span class=\"sr\">, current section</span></p>\n" +
                "              \n" +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>\n" +
                "\n" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">\n" +
                "            </a>\n" +
                "          </li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "\n" +
                "    \n" +
                "  <div class=\"chapter\">\n" +
                "      \n" +
                "      <h3  aria-label=\"第四讲 协调发展\">\n" +
                "        <a href=\"#\">\n" +
                "          第四讲 协调发展\n" +
                "        </a>\n" +
                "      </h3>\n" +
                "\n" +
                "    <ul>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/7b0428c7707b44f3ba659bc64d6fabef/\">\n" +
                "              <p>4.1 十九大报告与协调发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/a4a416f2ede8470e851ad6ff10f83c07/\">\n" +
                "              <p>4.2 习近平谈协调发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/78c45182e3c64060819ad9f8013208de/\">\n" +
                "              <p>4.3 协调发展的溯源和实践 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/66a4084f88e747dda928f8ed6c624abf/\">\n" +
                "              <p>4.4 协调发展的本质和内涵 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/88325f2ae12e4b08b1665a869ed57592/\">\n" +
                "              <p>4.5 协调发展之区域协调发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/2f0299000f054481a731b4f4d0cfe2c3/\">\n" +
                "              <p>4.6 协调发展之城乡协调发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/2f1ff1eb6c494b3e82768b73be6cff38/\">\n" +
                "              <p>4.7 小结：形成平衡有序稳定的发展体系 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" graded\">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/6c706fd6167e41b5837ada745d195e8b/cf55efab6ca0412b86a9b19e68c086e5/\">\n" +
                "              <p>第四讲测试 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>\n" +
                "\n" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">\n" +
                "            </a>\n" +
                "          </li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "\n" +
                "    \n" +
                "  <div class=\"chapter\">\n" +
                "      \n" +
                "      <h3  aria-label=\"第五讲 开放发展\">\n" +
                "        <a href=\"#\">\n" +
                "          第五讲 开放发展\n" +
                "        </a>\n" +
                "      </h3>\n" +
                "\n" +
                "    <ul>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/b545c1b387094eea8d94b6479219435c/\">\n" +
                "              <p>5.1 十九大报告与开放发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/9cf5a70e738245f9acb3652206485cd8/\">\n" +
                "              <p>5.2 习近平谈开放发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/41cfa801753b4a149f13e83ac8b3b03b/\">\n" +
                "              <p>5.3 开放发展的溯源和实践 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/2950f936a7b84c49a2c192bfb1d46c6a/\">\n" +
                "              <p>5.4 开放发展的本质和内涵 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/ac4c0a91b9ef4d8e8c8189ad43508a42/\">\n" +
                "              <p>5.5 中国在世界的位置 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/a5a123f7a03745ff9498a29dbfb0912c/\">\n" +
                "              <p>5.6 一带一路：从战略构想到战略行动 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/145f85b62031412480638ea3cbdc64e3/\">\n" +
                "              <p>5.7 从“逆全球化”到“新全球化” </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/e6a957bd079a46229559928bf37b1590/\">\n" +
                "              <p>5.8 小结：构建人类命运共同体 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" graded\">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/a7bc121bbfbc4044a8125ed85d18a92e/ec58c21be941437d87352b008337659e/\">\n" +
                "              <p>第五讲测试 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>\n" +
                "\n" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">\n" +
                "            </a>\n" +
                "          </li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "\n" +
                "    \n" +
                "  <div class=\"chapter\">\n" +
                "      \n" +
                "      <h3  aria-label=\"第六讲 共享发展\">\n" +
                "        <a href=\"#\">\n" +
                "          第六讲 共享发展\n" +
                "        </a>\n" +
                "      </h3>\n" +
                "\n" +
                "    <ul>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/da2f690398fb4d7fb81b059752c0f324/\">\n" +
                "              <p>6.1 十九大报告与共享发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/56bba7420a1f441cbf044542079efb21/\">\n" +
                "              <p>6.2 习近平谈共享发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/cdcd4e391f7440c1a3b11cf6da563031/\">\n" +
                "              <p>6.3 共享发展的溯源和实践 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/da90c2a4db1c43c6af629ccd7b51cad4/\">\n" +
                "              <p>6.4 共享发展的本质和内涵 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/ff36762f634c477d9319c5f2104aed5e/\">\n" +
                "              <p>6.5 坚决打赢脱贫攻坚战 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/6c62b5a6a8234205946a9a7b3a920c41/\">\n" +
                "              <p>6.6 实施就业优先战略 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/639f3444c5fb4939894e8e58be9467d4/\">\n" +
                "              <p>6.7 推进教育现代化 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/42b284c73d074b9d9a2f7d306e9a3e0c/\">\n" +
                "              <p>6.8 中国推动全球包容共享发展 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" \">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/708b9e04745b4bb09a82a9e22f0960d1/\">\n" +
                "              <p>6.9 小结：中国共享发展之路 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\"> </p>\n" +
                "\n" +
                "            </a>\n" +
                "          </li>\n" +
                "          <li class=\" graded\">\n" +
                "            <a href=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/courseware/13e8f52a8ed2467b8fcba61bf6c06d91/df53f4c90fbd4f9187634aa291aec2b4/\">\n" +
                "              <p>第六讲测试 </p>\n" +
                "              \n" +
                "              <p class=\"subtitle\">Homework 到期日2018-12-02 23:30:00</p>\n" +
                "\n" +
                "                  <img src=\"/static/images/graded.png\" alt=\"Graded Section\">\n" +
                "            </a>\n" +
                "          </li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "        </nav>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <section class=\"course-content\" id=\"course-content\">\n" +
                "      <div class=\"xblock xblock-student_view xmodule_display xmodule_SequenceModule\" data-runtime-class=\"LmsRuntime\" data-init=\"XBlockToXModuleShim\" data-block-type=\"sequential\" data-request-token=\"cd52375ee35e11e8a63c00163e002172\" data-runtime-version=\"1\" data-usage-id=\"block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@sequential+block@2645a520388d4777aef17fa569316214\" data-type=\"Sequence\" data-course-id=\"course-v1:TsinghuaX+hbu_2018031901X+2018_T2\">\n" +
                "    \n" +
                "\n" +
                "<div id=\"sequence_2645a520388d4777aef17fa569316214\" class=\"sequence\" data-id=\"block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@sequential+block@2645a520388d4777aef17fa569316214\" data-position=\"1\" data-ajax-url=\"/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/xblock/block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@sequential+block@2645a520388d4777aef17fa569316214/handler/xmodule_handler\" >\n" +
                "  <nav class=\"sequence-nav\">\n" +
                "    <ul class=\"sequence-nav-buttons\">\n" +
                "      <li class=\"prev\"><a role=\"button\" href=\"#\">上一个</a></li>\n" +
                "    </ul>\n" +
                "\n" +
                "    <div class=\"sequence-list-wrapper\">\n" +
                "      <ol role=\"tablist\" aria-label=\"章节导航\" id=\"sequence-list\">\n" +
                "        <li>\n" +
                "        <a class=\"seq_problem inactive progress-in_progress\"\n" +
                "           data-id=\"block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@vertical+block@3a459b24df7c4c378cf42c44b14b5aa4\"\n" +
                "           data-element=\"1\"\n" +
                "           href=\"javascript:void(0);\"\n" +
                "           data-page-title=\"单选题\"\n" +
                "           aria-controls=\"seq_contents_0\"\n" +
                "           id=\"tab_0\"\n" +
                "           tabindex=\"0\"\n" +
                "           role=\"tab\">\n" +
                "          </a>\n" +
                "        </li>\n" +
                "      </ol>\n" +
                "    </div>\n" +
                "\n" +
                "    <ul class=\"sequence-nav-buttons\">\n" +
                "      <li class=\"next\"><a role=\"button\" href=\"#\">下一个</a></li>\n" +
                "    </ul>\n" +
                "  </nav>\n" +
                "\n" +
                "  <div id=\"seq_contents_0\"\n" +
                "       aria-labelledby=\"tab_0\"\n" +
                "       aria-hidden=\"true\"\n" +
                "       class=\"seq_contents tex2jax_ignore asciimath2jax_ignore\">\n" +
                "     &lt;div class=&#34;xblock xblock-student_view xmodule_display xmodule_VerticalModule&#34; data-runtime-class=&#34;LmsRuntime&#34; data-init=&#34;XBlockToXModuleShim&#34; data-block-type=&#34;vertical&#34; data-request-token=&#34;cd52375ee35e11e8a63c00163e002172&#34; data-runtime-version=&#34;1&#34; data-usage-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@vertical+block@3a459b24df7c4c378cf42c44b14b5aa4&#34; data-type=&#34;None&#34; data-course-id=&#34;course-v1:TsinghuaX+hbu_2018031901X+2018_T2&#34;&gt;\n" +
                "    &lt;div class=&#34;vert-mod&#34;&gt;\n" +
                "  &lt;div class=&#34;vert vert-0&#34; data-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@24e20730b74d441bb60958bf74d19c9c&#34;&gt;\n" +
                "    &lt;div class=&#34;xblock xblock-student_view xmodule_display xmodule_CapaModule&#34; data-runtime-class=&#34;LmsRuntime&#34; data-init=&#34;XBlockToXModuleShim&#34; data-block-type=&#34;problem&#34; data-request-token=&#34;cd52375ee35e11e8a63c00163e002172&#34; data-runtime-version=&#34;1&#34; data-usage-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@24e20730b74d441bb60958bf74d19c9c&#34; data-type=&#34;Problem&#34; data-course-id=&#34;course-v1:TsinghuaX+hbu_2018031901X+2018_T2&#34;&gt;\n" +
                "    &lt;div id=&#34;problem_24e20730b74d441bb60958bf74d19c9c&#34; class=&#34;problems-wrapper&#34; data-problem-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@24e20730b74d441bb60958bf74d19c9c&#34; data-url=&#34;/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/xblock/block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@24e20730b74d441bb60958bf74d19c9c/handler/xmodule_handler&#34; data-progress_status=&#34;done&#34; data-progress_detail=&#34;1/1&#34;&gt;&lt;/div&gt;\n" +
                "\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "  &lt;/div&gt;\n" +
                "  &lt;div class=&#34;vert vert-1&#34; data-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@afa4a08626c34a4c8c38c87ccd5f2d08&#34;&gt;\n" +
                "    &lt;div class=&#34;xblock xblock-student_view xmodule_display xmodule_CapaModule&#34; data-runtime-class=&#34;LmsRuntime&#34; data-init=&#34;XBlockToXModuleShim&#34; data-block-type=&#34;problem&#34; data-request-token=&#34;cd52375ee35e11e8a63c00163e002172&#34; data-runtime-version=&#34;1&#34; data-usage-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@afa4a08626c34a4c8c38c87ccd5f2d08&#34; data-type=&#34;Problem&#34; data-course-id=&#34;course-v1:TsinghuaX+hbu_2018031901X+2018_T2&#34;&gt;\n" +
                "    &lt;div id=&#34;problem_afa4a08626c34a4c8c38c87ccd5f2d08&#34; class=&#34;problems-wrapper&#34; data-problem-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@afa4a08626c34a4c8c38c87ccd5f2d08&#34; data-url=&#34;/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/xblock/block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@afa4a08626c34a4c8c38c87ccd5f2d08/handler/xmodule_handler&#34; data-progress_status=&#34;none&#34; data-progress_detail=&#34;0/1&#34;&gt;&lt;/div&gt;\n" +
                "\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "  &lt;/div&gt;\n" +
                "  &lt;div class=&#34;vert vert-2&#34; data-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@69a3a32fd7364f4484ce22827d31f7c7&#34;&gt;\n" +
                "    &lt;div class=&#34;xblock xblock-student_view xmodule_display xmodule_CapaModule&#34; data-runtime-class=&#34;LmsRuntime&#34; data-init=&#34;XBlockToXModuleShim&#34; data-block-type=&#34;problem&#34; data-request-token=&#34;cd52375ee35e11e8a63c00163e002172&#34; data-runtime-version=&#34;1&#34; data-usage-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@69a3a32fd7364f4484ce22827d31f7c7&#34; data-type=&#34;Problem&#34; data-course-id=&#34;course-v1:TsinghuaX+hbu_2018031901X+2018_T2&#34;&gt;\n" +
                "    &lt;div id=&#34;problem_69a3a32fd7364f4484ce22827d31f7c7&#34; class=&#34;problems-wrapper&#34; data-problem-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@69a3a32fd7364f4484ce22827d31f7c7&#34; data-url=&#34;/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/xblock/block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@69a3a32fd7364f4484ce22827d31f7c7/handler/xmodule_handler&#34; data-progress_status=&#34;none&#34; data-progress_detail=&#34;0/1&#34;&gt;&lt;/div&gt;\n" +
                "\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "  &lt;/div&gt;\n" +
                "  &lt;div class=&#34;vert vert-3&#34; data-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@5722f606d51a4761bd4ee012214d3ae0&#34;&gt;\n" +
                "    &lt;div class=&#34;xblock xblock-student_view xmodule_display xmodule_CapaModule&#34; data-runtime-class=&#34;LmsRuntime&#34; data-init=&#34;XBlockToXModuleShim&#34; data-block-type=&#34;problem&#34; data-request-token=&#34;cd52375ee35e11e8a63c00163e002172&#34; data-runtime-version=&#34;1&#34; data-usage-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@5722f606d51a4761bd4ee012214d3ae0&#34; data-type=&#34;Problem&#34; data-course-id=&#34;course-v1:TsinghuaX+hbu_2018031901X+2018_T2&#34;&gt;\n" +
                "    &lt;div id=&#34;problem_5722f606d51a4761bd4ee012214d3ae0&#34; class=&#34;problems-wrapper&#34; data-problem-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@5722f606d51a4761bd4ee012214d3ae0&#34; data-url=&#34;/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/xblock/block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@5722f606d51a4761bd4ee012214d3ae0/handler/xmodule_handler&#34; data-progress_status=&#34;none&#34; data-progress_detail=&#34;0/1&#34;&gt;&lt;/div&gt;\n" +
                "\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "  &lt;/div&gt;\n" +
                "  &lt;div class=&#34;vert vert-4&#34; data-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@4b262dbcf81b49a2b88551c858d955d7&#34;&gt;\n" +
                "    &lt;div class=&#34;xblock xblock-student_view xmodule_display xmodule_CapaModule&#34; data-runtime-class=&#34;LmsRuntime&#34; data-init=&#34;XBlockToXModuleShim&#34; data-block-type=&#34;problem&#34; data-request-token=&#34;cd52375ee35e11e8a63c00163e002172&#34; data-runtime-version=&#34;1&#34; data-usage-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@4b262dbcf81b49a2b88551c858d955d7&#34; data-type=&#34;Problem&#34; data-course-id=&#34;course-v1:TsinghuaX+hbu_2018031901X+2018_T2&#34;&gt;\n" +
                "    &lt;div id=&#34;problem_4b262dbcf81b49a2b88551c858d955d7&#34; class=&#34;problems-wrapper&#34; data-problem-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@4b262dbcf81b49a2b88551c858d955d7&#34; data-url=&#34;/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/xblock/block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@4b262dbcf81b49a2b88551c858d955d7/handler/xmodule_handler&#34; data-progress_status=&#34;none&#34; data-progress_detail=&#34;0/1&#34;&gt;&lt;/div&gt;\n" +
                "\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "  &lt;/div&gt;\n" +
                "  &lt;div class=&#34;vert vert-5&#34; data-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@c0ce04a7a6ad4621bf5b744da0986888&#34;&gt;\n" +
                "    &lt;div class=&#34;xblock xblock-student_view xmodule_display xmodule_CapaModule&#34; data-runtime-class=&#34;LmsRuntime&#34; data-init=&#34;XBlockToXModuleShim&#34; data-block-type=&#34;problem&#34; data-request-token=&#34;cd52375ee35e11e8a63c00163e002172&#34; data-runtime-version=&#34;1&#34; data-usage-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@c0ce04a7a6ad4621bf5b744da0986888&#34; data-type=&#34;Problem&#34; data-course-id=&#34;course-v1:TsinghuaX+hbu_2018031901X+2018_T2&#34;&gt;\n" +
                "    &lt;div id=&#34;problem_c0ce04a7a6ad4621bf5b744da0986888&#34; class=&#34;problems-wrapper&#34; data-problem-id=&#34;block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@c0ce04a7a6ad4621bf5b744da0986888&#34; data-url=&#34;/courses/course-v1:TsinghuaX+hbu_2018031901X+2018_T2/xblock/block-v1:TsinghuaX+hbu_2018031901X+2018_T2+type@problem+block@c0ce04a7a6ad4621bf5b744da0986888/handler/xmodule_handler&#34; data-progress_status=&#34;none&#34; data-progress_detail=&#34;0/1&#34;&gt;&lt;/div&gt;\n" +
                "\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "  &lt;/div&gt;\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "&lt;/div&gt;\n" +
                "\n" +
                "  </div>\n" +
                "  <div id=\"seq_content\" role=\"tabpanel\"></div>\n" +
                "\n" +
                "  <nav class=\"sequence-bottom\">\n" +
                "    <ul aria-label=\"章节导航\" class=\"sequence-nav-buttons\">\n" +
                "      <li class=\"prev\"><a role=\"button\" href=\"#\">上一个</a></li>\n" +
                "      <li class=\"next\"><a role=\"button\" href=\"#\">下一个</a></li>\n" +
                "    </ul>\n" +
                "  </nav>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<script type=\"text/javascript\">\n" +
                "  var sequenceNav;\n" +
                "  $(document).ready(function() {\n" +
                "    sequenceNav = new SequenceNav($('.sequence-nav'));\n" +
                "  });\n" +
                "</script>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "    </section>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "<nav class=\"nav-utilities \">\n" +
                "  <h2 class=\"sr nav-utilities-title\">课程工具引导</h2>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</nav>\n" +
                "\n" +
                "\n" +
                "<div id=\"accessibile-confirm-modal\" class=\"modal\" aria-hidden=\"true\">\n" +
                "  <div class=\"inner-wrapper\" role=\"dialog\" aria-labelledby=\"accessibile-confirm-title\">\n" +
                "    <button class=\"close-modal\">\n" +
                "      <i class=\"icon fa fa-remove\"></i>\n" +
                "      <span class=\"sr\">\n" +
                "        关闭\n" +
                "      </span>\n" +
                "    </button>\n" +
                "\n" +
                "    <header>\n" +
                "      <h2 id=\"accessibile-confirm-title\">\n" +
                "          确认\n" +
                "        <span class=\"sr\">,\n" +
                "          模式打开\n" +
                "        </span>\n" +
                "      </h2>\n" +
                "    </header>\n" +
                "    <div role=\"dialogalert\" class=\"status message\" tabindex=\"-1\">\n" +
                "        <p class=\"message-title\"></p>\n" +
                "    </div>\n" +
                "    <hr aria-hidden=\"true\" />\n" +
                "    <div class=\"actions\">\n" +
                "        <button class=\"dismiss ok-button\">是的</button>\n" +
                "        <button class=\"dismiss cancel-button\" data-dismiss=\"leanModal\">取消</button>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <a href=\"#accessibile-confirm-modal\" rel=\"leanModal\" id=\"confirm_open_button\" style=\"display:none\">打开</a>\n" +
                "</div>\n" +
                "\n" +
                "<script type=\"text/javascript\">\n" +
                "var accessible_confirm = function(message, callback) {\n" +
                "    $(\"#accessibile-confirm-modal .cancel-button\").click(function(){\n" +
                "        $(\"#accessibile-confirm-modal .close-modal\").click();\n" +
                "    });\n" +
                "    $(\"#accessibile-confirm-modal .ok-button\").click(function(){\n" +
                "        $(\"#accessibile-confirm-modal .close-modal\").click();\n" +
                "        callback();\n" +
                "    });\n" +
                "\n" +
                "    accessible_modal(\"#accessibile-confirm-modal #confirm_open_button\", \"#accessibile-confirm-modal .close-modal\", \"#accessibile-confirm-modal\", \".content-wrapper\");\n" +
                "    $(\"#accessibile-confirm-modal #confirm_open_button\").click();\n" +
                "    $(\"#accessibile-confirm-modal .message-title\").html(message);\n" +
                "};\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "      \n" +
                "    </div>\n" +
                "\n" +
                "    \n" +
                "      \n" +
                "  \n" +
                "      \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div class=\"wrapper-footer\">\n" +
                "  <style tyep=\"text/css\">\n" +
                "        cite.intro_data{\n" +
                "        display: none;\n" +
                "        }\n" +
                "        .follow_name.name_bold{\n" +
                "        margin-top: 2px;\n" +
                "        }\n" +
                "        iframe#sina-btn{\n" +
                "        margin-top: -10px;\n" +
                "        margin-right: -95px;\n" +
                "        height: 30px;\n" +
                "        float: right;\n" +
                "        }\n" +
                "  </style>\n" +
                "\n" +
                "  <footer>\n" +
                "    <div class=\"colophon\" style=\"width:100%;\">\n" +
                "      <nav class=\"nav-colophon\">\n" +
                "        <ol>\n" +
                "        </ol>\n" +
                "      </nav>\n" +
                "    </div>\n" +
                "  </footer>\n" +
                "</div>\n" +
                "\n" +
                "<div id=\"tu-footer\">\n" +
                "  <div class=\"tu-container\">\n" +
                "        <!--\n" +
                "    <div class=\"pull-left\">\n" +
                "        <img src=\"http://storage.xuetangx.com/spoc/hbu/logo-header.png\" height=\"60\" alt=\"Home Page\" />\n" +
                "    </div>\n" +
                "    -->\n" +
                "    <div class=\"pull-right\">\n" +
                "        <span>地址：保定市莲池区五四东路180号</span><br/>\n" +
                "        <span>版权所有：河北大学学堂云</span>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "    \n" +
                "\n" +
                "  </div>\n" +
                "\n" +
                "    \n" +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-application.cc77fbdbd1fa.js\" charset=\"utf-8\"></script>\n" +
                "\n" +
                "\n" +
                "    \n" +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-modules.22cdd9bba76b.js\" charset=\"utf-8\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/jquery.scrollTo-1.4.2-min.4aa3e2dfa312.js\"></script>\n" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/flot/jquery.flot.d3d45ff0c6a8.js\"></script>\n" +
                "\n" +
                "  <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/vendor/codemirror-compressed.dd4b74f7c5fe.js\"></script>\n" +
                "\n" +
                "  \n" +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/lms-courseware.76c6a3e1b737.js\" charset=\"utf-8\"></script>\n" +
                "\n" +
                "\n" +
                "  \n" +
                "    <script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/discussion.a79d1c4307d4.js\" charset=\"utf-8\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "<script type=\"text/x-mathjax-config\">\n" +
                "  MathJax.Hub.Config({\n" +
                "    tex2jax: {\n" +
                "      inlineMath: [\n" +
                "        [\"\\\\(\",\"\\\\)\"],\n" +
                "        ['[mathjaxinline]','[/mathjaxinline]']\n" +
                "      ],\n" +
                "      displayMath: [\n" +
                "        [\"\\\\[\",\"\\\\]\"],\n" +
                "        ['[mathjax]','[/mathjax]']\n" +
                "      ]\n" +
                "    }\n" +
                "  });\n" +
                "</script>\n" +
                "\n" +
                "<!-- This must appear after all mathjax-config blocks, so it is after the imports from the other templates.\n" +
                "     It can't be run through static.url because MathJax uses crazy url introspection to do lazy loading of\n" +
                "     MathJax extension libraries -->\n" +
                "<script type=\"text/javascript\" src=\"//s.xuetangx.com/resource/mathjax-MathJax-727332c/MathJax.js?config=TeX-MML-AM_HTMLorMML-full\"></script>\n" +
                "\n" +
                "<script type='text/template' id='_profile_thread'>\n" +
                "\n" +
                "<article class=\"discussion-article\" data-id=\"{{id}}\">\n" +
                "    <div class=\"discussion-post\">\n" +
                "        <header>\n" +
                "            <h3>{{title}}</h3>\n" +
                "            <p class=\"posted-details\">                \n" +
                "                {{#user}}\n" +
                "                <a href=\"{{user_url}}\" class=\"username\">{{username}}</a>\n" +
                "                {{/user}}\n" +
                "                {{^user}}\n" +
                "                匿名\n" +
                "                {{/user}}\n" +
                "\n" +
                "                <span class=\"timeago\" title=\"{{created_at}}\">{{created_at}}</span>\n" +
                "                <span class=\"post-status-closed top-post-status\" style=\"display: none\">\n" +
                "                    &bull; 这个帖子已经关闭。\n" +
                "                </span>\n" +
                "            </p>\n" +
                "        </header>\n" +
                "        <div class=\"post-body\">{{abbreviatedBody}}</div>\n" +
                "        <div class=\"my-reply-body\">\n" +
                "            <h4>回复</h4>\n" +
                "            <ul><ul>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <div class=\"post-tools\">\n" +
                "        <a href=\"{{permalink}}\">查看讨论</a>\n" +
                "    </div>\n" +
                "\n" +
                "</article>\n" +
                "</script>\n" +
                "<script type='text/template' id='_user_profile'>\n" +
                "\n" +
                "<h2>活动的帖子</h2>\n" +
                "<section class=\"discussion\">\n" +
                "    {{#threads}}\n" +
                "        <article class=\"discussion-thread\" id=\"thread_{{id}}\"/>\n" +
                "    {{/threads}}\n" +
                "</section>\n" +
                "<section class=\"pagination\"/>\n" +
                "</script>\n" +
                "<script type='text/template' id='_inline_discussion'>\n" +
                "\n" +
                "<section class=\"discussion\" data-discussion-id=\"{{discussionId}}\">\n" +
                "    <article class=\"new-post-article\"></article>\n" +
                "\n" +
                "    <section class=\"threads\">\n" +
                "        {{#threads}}\n" +
                "            <article class=\"discussion-thread\" id=\"thread_{{id}}\">\n" +
                "            </article>\n" +
                "        {{/threads}}\n" +
                "    </section>\n" +
                "\n" +
                "    <section class=\"pagination\">\n" +
                "    </section>\n" +
                "</section>\n" +
                "</script>\n" +
                "<script type='text/template' id='_pagination'>\n" +
                "\n" +
                "<nav class=\"discussion-{{discussiontype}}-paginator discussion-paginator\">\n" +
                "    <ol>\n" +
                "        {{#previous}}\n" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">&lt; 上一个</a></li>\n" +
                "        {{/previous}}\n" +
                "        {{#first}}\n" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"1\">1</a></li>\n" +
                "        {{/first}}\n" +
                "        {{#leftdots}}\n" +
                "        <li>…</li>\n" +
                "        {{/leftdots}}\n" +
                "\n" +
                "        {{#lowPages}}\n" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">{{number}}</a></li>\n" +
                "        {{/lowPages}}\n" +
                "        <li class=\"current-page\"><span>{{page}}</span></li>\n" +
                "        {{#highPages}}\n" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">{{number}}</a></li>\n" +
                "        {{/highPages}}\n" +
                "\n" +
                "        {{#rightdots}}\n" +
                "        <li>…</li>\n" +
                "        {{/rightdots}}\n" +
                "        {{#last}}\n" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">{{number}}</a></li>\n" +
                "        {{/last}}\n" +
                "        {{#next}}\n" +
                "        <li><a class=\"discussion-pagination\" href=\"{{url}}\" data-page-number=\"{{number}}\">下一个 &gt;</a></li>\n" +
                "        {{/next}}\n" +
                "    </ol>\n" +
                "</nav>\n" +
                "\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "  <!-- TODO: http://docs.jquery.com/Plugins/Validation -->\n" +
                "  <script type=\"text/javascript\">\n" +
                "    \t//document.write('\\x3Cscript type=\"text/javascript\" src=\"' +\n" +
                "        //document.location.protocol + '//www.youtube.com/iframe_api\">\\x3C/script>');\n" +
                "  </script>\n" +
                "\n" +
                "  <script type=\"text/javascript\">\n" +
                "    var $$course_id = \"course\\u002Dv1:TsinghuaX+hbu_2018031901X+2018_T2\";\n" +
                "\n" +
                "    $(function(){\n" +
                "        $(\".ui-accordion-header a, .ui-accordion-content .subtitle\").each(function() {\n" +
                "          var elemText = $(this).text().replace(/^\\s+|\\s+$/g,''); // Strip leading and trailing whitespace\n" +
                "          var wordArray = elemText.split(\" \");\n" +
                "          var finalTitle = \"\";\n" +
                "          if (wordArray.length > 0) {\n" +
                "            for (i=0;i<=wordArray.length-1;i++) {\n" +
                "              finalTitle += wordArray[i];\n" +
                "              if (i == (wordArray.length-2)) {\n" +
                "                finalTitle += \"&nbsp;\";\n" +
                "              } else if (i == (wordArray.length-1)) {\n" +
                "                // Do nothing\n" +
                "              } else {\n" +
                "                finalTitle += \" \";\n" +
                "              }\n" +
                "            }\n" +
                "          }\n" +
                "          $(this).html(finalTitle);\n" +
                "        });\n" +
                "      });\n" +
                "  </script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "  <div style=\"display:none;\"><script type=\"text/javascript\" src=\"//vpc-static-cdn.xuetangx.com/static/js/analyse.1a5d505ceb2d.js\"></script></div> \n" +
                "\n" +
                "</body>\n" +
                "</html>\n" +
                "\n" +
                "\n";
        Document doc = Jsoup.parse(html);
        Elements eles = doc.select(".vert-mod");
        if(eles != null && eles.size() != 0){
            for(Element ele : eles){
                Element questionEle = ele.selectFirst("div div div");

                String dataProblemId = questionEle.attr("data-problem-id");
                String dataUrl = questionEle.attr("data-url");
                System.out.println(dataUrl);
            }

        }
    }
}
