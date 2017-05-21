package com.examsys;

import java.sql.*;

public class Experiments
{

  public static void main(String[] args)
  {
    try
    {
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/ExamSYS";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM questions";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
        String name = rs.getString("name");
        
        // print the results
        System.out.format("%s\n", name);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}