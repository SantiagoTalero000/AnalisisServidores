package com.analisisservidores.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ListarServidoresServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Lista de Servidores</h2>");
        out.println("<ul>");
        out.println("<li>Servidor 1 - 192.168.1.10</li>");
        out.println("<li>Servidor 2 - 192.168.1.11</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}
