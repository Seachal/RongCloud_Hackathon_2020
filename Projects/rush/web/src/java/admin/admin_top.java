/*
 * admin_top.java �������Ķ���ҳ��
 *
 * Created on 2007��5��23��, ����7:24
 */

package admin;

import java.io.*;
import java.net.*;
import java.sql.*;
import javax.sql.*;
import inc.condb;
import javax.servlet.*;
import javax.servlet.http.*;

public class admin_top
    extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws
      ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    HttpSession session = request.getSession();
    String username = (String) session.getAttribute("username");
    if (username == null) {
      response.sendRedirect("../index.html");
      return;
    }

    try {
      out.println("\r\n");
      out.println(
          "<link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.println("\r\n");
      out.println(
          "<div align=\"center\" class=\"top\">��ҵ��Ϣ����ϵͳ(CICS):<span class=\"red\">��ӭ����Ա��" +
          username + "�ĵ���</span>\r\n");
      out.println("</div>\r\n");
      out.println("\r\n");
    }
    catch (Exception e) {

    }

  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws
      ServletException, IOException {
    doGet(request, response);
  }
}