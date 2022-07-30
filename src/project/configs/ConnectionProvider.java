/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maneesh
 */
public class ConnectionProvider {
    
    public static Connection getConnection() {
        
        String mysqlUrl = Config.getMySqlUrl();
        String dbName = Config.getDbName();
        String dbUserName = Config.getDbUserName();
        String dbPassword = Config.getDbPassword();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(mysqlUrl + ":3306/" +dbName, dbUserName, dbPassword);
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("SQLException -" + e.getMessage());
            return null;
        }
    }
    
}
