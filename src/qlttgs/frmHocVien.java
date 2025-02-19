/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttgs;

import dao.frmCTHocVienDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import pojo.pCTHocVien;

/**
 *
 * @author Admin
 */
public class frmHocVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmHocVien
     */
    public frmHocVien() {
        initComponents();
        this.setLocation(60,60);
        this.setSize(655, 430);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ShowData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSHV = new javax.swing.JTable();
        lbThongTinLopHoc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnQuanLi = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();

        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblDSHV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HV", "Tên HV", "Ngày sinh", "Giới tính", "SĐT", "Email", "Trạng thái"
            }
        ));
        tblDSHV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSHVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSHV);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 630, 180);

        lbThongTinLopHoc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbThongTinLopHoc.setText("DANH SÁCH HỌC VIÊN");
        getContentPane().add(lbThongTinLopHoc);
        lbThongTinLopHoc.setBounds(190, 10, 300, 29);

        jPanel1.setLayout(null);

        btnQuanLi.setText("Quản Lí");
        btnQuanLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLiActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuanLi);
        btnQuanLi.setBounds(190, 60, 120, 40);

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
        jPanel1.add(btnDong);
        btnDong.setBounds(360, 60, 120, 40);

        btnTimKiem.setText("Tìm kiếm");
        jPanel1.add(btnTimKiem);
        btnTimKiem.setBounds(20, 60, 120, 40);

        jLabel1.setText("Tên GS: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 10, 80, 30);
        jPanel1.add(txtTimKiem);
        txtTimKiem.setBounds(130, 10, 310, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 260, 500, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDSHVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSHVMouseClicked
//        // TODO add your handling code here:
//        int row = tblDSHV.getSelectedRow();
//        txtMa.setText((String)tblDSHV.getValueAt(row, 0));
//        txtTenHV.setText((String)tblDSHV.getValueAt(row, 1));
//        txtLoai.setText((String)tblDSHV.getValueAt(row, 2));
//        txtGioiTinh.setText((String)tblDSHV.getValueAt(row, 3) + "");
    }//GEN-LAST:event_tblDSHVMouseClicked

    private void btnQuanLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLiActionPerformed
        // TODO add your handling code here:
        frmCTHocVien hv = new frmCTHocVien();
        JDesktopPane des = getDesktopPane();
        des.add(hv);
        hv.setVisible(true);
    }//GEN-LAST:event_btnQuanLiActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnQuanLi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbThongTinLopHoc;
    private javax.swing.JTable tblDSHV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void ShowData() {
        DefaultTableModel dtm = (DefaultTableModel)tblDSHV.getModel();
        dtm.setRowCount(0);
        frmCTHocVienDAO.ShowData(dtm);
        tblDSHV.setModel(dtm);
    }
}


