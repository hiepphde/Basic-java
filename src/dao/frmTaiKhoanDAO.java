/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import pojo.pNguoiDung;

/**
 *
 * @author PHAM NHUT QUY
 */
public class frmTaiKhoanDAO {
    public static ArrayList<pNguoiDung> LoadData(){
        ArrayList<pNguoiDung> dsND = new ArrayList<pNguoiDung>();
        try {
            String sql = "Select * from NGUOIDUNG";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while (rs.next()) {                
                pNguoiDung nd = new pNguoiDung();
                nd.setMaND(rs.getString("MaND"));
                nd.setTenND(rs.getString("TenND"));
                nd.setMatKhau(rs.getString("MatKhau"));
                nd.setPhanQuyen(rs.getString("PhanQuyen"));
                dsND.add(nd);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsND;
    }
    
    public static ArrayList<pNguoiDung> SearchName(String tenND){
        ArrayList<pNguoiDung> dsND = new ArrayList<pNguoiDung>();
        try {
            String sql = "Select * from NGUOIDUNG where TenND LIKE '%"+tenND+"%'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while (rs.next()) {                
                pNguoiDung mh = new pNguoiDung();
                mh.setMaND(rs.getString("MaND"));
                mh.setTenND(rs.getString("TenND"));
                mh.setMatKhau(rs.getString("MatKhau"));
                mh.setPhanQuyen(rs.getString("PhanQuyen"));
                dsND.add(mh);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsND;
    }
//    public static pCTMonHoc Search(String tenMH){
//        pCTMonHoc mh = null;
//        try {
//            String sql = String.format("Select * from MONHOC where TenMH = '%s'", tenMH);
//            SQLServerProvider provider = new SQLServerProvider();
//            provider.open();
//            ResultSet rs = provider.executeQuery(sql);
//            if (rs.next()) {
//                mh = new pCTMonHoc();
//                mh.setMaMH(rs.getString("MaMH"));
//                mh.setTenMH(rs.getString("TenMH"));
//                mh.setMaLop(rs.getString("MaLop"));
//                mh.setMaGV(rs.getString("MaGV"));
//                mh.setCa(rs.getString("Ca"));
//                mh.setNgayBD(rs.getString("NgayBD"));
//                mh.setTongBuoi(rs.getInt("TongBuoi"));
//                mh.setSoBuoi(rs.getInt("SoBuoi"));
//                mh.setTrangThai(rs.getString("TrangThai"));
//            }
//            provider.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return mh;
//    }
    public static boolean Add(pNguoiDung nd){
        boolean kq = false;
        try {
            String sql = "set dateformat dmy insert into NGUOIDUNG values ('" + nd.getMaND()+ "',N'" + nd.getTenND()+ "','" + nd.getMatKhau()+ "','" +nd.getPhanQuyen()+ "');";
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
    public static void ShowData(DefaultTableModel dtm) {
        ArrayList<pNguoiDung> dsND = dao.frmTaiKhoanDAO.LoadData();
        dtm.setRowCount(0);
        for (pNguoiDung mh : dsND) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(mh.getMaND());
            vec.add(mh.getTenND());
            vec.add(mh.getMatKhau());
            vec.add(mh.getPhanQuyen());
            dtm.addRow(vec);
        }
    }
    public static void ShowSearch(DefaultTableModel dtm,String tenND) {
        ArrayList<pNguoiDung> dsND = dao.frmTaiKhoanDAO.SearchName(tenND);
        dtm.setRowCount(0);
        for (pNguoiDung mh : dsND) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(mh.getMaND());
            vec.add(mh.getTenND());
            vec.add(mh.getMatKhau());
            vec.add(mh.getPhanQuyen());
            dtm.addRow(vec);
        }
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
    public static boolean Delete(String ma){
        boolean kq = false;
        try {
            String sql = "Delete from NGUOIDUNG where MaND like '%"+ ma +"%'";
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
    public static boolean Update(String ma, pNguoiDung nd){
        boolean kq = false;
        try {
            String sql = "Update NGUOIDUNG SET "
                    + "TENND = N'" + nd.getTenND() + "',"
                    + "MatKhau = '" + nd.getMatKhau() + "',"
                    + "PhanQuyen = N'" + nd.getPhanQuyen() + "'"
                    + "where MaND = '" + ma + "'";
                    
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
}
