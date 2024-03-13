package com.basics;


public class POJO{

private String name;
private int age;

public POJO(){
System.out.println("POJO object creation...");
}

public POJO(String s,int a){
this.name=s;
this.age=a;
}

public String toString(){
return "Name:"+name+",Age:"+age;
}

public void setName(String name){
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
