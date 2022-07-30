/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.management.system;

import project.views.Login;
import project.views.Welcome;

/**
 *
 * @author maneesh
 */
public class HotelManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ManeeshDev - hotel-management-system");

        Welcome welcome = new Welcome();
        welcome.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                welcome.percent.setText(Integer.toString(i)+"%");
                
                Login log = new Login();
                
                if (i == 70) {
                   welcome.systemLoad.setText("System Starting. . .");
                   
                } else if (i == 100) {
                    log.show();
                    welcome.setVisible(false);  
                   
                }
            }  
        } catch(InterruptedException e) {}
        
    }
    
}
