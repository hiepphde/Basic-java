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
public class pDiemDanh {

    private String maLop;
    private String maHV;
    private int tongBDH;
    private int tongBDN;

    public pDiemDanh(String maLop, String maHV, int tongBDH, int tongBDN) {
        this.maLop = maLop;
        this.maHV = maHV;
        this.tongBDH = tongBDH;
        this.tongBDN = tongBDN;
    }

    public pDiemDanh() {
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

    public int getTongBDH() {
        return tongBDH;
    }

    public void setTongBDH(int tongBDH) {
        this.tongBDH = tongBDH;
    }

    public int getTongBDN() {
        return tongBDN;
    }

    public void setTongBDN(int tongBDN) {
        this.tongBDN = tongBDN;
    }
    
}
