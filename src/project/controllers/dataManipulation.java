/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.controllers;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import project.configs.ConnectionProvider;

/**
 *
 * @author maneesh
 */
public class DataManipulation {
    
    public static void setData(String query, String msg) {
         Connection con = null;
         Statement stmt = null;
         try {
             con = ConnectionProvider.getConnection();
             stmt = con.createStatement();
             stmt.executeUpdate(query);
             if (!msg.equals("")) {
                 JOptionPane.showMessageDialog(null, msg);
             }
             
         } catch (HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(null, e);
         } finally {
             
         }
    }
    
    public static void setData(String query, String msg, JFrame thisJF) {
         Connection con = null;
         Statement stmt = null;
         try {
             con = ConnectionProvider.getConnection();
             stmt = con.createStatement();
             stmt.executeUpdate(query);
             if (!msg.equals("")) {
                 JOptionPane.showMessageDialog(thisJF, msg);
             }
             
         } catch (HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(thisJF, e);
         } finally {
             
         }
    }
    
}
