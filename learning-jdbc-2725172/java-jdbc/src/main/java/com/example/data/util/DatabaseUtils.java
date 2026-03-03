package com.example.data.util;

import java.sql.Connection;
import java.util.logging.Logger;

public class DatabaseUtils {
  private static final String URL = "jdbc:postgresql://localhost:5432/localdb"; 
  private static final String USERNAME = "postgres";
  private static final String PASSWORD = "#1/m@34Bv";
  private static final Logger LOGGER = Logger.getLogger(DatabaseUtils.class.getName());
  private static final String exceptionFormat = "exception in %s, message: %s, code: %s ";
  private static Connection connection;

  public static Connection getConnection(){
      if(connection == null){
        synchronized (DatabaseUtils) {
            
        }
      }
  }


}
