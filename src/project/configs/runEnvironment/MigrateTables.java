/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.configs.runEnvironment;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import project.configs.ConnectionProvider;
import project.tables.*;

/**
 *
 * @author maneesh
 */
public class MigrateTables {
    
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null; 
        try {
            con = ConnectionProvider.getConnection();
            stmt = con.createStatement();
            
            UsersTable.createUsersTable(stmt);
            
            RoomsTable.createRoomsTable(stmt);
            
            CustomersTable.createCustomersTable(stmt);

            JOptionPane.showMessageDialog(null, "Tables created successfully.!");
            
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
