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
public class pCTLop {
    private String maLop;   
    private String tenLop; 
    private String maGV;
    private String maMH;
    private String maCa;
    private int tongBuoi;
    private String ngayBD;
    private String ngayKT;
    private String TrangThai;

    public pCTLop(String maLop, String tenLop, String maGV, String maMH, String maCa, int tongBuoi, String ngayBD, String ngayKT, String TrangThai) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maGV = maGV;
        this.maMH = maMH;
        this.maCa = maCa;
        this.tongBuoi = tongBuoi;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.TrangThai = TrangThai;
    }

    public pCTLop() {
    }

    /**
     * @return the maLop
     */
    public String getMaLop() {
        return maLop;
    }

    /**
     * @param maLop the maLop to set
     */
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    /**
     * @return the tenLop
     */
    public String getTenLop() {
        return tenLop;
    }

    /**
     * @param tenLop the tenLop to set
     */
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    /**
     * @return the maGV
     */
    public String getMaGV() {
        return maGV;
    }

    /**
     * @param maGV the maGV to set
     */
    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    /**
     * @return the maMH
     */
    public String getMaMH() {
        return maMH;
    }

    /**
     * @param maMH the maMH to set
     */
    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    /**
     * @return the maCa
     */
    public String getMaCa() {
        return maCa;
    }

    /**
     * @param maCa the maCa to set
     */
    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    /**
     * @return the tongBuoi
     */
    public int getTongBuoi() {
        return tongBuoi;
    }

    /**
     * @param tongBuoi the tongBuoi to set
     */
    public void setTongBuoi(int tongBuoi) {
        this.tongBuoi = tongBuoi;
    }

    /**
     * @return the ngayBD
     */
    public String getNgayBD() {
        return ngayBD;
    }

    /**
     * @param ngayBD the ngayBD to set
     */
    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    /**
     * @return the ngayKT
     */
    public String getNgayKT() {
        return ngayKT;
    }

    /**
     * @param ngayKT the ngayKT to set
     */
    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    /**
     * @return the TrangThai
     */
    public String getTrangThai() {
        return TrangThai;
    }

    /**
     * @param TrangThai the TrangThai to set
     */
    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    
}
