/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.PopupMenu;
import java.awt.Toolkit;
// chờ em vào zom
/**
 *
 * @author Admin
 */
public class FrmMenu extends javax.swing.JFrame {
FrmGiaoDien giaodien;

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu(FrmGiaoDien giaodien) {// giờ em muốn từ from login goi from này nhưng mà from này đã có tham số là from giao dienj rồi
        //em alo 0914237513 cho cô để co hỏi cụ thể
        initComponents();
        setIcon();
        this.giaodien = giaodien;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paXe = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paKH = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        paGD = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        paTaikhoan = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        paThongke = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        paTaiKoan = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ THUÊ XE");

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHO THUÊ XE TỰ LÁI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cab_stand_96px_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Địa chỉ: 6 Lê Lợi, Huế");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hoặc gọi Hotline hỗ trợ để được tư vấn về sản phẩm, dịch vụ: 1800 8001 (Miễn phí cho tất cả thuê bao)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        paXe.setBackground(new java.awt.Color(0, 153, 153));
        paXe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paXe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paXe.setMinimumSize(new java.awt.Dimension(0, 0));
        paXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paXeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paXeMouseExited(evt);
            }
        });
        paXe.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("XE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 89, 13, 0);
        paXe.add(jLabel6, gridBagConstraints);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_car_insurance_64px_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 71, 0, 71);
        paXe.add(jLabel7, gridBagConstraints);

        paKH.setBackground(new java.awt.Color(0, 153, 153));
        paKH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paKH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paKHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paKHMouseExited(evt);
            }
        });
        paKH.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("KHÁCH HÀNG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 49, 15, 48);
        paKH.add(jLabel8, gridBagConstraints);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_member_64px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 71, 0, 0);
        paKH.add(jLabel9, gridBagConstraints);

        paGD.setBackground(new java.awt.Color(0, 153, 153));
        paGD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paGD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paGD.setPreferredSize(new java.awt.Dimension(206, 123));
        paGD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paGDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paGDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paGDMouseExited(evt);
            }
        });
        paGD.setLayout(new java.awt.GridBagLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GIAO DỊCH");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 71, 15, 57);
        paGD.add(jLabel10, gridBagConstraints);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_car_rental_64px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 81, 0, 0);
        paGD.add(jLabel11, gridBagConstraints);

        paTaikhoan.setBackground(new java.awt.Color(0, 153, 153));
        paTaikhoan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paTaikhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paTaikhoan.setPreferredSize(new java.awt.Dimension(206, 123));
        paTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paTaikhoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paTaikhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paTaikhoanMouseExited(evt);
            }
        });
        paTaikhoan.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TÀI KHOẢN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 61, 17, 56);
        paTaikhoan.add(jLabel12, gridBagConstraints);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_verified_account_64px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 71, 0, 0);
        paTaikhoan.add(jLabel13, gridBagConstraints);

        paThongke.setBackground(new java.awt.Color(0, 153, 153));
        paThongke.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paThongkeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paThongkeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paThongkeMouseExited(evt);
            }
        });
        paThongke.setLayout(new java.awt.GridBagLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("THỐNG KÊ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 61, 15, 61);
        paThongke.add(jLabel14, gridBagConstraints);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_graph_64px.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 71, 0, 0);
        paThongke.add(jLabel15, gridBagConstraints);

        paTaiKoan.setBackground(new java.awt.Color(0, 153, 153));
        paTaiKoan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paTaiKoan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paTaiKoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paTaiKoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paTaiKoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paTaiKoanMouseExited(evt);
            }
        });
        paTaiKoan.setLayout(new java.awt.GridBagLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ĐĂNG XUẤT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 61, 15, 56);
        paTaiKoan.add(jLabel16, gridBagConstraints);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_exit_64px_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 76, 0, 0);
        paTaiKoan.add(jLabel17, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paXe, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(paKH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paTaiKoan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(paGD, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE))
                .addGap(200, 200, 200))
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paXe, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(paGD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paTaikhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paTaiKoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paThongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paXeMouseExited
        resertcolor(paXe);
    }//GEN-LAST:event_paXeMouseExited

    private void paXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paXeMouseEntered
        setcolor(paXe);
    }//GEN-LAST:event_paXeMouseEntered

    private void paKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paKHMouseEntered
