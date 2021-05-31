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

@WebServlet(name = "CreateServlet", urlPatterns = "/create")
public class CreateServlet extends HttpServlet {
    IPhongTroService iPhongTroService = new PhongTroServiceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PhongTro phongTro = new PhongTro();
        phongTro.setId(Integer.parseInt(request.getParameter("id")));
        phongTro.setTenNguoiThue(request.getParameter("tenNguoiThue"));
        phongTro.setSdt(Integer.parseInt(request.getParameter("sdt")));
        phongTro.setIdNguoiThue(Integer.parseInt(request.getParameter("idNguoiThue")));
        phongTro.setNgayThue(request.getParameter("ngayThue"));
        phongTro.setGhiChu(request.getParameter("ghiChu"));
        try {
            iPhongTroService.create(phongTro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("JSP/create.jsp").forward(request, response);
    }
}
