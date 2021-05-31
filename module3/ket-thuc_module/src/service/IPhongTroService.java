package service;

import model.PhongTro;

import java.sql.SQLException;
import java.util.List;

public interface IPhongTroService {
    List<PhongTro> getAll() throws SQLException;
    PhongTro findById(int id);
    PhongTro findByName(String search) throws SQLException;
    void delete(int id) throws SQLException;
    void edit(PhongTro phongTro);
    void create(PhongTro phongTro) throws SQLException;
}
