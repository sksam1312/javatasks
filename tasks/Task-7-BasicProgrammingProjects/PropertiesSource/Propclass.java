package com.basics;
import java.io.*;
import java.util.*;

public class Propclass{

public void writeSampleText(){

File dir=new File("c:\\home\\basicprogramming\\myDir");
dir.mkdirs();
File file1=new File("c:\\home\\basicprogramming\\myDir\\sample.txt");
try{
file1.createNewFile();
FileWriter fw=new FileWriter(file1);
BufferedWriter bw=new BufferedWriter(fw);
bw.write("Line1:Programmatically created file.");
bw.newLine();
bw.write("Line 2:These words were written programmatically.");
bw.newLine();
bw.write("Line 3:All is Well. Be happy & enjoy the moment.");
bw.flush();
}
catch(IOException e){
e.printStackTrace();
}
System.out.println("File created and messages were  written in sample.txt successfully");
}

public void storeValues(String k,String v){
try{
File file2=new File("c:\\home\\basicprogramming\\myDir\\myprops.txt");
file2.createNewFile();
Properties p=new Properties();
p.setProperty(k,v);
FileOutputStream fos=new FileOutputStream(file2,true);
p.store(fos,"stored");
}
catch(IOException e){
e.printStackTrace();
}
System.out.println("File created and (Key:"+k+",Value:"+v +") pairs were stored in myprop.txt successfully");
}

public void loadValues(){
try{
Properties pr=new Properties();
File f=new File("c:\\home\\basicprogramming\\myDir\\myprops.txt");
FileInputStream fis=new FileInputStream(f);
pr.load(fis);
System.out.println("Key,Value pairs stored in properties object listed below:");
pr.forEach((key,value)->System.out.println(key+" "+value));
}
catch(IOException e){
e.printStackTrace();
}
System.out.println("myprops.txt file loaded and (key,value) pairs were stored in properties object successfully");
}


}