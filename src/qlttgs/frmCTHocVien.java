/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlttgs;

import dao.frmCTHocVienDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.pCTHocVien;

/**
 *
 * @author Admin
 */
public class frmCTHocVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCTHocVien
     */
    public frmCTHocVien() {
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
        tblTTHV = new javax.swing.JTable();
        lbThongTinHocVien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSDT = new javax.swing.JTextField();
        txtTenHV = new javax.swing.JTextField();
        txtMaHV = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbDiaChi = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        lbMaHV = new javax.swing.JLabel();
        lbTenHV = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbTrangThai = new javax.swing.JLabel();
        cbxTrangThai = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        cbbGT = new javax.swing.JComboBox<>();

        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblTTHV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Học Viên", "Tên Học Viên", "Ngày Sinh", "Giới Tính", "Điện Thoại", "Email", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTTHV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTTHVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTTHV);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 620, 150);

        lbThongTinHocVien.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbThongTinHocVien.setText("THÔNG TIN HỌC VIÊN");
        getContentPane().add(lbThongTinHocVien);
        lbThongTinHocVien.setBounds(180, 10, 269, 29);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
        jPanel1.add(btnDong);
        btnDong.setBounds(380, 10, 100, 30);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(20, 10, 100, 30);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);
        btnSua.setBounds(140, 10, 100, 30);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);
        btnXoa.setBounds(260, 10, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 340, 500, 50);

        jPanel2.setLayout(null);
        jPanel2.add(txtSDT);
        txtSDT.setBounds(70, 90, 120, 30);
        jPanel2.add(txtTenHV);
        txtTenHV.setBounds(70, 50, 120, 30);

        txtMaHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHVActionPerformed(evt);
            }
        });
        jPanel2.add(txtMaHV);
        txtMaHV.setBounds(70, 10, 120, 30);
        jPanel2.add(txtNgaySinh);
        txtNgaySinh.setBounds(270, 50, 120, 30);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(270, 90, 120, 30);

        lbDiaChi.setText("Email");
        jPanel2.add(lbDiaChi);
        lbDiaChi.setBounds(200, 90, 70, 30);

        lbNgaySinh.setText("Ngày sinh:");
        jPanel2.add(lbNgaySinh);
        lbNgaySinh.setBounds(200, 50, 70, 30);

        lbGioiTinh.setText("Giới tính:");
        jPanel2.add(lbGioiTinh);
        lbGioiTinh.setBounds(200, 10, 70, 30);

        lbMaHV.setText("Mã HV:");
        jPanel2.add(lbMaHV);
        lbMaHV.setBounds(10, 10, 60, 30);

        lbTenHV.setText("Tên HV:");
        jPanel2.add(lbTenHV);
        lbTenHV.setBounds(10, 50, 60, 30);

        lbSDT.setText("SĐT:");
        jPanel2.add(lbSDT);
        lbSDT.setBounds(10, 90, 60, 30);

        lbTrangThai.setText("Trạng thái:");
        jPanel2.add(lbTrangThai);
        lbTrangThai.setBounds(410, 10, 80, 30);

        cbxTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Chọn ---", "Đang học", "Chưa Đăng Kí", "Hoàn Thành" }));
        cbxTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTrangThaiActionPerformed(evt);
            }
        });
        jPanel2.add(cbxTrangThai);
        cbxTrangThai.setBounds(480, 10, 120, 30);

        btnSearch.setText("Search");
        jPanel2.add(btnSearch);
        btnSearch.setBounds(420, 60, 170, 50);

        cbbGT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Chọn ---", "Nam", "Nữ" }));
        jPanel2.add(cbbGT);
        cbbGT.setBounds(270, 10, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 40, 620, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTTHVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTTHVMouseClicked
        // TODO add your handling code here:
        int row = tblTTHV.getSelectedRow();
        txtMaHV.setText((String)tblTTHV.getValueAt(row, 0));
        txtTenHV.setText((String)tblTTHV.getValueAt(row, 1));
        txtNgaySinh.setText((String)tblTTHV.getValueAt(row, 2));
        cbbGT.getModel().setSelectedItem((String)tblTTHV.getValueAt(row, 3));
        txtSDT.setText((String)tblTTHV.getValueAt(row, 4));
        txtEmail.setText((String)tblTTHV.getValueAt(row, 5));
        cbxTrangThai.getModel().setSelectedItem((String)tblTTHV.getValueAt(row, 6));
    }//GEN-LAST:event_tblTTHVMouseClicked

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void txtMaHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHVActionPerformed

    private void cbxTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTrangThaiActionPerformed
        
    }//GEN-LAST:event_cbxTrangThaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (frmCTHocVienDAO.KTTT(txtMaHV.getText()) == true) {
            int kq = JOptionPane.showConfirmDialog(null, "Mã đã tồn tại! Xin vui lòng kiểm tra lại!","Thông báo!",JOptionPane.YES_NO_OPTION);
            
            if (kq == JOptionPane.YES_OPTION) {
                txtMaHV.setText("");
                txtMaHV.requestFocus();
            }
            return;
        }
        else
        {
            String mahv = txtMaHV.getText();
            String tenHV = txtTenHV.getText();
            String ns = txtNgaySinh.getText();
            String gt = cbbGT.getSelectedItem().toString();
            String dt = txtSDT.getText();
            String dc = txtEmail.getText();
            String tt = cbxTrangThai.getSelectedItem().toString();
            
            pCTHocVien hv = new pCTHocVien();
            hv.setMaHV(mahv);
            hv.setTenHV(tenHV);
            hv.setNgaySinh(ns);
            hv.setGioiTinh(gt);
            hv.setDienThoai(dt);
            hv.setDiaChi(dc);
            hv.setTrangThai(tt);
            if (frmCTHocVienDAO.Add(hv) == true) {
                JOptionPane.showMessageDialog(null, "Thêm thành công!");
                ShowData();
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (frmCTHocVienDAO.KTTT(txtMaHV.getText()) == false) {
            int kq = JOptionPane.showConfirmDialog(null, "Mã Không tồn tại! Xin vui lòng kiểm tra lại!","Thông báo!",JOptionPane.YES_NO_OPTION);
            return;
        }
        else
        {
            String ma = txtMaHV.getText();
            if (frmCTHocVienDAO.Delete(ma) == true) {
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                txtMaHV.setText("");
                txtTenHV.setText("");
                txtEmail.setText("");
                txtNgaySinh.setText("");
                txtSDT.setText("");
                cbxTrangThai.getModel().setSelectedItem(" --- Chọn --- ");
                cbbGT.getModel().setSelectedItem(" --- Chọn --- ");
                ShowData();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String mahv = txtMaHV.getText();
        String tenHV = txtTenHV.getText();
        String ns = txtNgaySinh.getText();
        String gt = cbbGT.getSelectedItem().toString();
        String dt = txtSDT.getText();
        String dc = txtEmail.getText();
        String tt = cbxTrangThai.getSelectedItem().toString();
        
        pCTHocVien hv = new pCTHocVien();
        hv.setMaHV(mahv);
        hv.setTenHV(tenHV);
        hv.setNgaySinh(ns);
        hv.setGioiTinh(gt);
        hv.setDienThoai(dt);
        hv.setDiaChi(dc);
        hv.setTrangThai(tt);
        if (frmCTHocVienDAO.Update(txtMaHV.getText(), hv) == true) {
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
            ShowData();
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbGT;
    private javax.swing.JComboBox<String> cbxTrangThai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbMaHV;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTenHV;
    private javax.swing.JLabel lbThongTinHocVien;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JTable tblTTHV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaHV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenHV;
    // End of variables declaration//GEN-END:variables

    private void ShowData() {
        DefaultTableModel dtm = (DefaultTableModel)tblTTHV.getModel();
        dtm.setRowCount(0);
        frmCTHocVienDAO.ShowData(dtm);
        tblTTHV.setModel(dtm);
    }
}
