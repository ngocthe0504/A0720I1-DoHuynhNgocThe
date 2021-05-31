package controller;

import model.PhongTro;
import service.IPhongTroService;
import service.impl.PhongTroServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ShowAllServlet", urlPatterns = "/list")
public class ShowAllServlet extends HttpServlet {
    public IPhongTroService iPhongTroService = new PhongTroServiceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhongTro> phongTroList = null;
        try {
            phongTroList = iPhongTroService.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("phongTroList", phongTroList);
        request.getRequestDispatcher("JSP/list.jsp").forward(request, response);
    }
}
