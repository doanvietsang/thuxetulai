/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.KhachHangDTO;
import dto.XeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author USER
 */
public class KhachHangDAO {
    public boolean create(KhachHangDTO dto) {
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlCreate = "INSERT INTO KhachHang VALUES(?, ?, ?, ?, ? ,?)"; 
            PreparedStatement pst = con.prepareStatement(sqlCreate);
            pst.setString(1, dto.getMakh()); 
            pst.setString(2, dto.getTenkh());
            pst.setString(3, dto.getSdt());
            pst.setString(4, dto.getDiachi());
            pst.setString(5, dto.getAnhcm());
            pst.setString(6, dto.getAnhgp());
            
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
    public ArrayList<KhachHangDTO> readByAll() {
        Connection con = null;
        try {
            ArrayList<KhachHangDTO> list = new ArrayList<KhachHangDTO>();
            con = ConnectDB.getCon();
            String sqlRead = "select * from KhachHang";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqlRead);
            while (rs.next()) {
              KhachHangDTO dto = new KhachHangDTO(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(dto);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
    public boolean update(KhachHangDTO dto) throws SQLException {
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlUpdate = "UPDATE KhachHang SET Tenkh = ?, Sdt = ?, Diachi = ? , Anhcm = ?, Anhgp = ?  WHERE Makh = ?";
            PreparedStatement pst = con.prepareStatement(sqlUpdate);
            pst.setString(1, dto.getTenkh());
            pst.setString(2, dto.getSdt());
            pst.setString(3, dto.getDiachi());
            pst.setString(4, dto.getAnhcm());
            pst.setString(5, dto.getAnhgp());
            pst.setString(6,dto.getMakh());
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
    public boolean delete(KhachHangDTO dto) {
        Connection con = null;
        try {
            con = ConnectDB.getCon();
            String sqlDelete = "DELETE FROM khachhang WHERE makh=?"; //cau lenh sql co tham so
            PreparedStatement pst = con.prepareStatement(sqlDelete);
            pst.setString(1, dto.getMakh());
            if (pst.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectDB.closedCon(con);
        }
        return false;
    }
    public ArrayList<KhachHangDTO> readByMakh(String Makh) {
        ArrayList<KhachHangDTO> list = new ArrayList<KhachHangDTO>();
        Connection con = null;
        KhachHangDTO dto = new KhachHangDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByGT = "SELECT * FROM KHACHHANG WHERE makh = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByGT);
            pst.setString(1, Makh);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                dto = new KhachHangDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
    public ArrayList<KhachHangDTO> ReadBySdt(String Sdt){
      ArrayList<KhachHangDTO> list = new ArrayList<>();
            Connection con = null;
    try {   con = ConnectDB.getCon();
            String Sql = "Select *from khachhang where Sdt = ?";
            PreparedStatement pst = con.prepareStatement(Sql);
            pst.setString(1, Sdt);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
 KhachHangDTO dto = new KhachHangDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(dto);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        ConnectDB.closedCon(con);
    }
    return null;
    }
    public ArrayList<KhachHangDTO> Makhachhang(){
        ArrayList<KhachHangDTO> list = new ArrayList<>();
        Connection con = null;
        con = ConnectDB.getCon();
String sql = "select makh from khachhang ORDER BY makh";
        try {
            Statement st = con.createStatement();
            ResultSet rt = st.executeQuery(sql);
while(rt.next()){
   KhachHangDTO dto = new KhachHangDTO(rt.getString(1));
   list.add(dto);
}   
return list;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectDB.closedCon(con);
        }
return null;
    }
    public KhachHangDTO Sdt(String Makh) {
        Connection con = null;
        KhachHangDTO dto = new KhachHangDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByGT = "SELECT * FROM KHACHHANG WHERE makh = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByGT);
            pst.setString(1, Makh);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                dto = new KhachHangDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
                
            }
            return dto;
        } catch (Exception e) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
    public KhachHangDTO readByMotkh(String Makh) {
        
        Connection con = null;
        KhachHangDTO dto = new KhachHangDTO();
        
        try {
            con = ConnectDB.getCon();
            String sqlreadByGT = "SELECT * FROM KHACHHANG WHERE makh = ?";
            PreparedStatement pst = con.prepareStatement(sqlreadByGT);
            pst.setString(1, Makh);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                dto = new KhachHangDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
            }
            return dto;
        } catch (Exception e) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            ConnectDB.closedCon(con);
        }
        return null;
    }
}
                    
