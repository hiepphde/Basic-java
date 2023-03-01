/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.pCTMonHoc;
import pojo.pNguoiDung;

/**
 *
 * @author hiepg
 */
public class frmDangKiDAO {
    public static boolean Add(pNguoiDung nd){
        boolean kq = false;
        try {
            String sql = String.format("insert into NGUOIDUNG values ('"+nd.getMaND()+"',N'"+nd.getTenND()+"','"+nd.getMatKhau()+"',N'Chọn');");
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            int n = provider.executeUpdate(sql);
            if (n==1) {
                kq = true;
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
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
}
