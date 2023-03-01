/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.SQLServerProvider;
import java.sql.ResultSet;
import pojo.pCTMonHoc;
import pojo.pNguoiDung;

/**
 *
 * @author hiepg
 */
public class frmDMKDAO {
    
    public static boolean KTTT(String ma){
        try {
            String sql = "Select * from NGUOIDUNG where MaND like '%" + ma + "%'";
            SQLServerProvider pro = new SQLServerProvider();
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean Update(String ma, pNguoiDung mh){
        boolean kq = false;
        try {
            String sql = "Update NGUOIDUNG set "
                    + "MatKhat = '"+ mh.getMatKhau()+"'"
                    + "where maND = '" + ma + "'";
            SQLServerProvider pro = new SQLServerProvider();
            pro.open();
            int n = pro.executeUpdate(sql);
            if (n == 1) {
                kq = true;
            }
            pro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public static boolean KTMK(String ma,String mk){
        try {
            String sql = "Select * from NGUOIDUNG where MaND = '" + ma + "' and MatKhau = '"+mk+"'";
            SQLServerProvider pro = new SQLServerProvider();
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
