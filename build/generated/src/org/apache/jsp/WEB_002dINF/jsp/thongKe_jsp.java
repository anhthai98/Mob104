package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thongKe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main-wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("<br/><br/>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left-sidebar.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"row page-titles\">\n");
      out.write("                <div class=\"col-md-5 align-self-center\">\n");
      out.write("                    <h3 class=\"text-primary\">Thống kê</h3> </div>\n");
      out.write("                <div class=\"col-md-7 align-self-center\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">Trang chủ</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\">Thống kê</li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Bread crumb -->\n");
      out.write("            <!-- Container fluid  -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- Start Page Content -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-title\">\n");
      out.write("                                <h4>Danh sách các nhân viên xuất sắc trong tháng</h4><h4>&nbsp1</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Ảnh</th>\n");
      out.write("                                                <th>Tên</th>\n");
      out.write("                                                <th>Loại nhân viên</th>\n");
      out.write("                                                <th>Số đơn hàng hoàn thành</th>\n");
      out.write("                                                <th>Ghi chú</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <div class=\"round-img\">\n");
      out.write("                                                        <a href=\"\"><img src=\"images/avatar/4.jpg\" alt=\"\"></a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td>John Abraham</td>\n");
      out.write("                                                <td><span>Shipper</span></td>\n");
      out.write("                                                <td><span class=\"badge badge-success\"><span>456</span></span></td>\n");
      out.write("                                                <td>Try hard</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-lg-1 col-form-label\" for=\"val-skill\">Dữ liệu</label>\n");
      out.write("                    <div class=\"col-lg-2\">\n");
      out.write("                        <select class=\"form-control\" id=\"val-skill\" name=\"val-skill\">\n");
      out.write("                            <option value=\"\">Please select</option>\n");
      out.write("                            <option value=\"html\">Doanh thu</option>\n");
      out.write("                            <option value=\"css\">Đơn hàng</option>\n");
      out.write("                            <option value=\"angular\">Nhân viên</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <label class=\"col-lg-1 col-form-label\" for=\"val-skill\">Từ ngày</label>\n");
      out.write("                    <div class=\"col-lg-2\">\n");
      out.write("                        <input type=\"date\" class=\"form-control\" placeholder=\"dd/mm/yyyy\">\n");
      out.write("                    </div>\n");
      out.write("                    <label class=\"col-lg-1 col-form-label\" for=\"val-skill\">Đến ngày</label>\n");
      out.write("                    <div class=\"col-lg-2\">\n");
      out.write("                        <input type=\"date\" class=\"form-control\" placeholder=\"dd/mm/yyyy\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2\">\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success btn-flat m-b-10 m-l-5\">Success</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Thống kê doanh thu</h4>\n");
      out.write("                                <div class=\"table-responsive m-t-40\">\n");
      out.write("                                    <table id=\"example23\" class=\"display nowrap table table-hover table-striped table-bordered\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Name</th>\n");
      out.write("                                                <th>Position</th>\n");
      out.write("                                                <th>Office</th>\n");
      out.write("                                                <th>Age</th>\n");
      out.write("                                                <th>Start date</th>\n");
      out.write("                                                <th>Salary</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tfoot>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Name</th>\n");
      out.write("                                                <th>Position</th>\n");
      out.write("                                                <th>Office</th>\n");
      out.write("                                                <th>Age</th>\n");
      out.write("                                                <th>Start date</th>\n");
      out.write("                                                <th>Salary</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tfoot>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Tiger Nixon</td>\n");
      out.write("                                                <td>System Architect</td>\n");
      out.write("                                                <td>Edinburgh</td>\n");
      out.write("                                                <td>61</td>\n");
      out.write("                                                <td>2011/04/25</td>\n");
      out.write("                                                <td>$320,800</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Thống kê đơn hàng</h4>\n");
      out.write("                                <div class=\"table-responsive m-t-40\">\n");
      out.write("                                    <table id=\"example23\" class=\"display nowrap table table-hover table-striped table-bordered\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Name</th>\n");
      out.write("                                                <th>Position</th>\n");
      out.write("                                                <th>Office</th>\n");
      out.write("                                                <th>Age</th>\n");
      out.write("                                                <th>Start date</th>\n");
      out.write("                                                <th>Salary</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tfoot>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Name</th>\n");
      out.write("                                                <th>Position</th>\n");
      out.write("                                                <th>Office</th>\n");
      out.write("                                                <th>Age</th>\n");
      out.write("                                                <th>Start date</th>\n");
      out.write("                                                <th>Salary</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tfoot>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Tiger Nixon</td>\n");
      out.write("                                                <td>System Architect</td>\n");
      out.write("                                                <td>Edinburgh</td>\n");
      out.write("                                                <td>61</td>\n");
      out.write("                                                <td>2011/04/25</td>\n");
      out.write("                                                <td>$320,800</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Thống kê nhân viên</h4>\n");
      out.write("                                <div class=\"table-responsive m-t-40\">\n");
      out.write("                                    <table id=\"example23\" class=\"display nowrap table table-hover table-striped table-bordered\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Name</th>\n");
      out.write("                                                <th>Position</th>\n");
      out.write("                                                <th>Office</th>\n");
      out.write("                                                <th>Age</th>\n");
      out.write("                                                <th>Start date</th>\n");
      out.write("                                                <th>Salary</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tfoot>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Name</th>\n");
      out.write("                                                <th>Position</th>\n");
      out.write("                                                <th>Office</th>\n");
      out.write("                                                <th>Age</th>\n");
      out.write("                                                <th>Start date</th>\n");
      out.write("                                                <th>Salary</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tfoot>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Tiger Nixon</td>\n");
      out.write("                                                <td>System Architect</td>\n");
      out.write("                                                <td>Edinburgh</td>\n");
      out.write("                                                <td>61</td>\n");
      out.write("                                                <td>2011/04/25</td>\n");
      out.write("                                                <td>$320,800</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- End PAge Content -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"footer\"> © 2018 All rights reserved. Template designed by <a href=\"https://www.facebook.com/profile.php?id=100010754627040\">Chu Thái</a></footer>\n");
      out.write("        <script src=\"abc/js/lib/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap tether Core JavaScript -->\n");
      out.write("        <script src=\"abc/js/lib/bootstrap/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- slimscrollbar scrollbar JavaScript -->\n");
      out.write("        <script src=\"abc/js/jquery.slimscroll.js\"></script>\n");
      out.write("        <!--Menu sidebar -->\n");
      out.write("        <script src=\"abc/js/sidebarmenu.js\"></script>\n");
      out.write("        <!--stickey kit -->\n");
      out.write("        <script src=\"abc/js/lib/sticky-kit-master/dist/sticky-kit.min.js\"></script>\n");
      out.write("        <!--Custom JavaScript -->\n");
      out.write("        <script src=\"abc/js/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"abc/js/lib/datatables/datatables.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.flash.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.print.min.js\"></script>\n");
      out.write("        <script src=\"abc/js/lib/datatables/datatables-init.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
