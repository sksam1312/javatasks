package com.basics;


public class SingletonRunner{
public static void main(String[] args){
Singleton s=Singleton.getInstance();
Singleton t=Singleton.getInstance();
s.display();
t.display();
if(s.equals(t)){
System.out.println("All object references created using Singleton class pointing to only one object");
}
}
}
