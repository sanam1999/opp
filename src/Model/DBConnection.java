/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/studentdb";
            conn = DriverManager.getConnection(url, "root", "");
            stat = conn.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
        return stat;
    }
    public static void closecon()throws SQLException{
        conn.close();
    }
}
