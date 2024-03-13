package com.jdbc;

public class JdbcRunner{

public static void main(String[] args){
JdbcDemo db=new JdbcDemo();
//db.deleteDB();
//db.createDB("incubationDB");
//db.createTable();
//db.insertRecords();
//db.retreiveRecord();
//db.updateRecord();
//db.printRecords();
//db.printRecordsDesc();
//db.deleteRecord();
//db.createDependentTable();
//db.insertDependentRecords();
db.listDependentDetails();
db.displayDependentDetails();
}
}