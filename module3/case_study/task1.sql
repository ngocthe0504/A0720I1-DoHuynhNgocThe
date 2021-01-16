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

select khachhang.*, count(hopdong.idkhachhang) from ((khachhang 
inner join hopdong on khachhang.idkhachhang = hopdong.idkhachhang)
inner join loaikhach on loaikhach.idloaikhach = khachhang.idloaikhach)
where khachhang.idloaikhach = 1
group by idkhachhang;

-- task 5 -- 
SELECT khachHang.IDKhachHang, khachHang.HoTen, loaiKhach.TenLoaiKhach, hopDong.IDHopDong,
dichVu.TenDichVu, hopDong.NgayLamHopDong, hopDong.NgayKetThuc, dichVu.chiphithue + (hopDongChiTiet.soLuong * dichvudikem.gia) as tongTien 
from khachHang
left join hopdong on khachHang.idKhachHang = hopdong.idKhachHang
left join loaiKhach on khachHang.idLoaiKhach = loaiKhach.idLoaiKhach
left join dichVu on dichvu.iddichvu = hopdong.iddichvu
left join hopDongChiTiet on hopdong.idhopdong = hopDongChiTiet.idHopDong
left join dichVuDiKem on hopDongChiTiet.idDichVuDiKem = dichVuDiKem.idDichVuDiKem;

-- task 6 --

select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu, HopDongQuyMot.NgayLamHopDong
from DichVu left join ( select * from HopDong where NgayLamHopDong between '2019-01-01' and '2019-03-31') as HopDongQuyMot 
on DichVu.IDDichVu = HopDongQuyMot.IDDichVu 
left join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
group by DichVu.IDDichVu
having HopDongQuyMot.NgayLamHopDong is null;

-- task 7 --

select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, Dichvu.SoNguoiToiDa, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu 
inner join (select * from HopDong where year(NgayLamHopDong) = 2018) as HopDong2018 on DichVu.IDDichVu = HopDong2018.IDDichVu
left join (select * from HopDong where year(NgayLamHopDong) = 2019) as HopDong2019 on DichVu.IDDichVu = HopDong2019.IDDichVu
left join LoaiDichVu on LoaiDichVu.IDLoaiDichVu = DichVu.IDLoaiDichVu
where HopDong2019.IDDichVu is null
group by DichVu.IDDichVu;

-- task 8 --

select distinct HoTen from KhachHang; 
select HoTen from KhachHang group by HoTen;

-- task 9--

select month(hopDong.ngayLamHopDong) as thang, count(idHopDong) as soLuong, sum(tongTien) 
from hopDong 
where year(ngayLamHopDong) = 2019
group by month(hopDong.ngayLamHopDong) ;

-- task 10--

select hopDong.idHopDong, hopDong.ngayLamHopDong, hopDong.ngayKetThuc, hopDong.tienDatCoc,
 count(hopDongChiTiet.idHopDongChiTiet) as SoLuongDichVuDiKem
 from hopDong
 left join hopDongChiTiet on hopDong.idHopdong = hopDongChiTiet.idHopDong
 group by hopDong.idHopDong;
 
 -- task 11--
 
 select dichVuDiKem.* from dichVuDiKem
inner join hopDongChiTiet on dichVuDiKem.idDichVuDiKem = hopDongChiTiet.idDichVuDiKem
inner join hopDong on hopDongChiTiet.idHopDong = hopDong.idHopDong
inner join khachHang on hopDong.idKhachHang = khachHang.idKhachHang
inner join loaiKhach on loaiKhach.idLoaiKhach = khachhang.idLoaiKhach
where loaiKhach.tenLoaiKhach = 'Diamond' and (khachHang.diaChi = 'Vinh' or khachHang.diaChi = 'Quang Ngai');

-- task 12--

select hopDongChiTiet.idHopDong, nhanVien.hoTen as tenNhanVien, khachHang.hoTen as tenKhachHang, khachHang.sdt, dichVu.tenDichVu,
 count(hopDongChiTiet.soLuong) as soLuongDichVuDiKEm, hopDong.tienDatCoc, hopDong.ngayLamHopDong
from dichVu
inner join HopDong on hopDong.idDichVu = dichVu.idDichVu
inner join khachHang on khachHang.idKhachHang = hopDong.idKhachHang
inner join nhanVien on nhanVien.idNhanVien = hopDong.idNhanVien
inner join hopDongChiTiet on hopDong.idHopDong = hopDongChiTiet.idHopDong
where (hopDong.ngayLamHopDong between '2019-10-01' and '2019-12-31' and year(hopDong.ngayLamHopDong) = 2019)
and (hopDong.idDichVu not in (select hopDong.idDichVu from hopDong where hopDong.ngayLamHopDong between '2019-01-01' and '2019-06-30'))
group by hopDongChiTiet.idHopDong;

-- task 13 --

select dichVuDiKem.*, count(hopDongChiTiet.idDichVuDiKEm) as soLandat from dichVuDikem
left join hopDongChiTiet on hopDongChiTiet.idDichVuDiKem = dichVuDikem.idDichVuDiKem
group by dichVuDikem.idDichVuDiKem
order by soLanDat desc ;

-- task 14--

select hopDongChiTiet.idHopDong, dichVu.tenDichVu, dichVuDiKem.tenDichVuDiKem, count(hopDongChiTiet.idDichVuDiKEm) as soLanSuDung
from hopDongChiTiet
inner join hopDong on hopDong.idHopDong = hopDongChiTiet.idHopDong
inner join dichVu on hopDong.idDichVu = dichVu.idDichVu
inner join dichVuDiKem on hopDongChiTiet.idDichVuDiKem = dichVuDiKem.idDichVuDiKem
group by dichVuDiKem.tenDichVuDiKem
having soLanSuDung = 1;

-- task 15 --

select nhanVien.*, trinhDo.TrinhDo, boPhan.tenBoPhan, count(soHopDong.idNhanVien)
from nhanVien
left join (select hopDong.idNhanVien from hopDong where year(hopDong.ngayLamHopDong) in (2018,2019)) as soHopDong 
on nhanVien.idNhanVien = soHopDong.idNhanVien
left join trinhDo on nhanVien.idTrinhDo = trinhDo.idTrinhDo
left join boPhan on nhanVien.idBoPhan = boPhan.idBoPhan
group by nhanVien.idNhanVien
having count(soHopDong.idNhanVien) <= 3;

-- task 16--

delete nhanvien from nhanVien 
left join (select hopDong.idNhanVien from hopDong where year(hopDong.ngayLamHopDong) in (2017,2018,2019)) as soHopDong 
on nhanVien.idNhanVien = soHopDong.idNhanVien
where nhanVien.idNhanVien is not null and soHopDong.idNhanVien is null;

 -- task 17 --
 
 -- task 18--
 
 -- task 19--
 
 -- task 20--
 select concat('NV - ',IDNhanVien), hoten, email, sdt, ngaysinh, DiaChi from nhanvien 
union all
select concat('KH - ',IDKhachHang), hoten, email, sdt, ngaysinh, DiaChi from khachhang;















