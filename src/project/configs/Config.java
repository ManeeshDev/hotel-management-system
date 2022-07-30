/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.configs;

/**
 *
 * @author maneesh
 */
public class Config {
    
    private static final String MYSQL_Url = "jdbc:mysql://127.0.0.1";
    private static final String DB_NAME = "hms_software";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    
    public static String getMySqlUrl() {
        return MYSQL_Url;
    }
    
    public static String getDbName() {
        return DB_NAME;
    }
    
    public static String getDbUserName() {
        return DB_USERNAME;
    }
    
    public static String getDbPassword() {
        return DB_PASSWORD;
    }
    
}
