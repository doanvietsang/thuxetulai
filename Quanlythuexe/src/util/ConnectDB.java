/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Le Tran Quang Huy
 */
public class ConnectDB {
    /*
    B1. Copy file sql.jar vào thư mục lib
    B2. Add file jar này vào library của netbeans
    B3. Enable cổng 1433 trong sql server
    B4. test ket noi trong netbeans
    */
    //tao ket noi den SQL server
    public static Connection getCon(){
        try {
            //tai driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DICHVU_TX", "sa", "123");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * dong connection
     * @param args 
     */
    public static void closedCon(Connection con){
        try {
            if(!con.isClosed()) //neu chua dong connection
                con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        if(ConnectDB.getCon() != null)
            System.out.println("ok");
        else System.out.println("not ok");
    }
}
