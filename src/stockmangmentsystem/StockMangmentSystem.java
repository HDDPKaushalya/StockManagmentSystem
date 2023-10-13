/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stockmangmentsystem;

import java.time.LocalDateTime;

/**
 *
 * @author H.D.Dakshina Prasad
 */
public class StockMangmentSystem {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login login  = new Login();
        login.setVisible(true);
        login.setTitle("Login");
        login.setResizable(false);
        login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE );
        
        
        System.out.println(LocalDateTime.now());
    }
    
}
