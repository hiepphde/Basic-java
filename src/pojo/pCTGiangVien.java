/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author hiepg
 */
public class pCTGiangVien {
    private String maGS,tenGS,ngaySinh,gioiTinh,dienThoai,diaChi;
    private String monHoc;

    public pCTGiangVien(String maGS, String tenGS, String ngaySinh, String gioiTinh, String dienThoai, String diaChi, String monHoc) {
        this.maGS = maGS;
        this.tenGS = tenGS;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.monHoc = monHoc;
    }

    

    public pCTGiangVien() {
    }

    /**
     * @return the maGS
     */
    public String getMaGS() {
        return maGS;
    }

    /**
     * @param maGS the maGS to set
     */
    public void setMaGS(String maGS) {
        this.maGS = maGS;
    }

    /**
     * @return the tenGS
     */
    public String getTenGS() {
        return tenGS;
    }

    /**
     * @param tenGS the tenGS to set
     */
    public void setTenGS(String tenGS) {
        this.tenGS = tenGS;
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
     * @return the monHoc
     */
    public String getMonHoc() {
        return monHoc;
    }

    /**
     * @param monHoc the monHoc to set
     */
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
}
