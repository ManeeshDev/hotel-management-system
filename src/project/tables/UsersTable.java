/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.tables;

import java.sql.*;

/**
 *
 * @author maneesh
 */
public class UsersTable {
    
    public static void createUsersTable(Statement stmt) throws SQLException {
        
        stmt.executeUpdate(
                "CREATE TABLE users("
                        + "id int NOT NULL AUTO_INCREMENT, "
                        + "name varchar(255), "
                        + "email varchar(255), "
                        + "password varchar(50), "
                        + "security_question varchar(255), "
                        + "answer varchar(255), "
                        + "address varchar(255), "
                        + "status varchar(20), "
                        + "user_type varchar(50), "
                        + "PRIMARY KEY (id) )"
        );
        
    }

}
