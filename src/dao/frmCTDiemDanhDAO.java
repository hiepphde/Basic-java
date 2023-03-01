/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import dal.SQLServerProvider;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import pojo.pCTDiemDanh;

/**
 *
 * @author Admin
 */
public class frmCTDiemDanhDAO {
   public static ArrayList<pCTDiemDanh> LoadData(){
        ArrayList<pCTDiemDanh> dsDD = new ArrayList<pCTDiemDanh>();
        try {
            String sql = "Select * from DiemDanh, CTLop";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while (rs.next()) {                
                pCTDiemDanh dd = new pCTDiemDanh();
                dd.setId(rs.getInt("Id"));
                dd.setMaLop(rs.getString("MaLop"));
                dd.setMaHV(rs.getString("MaHV"));
                dd.setNgayCheckIn(rs.getString("NgayCheckIn"));
                dd.setNgayCheckOut(rs.getString("NgayCheckOut"));
                dd.setCheckIn(rs.getString("CheckIn"));
                dd.setCheckOut(rs.getString("CheckOut"));
                dsDD.add(dd);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsDD;
    }
   public static ArrayList<pCTDiemDanh> sreachTen(String tenLop){
        ArrayList<pCTDiemDanh> dsDD = new ArrayList<pCTDiemDanh>();
        try{
            String sql = "select * from DiemDanh, Lop where DiemDanh.MaLop = Lop.MaLop and Lop.TenLop = N'%"+tenLop+"%'";
            SQLServerProvider provider = new SQLServerProvider();
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                pCTDiemDanh dd = new pCTDiemDanh();
                dd.setId(rs.getInt("Id"));
                dd.setMaLop(rs.getString("MaLop"));
                dd.setMaHV(rs.getString("MaHV"));
                dd.setNgayCheckIn(rs.getString("NgayCheckIn"));
                dd.setNgayCheckOut(rs.getString("NgayCheckOut"));
                dd.setCheckIn(rs.getString("CheckIn"));
                dd.setCheckOut(rs.getString("CheckOut"));
                dsDD.add(dd);
            }
            provider.close();
        } 
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsDD;
    }
    
    
    
    public static pCTDiemDanh sreachDD(int maLop){
        pCTDiemDanh dd = null;
        try{
        String sql = String.format("SELECT * FROM DiemDanh WHERE MaLop = '%"+ maLop+ "'" );
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        ResultSet rs = provider.executeQuery(sql);
        if(rs.next()){
            dd = new pCTDiemDanh();
            dd.setId(rs.getInt("Id"));
            dd.setMaLop(rs.getString("MaLop"));
                dd.setMaHV(rs.getString("MaHV"));
                dd.setNgayCheckIn(rs.getString("NgayCheckIn"));
                dd.setNgayCheckOut(rs.getString("NgayCheckOut"));
                dd.setCheckIn(rs.getString("CheckIn"));
                dd.setCheckOut(rs.getString("CheckOut"));
        }
        provider.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dd;
    }
    public static boolean KTTT(String maLop, String maHV){
        try {
            String sql = "Select * from DiemDanh where MaLop like '%" + maLop + "%'";
            SQLServerProvider pro = new SQLServerProvider();
            pro.open();
            ResultSet rs = pro.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static pCTDiemDanh Search(String tenLop){
        pCTDiemDanh dd = null;
        try {
            String sql = String.format("Select * from Lop where Tenlop = '%s'", tenLop);
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if (rs.next()) {
                dd = new pCTDiemDanh();
                dd.setId(rs.getInt("Id"));
                dd.setMaLop(rs.getString("MaLop"));
                dd.setMaHV(rs.getString("MaHV"));
                dd.setNgayCheckIn(rs.getString("NgayCheckIn"));
                dd.setNgayCheckOut(rs.getString("NgayCheckOut"));
                dd.setCheckIn(rs.getString("CheckIn"));
                dd.setCheckOut(rs.getString("CheckOut"));
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dd;
    }
    public static void ShowSearch(DefaultTableModel dtm,String tenLop) {
        ArrayList<pCTDiemDanh> dsDD = dao.frmCTDiemDanhDAO.sreachTen(tenLop);
        dtm.setRowCount(0);
        for (pCTDiemDanh dd : dsDD) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(dd.getNgayCheckIn());
            vec.add(dd.getNgayCheckOut());
            vec.add(dd.getCheckIn());
            vec.add(dd.getCheckOut());
            vec.add(dd.getGhiChu());
            dtm.addRow(vec);
        }
    }
    public static void ShowData2(DefaultTableModel dtm) {
        ArrayList<pCTDiemDanh> dsDD = dao.frmCTDiemDanhDAO.LoadData();
        dtm.setRowCount(0);
        for (pCTDiemDanh dd : dsDD) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(dd.getNgayCheckIn());
            vec.add(dd.getNgayCheckOut());
            vec.add(dd.getCheckIn());
            vec.add(dd.getCheckOut());
            vec.add(dd.getGhiChu());
            dtm.addRow(vec);
        }
    }
   
}
