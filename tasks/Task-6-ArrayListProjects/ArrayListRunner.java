package com.collectionz;
import java.util.*;


public class ArrayListRunner{

public static void main(String[] args){
int size,num,index,startIndex,endIndex;
String input,output;
Scanner sc=new Scanner(System.in);
ArrayListProject alp=new ArrayListProject();


try{
ArrayList al=alp.getArrayList();
size=alp.getSize(al);
System.out.println("The ArrayList is "+al);
System.out.println("The size of given ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of integer inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
int[] intArray=new int[num];
for(int i=0;i<num;i++){
System.out.println("Enter Integer "+(i+1));
intArray[i]=sc.nextInt();
}
ArrayList<Integer> intList=alp.getIntegerList(intArray);
size=alp.getSize(intList);
System.out.println("The ArrayList is "+intList);
System.out.println("The size of given ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
ArrayListProject alp1=new ArrayListProject("Custom obj1");
ArrayListProject alp2=new ArrayListProject("Custom obj2");
ArrayListProject alp3=new ArrayListProject("Custom obj3");
ArrayListProject [] obj={alp1,alp2,alp3};
ArrayList<ArrayListProject> al=alp.addCustomObject(obj);
size=alp.getSize(al);
System.out.println("The ArrayList is "+al);
System.out.println("The size of given ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
System.out.println("Enter the number of integer inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
int[] intArray=new int[num];
for(int i=0;i<num;i++){
System.out.println("Enter Integer "+(i+1));
intArray[i]=sc.nextInt();
}
ArrayListProject alp1=new ArrayListProject("Custom obj1");
ArrayListProject alp2=new ArrayListProject("Custom obj2");
ArrayListProject alp3=new ArrayListProject("Custom obj3");
ArrayListProject [] obj={alp1,alp2,alp3};
ArrayList<Object> alObj=alp.addVariousObjects(inputs,intArray,obj);
size=alp.getSize(alObj);
System.out.println("The ArrayList is "+alObj);
System.out.println("The size of given ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
System.out.println("Enter a String from the ArrayList to find the index of that String:");
input=sc.nextLine();
index=alp.findIndexOfString(strList,input);
if(index==-1)
{
System.out.println("The given input String doesn't present in the ArrayList.Please Check.");
}
else{
System.out.println("The Index of the given input String in the ArrayList is "+index);
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
System.out.println("The iteration of given ArrayList is:");
Iterator<String> iterator=alp.iteratingList(strList);
for(;iterator.hasNext();){
System.out.println(iterator.next());
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
System.out.println("Enter the index from the ArrayList to find a String: ");
index=sc.nextInt();
sc.nextLine();
output=alp.findingStringAtIndex(strList,index);
System.out.println("The value of String at the given index is "+output);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
System.out.println("Enter a String from the ArrayList to find the index of that String:");
input=sc.nextLine();
int firstIndex=alp.findIndexOfString(strList,input);
int lastIndex=alp.findingLastIndexOfString(strList,input);
if(firstIndex==-1)
{
System.out.println("The given input String doesn't present in the ArrayList.Please Check.");
}
else{
System.out.println("The First Index of the given input String in the ArrayList is "+firstIndex);
System.out.println("The Last Index of the given input String which is duplicate in the ArrayList is "+lastIndex);
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
System.out.println("Enter a String to add to the ArrayList:");
input=sc.nextLine();
System.out.println("Enter the index position where you want to add/insert the String:");
index=sc.nextInt();
sc.nextLine();
strList=alp.insertIntoArrayList(strList,input,index);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
System.out.println("Enter the starting index position where you want to start to make sublist:");
startIndex=sc.nextInt();
sc.nextLine();
System.out.println("Enter the ending index position to make the sublist:");
endIndex=sc.nextInt();
sc.nextLine();
ArrayList<String> newList=alp.arrayListSubList(strList,startIndex,endIndex);
size=alp.getSize(newList);
System.out.println("The New ArrayList is "+newList);
System.out.println("The size of New ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give for ArrayList one:");
num=sc.nextInt();
sc.nextLine();
String[] inputs1=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs1[i]=sc.nextLine();
}
ArrayList<String> strList1=alp.getStringList(inputs1);
size=alp.getSize(strList1);
System.out.println("The ArrayList one  is "+strList1);
System.out.println("The size of given ArrayList one  is "+size);
System.out.println("Enter the number of string inputs you are going to give for ArrayList two:");
num=sc.nextInt();
sc.nextLine();
String[] inputs2=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs2[i]=sc.nextLine();
}
ArrayList<String> strList2=alp.getStringList(inputs2);
size=alp.getSize(strList2);
System.out.println("The ArrayList two is "+strList2);
System.out.println("The size of given ArrayList two  is "+size);
ArrayList<String> newList=alp.mergeLeftArrayList(strList1,strList2);
size=alp.getSize(newList);
System.out.println("The New ArrayList is "+newList);
System.out.println("The size of New ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
System.out.println("Enter the number of string inputs you are going to give for ArrayList one:");
num=sc.nextInt();
sc.nextLine();
String[] inputs1=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs1[i]=sc.nextLine();
}
ArrayList<String> strList1=alp.getStringList(inputs1);
size=alp.getSize(strList1);
System.out.println("The ArrayList one  is "+strList1);
System.out.println("The size of given ArrayList one  is "+size);
System.out.println("Enter the number of string inputs you are going to give for ArrayList two:");
num=sc.nextInt();
sc.nextLine();
String[] inputs2=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs2[i]=sc.nextLine();
}
ArrayList<String> strList2=alp.getStringList(inputs2);
size=alp.getSize(strList2);
System.out.println("The ArrayList two is "+strList2);
System.out.println("The size of given ArrayList two  is "+size);
ArrayList<String> newList=alp.mergeRightArrayList(strList1,strList2);
size=alp.getSize(newList);
System.out.println("The New ArrayList is "+newList);
System.out.println("The size of New ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
System.out.println("Enter the number of float/decimal inputs you are going to give for ArrayList:");
num=sc.nextInt();
sc.nextLine();
ArrayList<Float> al=new ArrayList<>();
for (int i=0;i<num;i++){
System.out.println("Enter the decimal value:"+(i+1));
Float fl=sc.nextFloat();
al.add(fl);
}
size=alp.getSize(al);
System.out.println("The Float ArrayList is "+al);
System.out.println("The size of Float ArrayList is "+size);
System.out.println("Enter the float/decimal value to remove from the ArrayList:");
Float value=sc.nextFloat();
sc.nextLine();
al=alp.removeDecimalValue(al,value);
size=alp.getSize(al);
System.out.println("The Float ArrayList after the deciaml value removed is "+al);
System.out.println("The size of Float ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of float/decimal inputs you are going to give for ArrayList:");
num=sc.nextInt();
sc.nextLine();
ArrayList<Float> al=new ArrayList<>();
for (int i=0;i<num;i++){
System.out.println("Enter the decimal value:"+(i+1));
Float fl=sc.nextFloat();
al.add(fl);
}
size=alp.getSize(al);
System.out.println("The Float ArrayList is "+al);
System.out.println("The size of Float ArrayList is "+size);
System.out.println("Enter the Index number of float/decimal value to remove from the ArrayList:");
index=sc.nextInt();
sc.nextLine();
al=alp.removeDecimalValueAt(al,index);
size=alp.getSize(al);
System.out.println("The Float ArrayList after the deciaml value removed from given index is "+al);
System.out.println("The size of Float ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give for ArrayList one:");
num=sc.nextInt();
sc.nextLine();
String[] inputs1=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs1[i]=sc.nextLine();
}
ArrayList<String> strList1=alp.getStringList(inputs1);
size=alp.getSize(strList1);
System.out.println("The ArrayList one  is "+strList1);
System.out.println("The size of given ArrayList one  is "+size);
System.out.println("Enter the number of string inputs you are going to give for ArrayList two:");
num=sc.nextInt();
sc.nextLine();
String[] inputs2=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs2[i]=sc.nextLine();
}
ArrayList<String> strList2=alp.getStringList(inputs2);
size=alp.getSize(strList2);
System.out.println("The ArrayList two subList is "+strList2);
System.out.println("The size of given ArrayList two  is "+size);
ArrayList<String> newList=alp.removeSubList(strList1,strList2);
size=alp.getSize(newList);
System.out.println("The New ArrayList is "+newList);
System.out.println("The size of New ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give for ArrayList one:");
num=sc.nextInt();
sc.nextLine();
String[] inputs1=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs1[i]=sc.nextLine();
}
ArrayList<String> strList1=alp.getStringList(inputs1);
size=alp.getSize(strList1);
System.out.println("The ArrayList one  is "+strList1);
System.out.println("The size of given ArrayList one  is "+size);
System.out.println("Enter the number of string inputs you are going to give for ArrayList two:");
num=sc.nextInt();
sc.nextLine();
String[] inputs2=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs2[i]=sc.nextLine();
}
ArrayList<String> strList2=alp.getStringList(inputs2);
size=alp.getSize(strList2);
System.out.println("The ArrayList two subList is "+strList2);
System.out.println("The size of given ArrayList two  is "+size);
ArrayList<String> newList=alp.retainSubList(strList1,strList2);
size=alp.getSize(newList);
System.out.println("The New ArrayList is "+newList);
System.out.println("The size of New ArrayList is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
System.out.println("Enter the number of long inputs you are going to give for ArrayList:");
num=sc.nextInt();
sc.nextLine();
ArrayList<Long> al=new ArrayList<>();
for (int i=0;i<num;i++){
System.out.println("Enter the value for long:"+(i+1));
Long lon=sc.nextLong();
al.add(lon);
}
size=alp.getSize(al);
System.out.println("The ArrayList of Long values is "+al);
System.out.println("The size of long ArrayList is "+size);
al=alp.clearElements(al);
size=alp.getSize(al);
System.out.println("The ArrayList of Long values after cleared is "+al);
System.out.println("The size of long ArrayList after cleared is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

try{
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
ArrayList<String> strList=alp.getStringList(inputs);
size=alp.getSize(strList);
System.out.println("The ArrayList is "+strList);
System.out.println("The size of given ArrayList is "+size);
System.out.println("Enter a String to check whether the ArrayList contains it or not:");
input=sc.nextLine();
boolean isPresent=alp.containsString(strList,input);
if(isPresent){
System.out.println("The given String is present in the ArrayList");
}
else{
System.out.println("The given String is not present in the ArrayList");
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


}
}