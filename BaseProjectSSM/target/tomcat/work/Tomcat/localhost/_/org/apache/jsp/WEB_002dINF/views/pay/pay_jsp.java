/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-09-06 16:22:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.pay;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/pay/../common/header.jsp", Long.valueOf(1662034459722L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"copyright\" content=\"All Rights Reserved, Copyright (C) 2013, 包头师范学院, Ltd.\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../resources/admin/easyui/easyui/1.3.4/themes/default/easyui.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../resources/admin/easyui/css/wu.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../resources/admin/easyui/css/icon.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/admin/easyui/js/jquery-1.8.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/admin/easyui/easyui/1.3.4/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/admin/easyui/easyui/1.3.4/echarts.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../resources/admin/easyui/easyui/1.3.4/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<body class=\"easyui-layout\">");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul, ol {\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: \"Helvetica Neue\", Helvetica, Arial, \"Lucida Grande\",\n");
      out.write("            sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .tab-head {\n");
      out.write("            margin-left: 120px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .tab-content {\n");
      out.write("            clear: left;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            border-bottom: solid #02aaf1 2px;\n");
      out.write("            width: 200px;\n");
      out.write("            height: 25px;\n");
      out.write("            margin: 0;\n");
      out.write("            float: left;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .selected {\n");
      out.write("            color: #FFFFFF;\n");
      out.write("            background-color: #02aaf1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .show {\n");
      out.write("            clear: left;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hidden {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .new-btn-login-sp {\n");
      out.write("            padding: 1px;\n");
      out.write("            display: inline-block;\n");
      out.write("            width: 75%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .new-btn-login {\n");
      out.write("            background-color: #02aaf1;\n");
      out.write("            color: #FFFFFF;\n");
      out.write("            font-weight: bold;\n");
      out.write("            border: none;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 30px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #main {\n");
      out.write("            width: 100%;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .red-star {\n");
      out.write("            color: #f00;\n");
      out.write("            width: 10px;\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .null-star {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content {\n");
      out.write("            margin-top: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content dt {\n");
      out.write("            width: 100px;\n");
      out.write("            display: inline-block;\n");
      out.write("            float: left;\n");
      out.write("            margin-left: 20px;\n");
      out.write("            color: #666;\n");
      out.write("            font-size: 13px;\n");
      out.write("            margin-top: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content dd {\n");
      out.write("            margin-left: 120px;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content dd input {\n");
      out.write("            width: 85%;\n");
      out.write("            height: 28px;\n");
      out.write("            border: 0;\n");
      out.write("            -webkit-border-radius: 0;\n");
      out.write("            -webkit-appearance: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #foot {\n");
      out.write("            margin-top: 10px;\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 15px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .foot-ul {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .foot-ul li {\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #666;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .note-help {\n");
      out.write("            color: #999999;\n");
      out.write("            font-size: 12px;\n");
      out.write("            line-height: 130%;\n");
      out.write("            margin-top: 5px;\n");
      out.write("            width: 100%;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #btn-dd {\n");
      out.write("            margin: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .foot-ul {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .one_line {\n");
      out.write("            display: block;\n");
      out.write("            height: 1px;\n");
      out.write("            border: 0;\n");
      out.write("            border-top: 1px solid #eeeeee;\n");
      out.write("            width: 100%;\n");
      out.write("            margin-left: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .am-header {\n");
      out.write("            display: -webkit-box;\n");
      out.write("            display: -ms-flexbox;\n");
      out.write("            display: box;\n");
      out.write("            width: 100%;\n");
      out.write("            position: relative;\n");
      out.write("            padding: 7px 0;\n");
      out.write("            -webkit-box-sizing: border-box;\n");
      out.write("            -ms-box-sizing: border-box;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background: #1D222D;\n");
      out.write("            height: 50px;\n");
      out.write("            text-align: center;\n");
      out.write("            -webkit-box-pack: center;\n");
      out.write("            -ms-flex-pack: center;\n");
      out.write("            box-pack: center;\n");
      out.write("            -webkit-box-align: center;\n");
      out.write("            -ms-flex-align: center;\n");
      out.write("            box-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .am-header h1 {\n");
      out.write("            -webkit-box-flex: 1;\n");
      out.write("            -ms-flex: 1;\n");
      out.write("            box-flex: 1;\n");
      out.write("            line-height: 18px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 18px;\n");
      out.write("            font-weight: 300;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body text=#000000 bgColor=\"#ffffff\" leftMargin=0 topMargin=4>\n");
      out.write("<header class=\"am-header\">\n");
      out.write("    <h1>支付宝电脑网站支付体验入口页</h1>\n");
      out.write("</header>\n");
      out.write("<div id=\"main\">\n");
      out.write("    <div id=\"tabhead\" class=\"tab-head\">\n");
      out.write("        <h2 id=\"tab1\" class=\"selected\" name=\"tab\">付 款</h2>\n");
      out.write("        <h2 id=\"tab2\" name=\"tab\">交 易 查 询</h2>\n");
      out.write("        <h2 id=\"tab3\" name=\"tab\">退 款</h2>\n");
      out.write("        <h2 id=\"tab4\" name=\"tab\">退 款 查 询</h2>\n");
      out.write("        <h2 id=\"tab5\" name=\"tab\">交 易 关 闭</h2>\n");
      out.write("    </div>\n");
      out.write("    <form name=alipayment action=/pay/showPay method=post\n");
      out.write("          target=\"_blank\">\n");
      out.write("        <div id=\"body1\" class=\"show\" name=\"divcontent\">\n");
      out.write("            <dl class=\"content\">\n");
      out.write("                <dt>商户订单号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDout_trade_no\" name=\"WIDout_trade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>订单名称 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDsubject\" name=\"WIDsubject\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>付款金额 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDtotal_amount\" name=\"WIDtotal_amount\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>商品描述：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDbody\" name=\"WIDbody\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt></dt>\n");
      out.write("                <dd id=\"btn-dd\">\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\n");
      out.write("                                    style=\"text-align: center;\">付 款</button>\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">如果您点击“付款”按钮，即表示您同意该次的执行操作。</span>\n");
      out.write("                </dd>\n");
      out.write("            </dl>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <form name=tradequery action=alipay.trade.query.jsp method=post\n");
      out.write("          target=\"_blank\">\n");
      out.write("        <div id=\"body2\" class=\"tab-content\" name=\"divcontent\">\n");
      out.write("            <dl class=\"content\">\n");
      out.write("                <dt>商户订单号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTQout_trade_no\" name=\"WIDTQout_trade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>支付宝交易号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTQtrade_no\" name=\"WIDTQtrade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt></dt>\n");
      out.write("                <dd id=\"btn-dd\">\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\n");
      out.write("                                    style=\"text-align: center;\">交 易 查 询</button>\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“交易查询”按钮，即表示您同意该次的执行操作。</span>\n");
      out.write("                </dd>\n");
      out.write("            </dl>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <form name=traderefund action=alipay.trade.refund.jsp method=post\n");
      out.write("          target=\"_blank\">\n");
      out.write("        <div id=\"body3\" class=\"tab-content\" name=\"divcontent\">\n");
      out.write("            <dl class=\"content\">\n");
      out.write("                <dt>商户订单号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTRout_trade_no\" name=\"WIDTRout_trade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>支付宝交易号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTRtrade_no\" name=\"WIDTRtrade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>退款金额 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTRrefund_amount\" name=\"WIDTRrefund_amount\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>退款原因 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTRrefund_reason\" name=\"WIDTRrefund_reason\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>退款请求号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTRout_request_no\" name=\"WIDTRout_request_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt></dt>\n");
      out.write("                <dd id=\"btn-dd\">\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\n");
      out.write("                                    style=\"text-align: center;\">退 款</button>\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“退款”按钮，即表示您同意该次的执行操作。</span>\n");
      out.write("                </dd>\n");
      out.write("            </dl>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <form name=traderefundquery\n");
      out.write("          action=alipay.trade.fastpay.refund.query.jsp method=post\n");
      out.write("          target=\"_blank\">\n");
      out.write("        <div id=\"body4\" class=\"tab-content\" name=\"divcontent\">\n");
      out.write("            <dl class=\"content\">\n");
      out.write("                <dt>商户订单号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDRQout_trade_no\" name=\"WIDRQout_trade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>支付宝交易号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDRQtrade_no\" name=\"WIDRQtrade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>退款请求号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDRQout_request_no\" name=\"WIDRQout_request_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt></dt>\n");
      out.write("                <dd id=\"btn-dd\">\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\n");
      out.write("                                    style=\"text-align: center;\">退 款 查 询</button>\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“退款查询”按钮，即表示您同意该次的执行操作。</span>\n");
      out.write("                </dd>\n");
      out.write("            </dl>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <form name=tradeclose action=alipay.trade.close.jsp method=post\n");
      out.write("          target=\"_blank\">\n");
      out.write("        <div id=\"body5\" class=\"tab-content\" name=\"divcontent\">\n");
      out.write("            <dl class=\"content\">\n");
      out.write("                <dt>商户订单号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTCout_trade_no\" name=\"WIDTCout_trade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt>支付宝交易号 ：</dt>\n");
      out.write("                <dd>\n");
      out.write("                    <input id=\"WIDTCtrade_no\" name=\"WIDTCtrade_no\" />\n");
      out.write("                </dd>\n");
      out.write("                <hr class=\"one_line\">\n");
      out.write("                <dt></dt>\n");
      out.write("                <dd id=\"btn-dd\">\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\n");
      out.write("                                    style=\"text-align: center;\">交 易 关 闭</button>\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">商户订单号与支付宝交易号二选一，如果您点击“交易关闭”按钮，即表示您同意该次的执行操作。</span>\n");
      out.write("                </dd>\n");
      out.write("            </dl>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <div id=\"foot\">\n");
      out.write("        <ul class=\"foot-ul\">\n");
      out.write("            <li>支付宝版权所有 2015-2018 ALIPAY.COM</li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<script language=\"javascript\">\n");
      out.write("    var tabs = document.getElementsByName('tab');\n");
      out.write("    var contents = document.getElementsByName('divcontent');\n");
      out.write("\n");
      out.write("    (function changeTab(tab) {\n");
      out.write("        for(var i = 0, len = tabs.length; i < len; i++) {\n");
      out.write("            tabs[i].onmouseover = showTab;\n");
      out.write("        }\n");
      out.write("    })();\n");
      out.write("\n");
      out.write("    function showTab() {\n");
      out.write("        for(var i = 0, len = tabs.length; i < len; i++) {\n");
      out.write("            if(tabs[i] === this) {\n");
      out.write("                tabs[i].className = 'selected';\n");
      out.write("                contents[i].className = 'show';\n");
      out.write("            } else {\n");
      out.write("                tabs[i].className = '';\n");
      out.write("                contents[i].className = 'tab-content';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function GetDateNow() {\n");
      out.write("        var vNow = new Date();\n");
      out.write("        var sNow = \"\";\n");
      out.write("        sNow += String(vNow.getFullYear());\n");
      out.write("        sNow += String(vNow.getMonth() + 1);\n");
      out.write("        sNow += String(vNow.getDate());\n");
      out.write("        sNow += String(vNow.getHours());\n");
      out.write("        sNow += String(vNow.getMinutes());\n");
      out.write("        sNow += String(vNow.getSeconds());\n");
      out.write("        sNow += String(vNow.getMilliseconds());\n");
      out.write("        document.getElementById(\"WIDout_trade_no\").value =  sNow;\n");
      out.write("        document.getElementById(\"WIDsubject\").value = \"测试\";\n");
      out.write("        document.getElementById(\"WIDtotal_amount\").value = \"0.01\";\n");
      out.write("    }\n");
      out.write("    GetDateNow();\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
