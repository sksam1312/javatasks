package com.basics;


public class SingletonRunner{
public static void main(String[] args){

try{
Singleton s=Singleton.getInstance();
System.out.println("Number of Object created:"+s.objectCreated());
Singleton t=Singleton.getInstance();
System.out.println("Number of Object created:"+t.objectCreated());
if(s.equals(t)){
System.out.println("All object references created using Singleton class pointing to only one object");
}
}
catch(Exception exp){
System.out.println("Error:"+exp.getMessage());
exp.printStackTrace();
}
}

}
