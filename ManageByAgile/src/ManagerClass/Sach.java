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
public class Sach {
    private String ma,tenSach,tenTacGia,theLoai,nhaXB,khoSach,tinhTrang,ngonNgu;
    private int namXB,soLuong,soTrang,soTap;
    private double giaSach;

    public Sach() {
    }

    public Sach(String ma, String tenSach, String tenTacGia, String theLoai, String nhaXB, String khoSach, String tinhTrang, String ngonNgu, int namXB, int soLuong, int soTrang, int soTap, double giaSach) {
        this.ma = ma;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.theLoai = theLoai;
        this.nhaXB = nhaXB;
        this.khoSach = khoSach;
        this.tinhTrang = tinhTrang;
        this.ngonNgu = ngonNgu;
        this.namXB = namXB;
        this.soLuong = soLuong;
        this.soTrang = soTrang;
        this.soTap = soTap;
        this.giaSach = giaSach;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public String getKhoSach() {
        return khoSach;
    }

    public void setKhoSach(String khoSach) {
        this.khoSach = khoSach;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getSoTap() {
        return soTap;
    }

    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }
    
}
