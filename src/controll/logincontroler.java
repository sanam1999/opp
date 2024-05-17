/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controll;


import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.Home;

/**
 *
 * @author sanam
 */
public class logincontroler {

    public void login(String email, String password) {
         
        System.out.println(email + password);
        ResultSet rs = DBSearch.DBSearcht(email);
        
        try {
            
            if(password.equals(rs.getString("password"))){
                
        Home h1 = new Home();
        h1.setVisible(true);
        h1.pack();
        h1.setLocationRelativeTo(null);
       // this.dispose();
            }else{
                System.out.println("invalid password");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
