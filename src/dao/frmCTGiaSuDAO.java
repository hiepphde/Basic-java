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
import pojo.pCTGiangVien;
import pojo.pCTMonHoc;

/**
 *
 * @author hiepg
 */
public class frmCTGiaSuDAO {
    public static ArrayList<pCTGiangVien> LoadData(){
        ArrayList<pCTGiangVien> dsGV = new ArrayList<pCTGiangVien>();
        SQLServerProvider pro = new SQLServerProvider();
        try {
            String sql = "Select * from GIASU";
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            while (rs.next()) {                
                pCTGiangVien gv = new pCTGiangVien();
                gv.setMaGS(rs.getString("MaGS"));
                gv.setTenGS(rs.getString("TenGS"));
                gv.setNgaySinh(rs.getString("NgaySinh"));
                gv.setGioiTinh(rs.getString("GioiTinh"));
                gv.setDienThoai(rs.getString("DienThoai"));
                gv.setDiaChi(rs.getString("DiaChi"));
                gv.setMonHoc(rs.getString("MonHoc"));
                dsGV.add(gv);
            }
            pro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsGV;
    }
    public static ArrayList<pCTMonHoc> SearchName(String tenMH){
        ArrayList<pCTMonHoc> dsMH = new ArrayList<pCTMonHoc>();
        try {
            String sql = "Select * from MonHoc where TenMH LIKE '%"+tenMH+"%'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while (rs.next()) {                
                pCTMonHoc mh = new pCTMonHoc();
                mh.setMaMH(rs.getString("MaMH"));
                mh.setTenMH(rs.getString("TenMH"));
                mh.setMaLop(rs.getString("MaLop"));
                mh.setMaGV(rs.getString("MaGV"));
                mh.setCa(rs.getString("Ca"));
                mh.setNgayBD(rs.getString("NgayBD"));
                mh.setTongBuoi(rs.getInt("TongBuoi"));
                mh.setSoBuoi(rs.getInt("SoBuoi"));
                mh.setTrangThai(rs.getString("TrangThai"));
                dsMH.add(mh);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsMH;
    }
    public static boolean Add(pCTGiangVien mh){
        boolean kq = false;
        try {
            String sql = String.format("set dateformat dmy insert into GIASU values ('" + mh.getMaGS()+ "',N'" + mh.getTenGS()+ "','" + mh.getNgaySinh()+ "',N'" +mh.getGioiTinh()+ "','" +mh.getDienThoai()+ "',N'" +mh.getDiaChi()+ "','" +mh.getMonHoc()+ "');");
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
        ArrayList<pCTGiangVien> dsGV = dao.frmCTGiaSuDAO.LoadData();
        dtm.setRowCount(0);
        for (pCTGiangVien gv : dsGV) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(gv.getMaGS());
            vec.add(gv.getTenGS());
            vec.add(gv.getGioiTinh());
            vec.add(gv.getDienThoai());
            vec.add(gv.getDiaChi());
            vec.add(gv.getNgaySinh());
            vec.add(gv.getMonHoc());
            dtm.addRow(vec);
        }
    }
    public static void ShowSearch(DefaultTableModel dtm,String tenMH) {
        ArrayList<pCTMonHoc> dsMH = dao.frmCTMonHocDAO.SearchName(tenMH);
        dtm.setRowCount(0);
        for (pCTMonHoc mh : dsMH) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(mh.getMaMH());
            vec.add(mh.getTenMH());
            vec.add(mh.getMaLop());
            vec.add(mh.getMaGV());
            vec.add(mh.getCa());
            vec.add(mh.getNgayBD());
            vec.add(mh.getSoBuoi());
            vec.add(mh.getTongBuoi());
            vec.add(mh.getTrangThai());
            dtm.addRow(vec);
        }
    }
    public static boolean KTTT(String ma){
        try {
            String sql = "Select * from GIASU where MaGS like '%" + ma + "%'";
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
            String sql = "Delete from GIASU where MaGS like '%"+ ma +"%'";
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
    public static boolean Update(String ma, pCTMonHoc mh){
        boolean kq = false;
        try {
            String sql = "Update MONHOC set "
                    + "tenMH = N'"+ mh.getTenMH() +"',"
                    + "maLop = '"+ mh.getMaLop()+"',"
                    + "maGV = '"+ mh.getMaGV()+"',"
                    + "Ca = N'"+ mh.getCa() +"',"
                    + "ngayBD = '"+ mh.getNgayBD()+"',"
                    + "TongBuoi = "+ mh.getTongBuoi()+","
                    + "soBuoi = "+ mh.getSoBuoi()+","
                    + "TrangThai = N'"+ mh.getTrangThai()+"'"
                    + "where maMH = '" + ma + "'";
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
