/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerClass;

/**
 *
 * @author Admin
 */
public class DocGia {
    private String ma,ten,ngaySinh,diaChi,chucDanh,soCMT;
    private int gioiTinh;
    private Double tienKiGui;

    public DocGia() {
    }

    public DocGia(String ma, String ten, String ngaySinh, String diaChi, String chucDanh, String soCMT, int gioiTinh, Double tienKiGui) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chucDanh = chucDanh;
        this.soCMT = soCMT;
        this.gioiTinh = gioiTinh;
        this.tienKiGui = tienKiGui;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Double getTienKiGui() {
        return tienKiGui;
    }

    public void setTienKiGui(Double tienKiGui) {
        this.tienKiGui = tienKiGui;
    }
    
}
