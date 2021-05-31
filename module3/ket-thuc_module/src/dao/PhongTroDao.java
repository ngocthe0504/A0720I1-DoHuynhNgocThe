package dao;

import model.PhongTro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhongTroDao {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/module3?useSSL=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "123123";

    private static final String SELECT_ALL_PHONGTRO = "Select * from tro";
    private static final String CREATE_PHONGTRO = "insert into tro values (?, ?, ?, ?, ?, ?)";
    private static final String DELETE_PHONGTRO = "delete from tro where id = ? ";
    private static final String FIND_PHONGTRO = "select * from tro where id like ?";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public static List<PhongTro> getAll() throws SQLException {
        List<PhongTro> phongTroList = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PHONGTRO);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("idphongtro");
            String tenNguoiThue = resultSet.getString("tennguoithue");
            int idnguoiThue = resultSet.getInt("idnguoithue");
            int SDT = resultSet.getInt("sdt");
            String ngayBatDau = String.valueOf(resultSet.getDate("ngaybatdau"));
            String ghiChu = resultSet.getString("ghichu");

            phongTroList.add(new PhongTro(id, tenNguoiThue, SDT, idnguoiThue, ngayBatDau, ghiChu));

        }
        return phongTroList;
    }
    public void create(PhongTro phongTro) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE_PHONGTRO);
        preparedStatement.setString(1, String.valueOf(phongTro.getId()));
        preparedStatement.setString(2, phongTro.getTenNguoiThue());
        preparedStatement.setInt(3, phongTro.getIdNguoiThue());
        preparedStatement.setInt(4, phongTro.getSdt());
        preparedStatement.setString(5, phongTro.getNgayThue());
        preparedStatement.setString(6, phongTro.getGhiChu());
        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PHONGTRO);
        preparedStatement.setString(1, String.valueOf(id));
        preparedStatement.executeUpdate();
    }

    public List<PhongTro> search(String search) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_PHONGTRO);
        preparedStatement.setString(1, "%" + search + "%");
        ResultSet resultSet = preparedStatement.executeQuery();
        PhongTro phongTro = null;
        List<PhongTro> list = new ArrayList<>();
        while (resultSet.next()) {
            phongTro = new PhongTro();
            int id = resultSet.getInt("idphongtro");
            String tenNguoiThue = resultSet.getString("tennguoithue");
            int idnguoiThue = resultSet.getInt("idnguoithue");
            int SDT = resultSet.getInt("sdt");
            String ngayBatDau = String.valueOf(resultSet.getDate("ngaybatdau"));
            String ghiChu = resultSet.getString("ghichu");
            phongTro.setId(id);
            phongTro.setTenNguoiThue(tenNguoiThue);
            phongTro.setIdNguoiThue(idnguoiThue);
            phongTro.setSdt(SDT);
            phongTro.setNgayThue(ngayBatDau);
            phongTro.setGhiChu(ghiChu);
            list.add(phongTro);
        }
        return list;
    }
}
