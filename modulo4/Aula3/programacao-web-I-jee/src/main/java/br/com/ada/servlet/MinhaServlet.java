package br.com.ada.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/minhaServlet")
public class MinhaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); // MediaType.TEXT_HTML

        req.getSession().setAttribute("nome", "Matheus Gaviraghi");

        PrintWriter out = resp.getWriter();
        out.println("<h1>Escrevendo com o Servlet!</h1>");

        // redirecionando pra outra Servlet
        resp.sendRedirect("/programacao-web-I-jee/consultaServlet");
    }
}
