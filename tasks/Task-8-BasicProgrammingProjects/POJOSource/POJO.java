package com.basics;

import com.utility.DataValidation;
import com.utility.InvalidDataException;

public class POJO{

private String name;
private int age;

public POJO(){
}

public POJO(String name,int age) throws InvalidDataException{
DataValidation.nullCheck(name);
this.name=name;
this.age=age;
}

@Override
public String toString(){
return "Name:"+name+",Age:"+age;
}

public void setName(String name) throws InvalidDataException{
DataValidation.nullCheck(name);
this.name=name;
}

public String getName(){
return name;
}

public void setAge(int age){
this.age=age;
}

public int getAge(){
return age;
}

}
