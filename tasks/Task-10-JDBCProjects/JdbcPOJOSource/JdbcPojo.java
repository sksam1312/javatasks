package com.jdbc;
import java.sql.*;
import  java.util.logging.*;
import java.util.Scanner;

public class JdbcPojo{

private String name;
private String mobile;
private String email;
private String department;
private static final Logger logger=Logger.getLogger("JdbcPojo.class");
private Scanner sc=new Scanner(System.in);
private String url="jdbc:mysql://localhost:3306/";
private String user="root";
private String pwd="12345";


public JdbcPojo(){

}
public JdbcPojo(String name,String mobile,String email,String department){
this.name=name;
this.mobile=mobile;
this.email=email;
this.department=department;
}


public void setName(String name){
this.name=name;
}
public void setMobile(String mobile){
this.mobile=mobile;
}
public void setEmail(String email){
this.email=email;
}
public void setDepartment(String dept){
this.department=dept;
}
public String getName(){
return name;
}
public String getMobile(){
return mobile;
}
public String getEmail(){
return email;
}
public String getDepartment(){
return department;
}

public void createDB(String db){
try{
String query="CREATE DATABASE IF NOT EXISTS "+db;
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(query);
st.close();
con.close();
logger.log(Level.INFO,"Database instance 'pojodb' created successfully");
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}

}
public void createTable(){
url="jdbc:mysql://localhost:3306/pojodb";
try{
String query="CREATE TABLE Employee("+"EMPLOYEE_ID INT PRIMARY KEY AUTO_INCREMENT,"+"NAME VARCHAR(15) NOT NULL,"+"MOBILE VARCHAR(10),"+"EMAIL VARCHAR(50),"+"DEPARTMENT VARCHAR(10)"+")";
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(query);
st.close();
con.close();
logger.log(Level.INFO,"Employee table created successfully");
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
public void insertRecords(){
url="jdbc:mysql://localhost:3306/pojodb";
try{
String query="INSERT INTO Employee(NAME,MOBILE,EMAIL,DEPARTMENT) VALUES (?,?,?,?)";
Connection con = DriverManager.getConnection(url,user,pwd);
PreparedStatement ps=con.prepareStatement(query);
for(int i=1;i<=5;i++){
logger.log(Level.INFO,"Enter record for EMPLOYEE_ID: "+i);
logger.log(Level.INFO,"Enter a Name:");
String name=sc.nextLine();
logger.log(Level.INFO,"Enter Mobile number:");
String mobile=sc.nextLine();
logger.log(Level.INFO,"Enter an EmailID:");
String email=sc.nextLine();
logger.log(Level.INFO,"Enter Department:");
String department=sc.nextLine();
JdbcPojo jp=new JdbcPojo(name,mobile,email,department);
ps.setString(1,jp.getName());
ps.setString(2,jp.getMobile());
ps.setString(3,jp.getEmail());
ps.setString(4,jp.getDepartment());
ps.executeUpdate();
}
logger.log(Level.INFO,"Records inserted in Employee table successfully");
ps.close();
con.close();
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
public void retreiveRecord(){
url="jdbc:mysql://localhost:3306/pojodb";
try{
logger.log(Level.INFO,"Enter an EMPLOYEE_ID to retreive:");
String empid=sc.nextLine();
String query="SELECT * FROM Employee WHERE EMPLOYEE_ID="+empid; 
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
logger.log(Level.INFO,"A record is retrieved from Employee table based on EMPLOYEE_ID:"+empid+" successfully");
while (rs.next()) {
logger.log(Level.INFO,"Employee ID: " + rs.getInt("EMPLOYEE_ID"));
logger.log(Level.INFO,"Name: " + rs.getString("NAME"));
logger.log(Level.INFO,"Mobile: " + rs.getString("MOBILE"));
logger.log(Level.INFO,"Email: " + rs.getString("EMAIL"));
logger.log(Level.INFO,"Department: " + rs.getString("DEPARTMENT"));
}
rs.close();
st.close();
con.close();
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
public void updateRecord(){
url="jdbc:mysql://localhost:3306/pojodb";
try{
logger.log(Level.INFO,"Enter an EMPLOYEE_ID to update:");
String empid=sc.nextLine();
logger.log(Level.INFO,"Enter a Name to update for EMPLOYEE_ID:"+empid);
name=sc.nextLine();
String query="UPDATE Employee SET NAME='"+name+"' WHERE EMPLOYEE_ID="+empid;
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(query);
st.close();
con.close();
logger.log(Level.INFO,"Employee name updated for EMPLOYEE_ID:"+empid+" successfully");
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
public void printRecords(){
url="jdbc:mysql://localhost:3306/pojodb";
try{
logger.log(Level.INFO,"Enter a number to print N employees data:" );
int a=sc.nextInt();
logger.log(Level.INFO,"First "+a+" numbers of employees data:-" );
String query="SELECT * FROM Employee LIMIT ? ";
Connection con = DriverManager.getConnection(url,user,pwd);
PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1,a);
ResultSet rs=ps.executeQuery();
while(rs.next()){
logger.log(Level.INFO,"Employee_ID: "+rs.getInt("EMPLOYEE_ID"));
logger.log(Level.INFO,"Name: "+rs.getString("NAME"));
logger.log(Level.INFO,"Mobile: "+rs.getString("MOBILE"));
logger.log(Level.INFO,"Email: "+rs.getString("EMAIL"));
logger.log(Level.INFO,"Department: "+rs.getString("DEPARTMENT"));
logger.log(Level.INFO," ");
}
rs.close();
ps.close();
con.close();
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}

public void printRecordsDesc(){
url="jdbc:mysql://localhost:3306/pojodb";
try{
logger.log(Level.INFO,"Enter a number to print N employees data ordered by descending:" );
int a=sc.nextInt();
logger.log(Level.INFO,"First "+a+" numbers of employees data:-" );
String query="SELECT * FROM Employee ORDER BY NAME DESC LIMIT ? ";
Connection con = DriverManager.getConnection(url,user,pwd);
PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1,a);
ResultSet rs=ps.executeQuery();
while(rs.next()){
logger.log(Level.INFO,"Employee_ID: "+rs.getInt("EMPLOYEE_ID"));
logger.log(Level.INFO,"Name: "+rs.getString("NAME"));
logger.log(Level.INFO,"Mobile: "+rs.getString("MOBILE"));
logger.log(Level.INFO,"Email: "+rs.getString("EMAIL"));
logger.log(Level.INFO,"Department: "+rs.getString("DEPARTMENT"));
logger.log(Level.INFO," ");
}
rs.close();
ps.close();
con.close();
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
public void deleteRecord(){
url="jdbc:mysql://localhost:3306/pojodb";
try{
logger.log(Level.INFO,"Enter an EMPLOYEE_ID to delete record:");
String empid=sc.nextLine();
String query="DELETE FROM Employee WHERE EMPLOYEE_ID ="+empid;
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(query);
st.close();
con.close();
logger.log(Level.INFO,"Employee record of EMPLOYEE_ID:"+empid+" deleted successfully");
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
}

