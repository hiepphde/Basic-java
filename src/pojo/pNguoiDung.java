/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author PHAM NHUT QUY
 */
public class pNguoiDung {
    private String MaND, TenND, MatKhau, PhanQuyen;

    public pNguoiDung() {
    }

    public pNguoiDung(String MaND, String TenND, String MatKhau, String PhanQuyen) {
        this.MaND = MaND;
        this.TenND = TenND;
        this.MatKhau = MatKhau;
        this.PhanQuyen = PhanQuyen;
    }

    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public String getTenND() {
        return TenND;
    }

    public void setTenND(String TenND) {
        this.TenND = TenND;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(String PhanQuyen) {
        this.PhanQuyen = PhanQuyen;
    }
    
}
