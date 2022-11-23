/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package escom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author roy
 */
public class getCourses extends HttpServlet {

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
            out.println("<title>Servlet getCourses</title>");
            String link = "<link rel='stylesheet' href='https://unpkg.com/@picocss/pico@latest/css/pico.min.css'>";
            out.println(link);

            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            // create a return button
            out.println("<a href='index.html' class='btn btn-primary'>Regresar</a>");
            // out.println("<h1>Servlet getCourses at " + request.getContextPath() + "</h1>");

            MySQLConnection mySQLConnection = new MySQLConnection();
            ArrayList<Club> clubs = mySQLConnection.getClubs();
            out.print("<div class='grid'>");
            for (Club club : clubs) {
                out.println("<article>");
                out.println("<div class='card-header' style='text-align: center' >");
                out.println("<img src='img/"+ club.getLOGO() +"' style='height: 20vh' alt='imgClub' >");
                out.println("<h3 class='card-title'>" + club.getNAME() + "</h3>");

                out.println("</div>");
                out.println("<div class='card-body'>");
                out.println("<p>" + club.getDESCRIPTION() + "</p>");
                out.println("</div>");
                out.println("<div class='card-footer'>");
                out.println("<a href='./getClub?id=" + club.getID_CLUB() + "' class='btn btn-primary'>Ver más</a>");
                
                out.println("</div>");
                out.println("</article>");
            }
            out.print("</div");
            out.print("</div");

            // out.println("<article> "+ + " </article>");

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
