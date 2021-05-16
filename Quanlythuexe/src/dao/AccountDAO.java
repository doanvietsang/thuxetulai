/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.AccountDTO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author Le Tran Quang Huy
 */
public class AccountDAO {

    public boolean create(AccountDTO acc) {
        try {
            Connection con = ConnectDB.getCon();
            String sql = "insert into account values(?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            //ma hoa pass
            String result = "";
            MessageDigest digest;
            try {
                digest = MessageDigest.getInstance("MD5");
                digest.update(acc.getPassword().getBytes());
                BigInteger bigInteger = new BigInteger(1, digest.digest());
                result = bigInteger.toString(16);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            //luu thong tin vao table
            pst.setString(1, acc.getUsername());
            pst.setString(2, result);
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * kiem tra tai khoang da ton tai hay chua
     * 
     */
    public boolean isExist(AccountDTO acc){
        try {
            Connection con = ConnectDB.getCon();
            String sql = "select * from account where username = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            //luu thong tin vao table
            pst.setString(1, acc.getUsername());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) //da ton tai acc
                return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /**
     * KIEM TRA LOGIN
     * @param acc
     * @return 
     */
    public boolean isExistAcc(AccountDTO acc){
        try {
            Connection con = ConnectDB.getCon();
            String sql = "select * from account where username = ? and password = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            //luu thong tin vao table
            pst.setString(1, acc.getUsername());
            pst.setString(2, acc.getPassword());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) //da ton tai acc
                return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean Update(AccountDTO acc) {
        try {
            Connection con = ConnectDB.getCon();
            String sql = "update account set password = ? where username =?";
            PreparedStatement pst = con.prepareStatement(sql);

            //ma hoa pass
            String result = "";
            MessageDigest digest;
            try {
                digest = MessageDigest.getInstance("MD5");
                digest.update(acc.getPassword().getBytes());
                BigInteger bigInteger = new BigInteger(1, digest.digest());
                result = bigInteger.toString(16);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            //luu thong tin vao table
            pst.setString(2, acc.getUsername());
            pst.setString(1, result);
            if (pst.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
