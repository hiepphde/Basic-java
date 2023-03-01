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
public class pCTHocVien {
    private String maHV;
    private String tenHV;
    private String ngaySinh;
    private String gioiTinh;
    private String dienThoai;
    private String diaChi;
    private String trangThai;

    public pCTHocVien(String maHV, String tenHV, String ngaySinh, String gioiTinh, String dienThoai, String diaChi, String trangThai) {
        this.maHV = maHV;
        this.tenHV = tenHV;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public pCTHocVien() {
    }

    /**
     * @return the maHV
     */
    public String getMaHV() {
        return maHV;
    }

    /**
     * @param maHV the maHV to set
     */
    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    /**
     * @return the tenHV
     */
    public String getTenHV() {
        return tenHV;
    }

    /**
     * @param tenHV the tenHV to set
     */
    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the dienThoai
     */
    public String getDienThoai() {
        return dienThoai;
    }

    /**
     * @param dienThoai the dienThoai to set
     */
    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
}
