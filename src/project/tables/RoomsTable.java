/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.tables;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maneesh
 */
public class RoomsTable {
    
    public static void createRoomsTable(Statement stmt) throws SQLException {
        
        stmt.executeUpdate(
                "CREATE TABLE rooms("
                        + "id int NOT NULL AUTO_INCREMENT, "
                        + "room_no varchar(10), "
                        + "room_type varchar(255), "
                        + "bed varchar(255), "
                        + "price int, "
                        + "status varchar(20), "
                        + "PRIMARY KEY (id) )"
        );
        
    }
    
}
