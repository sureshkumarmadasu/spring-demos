package com.samples.spring.demo;
public class Student 
{
int sid;
String sname;
double percentage;
Department department;
 
public Student()
{
	System.out.println("Student Object Created");
}
public Student(Department department)
{
	this.department=department;
}

public Student(int sid, String sname, double percentage, Department department)
{
	super();
	this.sid = sid;
	this.sname = sname;
	this.percentage = percentage;
	this.department = department;
}




/**
 * @return the sid
 */
public int getSid() {
	return sid;
}
/**
 * @param sid the sid to set
 */
public void setSid(int sid) {
	this.sid = sid;
}
/**
 * @return the sname
 */
public String getSname() {
	return sname;
}
/**
 * @param sname the sname to set
 */
public void setSname(String sname) {
	this.sname = sname;
}
/**
 * @return the percentage
 */
public double getPercentage() {
	return percentage;
}
/**
 * @param percentage the percentage to set
 */
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
/**
 * @return the department
 */
public Department getDepartment() {
	return department;
}
/**
 * @param department the department to set
 */
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Student [id=" + sid + ", name=" + sname + ", percentage=" + percentage + ", department=" + department + "]";
}

}
