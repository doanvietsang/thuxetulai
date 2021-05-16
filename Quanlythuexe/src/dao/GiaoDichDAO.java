/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dto.GiaoDichDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;
import javax.sql.DataSource;
import java.sql.Statement;
import java.sql.Time;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class GiaoDichDAO {
   public boolean CreateGD (GiaoDichDTO dto){
       
           Connection con = null;
   try {   con = ConnectDB.getCon();
           String sql = "insert into GiaoDich (Magd, Makh, Maxe, Songaymuon, Ngaymuon ) values (?,?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, dto.getMagd());
           pst.setString(2, dto.getMakh());
           pst.setString(3, dto.getMaxe());
           pst.setInt(4, dto.getSongaymuon());
           pst.setDate(5, dto.getNgaymuon());
           if(pst.executeUpdate()> 0)
               return true;
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally  {
       ConnectDB.closedCon(con);
   }return false;
}
   public ArrayList<GiaoDichDTO> ReadbyGD(){
     ArrayList<GiaoDichDTO> list = new ArrayList<>();
           Connection con = null;
 try {   con = ConnectDB.getCon();
           String sql = "select *from GiaoDich where NgayTra is null";
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while (rs.next()){
GiaoDichDTO dto = new GiaoDichDTO(rs.getString(1), rs.getString(2)
 , rs.getString(3), rs.getInt(4), rs.getDate(5));
list.add(dto);
}
           return list;
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
     ConnectDB.closedCon(con);
 }return null;
   }
   public int TinhTien(int Giathue,int Songay){
     int TongTien = Songay * Giathue;
     int PhanTram;
     int KuyenMai = 0;
     if (Songay >= 1 && Songay <= 2){
     KuyenMai = TongTien ;    
          }
    if(Songay >= 3 && Songay <= 7){
     PhanTram = (TongTien * 3)/100;
     KuyenMai = TongTien - PhanTram;
    }
    if(Songay >= 8 && Songay <= 14){
     PhanTram = (TongTien * 7)/100;
     KuyenMai = TongTien - PhanTram;
    }
    if(Songay >= 15 && Songay <= 22){
     PhanTram = (TongTien * 12)/100;
     KuyenMai = TongTien - PhanTram;
    }
    if(Songay >= 23 && Songay <= 30){
     PhanTram = (TongTien * 15)/100;
     KuyenMai = TongTien - PhanTram;
    }
    if(Songay > 30){
int SoNgayPhat = Songay - 30;        
int TongTientp =(30 * Giathue)  - (((30 * Giathue) * 15)/100)  ;       
 KuyenMai = TongTientp + (SoNgayPhat * Giathue);        
    }
    return KuyenMai;
}
   public boolean delete (GiaoDichDTO dto){

           Connection con = null;
try {     con = ConnectDB.getCon();
           String sql = "delete from GiaoDich where Magd = ?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, dto.getMagd());
           if(pst.executeUpdate() > 0){
               return true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
    ConnectDB.closedCon(con);
}
return false;
   }
   public boolean Update(GiaoDichDTO dto){
    
           Connection con = null;
 try {  con = ConnectDB.getCon();
           String sqbl = "Update GiaoDich set Makh = ?, Maxe = ?,Songaymuon = ?,Ngaymuon = ? where Magd = ? ";
           PreparedStatement pst = con.prepareStatement(sqbl);
           pst.setString(1, dto.getMakh());
           pst.setString(2, dto.getMaxe());
           pst.setInt(3, dto.getSongaymuon());
           pst.setDate(4, dto.getNgaymuon());
           pst.setString(5, dto.getMagd());
           if(pst.executeUpdate() > 0){
               return  true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
     ConnectDB.closedCon(con);
 }
return false;
   }
   public boolean Traxe(GiaoDichDTO dto){
    
           Connection con = null;
 try {  con = ConnectDB.getCon();
           String sqbl = "Update GiaoDich set Makh = ?, Maxe = ?,Songaymuon = ?"
+ ",Ngaymuon = ?, Ngaytra = ?, Loaipp = ?, Phuphi = ?, Tongphi = ? where Magd = ? ";
           PreparedStatement pst = con.prepareStatement(sqbl);
           pst.setString(1, dto.getMakh());
           pst.setString(2, dto.getMaxe());
           pst.setInt(3, dto.getSongaymuon());
           pst.setDate(4, dto.getNgaymuon());
           pst.setDate(5, dto.getNgaytra());
           pst.setString(6, dto.getLoaipp());
           pst.setInt(7, dto.getPhuphi());
           pst.setInt(8, dto.getTongphi());
           pst.setString(9, dto.getMagd());
           if(pst.executeUpdate() > 0){
               return  true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
     ConnectDB.closedCon(con);
 }
return false;
   }
public ArrayList<GiaoDichDTO>SapxepHetHang(ArrayList<GiaoDichDTO> list){
     Collections.sort(list, new Comparator<GiaoDichDTO>() {
         @Override
         public int compare(GiaoDichDTO o1, GiaoDichDTO o2) {
         long a = (long)o1.getSongaymuon()*(1000L*60L*60L*24L);
         long b = (long)o2.getSongaymuon()*(1000L*60L*60L*24L);
             if(o1.getNgaymuon().getTime()+a > o2.getNgaymuon().getTime()+b){
                return 1;
            }
            else{
                if(o1.getNgaymuon().getTime()+a == o2.getNgaymuon().getTime()+b){
                    return 0;
                }
                else{
                    return -1;
                }
            }
         
         }
     });
     return list;
 }
public ArrayList<GiaoDichDTO>SapxepGanNhat(ArrayList<GiaoDichDTO> list){
     Collections.sort(list, new Comparator<GiaoDichDTO>() {

         @Override
         public int compare(GiaoDichDTO o1, GiaoDichDTO o2) {
         if(o1.getNgaymuon().getTime() < o2.getNgaymuon().getTime()){
             return 1;
         }
         else{
             if(o1.getNgaymuon().getTime() == o2.getNgaymuon().getTime()){
                 return 0;
             }
             else{
                 return -1;
             }
 }
}
  });
     return list;
}
public ArrayList<GiaoDichDTO> ReadbyThongke(){
     ArrayList<GiaoDichDTO> list = new ArrayList<>();
           Connection con = null;
 try {   con = ConnectDB.getCon();
           String sql = "select *from GiaoDich ORDER BY Ngaytra DESC";
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while (rs.next()){
GiaoDichDTO dto = new GiaoDichDTO(rs.getString(1), rs.getString(2), rs.getString(3)
        , rs.getInt(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
list.add(dto);
}
           return list;
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
     ConnectDB.closedCon(con);
 }return null;
   }
public ArrayList<GiaoDichDTO> ReadbythongkeThang(int Thang, int nam){
     ArrayList<GiaoDichDTO> list = new ArrayList<>();
           Connection con = null;
 try {   con = ConnectDB.getCon();
           String sql = "select *from GiaoDich where month(Ngaytra) = ? and  year(Ngaytra) = ?\n" +
"or month(Ngaymuon) = ? and  year(Ngaymuon) = ? ORDER BY Ngaytra DESC";
  PreparedStatement pst = con.prepareStatement(sql);
  pst.setInt(1, Thang);
  pst.setInt(2, nam);
  pst.setInt(3, Thang);
  pst.setInt(4, nam);
 ResultSet rs = pst.executeQuery();
           while (rs.next()){
GiaoDichDTO dto = new GiaoDichDTO(rs.getString(1), rs.getString(2), rs.getString(3)
        , rs.getInt(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
list.add(dto);
}
           return list;
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
     ConnectDB.closedCon(con);
 }return null;
   }
public ArrayList<GiaoDichDTO> ReadbythongkeNgay(int ngay,int Thang, int nam){
     ArrayList<GiaoDichDTO> list = new ArrayList<>();
           Connection con = null;
 try {   con = ConnectDB.getCon();
           String sql = "select *from GiaoDich where month(Ngaytra) = ? and  year(Ngaytra) = ? and day(Ngaytra) = ?\n" +
"or month(Ngaymuon) = ? and  year(Ngaymuon) = ? and day(Ngaymuon) = ? ORDER BY Ngaytra DESC";
  PreparedStatement pst = con.prepareStatement(sql);
  pst.setInt(1, Thang);
  pst.setInt(2, nam);
  pst.setInt(3, ngay);
  pst.setInt(4, Thang);
  pst.setInt(5, nam);
  pst.setInt(6, ngay);
 ResultSet rs = pst.executeQuery();
           while (rs.next()){
GiaoDichDTO dto = new GiaoDichDTO(rs.getString(1), rs.getString(2), rs.getString(3)
        , rs.getInt(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
list.add(dto);
}
           return list;
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
     ConnectDB.closedCon(con);
 }return null;
   }
public ArrayList<GiaoDichDTO> ReadbyGDsdt(String makh){
     ArrayList<GiaoDichDTO> list = new ArrayList<>();
           Connection con = null;
 try {   con = ConnectDB.getCon();
           String sql = "select *from GiaoDich where NgayTra is null and Makh = ?";
 PreparedStatement pst = con.prepareStatement(sql);
 pst.setString(1, makh);
 ResultSet rs = pst.executeQuery();
           while (rs.next()){
GiaoDichDTO dto = new GiaoDichDTO(rs.getString(1), rs.getString(2)
 , rs.getString(3), rs.getInt(4), rs.getDate(5));
list.add(dto);
}
           return list;
       } catch (SQLException ex) {
           Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
     ConnectDB.closedCon(con);
 }return null;
   }
}