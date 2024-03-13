package com.vehicle;

public class Car{

private int yearOfMake;
private String engineNumber;
private String type;

public void Car(String a){
System.out.println(a);
}

public void setyearOfMake(int make){
yearOfMake=make;
}
public void setengineNumber(String no){
engineNumber=no;
}
public void settype(String t){
type=t;
}
public int getyearOfMake(){
return yearOfMake;
}
public String getengineNumber(){
return engineNumber;
}
public String gettype(){
return type;
}
public void maintenance(){
System.out.println("Car under maintenance");
}
}