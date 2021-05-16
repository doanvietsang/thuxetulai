/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import dao.GiaoDichDAO;
import dao.BanThongKeDAO;
import dao.KhachHangDAO;
import dao.XeDAO;
import dto.BanThongKeDTO;
import dto.GiaoDichDTO;
import dto.KhachHangDTO;
import dto.XeDTO;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class pnlThongke extends javax.swing.JPanel {
    ArrayList<GiaoDichDTO>list = null;
    Vector col = null;
    Vector row = null;
    Vector colthongke = null;
    Vector rowthongke = null;
    DefaultTableModel model = null;
    GiaoDichDAO dao = new GiaoDichDAO();
    BanThongKeDTO dto = null;
    int Tao = 0;
    int Hoanthanh = 0;
    int tong = 0;
    int doanhthu = 0;
    /**
     * Creates new form FrmKhachhang
     */
    public pnlThongke() {
        initComponents();
col = new Vector();
col.add("Mã Giao Dịch");
col.add("Mã Khách Hàng");
col.add("Mã Xe");
col.add("Số Ngày Mượn");
col.add("Ngày Mượn");
col.add("Ngày Trả");
col.add("Loại Phụ Phí");
col.add("Phụ Phí");
col.add("Tổng Chi Phí");
list = dao.ReadbyThongke();
Resetable();
tableHienthi.updateUI();
colthongke = new Vector();
colthongke.add("Giao Dịch Được Tạo");
colthongke.add("Giao Dịch Hoàn Thành");
colthongke.add("Tổng Số Giao Dịch");
colthongke.add("Tổng Doanh Thu");
BanThongKeDAO dao1 = new BanThongKeDAO();
Tao = dao1.tao();
Hoanthanh = dao1.hoanthanh();
tong = Tao + Hoanthanh;
doanhthu = dao1.doanhthu();
resetthongke();
tableThongke.updateUI();
    }
public void Resetable(){
    row = new Vector();
for (GiaoDichDTO dto : list){
    Vector v = new Vector();
    v.add(dto.getMagd());
    v.add(dto.getMakh());
    v.add(dto.getMaxe());
    v.add(dto.getSongaymuon());
    v.add(dto.getNgaymuon());
    v.add(dto.getNgaytra());
    v.add(dto.getLoaipp());
    v.add(dto.getPhuphi());
    v.add(dto.getTongphi());
    row.add(v);
}
model = new DefaultTableModel(row, col);
tableHienthi.setModel(model);
}

    public pnlThongke(LayoutManager layout) {
        super(layout);
    }
public void resetthongke(){
    rowthongke = new Vector();
Vector v = new Vector();
v.add(Tao);
v.add(Hoanthanh);
v.add(tong);
v.add(doanhthu);
rowthongke.add(v);
DefaultTableModel model1 = new DefaultTableModel(rowthongke, colthongke);
tableThongke.setModel(model1);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHienthi = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbTimkiem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtThang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNam = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableThongke = new javax.swing.JTable();
        butInhoadon = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_graph_64px.png"))); // NOI18N
        jLabel1.setText("THỐNG KÊ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(910, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Thông Tin Giao Dịch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        tableHienthi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableHienthi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableHienthi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tableHienthi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHienthiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHienthi);

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_trash_32px_1.png"))); // NOI18N
        jButton9.setText("Xóa");
        jButton9.setMaximumSize(new java.awt.Dimension(117, 41));
        jButton9.setMinimumSize(new java.awt.Dimension(117, 41));
        jButton9.setPreferredSize(new java.awt.Dimension(117, 41));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_more_32px.png"))); // NOI18N

        cbTimkiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbTimkiem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hiển Thị Tất CẢ", "Tìm Kiếm Theo Tháng", "Tìm Kiếm Theo Ngày" }));
        cbTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimkiemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Ngày");

        txtNgay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNgay.setText("00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Tháng");

        txtThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Năm");

        txtNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_update_left_rotation_32px_3.png"))); // NOI18N
        jButton8.setText("Tìm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cbTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BẢN SỐ LƯỢNG GIAO DỊCH VÀ DOANH THU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        tableThongke.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableThongke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Giao Dịch Được Tạo", "Giao Dịch Hoàn Thành", "Tổng Giao Dịch", "Tổng Doanh Thu"
            }
        ));
        jScrollPane2.setViewportView(tableThongke);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        butInhoadon.setBackground(new java.awt.Color(255, 255, 255));
        butInhoadon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        butInhoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons1/icons8_print_32px.png"))); // NOI18N
        butInhoadon.setText("In Hóa Đơn");
        butInhoadon.setEnabled(false);
        butInhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInhoadonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butInhoadon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(butInhoadon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
int index = cbTimkiem.getSelectedIndex();
if(index == 0){
list = dao.ReadbyThongke();
Resetable();
tableHienthi.updateUI();
BanThongKeDAO dao1 = new BanThongKeDAO();
Tao = dao1.tao();
Hoanthanh = dao1.hoanthanh();
tong = Tao + Hoanthanh;
doanhthu = dao1.doanhthu();
resetthongke();
tableThongke.updateUI();
}
if(index == 1){
if(validata().length() > 0){
    JOptionPane.showMessageDialog(this, validata());
}
else{
int Thang = Integer.parseInt(txtThang.getText());
int nam = Integer.parseInt(txtNam.getText());
//int ngay = Integer.parseInt(txtNgay.getText());
list = dao.ReadbythongkeThang(Thang, nam);
Resetable();
tableHienthi.updateUI();
BanThongKeDAO dao1 = new BanThongKeDAO();
Tao = dao1.taothang(Thang, nam);
Hoanthanh = dao1.hoanthanhthang(Thang, nam);
tong = Tao + Hoanthanh;
doanhthu = dao1.doanhthuthang(Thang, nam);
resetthongke();
tableThongke.updateUI();
}
}
if(index == 2){
if(validata().length() > 0){
JOptionPane.showMessageDialog(this, validata());
}
else{
int Thang = Integer.parseInt(txtThang.getText());
int nam = Integer.parseInt(txtNam.getText());
int ngay = Integer.parseInt(txtNgay.getText());
list = dao.ReadbythongkeNgay(ngay, Thang, nam);
Resetable();
tableHienthi.updateUI();
BanThongKeDAO dao1 = new BanThongKeDAO();
Tao = dao1.taongay(Thang, nam, ngay);
Hoanthanh = dao1.hoanthanhngay(Thang, nam, ngay);
tong = Tao + Hoanthanh;
doanhthu = dao1.doanhthungay(Thang, nam , ngay);
resetthongke();
tableThongke.updateUI();
}
}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cbTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimkiemActionPerformed
int index = cbTimkiem.getSelectedIndex();
if(index == 0){
list = dao.ReadbyThongke();
Resetable();
tableHienthi.updateUI();
BanThongKeDAO dao1 = new BanThongKeDAO();
Tao = dao1.tao();
Hoanthanh = dao1.hoanthanh();
tong = Tao + Hoanthanh;
doanhthu = dao1.doanhthu();
resetthongke();
tableThongke.updateUI();
}
    }//GEN-LAST:event_cbTimkiemActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
int index = tableHienthi.getSelectedRow();
if(index == -1 ){
    JOptionPane.showMessageDialog(this, "CHỌN GIAO DỊCH CẦN XÓA");
}
else{
GiaoDichDTO dto = list.get(index);
if(dto.getNgaytra() == null){
    JOptionPane.showMessageDialog(this, "GIAO DỊCH CHƯA HOÀN THÀNH\n VIỆT XÓA GIAO DỊCH SẼ GÂY RA LỖI");
}
else{
if(JOptionPane.showConfirmDialog(this, "BẠN CÓ CHẮT MUỐN XÓA GIAO DỊCH NÀY", "XÓA"
        , JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
list.remove(index);
if(dao.delete(dto)){
row.remove(index);
tableHienthi.updateUI();
BanThongKeDAO dao1 = new BanThongKeDAO();
Tao = dao1.tao();
Hoanthanh = dao1.hoanthanh();
tong = Tao + Hoanthanh;
doanhthu = dao1.doanhthu();
resetthongke();
tableThongke.updateUI();
JOptionPane.showMessageDialog(this, "ĐÃ XÓA GIAO DỊCH");
}
}    
}
}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void butInhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInhoadonActionPerformed
int index = tableHienthi.getSelectedRow();
GiaoDichDTO dto = list.get(index);
if(dto.getNgaytra() == null){
    JOptionPane.showMessageDialog(this, "GIAO DỊCH CHƯA HOÀN THÀNH");
}
else{
    KhachHangDAO daokh = new KhachHangDAO();
    KhachHangDTO dtokh = daokh.readByMotkh(dto.getMakh());
    XeDAO daoxe = new XeDAO();
    XeDTO dtoxe = daoxe.readBymotxe(dto.getMaxe());
Frmhoadon frmhd = new Frmhoadon(null);
frmhd.labeTenkh.setText(dtokh.getTenkh());
frmhd.labeDiachi.setText(dtokh.getDiachi());
frmhd.labeSDT.setText(dtokh.getSdt());
frmhd.LabeTenXE.setText(dtoxe.getTenXe());
frmhd.LabeBienso.setText(dtoxe.getBienSo());
String giathue = String.valueOf(dtoxe.getGiathue());
frmhd.labeGiathue.setText(giathue + "\t VND");
frmhd.labeNgayMuon.setText(dto.getNgaymuon().toString());
frmhd.labeNgayTra.setText(dto.getNgaytra().toString());
frmhd.labeSongaymuon.setText(String.valueOf(dto.getSongaymuon()));
int day = dto.getSongaymuon();
String a = "";
if(day >= 1 && day <= 2){
    a += "0";
}
if(day >= 3 && day <= 7){
    a += "GIẢM 3 %";
}
if(day >= 8 && day <= 14){
    a += "GIẢM 7 %";
}
if(day >= 15 && day <= 22){
    a += "GIẢM 12 %";
}
if(day >= 23){
    a += "GIẢM 15 %";
}

frmhd.LabeGiam.setText(a);
GiaoDichDAO daogd = new GiaoDichDAO();
int tonggiathue = daogd.TinhTien(dtoxe.getGiathue(), dto.getSongaymuon());
String Tonggiathue = String.valueOf(tonggiathue);
frmhd.labeTongGiaThue.setText(Tonggiathue + "\t VND");
frmhd.labeLoaiPP.setText(dto.getLoaipp());
frmhd.labePP.setText(String.valueOf(dto.getPhuphi())+ "\t VND");
frmhd.labeTong.setText(String.valueOf(dto.getTongphi())+ "\t VND");
frmhd.labeNgaytao.setText(dto.getNgaytra().toString());
frmhd.setVisible(true);
    
}
    }//GEN-LAST:event_butInhoadonActionPerformed

    private void tableHienthiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHienthiMouseClicked
int index = tableHienthi.getSelectedRow();
if(index != -1){
    butInhoadon.setEnabled(true);
}
    }//GEN-LAST:event_tableHienthiMouseClicked
String validata(){
String mess = "";
if(txtNam.getText().equals("")){
    mess += "ĐIỀN NĂM \n";
}
if(txtThang.getText().equals("")){
    mess += "ĐIỀN THÁNG \n";
}
if(txtNgay.getText().equals("")){
    mess += "ĐIỀN NGÀY \n";
}
return mess;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butInhoadon;
    private javax.swing.JComboBox cbTimkiem;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableHienthi;
    private javax.swing.JTable tableThongke;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}
