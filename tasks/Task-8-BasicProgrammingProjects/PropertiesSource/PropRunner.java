package com.basics;

import java.util.Scanner;
import java.io.IOException;
import java.util.Properties;
import com.utility.InvalidDataException;
import com.utility.DataValidation;

public class PropRunner{

public static void main(String[] args){
PropertiesProject pp=new PropertiesProject();
Properties properties=pp.getProperties();
Scanner sc=new Scanner(System.in);
String dirPath,filePath,text,key,value;


try{
dirPath="c:\\home\\basicprogramming\\myDir";
pp.createDirectory(dirPath);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
filePath="c:\\home\\basicprogramming\\myDir\\myprops.txt";
pp.createAFile(filePath);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
filePath="c:\\homie\\sample.txt";
text="Written successfully";
pp.writeTextToTheFile(filePath,text);
text="directory and file cretaed";
pp.writeTextToTheFile(filePath,text);

}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
for(int i=0;i<5;i++){
System.out.println("Enter the String value for key "+(i+1));
key=sc.nextLine();
System.out.println("Enter the String value for value "+(i+1));
value=sc.nextLine();
Properties pr=pp.getStringProperties(key,value);
properties.putAll(pr);
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
filePath="c:\\home\\basicprogramming\\myDir\\myprops.txt";
pp.storeValues(filePath,properties);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
filePath="c:\\home\\basicprogramming\\myDir\\myprops.txt";
Properties prop=pp.loadValues(filePath);
System.out.println("Key,Value pairs stored in properties object listed below:");
prop.forEach((keys,values)->System.out.println(keys+" "+values));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


}
}