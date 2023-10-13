/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stockmangmentsystem;

/**
 *
 * @author H.D.Dakshina Prasad
 */
class User {
    private String Gmail;
    private String password;
    private String login_Time;
    private String logout_Time;
    
    public User(String Gmail,String password,String login_Time,String logout_Time){
        this.Gmail = Gmail;
        this.login_Time = login_Time;
        this.logout_Time = logout_Time;
        this.password = password;
        
    }
    
    public String  getGmail(){
    return Gmail;
    }
    public String getpass(){
        return password;
    }
    public String login_Time(){
        return login_Time;
    }
    public String logout_Time(){
        return logout_Time;
    }
    
    
}
