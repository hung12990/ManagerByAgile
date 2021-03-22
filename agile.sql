
CREATE TABLE DocGia
 (
 maDG NVARCHAR(20) NOT NULL,
 tenDG NVARCHAR(40) NULL,
 gioiTinh NVARCHAR(10) NULL,
 ngaySinh DATE NULL,
 diaChi NVARCHAR(100) NULL,
 chucDanh NVARCHAR(40) NULL,
 CMT VARCHAR(40) NULL,
 tienKiGui MONEY,
 CONSTRAINT pk_MatHang PRIMARY KEY(maDG)
 )
 CREATE TABLE PhieuMuon
 (
     maPhieuMuon NVARCHAR(20) NOT NULL,
     maDG NVARCHAR(20) NOT NULL,
	 ngayMuon DATE NULL,
	 ngayTra DATE NULL,
	 trangThai NVARCHAR(20) NULL,

	 CONSTRAINT pk_PhieuMuon PRIMARY KEY(maPhieuMuon),
	 CONSTRAINT fk_phieuMuon FOREIGN KEY (maDG) REFERENCES dbo.DocGia
 )
 CREATE TABLE Sach
 (
    maSach NVARCHAR(20) NOT NULL,
	tenSach NVARCHAR(30) NULL,
	namXuatBan DATE NULL,
	soLuong INT NULL,
	soTrang INT NULL,
	tenTacGia NVARCHAR(20) NULL,
	tenTheLoai NVARCHAR(20) NULL,
	tenNhaXuatBan NVARCHAR(20) NULL,
	giaSach MONEY NULL,
	soTap INT NULL,
	khoSach NVARCHAR(20) NULL,
	tinhTrang NVARCHAR(20) NULL,
	ngonNgu NVARCHAR(20),
	CONSTRAINT pk_Sach PRIMARY KEY(maSach)
 )

  CREATE TABLE QuanLyPhieuMuon
    (
    maSach NVARCHAR(20) NOT NULL,
	maPhieuMuon  NVARCHAR(20) NOT NULL,
	CONSTRAINT fk_QuanLyPhieuMuon_Sach FOREIGN KEY(maSach) REFERENCES dbo.Sach,
	CONSTRAINT fk_QuanLyPhieuMuon_PhieuMuon FOREIGN KEY(maPhieuMuon) REFERENCES dbo.PhieuMuon
  )
  CREATE TABLE nguoiDung
  (
    tenND  NVARCHAR(20) NOT NULL,
	matKhau  NVARCHAR(20) NOT NULL,
	CONSTRAINT pk_NguoiDung PRIMARY KEY(tenND,matKhau)
  )