package com.jdbc;

public class JdbcPojoRunner{

public static void main(String[] args){



JdbcPojo db=new JdbcPojo();

//db.createDB("pojodb");
//db.createTable();
//db.insertRecords();
db.retreiveRecord();
db.updateRecord();
db.printRecords();
db.printRecordsDesc();
db.deleteRecord();
}
}