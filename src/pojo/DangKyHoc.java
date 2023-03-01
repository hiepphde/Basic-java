/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author phamnhutquy
 */
public class DangKyHoc {
    private String MaDK, MaHV, MaLichDay, NgayDangKy;
    private int HocPhi;

    public DangKyHoc() {
    }

    public DangKyHoc(String MaDK, String MaHV, String MaLichDay, String NgayDangKy, int HocPhi) {
        this.MaDK = MaDK;
        this.MaHV = MaHV;
        this.MaLichDay = MaLichDay;
        this.NgayDangKy = NgayDangKy;
        this.HocPhi = HocPhi;
    }

    public String getMaDK() {
        return MaDK;
    }

    public void setMaDK(String MaDK) {
        this.MaDK = MaDK;
    }

    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getMaLichDay() {
        return MaLichDay;
    }

    public void setMaLichDay(String MaLichDay) {
        this.MaLichDay = MaLichDay;
    }

    public String getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(String NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }

    public int getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(int HocPhi) {
        this.HocPhi = HocPhi;
    }
    
}
