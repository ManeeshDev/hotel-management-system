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
public class CustomersTable {
    
    public static void createCustomersTable(Statement stmt) throws SQLException {
        
        stmt.executeUpdate("CREATE TABLE customers("
                    + "id int NOT NULL AUTO_INCREMENT, "
                    + "name varchar(255), "
                    + "mobile varchar(10), "
                    + "nationality varchar(255), "
                    + "gender varchar(20), "
                    + "email varchar(255), "
                    + "id_proof varchar(255), "
                    + "address varchar(255), "
                    + "check_in varchar(20), "
                    + "room_no varchar(10), "
                    + "bed varchar(255), "
                    + "room_type varchar(255), "
                    + "price_per_day int(11), "
                    + "no_of_days_stay int(11), "
                    + "total_amount varchar(255), "
                    + "check_out varchar(20), "
                    + "PRIMARY KEY (id) )"
        );
        
    }

}
