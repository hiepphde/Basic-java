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
import pojo.pDiemDanh;

/**
 *
 * @author Admin
 */
public class frmDiemDanhDAO {
   public static ArrayList<pDiemDanh> LoadData(){
        ArrayList<pDiemDanh> dsDD = new ArrayList<pDiemDanh>();
        try {
            String sql = "Select * from CTLop, Lop";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while (rs.next()) {                
                pDiemDanh dd = new pDiemDanh();
                dd.setMaLop(rs.getString("MaLop"));
                dd.setMaHV(rs.getString("MaHV"));
                dd.setTongBDH(rs.getInt("TongBDH"));
                dd.setTongBDN(rs.getInt("TongBDN"));
                dsDD.add(dd);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsDD;
    }
    public static pDiemDanh Search(String tenLop){
        pDiemDanh dd = null;
        try {
            String sql = String.format("Select * from Lop where Tenlop = '%s'", tenLop);
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if (rs.next()) {
                dd = new pDiemDanh();
                dd.setMaLop(rs.getString("MaLop"));
                dd.setMaHV(rs.getString("MaHV"));
                dd.setTongBDH(rs.getInt("TongBDH"));
                dd.setTongBDN(rs.getInt("TongBDN"));
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dd;
    }
    public static void ShowSearch(DefaultTableModel dtm,String tenLop) {
        ArrayList<pDiemDanh> dsDD = dao.frmDiemDanhDAO.Sreach(tenLop);
        dtm.setRowCount(0);
        for (pDiemDanh dd : dsDD) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(dd.getMaLop());
            vec.add(dd.getMaHV());
            vec.add(dd.getTongBDH());
            vec.add(dd.getTongBDN());
            dtm.addRow(vec);
        }
    }
    public static void ShowData2(DefaultTableModel dtm) {
        ArrayList<pDiemDanh> dsDD = dao.frmDiemDanhDAO.LoadData();
        dtm.setRowCount(0);
        for (pDiemDanh dd : dsDD) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(dd.getMaLop());
            vec.add(dd.getMaHV());
            vec.add(dd.getTongBDH());
            vec.add(dd.getTongBDN());
            dtm.addRow(vec);
        }
    }

    private static ArrayList<pDiemDanh> Sreach(String tenLop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
