package com.student.manage;

import java.util.*;
import java.io.*;
public class start {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
         System.out.println("...WELCOME TO STUDENT MANAGEMENT APP....");
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
         while(true)
         {
        	 System.out.println("press 1 to add student");
        	 System.out.println("press 2 to delete student");
        	 System.out.println("press 3 to display student");
        	 System.out.println("press 4 to exit app");
        	 System.out.println("press 5 to delete all student details");
        	 
        	 int c=Integer.parseInt(br.readLine());
        	 
        	 if(c==1)
        	 {
        		 //add student
        		 System.out.println("enter the name of user");
        		 String name=br.readLine();
        		 System.out.println("enter phone numberr");
        		 String phone=br.readLine();
        		 System.out.println("enter the name of city");
        		 String city=br.readLine();
        		 
        		 // create student object
        		 student st=new student(name,phone,city);
        		
        		 boolean answer= StudentDao.insertstudentToDB(st);
        		 if(answer)
        		 {
        			 System.out.println("successfully added");
        		 }
        		 else
        			 System.out.println("something went wrong");
        		 System.out.println(st);
        	 }
        	 else if(c==2)
        	 {
        		 //delete student
        		 System.out.println("Enter the student id to delete : ");
        		 int userId=Integer.parseInt(br.readLine());
        		 boolean f = StudentDao.deleteStudent(userId);
        		 if(f) 
        		   System.out.println("deleted..");
        		 else
          		   System.out.println("something went wrong");
        		 
        		 
        	 }
        	 else if(c==3)
        	 {
        		 //display student
        		 StudentDao.showAllStudent();
        	 }
        	 else if(c==4)
        	 {
        		 //exit
        		break; 
        	 }
        	 else if(c==5)
        	 {
        		boolean x= StudentDao.deleteAll();
        		if(x)
        			 System.out.println("Deleted all Students information.");
        		else
        			 System.out.println("Sorry something went wrong");
        	 }
        	 else 
        		 System.out.println("invalid option!! please enter valid option");
        	
         }
         System.out.println("THANK YOU for using the app");
	}

}

