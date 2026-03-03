package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

   public static Connection getConnection(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
        
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "1234"
            );

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
   


}
