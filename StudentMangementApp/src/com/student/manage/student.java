package com.student.manage;

public class student 
{
   private int StudentId;
   private String StudentName;
   private String StudentPhone;
   private String StudentCity;

public student(int studentId, String studentName, String studentPhone, String studentCity) {
	super();
	this.StudentId = studentId;
	this.StudentName = studentName;
	this.StudentPhone = studentPhone;
	this.StudentCity = studentCity;
}

public student(String studentName, String studentPhone, String studentCity) {
	super();
	this.StudentName = studentName;
	this.StudentPhone = studentPhone;
	this.StudentCity = studentCity;
}


public student() {
	super();
	// TODO Auto-generated constructor stub
}



@Override
public String toString() {
	return "student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
			+ ", StudentCity=" + StudentCity + "]";
}

/**
 * @return the studentId
 */
public int getStudentId() {
	return StudentId;
}

/**
 * @param studentId the studentId to set
 */
public void setStudentId(int studentId) {
	StudentId = studentId;
}

/**
 * @return the studentName
 */
public String getStudentName() {
	return StudentName;
}

/**
 * @param studentName the studentName to set
 */
public void setStudentName(String studentName) {
	StudentName = studentName;
}

/**
 * @return the studentPhone
 */
public String getStudentPhone() {
	return StudentPhone;
}

/**
 * @param studentPhone the studentPhone to set
 */
public void setStudentPhone(String studentPhone) {
	StudentPhone = studentPhone;
}

/**
 * @return the studentCity
 */
public String getStudentCity() {
	return StudentCity;
}

/**
 * @param studentCity the studentCity to set
 */
public void setStudentCity(String studentCity) {
	StudentCity = studentCity;
}
   
   
}
