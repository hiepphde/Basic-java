/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dal.SQLServerProvider;
import java.sql.Array;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import pojo.pCTHocVien;
import pojo.pCTMonHoc;

/**
 *
 * @author hiepg
 */
public class frmCTHocVienDAO {
    public static ArrayList<pCTHocVien> LoadData(){
        ArrayList<pCTHocVien> dsHV = new ArrayList<pCTHocVien>();
        try {
            String sql = "Select * from HocVien";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while (rs.next()) {                
                pCTHocVien hv = new pCTHocVien();
                hv.setMaHV(rs.getString("MaHV"));
                hv.setTenHV(rs.getString("TenHV"));
                hv.setNgaySinh(rs.getString("NgaySinh"));
                hv.setGioiTinh(rs.getString("GioiTinh"));
                hv.setDienThoai(rs.getString("DienThoai"));
                hv.setDiaChi(rs.getString("DiaChi"));
                hv.setTrangThai(rs.getString("TrangThai"));
                dsHV.add(hv);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsHV;
    }
    public static void ShowData(DefaultTableModel dtm) {
        ArrayList<pCTHocVien> dsHV = dao.frmCTHocVienDAO.LoadData();
        dtm.setRowCount(0);
        for (pCTHocVien hv : dsHV) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(hv.getMaHV());
            vec.add(hv.getTenHV());
            vec.add(hv.getNgaySinh());
            vec.add(hv.getGioiTinh());
            vec.add(hv.getDienThoai());
            vec.add(hv.getDiaChi());
            vec.add(hv.getTrangThai());
            dtm.addRow(vec);
        }
    }
    public static boolean KTTT(String ma){
        try {
            String sql = "Select * from HOCVIEN where MaHV like '%" + ma + "%'";
            SQLServerProvider pro = new SQLServerProvider();
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean Add(pCTHocVien hv){
        boolean kq = false;
        try {
            String sql = String.format("set dateformat dmy insert into HOCVIEN values ('" + hv.getMaHV()+ "',N'" + hv.getTenHV()+ "','" + hv.getNgaySinh()+ "',N'" + hv.getGioiTinh()+ "',N'" +hv.getDienThoai()+ "','" +hv.getDiaChi()+ "',N'" +hv.getTrangThai()+"');");
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
    public static boolean Delete(String ma){
        boolean kq = false;
        try {
            String sql = "Delete from HOCVIEN where MaHV like '%"+ ma +"%'";
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
    public static boolean Update(String ma, pCTHocVien mh){
        boolean kq = false;
        try {
            String sql = "Update HOCVIEN set "
                    + "tenHV = N'"+ mh.getTenHV()+"',"
                    + "NgaySinh = '"+ mh.getNgaySinh()+"',"
                    + "GioiTinh = N'"+ mh.getGioiTinh()+"',"
                    + "DiaChi = N'"+ mh.getDiaChi()+"',"
                    + "DienThoai = '"+ mh.getDienThoai()+"',"
                    + "TrangThai = N'"+ mh.getTrangThai()+"'"
                    + "where maHV = '" + ma + "'";
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
