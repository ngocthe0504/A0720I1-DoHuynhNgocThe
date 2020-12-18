-- task 1 --
create table ViTri (
	IDViTri int auto_increment,
    tenViTri varchar(45) not null,
    constraint pk_idvitri primary key (IDViTri)
);

create table TrinhDo (
	IDTrinhDo int auto_increment,
    TrinhDo int not null,
    constraint pk_idtrinhdo primary key(IDTrinhDo)
);

create table BoPhan (
	IDBoPhan int auto_increment,
    TenBoPhan varchar(45) not null,
    constraint pk_idbophan primary key(IDBoPhan)
);

create table NhanVien (
	IDNhanVien int auto_increment,
    HoTen varchar(100) not null,
    IDViTri int,
    IDTrinhDo int,
    IDBoPhan int,
    NgaySinh date not null,
    SoCMND int not null unique,
    Luong double not null,
    SDT int unique,
    Email varchar(45) not null,
    DiaChi varchar(45),
    constraint pk_idnhanvien primary key(IDNhanVien),
    constraint fk_idvitri foreign key(IDViTri) references ViTri(IDViTri),
    constraint fk_idtrinhdo foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo),
    constraint fk_idbophan foreign key(IDBoPhan) references BoPhan(IDBoPhan)
); 

create table DichVuDikem (
	IDDichVuDiKem int auto_increment,
    TenDichVuDiKem varchar(45) not null,
    Gia int not null,
    DonVi int not null,
    TrangThaiKhaDung varchar(45) not null,
    constraint pk_iddichvudikem primary key(IDDichVuDiKem)
);

create table LoaiKhach(
	IDLoaiKhach int,
    TenLoaiKhach varchar(45) not null,
    constraint pk_idloaikhach primary key(IDLoaiKhach)
);

create table KhachHang(
	IDKhachHang int auto_increment,
    IDLoaiKhach int,
    HoTen varchar(45) not null,
    NgaySinh date,
    SoCMND int not null unique,
    SDT int not null unique,
    Email varchar(45) unique,
    DiaChi varchar(45),
    constraint pk_idkhachhang primary key(IDKhachHang),
    constraint fk_idloaikhach foreign key(IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);

create table KieuThue (
	IDKieuThue int auto_increment,
    TenKieuThue varchar(45) not null,
    Gia int not null,
    constraint pk_idkieuthue primary key (IDKieuThue)
);

create table LoaiDichVu (
	IDLoaiDichVu int auto_increment,
    TenLoaiDichVu varchar(45) not null,
    constraint pk_idloaidichvu primary key (IDLoaiDichVu)
);

create table DichVu (
	IDDichVu int auto_increment,
    TenDichVu varchar(45) not null,
    DienTich int not null,
    SoTang int not null,
    SoNguoiToiDa int not null,
    ChiPhiThue int not null,
    IDKieuThue int,
    IDLoaiDichVu int,
    TrangThai varchar(45) not null,
    constraint pk_iddichvu primary key (IDDichVu),
    constraint fk_idkieuthue foreign key(IDKieuThue) references KieuThue(IDKieuThue),
    constraint fk_idloaidichvu foreign key(IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);

create table HopDong (
	IDHopDong int,
    IDNhanVien int,
    IDKhachHang int,
    IDDichVu int,
    NgayLamHopDong date not null,
    NgayKetThuc date not null,
    TienDatCoc int not null,
    TongTien int not null,
    constraint pk_idhhopdong primary key (IDHopDong),
    constraint fk_idnhanvien foreign key (IDNhanVien) references NhanVien(IDNhanVien),
    constraint fk_idkhachhang foreign key (IDKhachHang) references KhachHang(IDKhachHang),
    constraint fk_iddichvu foreign key (IDDichVu) references DichVu(IDDichVu)
);

create table HopDongChiTiet (
	IDHopDongChiTiet int,
    IDHopDong int,
    IDDichVuDikem int,
    SoLuong int,
    constraint pk_idhopdongchitiet primary key (IDHopDongChiTiet),
    constraint fk_idhopdong foreign key(IDHopDong) references HopDong(IDHopDong),
    constraint fk_iddichvudikem foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);
insert into ViTri values (1, 'nhan vien');
insert into TrinhDo values (1, 2);
insert into BoPhan values (1, 'Nhan vien');
insert into NhanVien values (1, 'Linh Doan', 1, 1, 1, 12/12/1991, 102040203, 1000, 013003401, 'linhdoan@gmail.com', 'Danang');
insert into dichvudikem values (1, 'Villa', 1000, 2, 'trong');
insert into loaikhach values (1, 'Vip');
insert into khachhang values (1, 1, 'Do Huynh Ngọc The', 05/04/2001, 12241242, 0924835283, 'thedo090@gmail.com', 'Quang nam');
insert into kieuthue values (1, 'dai han', 30000);
insert into loaidichvu values (1, 'Villa');
insert into dichvu values (1, 'Villa', 300, 5, 5, 30000, 1, 1, 'trong');
insert into hopdong values (1, 1, 1, 1, 5/12/2020, 10/12/2020, 10000, 30000);
insert into hopdong values (1, 1, 1, 1);

-- task 2 --

SELECT * FROM nhanvien
having (substring_index(HoTen, ' ', -1) like 'H%'
	or substring_index(HoTen, ' ', -1) like 'K%'
	or substring_index(HoTen, ' ', -1) like 'T%')
	and length(substring_index(HoTen, ' ', -1)) < 16;
    
-- task 3 --

SELECT * FROM nhanvien
	having (YEAR(CURDATE()) - YEAR(ngaysinh) between 15 and 50) and (DiaChi = 'Quang Nam' or DiaChi = 'Da nang');

-- task 4 --

















