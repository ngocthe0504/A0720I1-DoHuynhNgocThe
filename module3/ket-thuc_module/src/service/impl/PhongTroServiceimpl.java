package service.impl;

import dao.PhongTroDao;
import model.PhongTro;
import service.IPhongTroService;

import java.sql.SQLException;
import java.util.List;

public class PhongTroServiceimpl implements IPhongTroService {
    public PhongTroDao phongTroDao = new PhongTroDao();
    @Override
    public List<PhongTro> getAll() throws SQLException {
        return PhongTroDao.getAll();
    }

    @Override
    public PhongTro findById(int id) {
        return null;
    }

    @Override
    public PhongTro findByName(String search) throws SQLException {
        return (PhongTro) phongTroDao.search(search);
    }

    @Override
    public void delete(int id) throws SQLException {
        phongTroDao.delete(id);
    }

    @Override
    public void edit(PhongTro phongTro) {

    }

    @Override
    public void create(PhongTro phongTro) throws SQLException {
        phongTroDao.create(phongTro);
    }
}
