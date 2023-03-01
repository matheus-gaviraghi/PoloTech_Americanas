package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {

    private static Integer ID;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String placa = req.getParameter("placa");
        String marca = req.getParameter("marca");
        String modelo = req.getParameter("modelo");
        String tipo = req.getParameter("tipo");

        if(placa.equals("") || marca.equals("") || modelo.equals("") || tipo.equals("")){

            resp.setContentType(MediaType.TEXT_HTML);
            PrintWriter out = resp.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Algum dos campos não foi preenchido!');");
            out.println("</script>");

            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.include(req, resp);

//            resp.setContentType(MediaType.TEXT_HTML);
//            resp.getWriter().println("<h3>Algum dos dados não foi preenchido</h3>");
        } else {
            req.setAttribute("placa", placa);
            req.setAttribute("marca", marca);
            req.setAttribute("modelo", modelo);
            req.setAttribute("tipo", tipo);

            RequestDispatcher rd = req.getRequestDispatcher("data.jsp");
            rd.forward(req, resp);
        }

    }
}