setcolor(paKH);
    }//GEN-LAST:event_paKHMouseEntered

    private void paKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paKHMouseExited
        resertcolor(paKH);
    }//GEN-LAST:event_paKHMouseExited

    private void paGDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paGDMouseEntered
 setcolor(paGD);
    }//GEN-LAST:event_paGDMouseEntered

    private void paGDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paGDMouseExited
         resertcolor(paGD);
    }//GEN-LAST:event_paGDMouseExited

    private void paTaikhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaikhoanMouseEntered
setcolor(paTaikhoan);
    }//GEN-LAST:event_paTaikhoanMouseEntered

    private void paTaikhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaikhoanMouseExited
       resertcolor(paTaikhoan);
    }//GEN-LAST:event_paTaikhoanMouseExited

    private void paThongkeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paThongkeMouseEntered
 setcolor(paThongke);
    }//GEN-LAST:event_paThongkeMouseEntered

    private void paThongkeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paThongkeMouseExited
 resertcolor(paThongke);
    }//GEN-LAST:event_paThongkeMouseExited

    private void paTaiKoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaiKoanMouseEntered
setcolor(paTaiKoan);
    }//GEN-LAST:event_paTaiKoanMouseEntered

    private void paTaiKoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaiKoanMouseExited
        resertcolor(paTaiKoan);
    }//GEN-LAST:event_paTaiKoanMouseExited

    private void paXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paXeMouseClicked
giaodien = new FrmGiaoDien(this);
this.setVisible(false);
giaodien.setVisible(true);
giaodien.pnlHienthi.add(new pnlXe());
pnlXe.tableXe.getColumnModel().getColumn(1).setPreferredWidth(200);
pnlXe.tableXe.getColumnModel().getColumn(0).setPreferredWidth(20);
    }//GEN-LAST:event_paXeMouseClicked

    private void paKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paKHMouseClicked
giaodien = new FrmGiaoDien(this);
this.setVisible(false);
giaodien.setVisible(true);
giaodien.pnlHienthi.add(new pnlKhachhang());
pnlKhachhang.TableKH.getColumnModel().getColumn(3).setPreferredWidth(500);
    }//GEN-LAST:event_paKHMouseClicked

    private void paGDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paGDMouseClicked
giaodien = new FrmGiaoDien(this);
this.setVisible(false);
giaodien.setVisible(true);
giaodien.pnlHienthi.add(new pnlGiaodich());
    }//GEN-LAST:event_paGDMouseClicked

    private void paTaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaikhoanMouseClicked
giaodien = new FrmGiaoDien(this);
this.setVisible(false);
giaodien.setVisible(true);
giaodien.pnlHienthi.add(new pnlTaikhoan());
    }//GEN-LAST:event_paTaikhoanMouseClicked

    private void paThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paThongkeMouseClicked
giaodien = new FrmGiaoDien(this);
this.setVisible(false);
giaodien.setVisible(true);
giaodien.pnlHienthi.add(new pnlThongke());
    }//GEN-LAST:event_paThongkeMouseClicked

    private void paTaiKoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paTaiKoanMouseClicked
Login login = new Login(this);
login.setVisible(true);
this.dispose();
    }//GEN-LAST:event_paTaiKoanMouseClicked
public void setcolor (JPanel panel ){
 panel.setBackground(new java.awt.Color(0,102,102));
}
public void resertcolor (JPanel panel ){
 panel.setBackground(new java.awt.Color(0,153,153));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel paGD;
    private javax.swing.JPanel paKH;
    private javax.swing.JPanel paTaiKoan;
    private javax.swing.JPanel paTaikhoan;
    private javax.swing.JPanel paThongke;
    private javax.swing.JPanel paXe;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8_traffic_jam_80px_1.png")));
    }
}
