package controller;

import model.PhongTro;
import service.IPhongTroService;
import service.impl.PhongTroServiceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "SearchServlet", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    IPhongTroService iPhongTroService = new PhongTroServiceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("search");
        try {
            List<PhongTro> phongTroList = (List<PhongTro>) iPhongTroService.findByName("search");
            request.setAttribute("phongTroList", phongTroList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("JSP/list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
