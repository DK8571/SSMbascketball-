/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-09-04 01:35:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.ownmasage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ownmasage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/ownmasage/../common/header.jsp", Long.valueOf(1662034459722L));
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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<body style=\"height: 100%;width: 100%;\" onload=\"setsex()\">\r\n");
      out.write("<div style=\" margin: auto auto;height: 900px;width: 900px\">\r\n");
      out.write("    <div style=\"margin: 100px auto;;height: 800px;width: 800px\">\r\n");
      out.write("        <form id=\"edit-form\" style=\" margin:  auto;height: 400px;width: 500px;text-align:center;\" method=\"post\">\r\n");
      out.write("            <input type=\"hidden\" name=\"id\" id=\"edit-id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("            <table style=\"margin: auto auto;height: 300px;width: 400px;text-align:center;\">\r\n");
      out.write("                <tr style=\"text-align:center;\">\r\n");
      out.write("\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <td style=\"margin-left: 100px\"></td>\r\n");
      out.write("                        <img id=\"preview-photo\" style=\"Border-radius:60%\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].photo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"onclick=\"uploadPhoto()\" height=\"100px\" width=\"100px\">\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"60\" align=\"right\">头像:</td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"add-photo\" name=\"photo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].photo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\" class=\"wu-text \" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"60\" align=\"right\">用户名:</td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"add-username\" name=\"username\" class=\"wu-text easyui-validatebox\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"60\" align=\"right\">姓名:</td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"add-name\" name=\"name\" class=\"wu-text easyui-validatebox\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"60\" align=\"right\">性别:</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"sex\" id=\"add-sex\" class=\"easyui-combobox\" panelHeight=\"auto\" style=\"width:268px\">\r\n");
      out.write("                            <option value=\"0\">未知</option>\r\n");
      out.write("                            <option value=\"1\">男</option>\r\n");
      out.write("                            <option value=\"2\">女</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"60\" align=\"right\">年龄:</td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"add-age\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].age }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"age\" class=\"wu-text easyui-numberbox easyui-validatebox\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"60\" align=\"right\">地址:</td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"add-address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"address\" class=\"wu-text easyui-validatebox\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"60\" align=\"right\">余额:</td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"add-balance\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].balance }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"balance\" readonly=\"readonly\" class=\"wu-text easyui-validatebox\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("            <input type=\"button\" id=\"edit-btn\"  class=\"edit-btn\" value=\"保存\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("<div id=\"process-dialog\" class=\"easyui-dialog\" data-options=\"closed:true,iconCls:'icon-upload',title:'正在上传图片'\" style=\"width:450px; padding:10px;\">\r\n");
      out.write("<div id=\"p\" class=\"easyui-progressbar\" style=\"width:400px;\" data-options=\"text:'正在上传中...'\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"file\" id=\"photo-file\" style=\"display:none;\" onchange=\"upload()\">\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //上传图片\r\n");
      out.write("    function start(){\r\n");
      out.write("        var value = $('#p').progressbar('getValue');\r\n");
      out.write("        if (value < 100){\r\n");
      out.write("            value += Math.floor(Math.random() * 10);\r\n");
      out.write("            $('#p').progressbar('setValue', value);\r\n");
      out.write("        }else{\r\n");
      out.write("            $('#p').progressbar('setValue',0)\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("    function upload(){\r\n");
      out.write("        if($(\"#photo-file\").val() == '')return;\r\n");
      out.write("        var formData = new FormData();\r\n");
      out.write("        formData.append('photo',document.getElementById('photo-file').files[0]);\r\n");
      out.write("        $(\"#process-dialog\").dialog('open');\r\n");
      out.write("        var interval = setInterval(start,200);\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:'upload_photo',\r\n");
      out.write("            type:'post',\r\n");
      out.write("            data:formData,\r\n");
      out.write("            contentType:false,\r\n");
      out.write("            processData:false,\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                clearInterval(interval);\r\n");
      out.write("                $(\"#process-dialog\").dialog('close');\r\n");
      out.write("                if(data.type == 'success'){\r\n");
      out.write("                    $(\"#preview-photo\").attr('src',data.filepath);\r\n");
      out.write("                    $(\"#add-photo\").val(data.filepath);\r\n");
      out.write("                }else{\r\n");
      out.write("                    $.messager.alert(\"消息提醒\",data.msg,\"warning\");\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            error:function(data){\r\n");
      out.write("                clearInterval(interval);\r\n");
      out.write("                $(\"#process-dialog\").dialog('close');\r\n");
      out.write("                $.messager.alert(\"消息提醒\",\"上传失败!\",\"warning\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function uploadPhoto(){\r\n");
      out.write("        $(\"#photo-file\").click();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(\"#edit-btn\").click(function(){\r\n");
      out.write("        var validate = $(\"#edit-form\").form(\"validate\");\r\n");
      out.write("        if(!validate){\r\n");
      out.write("            $.messager.alert(\"消息提醒\",\"请检查你输入的数据!\",\"warning\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var data = $(\"#edit-form\").serialize();\r\n");
      out.write("        console.log(data)\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:'edit',\r\n");
      out.write("            dataType:'json',\r\n");
      out.write("            type:'post',\r\n");
      out.write("            data:data,\r\n");
      out.write("            success:function(data){\r\n");
      out.write("                if(data.type == 'success'){\r\n");
      out.write("                    $.messager.alert('信息提示','修改成功！','info');\r\n");
      out.write("                    $('#edit-dialog').dialog('close');\r\n");
      out.write("                    $('#data-datagrid').datagrid('reload');\r\n");
      out.write("                }else{\r\n");
      out.write("                    $.messager.alert('信息提示',data.msg,'warning');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function setsex(){\r\n");
      out.write("        $(\"#add-sex\").combobox('setValue',");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Member[0].sex }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
