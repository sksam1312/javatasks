package com.jdbc;
import java.sql.*;
import  java.util.logging.*;
import java.util.Scanner;

public class JdbcDemo{

private static final Logger logger=Logger.getLogger("JdbcDemo.class");
private Scanner sc=new Scanner(System.in);
String url="jdbc:mysql://localhost:3306/";
String user="root";
String pwd="12345";

public void deleteDB(String db){
try{
String query="DROP DATABASE IF EXISTS "+db;
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(query);
st.close();
con.close();
logger.log(Level.INFO,"Database instance deleted successfully");
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}

}


public void createDB(String db){
try{
String query="CREATE DATABASE IF NOT EXISTS "+db;
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(query);
st.close();
con.close();
logger.log(Level.INFO,"Database instance 'incubation' created successfully");
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}

}

public void createTable(){
url="jdbc:mysql://localhost:3306/incubationDB";
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
url="jdbc:mysql://localhost:3306/incubationDB";
try{
String query="INSERT INTO Employee(NAME,MOBILE,EMAIL,DEPARTMENT) VALUES (?,?,?,?)";
Connection con = DriverManager.getConnection(url,user,pwd);
PreparedStatement ps=con.prepareStatement(query);
for(int i=1;i<=10;i++){
logger.log(Level.INFO,"Enter record for EMPLOYEE_ID: "+i);
logger.log(Level.INFO,"Enter a Name:");
String name=sc.nextLine();
logger.log(Level.INFO,"Enter Mobile number:");
String mobile=sc.nextLine();
logger.log(Level.INFO,"Enter an EmailID:");
String email=sc.nextLine();
logger.log(Level.INFO,"Enter Department:");
String dept=sc.nextLine();
ps.setString(1,name);
ps.setString(2,mobile);
ps.setString(3,email);
ps.setString(4,dept);
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
url="jdbc:mysql://localhost:3306/incubationDB";
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
url="jdbc:mysql://localhost:3306/incubationDB";
try{
logger.log(Level.INFO,"Enter an EMPLOYEE_ID to update:");
String empid=sc.nextLine();
logger.log(Level.INFO,"Enter a Name to update for EMPLOYEE_ID:"+empid);
String name=sc.nextLine();
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
url="jdbc:mysql://localhost:3306/incubationDB";
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
url="jdbc:mysql://localhost:3306/incubationDB";
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
url="jdbc:mysql://localhost:3306/incubationDB";
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
public void createDependentTable(){
url="jdbc:mysql://localhost:3306/incubationDB";
try{
String query="CREATE TABLE Dependent("+"NAME VARCHAR(15) NOT NULL,"+"AGE INT,"+"RELATIONSHIP VARCHAR(50),"+"EMPLOYEE_ID INT,"+"FOREIGN KEY(EMPLOYEE_ID) REFERENCES employee(EMPLOYEE_ID)"+")";
Connection con = DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(query);
st.close();
con.close();
logger.log(Level.INFO,"Dependent table created successfully");
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
public void insertDependentRecords(){
url="jdbc:mysql://localhost:3306/incubationDB";
try{
String query="INSERT INTO dependent(NAME,AGE,RELATIONSHIP,EMPLOYEE_ID) VALUES (?,?,?,?)";
Connection con = DriverManager.getConnection(url,user,pwd);
PreparedStatement ps=con.prepareStatement(query);
for(int i=1;i<=3;i++){
logger.log(Level.INFO,"Enter record for EMPLOYEE_ID: "+i);
logger.log(Level.INFO,"Enter a Name:");
String name=sc.nextLine();
logger.log(Level.INFO,"Enter Age:");
String age=sc.nextLine();
logger.log(Level.INFO,"Enter Relationship:");
String relationship=sc.nextLine();
logger.log(Level.INFO,"Enter Employee_id:");
String empid=sc.nextLine();
ps.setString(1,name);
ps.setString(2,age);
ps.setString(3,relationship);
ps.setString(4,empid);
ps.executeUpdate();
}
logger.log(Level.INFO,"Records inserted in Dependent table successfully");
ps.close();
con.close();
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}

public void listDependentDetails(){
url="jdbc:mysql://localhost:3306/incubationDB";
try{
logger.log(Level.INFO,"Enter an EMPLOYEE_ID to retreive record:");
int empid=sc.nextInt();
String query="SELECT Employee.EMPLOYEE_ID, Employee.NAME AS EMPLOYEE_NAME, " +"Employee.MOBILE, Employee.EMAIL, Employee.DEPARTMENT, " +"Dependent.NAME AS DEPENDENT_NAME, Dependent.AGE, " +"Dependent.RELATIONSHIP " +" FROM employee "+"LEFT JOIN Dependent ON Employee.EMPLOYEE_ID = Dependent.EMPLOYEE_ID"+" WHERE Employee.EMPLOYEE_ID = ?"; 
Connection con = DriverManager.getConnection(url,user,pwd);
PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1, empid);
ResultSet rs=ps.executeQuery();
logger.log(Level.INFO,"A record is retrieved from Employee table based on EMPLOYEE_ID:"+empid+" successfully");
while (rs.next()) {
logger.log(Level.INFO,"Employee ID: " + rs.getInt("EMPLOYEE_ID"));
logger.log(Level.INFO,"Name: " + rs.getString("EMPLOYEE_NAME"));
logger.log(Level.INFO,"Mobile: " + rs.getString("MOBILE"));
logger.log(Level.INFO,"Email: " + rs.getString("EMAIL"));
logger.log(Level.INFO,"Department: " + rs.getString("DEPARTMENT"));
logger.log(Level.INFO,"Dependent Name: " + rs.getString("DEPENDENT_NAME"));
logger.log(Level.INFO,"Dependent age: " + rs.getInt("AGE"));
logger.log(Level.INFO,"Dependent relationship: " + rs.getString("RELATIONSHIP"));
}
rs.close();
ps.close();
con.close();
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}

public void displayDependentDetails(){
url="jdbc:mysql://localhost:3306/incubationDB";
try{
logger.log(Level.INFO,"Enter a number to print N employees data:" );
int n=sc.nextInt();
logger.log(Level.INFO,"First "+n+" numbers of employees data:-" );
String query="SELECT * FROM (" +
                "SELECT Employee.EMPLOYEE_ID, Employee.NAME AS EMPLOYEE_NAME, " +
                "Employee.MOBILE, Employee.EMAIL, Employee.DEPARTMENT, " +
                "dependent.NAME AS DEPENDENT_NAME, dependent.AGE, " +
                "dependent.RELATIONSHIP " +
                "FROM Employee " +
                "LEFT JOIN dependent ON Employee.EMPLOYEE_ID = dependent.EMPLOYEE_ID " +
                "LIMIT " + n +
                ") AS subquery " +
                "ORDER BY EMPLOYEE_NAME ASC";
Connection con = DriverManager.getConnection(url,user,pwd);
PreparedStatement ps=con.prepareStatement(query);
ResultSet rs=ps.executeQuery();
while(rs.next()){
logger.log(Level.INFO,"Employee ID: " + rs.getInt("EMPLOYEE_ID"));
logger.log(Level.INFO,"Name: " + rs.getString("EMPLOYEE_NAME"));
logger.log(Level.INFO,"Mobile: " + rs.getString("MOBILE"));
logger.log(Level.INFO,"Email: " + rs.getString("EMAIL"));
logger.log(Level.INFO,"Department: " + rs.getString("DEPARTMENT"));
logger.log(Level.INFO,"Dependent Name: " + rs.getString("DEPENDENT_NAME"));
logger.log(Level.INFO,"Dependent age: " + rs.getInt("AGE"));
logger.log(Level.INFO,"Dependent relationship: " + rs.getString("RELATIONSHIP"));
logger.log(Level.INFO,"");
}
rs.close();
ps.close();
con.close();
}
catch(Exception e){
logger.log(Level.SEVERE,"SQL Exception caught: ",e);
}
}
}