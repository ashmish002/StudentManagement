package com.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
   public static boolean insertstudentToDB(student st)
   
   {  boolean f=false;
   
	   try {
	   // jdbc code..
	   Connection con=ConnectionProvider.createC();
	   String q="insert into students(sname,sphone,scity) values(?,?,?)";
	   
	   // prepared statement
	   PreparedStatement pstmt=con.prepareStatement(q);
	   
	   //setting the values
	   pstmt.setString(1, st.getStudentName());
	   pstmt.setString(2, st.getStudentPhone());
	   pstmt.setString(3, st.getStudentCity());
	   
	   //execute..
	   pstmt.executeUpdate();
	   f=true;
	   
	   } catch(Exception e) {
		   e.printStackTrace();
	   }
	   return f;
   }

public static boolean deleteStudent(int userId) {
	// TODO Auto-generated method stub
	
	 boolean f=false;
	   
	   try {
	   // jdbc code..
	   Connection con=ConnectionProvider.createC();
	   String q="delete from students where sid=?";
	   
	   // prepared statement
	   PreparedStatement pstmt=con.prepareStatement(q);
	   
	   //setting the values
	   pstmt.setInt(1, userId);
	  
	   
	   //execute..
	   pstmt.executeUpdate();
	   f=true;
	   
	   } catch(Exception e) {
		   e.printStackTrace();
	   }
	   return f;
}

public static void showAllStudent() {
	// TODO Auto-generated method stub
	
	   try {
	   // jdbc code..
	   Connection con=ConnectionProvider.createC();
	   String q="select*from students";
	   
	  //statement
	   Statement stmt=con.createStatement();
	   
	   ResultSet set = stmt.executeQuery(q);
	   
	   while(set.next())
	   {
		   int id=set.getInt(1);
		   String name=set.getString(2);
		   String phone=set.getString(3);
		   String city=set.getString(4);
		   
		   
		   System.out.println("ID : "+id);
		   System.out.println("NAME : "+name);
		   System.out.println("PHONE : "+phone);
		   System.out.println("CITY : "+city);
		   
		   System.out.println("****************************");
		   
	   }
	   
	   
	   } catch(Exception e) {
		   e.printStackTrace();
	   }
	   
}

public static boolean deleteAll() {
	// TODO Auto-generated method stub
	boolean x=false;
	try {
		   // jdbc code..
		   Connection con=ConnectionProvider.createC();
		   String q="delete from students";
		   
		  //statement
		   Statement stmt=con.createStatement();
		   
		   stmt.executeUpdate(q);
		   x=true; 
		   
		   } catch(Exception e) {
			   e.printStackTrace();
		   }
	return x;
}
}
