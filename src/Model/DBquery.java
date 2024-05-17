///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Model;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DBquery {
//    public static ResultSet searchUser(String email) {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        ResultSet rs = null;
//        
// return rs;
//    }
//
////    public static boolean createUser(String name, String email, String password) {
////        Connection connection = null;
////        PreparedStatement statement = null;
////        
////        try {
////            connection = DBConnection.getConnection();
////            statement = connection.prepareStatement("INSERT INTO user (name, email, password) VALUES (?, ?, ?)");
////            statement.setString(1, name);
////            statement.setString(2, email);
////            statement.setString(3, password);
////            
////            int rowsInserted = statement.executeUpdate();
////            
////            return rowsInserted > 0;
////        } catch (SQLException e) {
////            e.printStackTrace();
////            return false;
////        } finally {
////            try {
////                if (statement != null) statement.close();
////                if (connection != null) connection.close();
////            } catch (SQLException e) {
////                e.printStackTrace();
////            }
////        }
////    }
//}


package Model;

import java.sql.ResultSet;
import java.sql.Statement;


public class DBSearch {
    Statement stmt;
    ResultSet rs;
    
    public ResultSet DBSearcht(String email){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT email from library WHERE email ='" + email + "'");
        } catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet searchStudents(){
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM student");
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
}
