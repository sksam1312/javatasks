package com.basics;


public class Singleton{

private static volatile Singleton obj;
private static int count;

private Singleton(){
count=count+1;
}

public void display(){
System.out.println("No of intance created:"+count);
}

public static Singleton getInstance(){
if(obj==null){
synchronized(Singleton.class){
if(obj==null)
{
return obj=new Singleton();
}
}
}
return obj;
}
}