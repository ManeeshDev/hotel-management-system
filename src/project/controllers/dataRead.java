/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.controllers;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import project.configs.ConnectionProvider;

/**
 *
 * @author maneesh
 */
public class DataRead {
    
    public static ResultSet getData(String query) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rSet = null;
        try {
            con = ConnectionProvider.getConnection();
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            return rSet;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static ResultSet getData(String query, JFrame thisJF) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rSet = null;
        try {
            con = ConnectionProvider.getConnection();
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            return rSet;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(thisJF, e);
            return null;
        }
    }
    
}
