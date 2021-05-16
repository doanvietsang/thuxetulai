/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import util.ConnectDB;
import dto.BanThongKeDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;
        
/**
 *
 * @author Admin
 */
public class BanThongKeDAO {
    

    public int taothang (int month, int year){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Ngaymuon) from GiaoDich "
+ "where month(Ngaymuon) = ? and YEAR(Ngaymuon) = ? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
    public int taongay (int month, int year,int day){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Ngaymuon) from GiaoDich "
+ "where month(Ngaymuon) = ? and YEAR(Ngaymuon) = ? and day(Ngaymuon) = ? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
            pst.setInt(3, day);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
    
    public int tao(){
       int tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Ngaymuon) from GiaoDich";
            PreparedStatement pst = con.prepareStatement(sql);
            Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
while(rs.next()){
   tao = rs.getInt(1);
    return tao;
}
        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
    
     public int hoanthanh(){
       int hoanthanh = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Ngaytra) from GiaoDich";
            PreparedStatement pst = con.prepareStatement(sql);
            Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
while(rs.next()){
   hoanthanh = rs.getInt(1);
    return hoanthanh;
}
        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
      public int hoanthanhthang (int month, int year){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Ngaytra) from GiaoDich "
+ "where month(Ngaytra) = ? and YEAR(Ngaytra) = ? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
    public int hoanthanhngay (int month, int year,int day){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Ngaytra) from GiaoDich "
+ "where month(Ngaytra) = ? and YEAR(Ngaytra) = ? and day(Ngaytra) = ? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
            pst.setInt(3, day);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
      public int tonggiaodich(){
       int hoanthanh = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Magd) from GiaoDich";
            PreparedStatement pst = con.prepareStatement(sql);
            Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
while(rs.next()){
   hoanthanh = rs.getInt(1);
    return hoanthanh;
}
        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
      public int tonggaodichthang (int month, int year){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Magd) from GiaoDich "
+ "where month(Ngaymuon) = ? and YEAR(Ngaymuon) = ? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
    public int tonggiaodichngay (int month, int year,int day){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select count(Magd) from GiaoDich "
+ "where month(Ngaymuon) = ? and YEAR(Ngaymuon) = ? and day(Ngaymuon) = ? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
            pst.setInt(3, day);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
       public int doanhthu(){
       int hoanthanh = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select sum(Tongphi) from GiaoDich";
            PreparedStatement pst = con.prepareStatement(sql);
            Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
while(rs.next()){
   hoanthanh = rs.getInt(1);
    return hoanthanh;
}
        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
        public int doanhthuthang (int month, int year){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select sum(Tongphi) from GiaoDich "
+ "where month(Ngaytra) = ? and YEAR(Ngaytra) = ? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
    public int doanhthungay (int month, int year,int day){
       int Tao = 0;
            Connection con = null;
try {      con = ConnectDB.getCon();
            String sql = "select sum (Tongphi) from GiaoDich "
+ "where month(Ngaytra) = ? and YEAR(Ngaytra) = ? and day(Ngaytra) =? ";       
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, month);
            pst.setInt(2, year);
            pst.setInt(3, day);
ResultSet rs = pst.executeQuery();
while(rs.next()){
    Tao = rs.getInt(1);
    return Tao;
}


        } catch (SQLException ex) {
            Logger.getLogger(BanThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    ConnectDB.closedCon(con);
}return 0;
    }
}
