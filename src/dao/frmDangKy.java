/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import pojo.DangKyHoc;


/**
 *
 * @author phamnhutquy
 */
public class frmDangKy {
    public static ArrayList<DangKyHoc> layDanhSachDangKy()
    {
        ArrayList<DangKyHoc> dsDK = new ArrayList<DangKyHoc>();
        try
        {
            String sql = "SELECT * FROM DangKyHoc";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next())
            {
                DangKyHoc dk = new DangKyHoc();
                dk.setMaDK(rs.getString("MaDK"));
                dk.setMaHV(rs.getString("MaHV"));
                dk.setMaLichDay(rs.getString("MaLichDay"));
                dk.setNgayDangKy(rs.getString("NgayDangKy"));
                dk.setHocPhi(rs.getInt("HocPhi"));
                dsDK.add(dk);
            }
            provider.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return dsDK;
    }
    
    
    public static boolean KTTT(String MaDK){
        try {
            String sql = "Select * from DangKyHoc where MaDK like '%" + MaDK + "%'";
            SQLServerProvider pro = new SQLServerProvider();
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean themDangKy(DangKyHoc dk)
    {
        boolean kq = false;
        String sql = String.format("INSERT INTO DangKyHoc(MaDK, MaHV, MaLichDay, NgayDangKy, HocPhi) VALUES('%s','%s','%s','%s', '%d')",dk.getMaDK(),dk.getMaHV(),dk.getMaLichDay(),dk.getNgayDangKy(),dk.getHocPhi());
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n==1)
        {
            kq=true;
        }
        provider.close();
        return kq;
    }
}
