/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-03-07 18:14:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/jstlLib.jsp", Long.valueOf(1678203362747L));
    _jspx_dependants.put("jar:file:/C:/Users/bourg/OneDrive/Bureau/WorkspaceJ2E/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LaCleanSneak/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1678177894932L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"row m-1 rounded\" style=\"background-color: green\">\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/1.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/2.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/3.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/4.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/5.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/6.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/7.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card m-auto my-3 rounded\" style=\"width: 18rem;\">\r\n");
      out.write("		<img src=\"resources/img/8.jpg\" class=\"card-img-top\" alt=\"shoes\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">Air Jordan 1</h5>\r\n");
      out.write("			<p class=\"card-text\">La Air Jordan 1 Low UNC affiche une empeigne\r\n");
      out.write("				en cuir combinant du blanc et des empiÃ¨cement aux couleurs de\r\n");
      out.write("				lâuniversitÃ© de la Caroline du Nord dans laquelle Â« His Airness Â»\r\n");
      out.write("				Ã©voluait. On retrouve ce bleu pÃ¢le au niveau de lâoutsole qui vient\r\n");
      out.write("				faire un rappel, ainsi que sur les lacets. Enfin, un logo Wings au\r\n");
      out.write("				talon et un Jumpman sur la languette finalisent le design.</p>\r\n");
      out.write("			<a href=\"addUser\" class=\"btn btn-primary\">Achete !</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f0_reused = false;
    try {
      _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f0.setParent(null);
      // /View/home.jsp(1,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f0.setUrl("header+footer/header.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
        if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
      _jspx_th_c_005fimport_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    boolean _jspx_th_c_005fimport_005f1_reused = false;
    try {
      _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fimport_005f1.setParent(null);
      // /View/home.jsp(108,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fimport_005f1.setUrl("header+footer/footer.jsp");
      int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
        if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fimport_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
      _jspx_th_c_005fimport_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fimport_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fimport_005f1_reused);
    }
    return false;
  }
}
