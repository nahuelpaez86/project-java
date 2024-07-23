/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import parcial2.Views.DashboardView;
import parcial2.Views.LoginView;

/**
 *
 * @author Usuario
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoginView login = new LoginView(); 
        login.setVisible (true); 
        // centrar jframe
        login.setLocationRelativeTo(null); 
    }
    
}
