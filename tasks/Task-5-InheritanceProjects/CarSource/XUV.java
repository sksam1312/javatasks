package com.vehicle;
import com.utility.*;

public class XUV extends Car{

private int seats;
private int airBags;
private String model;
private String color;

public XUV() throws InvalidDataException{
super("Overloaded Car constructor is called");
}


public void setSeats(int seat){
seats=seat;
}
public void setAirBags(int bags){
airBags=bags;
}
public void setModel(String mod) throws InvalidDataException{
DataValidation.nullCheck(mod);
model=mod;
}
public void setColor(String col) throws InvalidDataException{
DataValidation.nullCheck(col);
color=col;
}

public int getSeats(){
return seats;
}
public int getAirBags(){
return airBags;
}
public String getModel(){
return model;
}
public String getColor(){
return color;
}
}