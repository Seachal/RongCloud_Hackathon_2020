/*
 * admin_left.java ����Ա���ҳ��
 *
 * Created on 2007��5��23��, ����7:29
 */

package admin;

import java.io.*;
import java.net.*;
import java.sql.*;
import javax.sql.*;
import inc.condb;
import javax.servlet.*;
import javax.servlet.http.*;

public class admin_left
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
    out.println("\r\n");
    out.println("<script language=JavaScript>\r\n");
    out.println("function logout(){\r\n");
    out.println("\tif (confirm(\"ϵͳ��ʾ����ȷ��Ҫ�˳�����������\"))\r\n");
    out.println("\ttop.location = \"../index.html\";\r\n");
    out.println("\treturn false;\r\n");
    out.println("}\r\n");
    out.println("</script>\r\n");
    out.println(
        "<link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
    out.println("<body>\r\n");
    out.println("<table width=\"150\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#CCCCCC\" class=\"left\">\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td height=\"25\" align=\"center\" bgcolor=\"#0099FF\" class=\"write\">�û�����</td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\"><a href=\"admin_add.do\" target=\"mainFrame\">�������û�</a></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("    <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\"><a href=\"admin_infor.do\" target=\"mainFrame\">�޸ı�������</a></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("    <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\"><a href=\"admin_password.do\" target=\"mainFrame\">�޸ı�������</a></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td height=\"25\" align=\"center\" bgcolor=\"#0099FF\" class=\"write\">��Ϣ��������</td>\r\n");
    out.println("  </tr>\r\n");

    out.println("    <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\"><span class=\"STYLE1\"><a href=\"myinfor.do\" target=\"mainFrame\">�ҵ���Ϣ</a></span></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\"><a href=\"write.do\" target=\"mainFrame\">д��Ϣ</a></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\"><a href=\"inforhostry.do\" target=\"mainFrame\">��Ϣ��¼</a></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td height=\"25\" align=\"center\" bgcolor=\"#0099FF\" class=\"write\">��������</td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\"><a href=\"online.do\" target=\"mainFrame\">Ա���б�</a></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("    <tr>\r\n");
    out.println("    <td height=\"20\" align=\"center\" bgcolor=\"#0099FF\"><a href=\"../logout.do\" onClick=\"logout();\" class=\"write\">�˳�</a></td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println(
        "    <td height=\"20\" align=\"center\" bgcolor=\"#9CCFFF\">��Ȩ����:</td>\r\n");
    out.println("  </tr>\r\n");
    out.println("  <tr>\r\n");
    out.println("    <td align=\"center\" bgcolor=\"#0099FF\"><a href=\"http://www.chmchm.com\" target=\"_blank\">CHMCHM</a> &copy;2007-2010 </td>\r\n");
    out.println("  </tr>\r\n");
    out.println("</table>\r\n");
    out.println("</body>\r\n");

  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws
      ServletException, IOException {
    doGet(request, response);
  }
}