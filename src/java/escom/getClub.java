/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package escom;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author roy
 */
public class getClub extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet getClub</title>");
            String link = "<link rel='stylesheet' href='https://unpkg.com/@picocss/pico@latest/css/pico.min.css'>";
            out.println(link);
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='index.html' class='btn btn-primary'>Regresar</a>");
            // out.println("<h1>Servlet getCourses at " + request.getContextPath() + "</
            // out.println("<h1>Servlet getClub at " + request.getContextPath() + "</h1>");
            MySQLConnection mySQLConnection = new MySQLConnection();
            Club club = mySQLConnection.getClub(request.getParameter("id"));
            if(club.getNAME() != null){
                out.println("<div class='container'>");
                out.println("<article style='text-align: center' >");
                out.println("<img src='img/"+ club.getLOGO() +"' style='height: 20vh' alt='imgClub' >");
                out.println("<h3 class='card-title'>" + club.getNAME() + "</h3>");
                out.println("<p>" + club.getDESCRIPTION() + "</p>");
                out.println("<p>Responsable:" + club.getOWNER() + "</p>");
                out.println("<p>Lugares Disponibles: "+ club.getMAX_MEMBERS() +" (" + club.getCURRENT_MEMBERS() + ")</p>");
                out.println("<p>Ubicado en:" + club.getPLACE() + "</p>");

                out.println("</article>");
                out.println("</div>");
            }else{
                out.println("<div class='container'>");
                out.println("<article><h1>Club no encontrado</h1></article>");
                out.println("</div>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
