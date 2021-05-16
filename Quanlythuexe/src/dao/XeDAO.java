/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.XeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author USER
 */
public class XeDAO {
     public boolean create(XeDTO dto) {
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlCreate = "INSERT INTO XE VALUES(?, ?, ?, ?, ? ,?)"; 
            PreparedStatement pst = con.prepareStatement(sqlCreate);
            pst.setString(1, dto.getMaXe()); 
            pst.setString(2, dto.getTenXe());
            pst.setString(3, dto.getBienSo());
            pst.setString(4, dto.getLoaiXe());
            pst.setString(5, dto.getTrangthai());
            pst.setInt(6, dto.getGiathue());
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
     public ArrayList<XeDTO> readByAll() {
        Connection con = null;
        try {
            ArrayList<XeDTO> list = new ArrayList<XeDTO>();
            con = ConnectDB.getCon();
            String sqlRead = "select * from xe";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlRead);
            while (rs.next()) {
              XeDTO dto = new XeDTO(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(dto);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
     public boolean update(XeDTO dto) throws SQLException {
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlUpdate = "UPDATE XE SET Tenxe = ?,Bienso = ?,Loaixe = ?, Trangthai = ?, Giathue = ? WHERE Maxe=?";
            PreparedStatement pst = con.prepareStatement(sqlUpdate);
            pst.setString(1, dto.getTenXe());
            pst.setString(2, dto.getBienSo());
            pst.setString(3, dto.getLoaiXe());
            pst.setString(4, dto.getTrangthai());
            pst.setInt(5, dto.getGiathue());
            pst.setString(6,dto.getMaXe());
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
      public boolean delete(XeDTO dto) {
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlDelete = "DELETE FROM xe WHERE maxe=?"; //cau lenh sql co tham so
            PreparedStatement pst = con.prepareStatement(sqlDelete);
            pst.setString(1, dto.getMaXe());
            if (pst.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
      public ArrayList<XeDTO> readByMaxe(String Maxe) {
        ArrayList<XeDTO> list = new ArrayList<XeDTO>();
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Maxe = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, Maxe);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
       public boolean Baotri(XeDTO dto) throws SQLException {
           String baotri = "baotri";
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlUpdate = "UPDATE XE SET Trangthai = ? WHERE Maxe=?";
            PreparedStatement pst = con.prepareStatement(sqlUpdate);
            pst.setString(1,baotri);
            pst.setString(2,dto.getMaXe());
            if (pst.executeUpdate() > 0) {
                dto.setTrangthai(baotri);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
       public boolean Thue(String Maxe) throws SQLException {
           String thue = "thue";
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlUpdate = "UPDATE XE SET Trangthai = ? WHERE Maxe=?";
            PreparedStatement pst = con.prepareStatement(sqlUpdate);
            pst.setString(1,thue);
            pst.setString(2,Maxe);
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
       public boolean Trong(String Maxe) throws SQLException {
           String trong = "trong";
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlUpdate = "UPDATE XE SET Trangthai = ? WHERE Maxe=?";
            PreparedStatement pst = con.prepareStatement(sqlUpdate);
            pst.setString(1,trong);
            pst.setString(2,Maxe);
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
  public ArrayList<XeDTO> readByLoaixe(String loaixe) {
        ArrayList<XeDTO> list = new ArrayList<XeDTO>();
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Loaixe = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, loaixe);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
   public ArrayList<XeDTO> readByTrangThai(String Trangthai) {
        ArrayList<XeDTO> list = new ArrayList<XeDTO>();
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Trangthai = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, Trangthai);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
  public ArrayList<XeDTO> readByLoaixeTrong(String loaixe) {
        ArrayList<XeDTO> list = new ArrayList<XeDTO>();
        String Trong = "trong";
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Loaixe = ? and Trangthai = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, loaixe);
            pst.setString(2,Trong);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
        
    }   
  public ArrayList<XeDTO> readByTenxeTrong(String Tenxe) {
        ArrayList<XeDTO> list = new ArrayList<XeDTO>();
        String Trong = "trong";
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Tenxe = ? and Trangthai = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, Tenxe);
            pst.setString(2,Trong);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }    
  public ArrayList<XeDTO> readByTenxe(String loaixe) {
        ArrayList<XeDTO> list = new ArrayList<XeDTO>();
        String Trong = "trong";
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT distinct Tenxe FROM XE WHERE Loaixe = ? and Trangthai = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, loaixe);
            pst.setString(2,Trong);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
        
    }   
  public XeDTO readMaxe(String Maxe) {
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Maxe = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, Maxe);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6)); 
            }
            return dto;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
 public XeDTO readGiathue(String Maxe) {
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT Giathue FROM XE WHERE Maxe = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, Maxe);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getInt(1));
            }
            return dto;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
 public ArrayList<XeDTO>Giatangdan(ArrayList<XeDTO> list){
     Collections.sort(list, new Comparator<XeDTO>() {

         @Override
         public int compare(XeDTO o1, XeDTO o2) {
            if(o1.getGiathue() > o2.getGiathue()){
                return 1;
            }
            else{
                if(o1.getGiathue() == o2.getGiathue()){
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
 public ArrayList<XeDTO>Giagiamdan(ArrayList<XeDTO> list){
     Collections.sort(list, new Comparator<XeDTO>() {

         @Override
         public int compare(XeDTO o1, XeDTO o2) {
            if(o1.getGiathue() < o2.getGiathue()){
                return 1;
            }
            else{
                if(o1.getGiathue() == o2.getGiathue()){
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
 public boolean Sosanh(String maxe) {
        String Trong = "trong";
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Maxe = ? and Trangthai = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, maxe);
            pst.setString(2,Trong);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
           return true;
            }
            
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
        
    }
 public int Soxetrong(){
         int xetrong = 0;
             Connection con = null;
try {    con = ConnectDB.getCon();
             String sql = "select count(distinct Maxe) from Xe  where Trangthai = 'trong'";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 xetrong = rs.getInt(1);
             }
             return xetrong;
         } catch (SQLException ex) {
             Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
    ConnectDB.closedCon(con);
}
return 0;
 }
 public int Soxethue(){
         int xetrong = 0;
             Connection con = null;
try {    con = ConnectDB.getCon();
             String sql = "select count(distinct Maxe) from Xe  where Trangthai = 'thue'";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 xetrong = rs.getInt(1);
             }
             return xetrong;
         } catch (SQLException ex) {
             Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
    ConnectDB.closedCon(con);
}
return 0;
 }
 public int Soxebaotri(){
         int xetrong = 0;
             Connection con = null;
try {    con = ConnectDB.getCon();
             String sql = "select count(distinct Maxe) from Xe  where Trangthai = 'baotri'";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 xetrong = rs.getInt(1);
             }
             return xetrong;
         } catch (SQLException ex) {
             Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
    ConnectDB.closedCon(con);
}
return 0;
 }
 public int Tong(){
         int xetrong = 0;
             Connection con = null;
try {    con = ConnectDB.getCon();
             String sql = "select count(distinct Maxe) from Xe";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 xetrong = rs.getInt(1);
             }
             return xetrong;
         } catch (SQLException ex) {
             Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
    ConnectDB.closedCon(con);
}
return 0;
 }
 public XeDTO readBymotxe(String Maxe) {
        Connection con = null;
        XeDTO dto = new XeDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByX = "SELECT * FROM XE WHERE Maxe = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByX);
            pst.setString(1, Maxe);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dto = new XeDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6));
                
            }
            return dto;
        } catch (Exception e) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
 }



