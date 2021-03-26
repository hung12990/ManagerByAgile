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
public class QuanLyPhieuMuon {
    private String maSach,maPhieuMuon;

    public QuanLyPhieuMuon() {
    }

    public QuanLyPhieuMuon(String maSach, String maPhieuMuon) {
        this.maSach = maSach;
        this.maPhieuMuon = maPhieuMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }
    
}
