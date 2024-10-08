package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.utility.DataValidation;
import com.utility.InvalidDataException;


public class JdbcProject{

private Connection connection;


public void createDb(String url,String user,String pwd,String dbName) throws InvalidDataException{
DataValidation.nullCheck(dbName);
String query="CREATE DATABASE IF NOT EXISTS "+dbName;
try(Connection conn = DriverManager.getConnection(url,user,pwd);Statement st=conn.createStatement()){
st.executeUpdate(query);
}
catch(SQLException exp){
throw new InvalidDataException("SQL Exception caught: "+dbName,exp);
}
}


public void deleteDb(String url,String user,String pwd,String dbName) throws InvalidDataException{
DataValidation.nullCheck(dbName);
String query="DROP DATABASE IF EXISTS "+dbName;
try(Connection conn = DriverManager.getConnection(url,user,pwd);Statement st=conn.createStatement()){
st.executeUpdate(query);
}
catch(SQLException exp){
throw new InvalidDataException("SQL Exception caught: "+dbName,exp);
}
}


public void connectToDatabase(String dbUrl,String user,String pwd) throws InvalidDataException{
try{
connection=DriverManager.getConnection(dbUrl,user,pwd);
} 
catch (SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public void createTable(String query) throws InvalidDataException{
DataValidation.nullCheck(query);
try(Statement st=connection.createStatement()){
st.executeUpdate(query);
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public int insertRecords(String query,String name,String mobile,String email,String department) throws InvalidDataException{
DataValidation.nullCheck(query);
DataValidation.nullCheck(name);
DataValidation.nullCheck(mobile);
DataValidation.nullCheck(email);
DataValidation.nullCheck(department);
try(PreparedStatement ps=connection.prepareStatement(query)){
ps.setString(1,name);
ps.setString(2,mobile);
ps.setString(3,email);
ps.setString(4,department);
int rowsAffected=ps.executeUpdate();
return rowsAffected;
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public Employee retrieveRecordByName(String name) throws InvalidDataException {
DataValidation.nullCheck(name);
String query = "SELECT * FROM Employee WHERE NAME = ?";
Employee employee = null;
try (PreparedStatement ps = connection.prepareStatement(query)) {
ps.setString(1,name); 
ResultSet rs = ps.executeQuery();
if (rs.next()){
employee = new Employee(
                        rs.getInt("EMPLOYEE_ID"),
                        rs.getString("NAME"),
                        rs.getString("MOBILE"),
                        rs.getString("EMAIL"),
                        rs.getString("DEPARTMENT"));
}
return employee;
} 
catch (SQLException exp) {
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public Employee retreiveRecordById(int empId) throws InvalidDataException{
String query="SELECT * FROM Employee WHERE EMPLOYEE_ID= ?";
Employee employee=null;
try(PreparedStatement ps = connection.prepareStatement(query)) {
ps.setInt(1, empId);
ResultSet rs = ps.executeQuery();
if(rs.next()){
employee = new Employee(
                        rs.getInt("EMPLOYEE_ID"),
                        rs.getString("NAME"),
                        rs.getString("MOBILE"),
                        rs.getString("EMAIL"),
                        rs.getString("DEPARTMENT"));
}
return employee;
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public int updateRecord(int empId, String fieldToUpdate, String newValue) throws InvalidDataException {
if(!isUpdatableField(fieldToUpdate)){
throw new InvalidDataException("Invalid field: " + fieldToUpdate);
}
DataValidation.nullCheck(newValue);
String query="UPDATE Employee SET " + fieldToUpdate + " = ? WHERE EMPLOYEE_ID = ?";
try(PreparedStatement ps=connection.prepareStatement(query)){
ps.setString(1, newValue);  
ps.setInt(2, empId);     
int rowsAffected=ps.executeUpdate();
return rowsAffected;
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public boolean isUpdatableField(String field) throws InvalidDataException{
DataValidation.nullCheck(field);
List<String> updatableFields=Arrays.asList("NAME","MOBILE","DEPARTMENT","EMAIL");
return updatableFields.contains(field.toUpperCase());
}


public List<Employee> printRecords(int firstNNumber) throws InvalidDataException{
if(firstNNumber<=0){
throw new InvalidDataException("Number cannot be zero or negative");
}
String query="SELECT * FROM Employee LIMIT ? ";
List<Employee> employees = new ArrayList<>();
try(PreparedStatement ps=connection.prepareStatement(query)){
ps.setInt(1,firstNNumber);
ResultSet rs=ps.executeQuery();
while(rs.next()){
Employee employee = new Employee(
                        rs.getInt("EMPLOYEE_ID"),
                        rs.getString("NAME"),
                        rs.getString("MOBILE"),
                        rs.getString("EMAIL"),
                        rs.getString("DEPARTMENT"));
employees.add(employee);
}
return employees;
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public List<Employee> printRecordsDesc(int firstNNumber) throws InvalidDataException{
if(firstNNumber<=0){
throw new InvalidDataException("Number cannot be zero or negative");
}
String query="SELECT * FROM Employee ORDER BY NAME DESC LIMIT ? ";
List<Employee> employees = new ArrayList<>();
try(PreparedStatement ps=connection.prepareStatement(query)){
ps.setInt(1,firstNNumber);
ResultSet rs=ps.executeQuery();
while(rs.next()){
Employee employee = new Employee(
                        rs.getInt("EMPLOYEE_ID"),
                        rs.getString("NAME"),
                        rs.getString("MOBILE"),
                        rs.getString("EMAIL"),
                        rs.getString("DEPARTMENT"));
employees.add(employee);
}
return employees;
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public int deleteRecord(int empId) throws InvalidDataException{
String query="DELETE FROM Employee WHERE EMPLOYEE_ID ="+empId;
try(Statement st=connection.createStatement()){
int rowsAffected= st.executeUpdate(query);
return rowsAffected;
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public int insertDependentRecords(String query,String name,int age,String relationship,int empId) throws InvalidDataException{
DataValidation.nullCheck(query);
DataValidation.nullCheck(name);
DataValidation.nullCheck(relationship);
try(PreparedStatement ps=connection.prepareStatement(query)){
ps.setString(1,name);
ps.setInt(2,age);
ps.setString(3,relationship);
ps.setInt(4,empId);
int rowsAffected=ps.executeUpdate();
return rowsAffected;
}
catch(SQLException exp){
throw new InvalidDataException("Error connecting to the database.", exp);
}
}


public Employee listDependentDetails(int empId) throws InvalidDataException{
String query="SELECT Employee.EMPLOYEE_ID, Employee.NAME AS EMPLOYEE_NAME, " +"Employee.MOBILE, Employee.EMAIL, Employee.DEPARTMENT, " +"Dependent.NAME AS DEPENDENT_NAME, Dependent.AGE, " +"Dependent.RELATIONSHIP " +" FROM employee "+"LEFT JOIN Dependent ON Employee.EMPLOYEE_ID = Dependent.EMPLOYEE_ID"+" WHERE Employee.EMPLOYEE_ID = ?"; 
Employee employee=null;
try(PreparedStatement ps=connection.prepareStatement(query)){
ps.setInt(1, empId);
ResultSet rs=ps.executeQuery();
List<Dependent> dependents = new ArrayList<>();
while(rs.next()){
employee = new Employee(
                        rs.getInt("EMPLOYEE_ID"),
                        rs.getString("EMPLOYEE_NAME"),
                        rs.getString("MOBILE"),
                        rs.getString("EMAIL"),
                        rs.getString("DEPARTMENT"));
String depName = rs.getString("DEPENDENT_NAME");
if(depName != null) { 
Dependent dependent = new Dependent(
                       depName,
                       rs.getInt("AGE"),
                       rs.getString("RELATIONSHIP"));
dependents.add(dependent);
}
}
if (employee != null) {
employee.setDependents(dependents);  
}
return employee;
} 
catch (SQLException exp) {
throw new InvalidDataException("Error retrieving dependent details.", exp);
}
}


public List<Employee> displayDependentDetails(int firstNNumber) throws InvalidDataException{
if(firstNNumber<=0){
throw new InvalidDataException("Number cannot be zero or negative");
}
String query = "SELECT * FROM (" +
                               "SELECT Employee.EMPLOYEE_ID, Employee.NAME AS EMPLOYEE_NAME, " +
                               "Employee.MOBILE, Employee.EMAIL, Employee.DEPARTMENT, " +
                               "Dependent.NAME AS DEPENDENT_NAME, Dependent.AGE, " +
                               "Dependent.RELATIONSHIP " +
                               "FROM Employee " +
                               "LEFT JOIN Dependent ON Employee.EMPLOYEE_ID = Dependent.EMPLOYEE_ID " +
                               "LIMIT ?) AS subquery " +
                               "ORDER BY EMPLOYEE_NAME ASC";
List<Employee> employees = new ArrayList<>();
try (PreparedStatement ps = connection.prepareStatement(query)) {
ps.setInt(1, firstNNumber);
ResultSet rs = ps.executeQuery();
Map<Integer,Employee> employeeMap = new HashMap<>();
while (rs.next()) {
int empId = rs.getInt("EMPLOYEE_ID");
Employee employee = employeeMap.get(empId);
if (employee == null) {
employee = new Employee(
empId,
rs.getString("EMPLOYEE_NAME"),
rs.getString("MOBILE"),
rs.getString("EMAIL"),
rs.getString("DEPARTMENT")
);
employeeMap.put(empId, employee);
}
String depName = rs.getString("DEPENDENT_NAME");
if (depName != null) {
Dependent dependent = new Dependent(
                                    depName,
                                    rs.getInt("AGE"),
                                    rs.getString("RELATIONSHIP"));
employee.getDependents().add(dependent);
}
}
employees.addAll(employeeMap.values());
return employees;
} 
catch (SQLException exp) {
throw new InvalidDataException("Error retrieving dependent details.", exp);
}
}



}