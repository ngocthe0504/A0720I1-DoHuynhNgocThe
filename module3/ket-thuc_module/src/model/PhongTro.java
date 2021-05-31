package model;

public class PhongTro {
    private int id;
    private String tenNguoiThue;
    private int sdt;
    private int idNguoiThue;
    private String ngayThue;
    private String hinhThucThanhToan;
    private String ghiChu;

    public PhongTro() {
    }



    public PhongTro(int id, String tenNguoiThue, int sdt, int idNguoiThue, String ngayThue, String ghiChu) {
        this.id = id;
        this.tenNguoiThue = tenNguoiThue;
        this.sdt = sdt;
        this.idNguoiThue = idNguoiThue;
        this.ngayThue = ngayThue;
        this.ghiChu = ghiChu;
    }

    public int getIdNguoiThue() {
        return idNguoiThue;
    }

    public void setIdNguoiThue(int idNguoiThue) {
        this.idNguoiThue = idNguoiThue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNguoiThue() {
        return tenNguoiThue;
    }

    public void setTenNguoiThue(String tenNguoiThue) {
        this.tenNguoiThue = tenNguoiThue;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
