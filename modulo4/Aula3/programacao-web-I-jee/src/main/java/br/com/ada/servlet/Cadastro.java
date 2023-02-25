package br.com.ada.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address = req.getParameter("address");

        if(name.equals("") || age.equals("")|| address.equals("")){
            resp.setContentType(MediaType.TEXT_HTML);
            resp.getWriter().println("<h3>Algum dos dados não foi preenchido</h3>");
        } else {
            req.setAttribute("name", name);
            req.setAttribute("age", age);
            req.setAttribute("address", address);

            RequestDispatcher rd = req.getRequestDispatcher("data.jsp");
            rd.forward(req, resp);
        }

    }
}
