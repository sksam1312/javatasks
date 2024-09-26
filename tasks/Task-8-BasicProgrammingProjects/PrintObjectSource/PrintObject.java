package com.basics;

import com.utility.InvalidDataException;
import com.utility.DataValidation;

public class PrintObject{

private String name;

public PrintObject(){
}

public PrintObject(String name)throws InvalidDataException{
DataValidation.nullCheck(name);
this.name=name;
}

@Override
public String toString(){
return name;
}
}