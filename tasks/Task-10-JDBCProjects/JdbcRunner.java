package com.jdbc;

import java.util.Scanner;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.utility.InvalidDataException;


public class JdbcRunner{

private static final Logger logger = Logger.getLogger(ThreadRunner.class.getName());

public static void main(String[] args){
String url="jdbc:mysql://localhost:3306/";
String dbUrl="jdbc:mysql://localhost:3306/incubationDB";
String user="root";
String pwd="1234";
String dbName="incubationDB";
String query,name,mobile,email,department;
int rowsAffected=0;
Scanner sc=new Scanner(System.in);
JdbcProject jdbc=new JdbcProject();
Employee employee=new Employee();

try{
jdbc.createDb(url,user,pwd,dbName);
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}

try{
jdbc.deleteDb(url,user,pwd,"incubationdatabase");
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}

try{
jdbc.connectToDatabase(dbUrl,user,pwd);
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}

try{
query="CREATE TABLE Employee("+"EMPLOYEE_ID INT PRIMARY KEY AUTO_INCREMENT,"+"NAME VARCHAR(15) NOT NULL,"+"MOBILE VARCHAR(10),"+"EMAIL VARCHAR(50),"+"DEPARTMENT VARCHAR(10)"+")";
jdbc.createTable(query);
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
query="INSERT INTO Employee(NAME,MOBILE,EMAIL,DEPARTMENT) VALUES (?,?,?,?)";
for(int i=0;i<10;i++){
logger.log(Level.INFO, "Enter name of person: {0}", (i + 1));
name=sc.nextLine();
logger.log(Level.INFO, "Enter mobile of person: {0}", (i + 1));
mobile=sc.nextLine();       
logger.log(Level.INFO, "Enter email of person: {0}", (i + 1));
email=sc.nextLine();          
logger.log(Level.INFO, "Enter department of person: {0}", (i + 1));       
department=sc.nextLine();
rowsAffected=rowsAffected+jdbc.insertRecords(query,name,mobile,email,department);
}
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}



try{
logger.log(Level.INFO, "Enter name of person to retrieve their records:");
name=sc.nextLine();
employee=jdbc.retrieveRecordByName(name);
String employeeDetails=employee.displayEmployeeDetails();
logger.log(Level.INFO, employeeDetails);
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
logger.log(Level.INFO, "Enter EmployeeId of person to retrieve their records:");
int empId=sc.nextInt();
employee=jdbc.retreiveRecordById(empId);
String employeeDetails=employee.displayEmployeeDetails();
logger.log(Level.INFO, employeeDetails);
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
logger.log(Level.INFO, "Enter Employee Id of person to update their records:");
int empId=sc.nextInt();
sc.nextLine();
logger.log(Level.INFO, "Enter field of person to update in records:");
String field=sc.nextLine();
logger.log(Level.INFO, "Enter the new value of person to update in records:");
String newValue=sc.nextLine();
rowsAffected=jdbc.updateRecord(empId,field,newValue);
logger.log(Level.INFO, "{0} Record(s) updated for: {1}", new Object[]{rowsAffected, empId});
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
logger.log(Level.INFO, "Enter a number to get the first n number of records of employees:");
int number=sc.nextInt();
List<Employee> employees=jdbc.printRecords(number);
for(Employee employ:employees){
String employeeDetails=employ.displayEmployeeDetails();
logger.log(Level.INFO, employeeDetails);
}
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
logger.log(Level.INFO, "Enter a number to get the first n number of records of employees in descending order:");
int number=sc.nextInt();
List<Employee> employees=jdbc.printRecordsDesc(number);
for(Employee employ:employees){
String employeeDetails=employ.displayEmployeeDetails();
logger.log(Level.INFO, employeeDetails);
}
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}



try{
logger.log(Level.INFO, "Enter Employee Id of person to delete their records:");
int empId=sc.nextInt();
sc.nextLine();
rowsAffected=jdbc.deleteRecord(empId);
logger.log(Level.INFO, rowsAffected + " Record deleted for EmployeeId: " + empId);
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}

try{
query="CREATE TABLE Dependent("+"NAME VARCHAR(15) NOT NULL,"+"AGE INT,"+"RELATIONSHIP VARCHAR(50),"+"EMPLOYEE_ID INT,"+"FOREIGN KEY(EMPLOYEE_ID) REFERENCES employee(EMPLOYEE_ID)"+")";
jdbc.createTable(query);
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
query="INSERT INTO dependent(NAME,AGE,RELATIONSHIP,EMPLOYEE_ID) VALUES (?,?,?,?)";
for(int i=0;i<4;i++){
logger.log(Level.INFO, "Enter name of person: " + (i + 1));
name=sc.nextLine();
logger.log(Level.INFO, "Enter age of person: " + (i + 1));
int age=sc.nextInt();
sc.nextLine();
logger.log(Level.INFO, "Enter relationship of person: " + (i + 1));
String relationship=sc.nextLine();
logger.log(Level.INFO, "Enter employeeId of person: " + (i + 1));
int empId=sc.nextInt();
sc.nextLine();
rowsAffected=rowsAffected+jdbc.insertDependentRecords(query,name,age,relationship,empId);
}
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
logger.log(Level.INFO, "Enter Employee Id of person to retrieve their records with dependent details:");
int empId=sc.nextInt();
employee=jdbc.listDependentDetails(empId);
logger.log(Level.INFO, "Retrieved employee details: {0}", employee);

}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}


try{
logger.log(Level.INFO, "Enter a number to get the first n number of records of employees with dependent details:");
int number=sc.nextInt();
List<Employee> employees=jdbc.displayDependentDetails(number);
for(Employee employ:employees){
logger.log(Level.INFO, "Employee details: {0}", employ);
}
}
catch(Exception exp){
logger.log(Level.SEVERE, "SQL Exception occurred: {0}", exp.getMessage());
logger.log(Level.SEVERE, "SQL Exception details: ", exp);
}

}
}