package com.basics;

import com.utility.InvalidDataException;

public class PrintObjectRunner{

public static void main(String[] args){
try{
PrintObject print=new PrintObject("sam");
System.out.println(print);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
}
}

}