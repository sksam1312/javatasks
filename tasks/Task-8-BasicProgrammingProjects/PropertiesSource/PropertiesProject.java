package com.basics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.utility.InvalidDataException;
import com.utility.DataValidation;


public class PropertiesProject{


public void createDirectory(String dirPath) throws InvalidDataException{
DataValidation.nullCheck(dirPath);
File dir=new File(dirPath);
try{
if(!dir.exists()){
dir.mkdirs();
}
else{
throw new InvalidDataException("The Given Directory exists already");
}
}
catch(Exception exp){
throw new InvalidDataException("Failed to create direcctory",exp);
}
}


public void createAFile(String filePath) throws InvalidDataException{
DataValidation.nullCheck(filePath);
File file=new File(filePath);
if(!file.exists()){
try{
file.createNewFile();
}
catch(IOException exp){
throw new InvalidDataException("Failed to create file",exp);
}
}
else{
throw new InvalidDataException("The Given File exists already");
}
}


public void writeTextToTheFile(String filePath,String text) throws InvalidDataException{
DataValidation.nullCheck(filePath);
DataValidation.nullCheck(text);
try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath, true))){ 
writer.write(text);
writer.newLine();
} 
catch(IOException exp){
throw new InvalidDataException("Failed to write to the file", exp);
}
}

public Properties getProperties(){
return new Properties();
}

public Properties getStringProperties(String key,String value) throws InvalidDataException{
DataValidation.nullCheck(key);
DataValidation.nullCheck(value);
Properties pr=getProperties();
pr.setProperty(key,value);
return pr;
}


public void storeValues(String filePath,Properties pr) throws InvalidDataException{
DataValidation.nullCheck(filePath);
try{
File file=new File(filePath);
FileOutputStream fos=new FileOutputStream(file);
pr.store(fos,"stored");
fos.close();
}
catch(IOException exp){
throw new InvalidDataException("Failed to store Properties to the file", exp);
}
}


public Properties loadValues(String filePath) throws InvalidDataException{
DataValidation.nullCheck(filePath);
try{
Properties pr=getProperties();
File file=new File(filePath);
FileInputStream fis=new FileInputStream(file);
pr.load(fis);
fis.close();
return pr;
}
catch(IOException exp){
throw new InvalidDataException("Failed to load Properties to the Properties object", exp);
}
}


}