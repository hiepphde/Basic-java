/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;

/**
 *
 * @author hiepg
 */
public class pCTMonHoc {
    private String maMH;
    private String tenMH;
    private String maLop;
    private String Ca;
    private String maGV;
    private String ngayBD;
    private int soBuoi;
    private int tongBuoi;
    private String trangThai;

    public pCTMonHoc() {
    }

    public pCTMonHoc(String maMH, String tenMH, String maLop, String Ca, String maGV, String ngayBD, int soBuoi, int tongBuoi, String trangThai) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.maLop = maLop;
        this.Ca = Ca;
        this.maGV = maGV;
        this.ngayBD = ngayBD;
        this.soBuoi = soBuoi;
        this.tongBuoi = tongBuoi;
        this.trangThai = trangThai;
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
     * @return the tenMH
     */
    public String getTenMH() {
        return tenMH;
    }

    /**
     * @param tenMH the tenMH to set
     */
    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
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
     * @return the Ca
     */
    public String getCa() {
        return Ca;
    }

    /**
     * @param Ca the Ca to set
     */
    public void setCa(String Ca) {
        this.Ca = Ca;
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
     * @return the ngayBD
     */


    /**
     * @return the soBuoi
     */
    public int getSoBuoi() {
        return soBuoi;
    }

    /**
     * @param soBuoi the soBuoi to set
     */
    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
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
     * @return the trangThai
     */
    public String getTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
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
}
