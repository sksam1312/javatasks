package com.basics;


public class POJORunner{
public static void main(String[] args){

POJO p=new POJO("sam",32);
POJO q=new POJO("charu",25);
System.out.println(p);
System.out.println(q);
POJO r=new POJO();
r.setName("vimi");
r.setAge(23);
System.out.println("Name:"+r.getName()+",Age:"+r.getAge());
POJO s=new POJO();
s.setName("vicky");
s.setAge(34);
System.out.println("Name:"+s.getName()+",Age:"+s.getAge());
}
}