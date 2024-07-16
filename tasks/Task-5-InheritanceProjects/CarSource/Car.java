package com.vehicle;
import com.utility.*;

public class Car{

private int yearOfMake;
private String engineNumber;
private String type;


public Car(){}

public Car(String message) throws InvalidDataException{
DataValidation.nullCheck(message);
System.out.println(message);
}

public void setYearOfMake(int make){
yearOfMake=make;
}
public void setEngineNumber(String no) throws InvalidDataException{
DataValidation.nullCheck(no);
engineNumber=no;
}
public void setType(String typ) throws InvalidDataException{
DataValidation.nullCheck(typ);
type=typ;
}
public int getYearOfMake(){
return yearOfMake;
}
public String getEngineNumber(){
return engineNumber;
}
public String getType(){
return type;
}
public String maintenance(){
return "Car under maintenance";
}
}