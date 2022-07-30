/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.configs.runEnvironment;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import project.configs.Config;

/**
 *
 * @author maneesh
 */
public class CreateDatabase {
    
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
      
        Connection con = null;
        Statement stmt = null;
        
        String mysqlUrl = Config.getMySqlUrl();
        String dbName = Config.getDbName();
        String dbUserName = Config.getDbUserName();
        String dbPassword = Config.getDbPassword();
        
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            
            con = DriverManager.getConnection(mysqlUrl, dbUserName, dbPassword);
            
            System.out.println("Connection established......");
            
            stmt = con.createStatement();
            
            String query = "CREATE DATABASE " + dbName;
            
            stmt.execute(query);
      
            System.out.println("Database created.");
           
            JOptionPane.showMessageDialog(null, "Database created successfully.!");
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        } finally {
            try {
                con.close();
                stmt.close();
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
   }
    
}
