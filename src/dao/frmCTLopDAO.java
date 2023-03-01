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
import pojo.pCTLop;
import pojo.pCTMonHoc;

/**
 *
 * @author Admin
 */
public class frmCTLopDAO {
   public static ArrayList<pCTLop> LoadData(){
        ArrayList<pCTLop> dsLop = new ArrayList<pCTLop>();
        try {
            String sql = "Select * from Lop";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while (rs.next()) {                
                pCTLop l = new pCTLop();
                l.setMaLop(rs.getString("MaLop"));
                l.setTenLop(rs.getString("TenLop"));
                l.setMaCa(rs.getString("MaCa"));
                l.setMaGV(rs.getString("MaGV"));
                l.setMaMH(rs.getString("MaMH"));
                l.setNgayBD(rs.getString("NgayBD"));
                l.setNgayKT(rs.getString("NgayKT"));
                l.setTrangThai(rs.getString("TrangThai"));
                l.setTongBuoi(rs.getInt("TongBuoi"));
                dsLop.add(l);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsLop;
    }
    public static void ShowData(DefaultTableModel dtm) {
         ArrayList<pCTLop> dsMH = dao.frmCTLopDAO.LoadData();
         dtm.setRowCount(0);
         for (pCTLop mh : dsMH) {
             Vector<Object> vec = new Vector<Object>();
             vec.add(mh.getMaLop());
             vec.add(mh.getTenLop());
             vec.add(mh.getMaGV());
             vec.add(mh.getMaMH());
             vec.add(mh.getMaCa());
             vec.add(mh.getTongBuoi());
             vec.add(mh.getNgayBD());
             vec.add(mh.getNgayKT());
             vec.add(mh.getTrangThai());
             dtm.addRow(vec);
         }
     }
   public static ArrayList<pCTLop> timKiemLopTheoTen(String tenLop){
        ArrayList<pCTLop> dsLop = new ArrayList<pCTLop>();
        try{
            String sql = "SELECT *FROM Lop where TenLop LIKE '%"+tenLop+"%'";
            SQLServerProvider provider = new SQLServerProvider();
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                pCTLop l = new pCTLop();
                l.setMaLop(rs.getString("MaLop"));
                l.setTenLop(rs.getString("TenLop"));
                l.setMaCa(rs.getString("MaCa"));
                l.setMaGV(rs.getString("MaGV"));
                l.setMaMH(rs.getString("MaMH"));
                l.setNgayBD(rs.getString("NgayBD"));
                l.setNgayKT(rs.getString("NgayKT"));
                l.setTrangThai(rs.getString("TrangThai"));
                l.setTongBuoi(rs.getInt("TongBuoi"));
                dsLop.add(l);
            }
            provider.close();
        } 
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsLop;
    }
    public static boolean themLop(pCTLop l){
        boolean kq = false;
        try {
            String sql = "set dateformat dmy insert into Lop values('"+l.getMaLop()+"',"
                    + "'"+l.getTenLop()+"',"
                    + "'"+l.getMaGV()+"',"
                    + "'"+l.getMaMH()+"',"
                    + "'"+l.getMaCa()+"',"
                    + ""+l.getTongBuoi()+","
                    + "'"+l.getNgayBD()+"',"
                    + "'"+l.getNgayKT()+"',"
                    + "'"+l.getTrangThai()+"');";
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public static boolean xoaLop(String maLop){
        boolean kq = false;
        try {
            String sql = "DELETE FROM Lop WHERE maLop like '%"+ maLop +"%'";
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public static boolean capNhatLop(String maLop, pCTLop l){
        boolean kq = false;
        try {
            String sql = "UPDATE Lop SET "
                    + "tenMH = N'"+ l.getTenLop() +"',"
                    + "maCa = '"+ l.getMaCa()+"',"
                    + "maGV = '"+ l.getMaGV()+"',"
                    + "maMH = '"+ l.getMaMH()+"',"
                    + "ngayBD = '"+ l.getNgayBD()+"',"
                    + "ngayKT = '"+ l.getNgayKT()+"',"
                    + "TongBuoi = "+ l.getTongBuoi()+","
                    + "TrangThai = N'"+ l.getTrangThai()+"'"
                    + "where maLop = '" + maLop + "'";
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n==1){
            kq = true;
        }
        provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kq;
    }
    public static pCTLop layLop(int maLop){
        pCTLop l = null;
        try{
        String sql = String.format("SELECT * FROM Lop WHERE MaLop = '%s'" + maLop);
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        if(rs.next()){
            l = new pCTLop();
            l.setMaLop(rs.getString("MaLop"));
                l.setTenLop(rs.getString("TenLop"));
                l.setMaCa(rs.getString("MaCa"));
                l.setMaGV(rs.getString("MaGV"));
                l.setMaMH(rs.getString("MaMH"));
                l.setNgayBD(rs.getString("NgayBD"));
                l.setNgayKT(rs.getString("NgayKT"));
                l.setTrangThai(rs.getString("TrangThai"));
                l.setTongBuoi(rs.getInt("TongBuoi"));
        }
        provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return l;
    }
    public static boolean KTTT(String maLop){
        try {
            String sql = "Select * from Lop where MaLop like '%" + maLop + "%'";
            SQLServerProvider pro = new SQLServerProvider();
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static pCTLop Search(String tenLop){
        pCTLop l = null;
        try {
            String sql = String.format("Select * from Lop where Tenlop = '%s'", tenLop);
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if (rs.next()) {
                l = new pCTLop();
                l.setMaLop(rs.getString("MaLop"));
                l.setTenLop(rs.getString("TenLop"));
                l.setMaCa(rs.getString("MaCa"));
                l.setMaGV(rs.getString("MaGV"));
                l.setMaMH(rs.getString("MaMH"));
                l.setNgayBD(rs.getString("NgayBD"));
                l.setNgayKT(rs.getString("NgayKT"));
                l.setTrangThai(rs.getString("TrangThai"));
                l.setTongBuoi(rs.getInt("TongBuoi"));
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return l;
    }
    public static void ShowSearch(DefaultTableModel dtm,String tenLop) {
        ArrayList<pCTLop> dsL = dao.frmCTLopDAO.timKiemLopTheoTen(tenLop);
        dtm.setRowCount(0);
        for (pCTLop l : dsL) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(l.getMaLop());
            vec.add(l.getTenLop());
            vec.add(l.getMaGV());
            vec.add(l.getMaMH());
            vec.add(l.getMaCa());
            vec.add(l.getNgayBD());
            vec.add(l.getNgayKT());
            vec.add(l.getTongBuoi());
            vec.add(l.getTrangThai());
            dtm.addRow(vec);
        }
    }
}
