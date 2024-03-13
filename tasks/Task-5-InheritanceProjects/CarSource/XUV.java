package com.vehicle;

public class XUV extends Car{

private int seats;
private int airBags;
private String model;
private String color;


public void setseats(int s){
seats=s;
}
public void setairBags(int bags){
airBags=bags;
}
public void setmodel(String m){
model=m;
}
public void setcolor(String c){
color=c;
}

public int getseats(){
return seats;
}
public int getairBags(){
return airBags;
}
public String getmodel(){
return model;
}
public String getcolor(){
return color;
}
}