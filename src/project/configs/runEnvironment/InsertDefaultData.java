/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.configs.runEnvironment;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.configs.ConnectionProvider;

/**
 *
 * @author maneesh
 */
public class InsertDefaultData {
    
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null; 
        try {
            con = ConnectionProvider.getConnection();
            stmt = con.createStatement();
            
            stmt.executeUpdate("INSERT INTO users(name, email, password, security_question, answer, address, status, user_type) "
                    + "VALUES('Admin User','admin@hms.com','admin123','What was your first car?','hummer','admin address','true','admin')");
            
            stmt.executeUpdate("INSERT INTO users(name, email, password, security_question, answer, address, status, user_type) "
                    + "VALUES('User','user@hms.com','user123','What was your first car?','bmw','user address','false','user')");

            JOptionPane.showMessageDialog(null, "Default data insert successfully.!");
            
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
