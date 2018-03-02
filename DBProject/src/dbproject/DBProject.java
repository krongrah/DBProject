/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Krongrah
 */
public class DBProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
        void connectToDatabase(){
    try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }


        String url = "jdbc:postgresql://horton.elephantsql.com:5432/baasu";
        String username = "tilfjjea";
        String password = "tC0sMMGx8EH6KyQ7CRBVEIUVzC82C8Zv";





        try (Connection con = DriverManager.getConnection(url, username, password)){
            

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from test3");
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
 

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    
    List first(){
    
    return null;
    }
    
    List second(){
    
    return null;
    }
    
    List third(){
    
    return null;
    }
    
    List fourth(int number){
        
    return null;
    }
    
}
