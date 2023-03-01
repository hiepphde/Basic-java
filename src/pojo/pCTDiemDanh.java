/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class pCTDiemDanh {
    private int id;
    private String maLop;
    private String maHV;
    private String ngayCheckIn;
    private String ngayCheckOut;
    private String checkIn;
    private String checkOut;
    private String ghiChu;

    public pCTDiemDanh() {
    }

    public pCTDiemDanh(int id, String maLop, String maHV, String ngayCheckIn, String ngayCheckOut, String checkIn, String checkOut, String ghiChu) {
        this.id = id;
        this.maLop = maLop;
        this.maHV = maHV;
        this.ngayCheckIn = ngayCheckIn;
        this.ngayCheckOut = ngayCheckOut;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.ghiChu = ghiChu;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getNgayCheckIn() {
        return ngayCheckIn;
    }

    public void setNgayCheckIn(String ngayCheckIn) {
        this.ngayCheckIn = ngayCheckIn;
    }

    public String getNgayCheckOut() {
        return ngayCheckOut;
    }

    public void setNgayCheckOut(String ngayCheckOut) {
        this.ngayCheckOut = ngayCheckOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
