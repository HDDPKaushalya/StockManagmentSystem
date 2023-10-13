/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stockmangmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author H.D.Dakshina Prasad
 */
public class Mysql {
        public Connection con;
        public Statement  st;
        public ResultSet  rs;
        public PreparedStatement in = null;
    
    public Mysql(){
                try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systemstock","root","Dakshina@123@345");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Createaccount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Createaccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    }
    

