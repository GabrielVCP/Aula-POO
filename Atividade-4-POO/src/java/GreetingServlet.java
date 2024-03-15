package web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalTime;

@WebServlet(name = "GreetingServlet", urlPatterns = {"/greeting.html"})
public class GreetingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GreetingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int horaAtual = LocalTime.now().getHour();
            int horaAtual2 = LocalTime.now().getMinute();
            
           if (horaAtual >= 4 && horaAtual < 12)
            {
                 out.println("<h1> Bom dia </h1>"+horaAtual+":"+horaAtual2);
            }
           else if (horaAtual >= 12 && horaAtual < 18 )
           {
               out.println("<h1> Boa tarde </h1>"+horaAtual+":"+horaAtual2);
           }
           else if (horaAtual >= 18 && horaAtual < 23 )
           {
               out.println("<h1> Boa noite </h1>"+horaAtual+":"+horaAtual2);
           }
           else
           {
               out.println("<h1> Boa noite </h1>"+horaAtual+":"+horaAtual2);
           }
         
            
            out.println("<h3><a href='index.html'> voltar</a></h3>" );
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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