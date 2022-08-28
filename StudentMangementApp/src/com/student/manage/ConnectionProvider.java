package com.student.manage;
import java.sql.Connection; //all libraries of JDBC are in connection package
import java.sql.DriverManager;
public class ConnectionProvider
{
	static Connection con;  //variable of type connection to store the connection;
    public static Connection createC()
    {
    	try
    	{
    		//load the driver
    	  Class.forName("com.mysql.jdbc.Driver");
    	  
    	   //step 2 : creating connection ....
    	  String user="root";
    	  String password="ashmish";
    	  String url="jdbc:mysql://localhost:3306/student_manage";
    	  
    	  con=DriverManager.getConnection(url, user, password);
    	  
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	return con;
    }
}
