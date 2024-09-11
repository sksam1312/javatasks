package com.collectionz;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import com.utility.InvalidDataException;


public class HashMapRunner{

public static void main(String[] args){
int size,num;
String input,output;
Scanner sc=new Scanner(System.in);
HashMapProject hmp= new HashMapProject();


try{
Map<String,Integer> hash=hmp.getHashMap();
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<Integer,Integer> hash=hmp.getHashMap();
System.out.println("Enter the Integer keys");
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
Integer key=sc.nextInt();
System.out.println("Enter the Integer value for key"+(i+1));
Integer value=sc.nextInt();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,Integer> hash=hmp.getHashMap();
System.out.println("Enter the String keys");
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the Integer value for key"+(i+1));
Integer value=sc.nextInt();
sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,HashMapProject> hash=hmp.getHashMap();
HashMapProject[] customValues=new HashMapProject[num];
System.out.println("Enter the String keys");
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
customValues[i]=new HashMapProject("CustomObject"+(i+1));
hmp.putPairsToMap(hash,key,customValues[i]);
System.out.println("Custom object created and added as value for key"+(i+1));
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
System.out.println("Enter the String keys");
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String keyInput = sc.nextLine();
String key="null".equals(keyInput) ? null : keyInput;
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
System.out.println("Enter the String keys");
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String keyInput = sc.nextLine();
String key="null".equals(keyInput) ? null : keyInput;
System.out.println("Enter the String value for key"+(i+1));
String valueInput = sc.nextLine();
String value="null".equals(keyInput) ? null : valueInput;
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the key to check whether the hashmap contains it or not");
String inputKey=sc.nextLine();
boolean isContains=hmp.mapContainsKey(hash,inputKey);
if(isContains){
System.out.println("The given key is present in the HashMap");
}
else{
System.out.println("The given key is not present in the HashMap");
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the value to check whether the hashmap contains it or not");
String inputValue=sc.nextLine();
boolean isContains=hmp.mapContainsValue(hash,inputValue);
if(isContains){
System.out.println("The given value is present in the HashMap");
}
else{
System.out.println("The given value is not present in the HashMap");
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the key which value has to be updated");
String key=sc.nextLine();
System.out.println("Enter the new value for the key");
String value=sc.nextLine();
hash=hmp.updateValueForAKey(hash,key,value);
System.out.println("The updated values of HashMap is " +hash);
System.out.println("The size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the existing key to get the value of it");
String inputKey=sc.nextLine();
String value=hmp.getValueOfKey(hash,inputKey);
System.out.println("The value of given existing key is "+value);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the non existing key to get the value of it");
String inputKey=sc.nextLine();
String value=hmp.getValueOfKey(hash,inputKey);
System.out.println("The value of given non existing key is "+value);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the  key to remove from the HashMap");
String inputKey=sc.nextLine();
hash=hmp.removeKey(hash,inputKey);
size=hmp.getSize(hash);
System.out.println("The HashMap after removing the given key is " +hash);
System.out.println("The size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the  key from the HashMap");
String inputKey=sc.nextLine();
System.out.println("Enter the  value to remove from the HashMap if it matches with existing key's value");
String inputValue=sc.nextLine();
hash=hmp.removeKeyAsPerValue(hash,inputKey,inputValue);
size=hmp.getSize(hash);
System.out.println("The HashMap after removing the given key is " +hash);
System.out.println("The size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the  key from the HashMap to replace its value");
String inputKey=sc.nextLine();
System.out.println("Enter the  value to replace from the HashMap");
String inputValue=sc.nextLine();
hash=hmp.replaceValue(hash,inputKey,inputValue);
size=hmp.getSize(hash);
System.out.println("The HashMap after replacing the value of given key is " +hash);
System.out.println("The size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("HashMap is created and the size of the HashMap is "+size);
System.out.println("Enter the  key from the HashMap to replace its value");
String inputKey=sc.nextLine();
System.out.println("Enter the  old value to replace from the HashMap");
String inputOldValue=sc.nextLine();
System.out.println("Enter the  new value to update to the HashMap");
String inputNewValue=sc.nextLine();
hash=hmp.replaceValueIfMatch(hash,inputKey,inputOldValue,inputNewValue);
size=hmp.getSize(hash);
System.out.println("The HashMap after replacing the old value of given key with new value is " +hash);
System.out.println("The size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted for first map");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The First HashMap is " +hash);
System.out.println("The First HashMap is created and the size of the HashMap is "+size);

System.out.println("Enter the number of Key-Value pairs to be inserted for second map");
num=sc.nextInt();
sc.nextLine();
Map<String,String> map=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(map,key,value);
}
size=hmp.getSize(map);
System.out.println("The second HashMap is " +map);
System.out.println("The second HashMap is created and the size of the HashMap is "+size);
map=hmp.hashMapTransfer(hash,map);
size=hmp.getSize(map);
System.out.println("The Final HashMap is " +map);
System.out.println("The Final HashMap is created and the size of the HashMap is "+size);

}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("The HashMap is created and the size of the HashMap is "+size);
System.out.println("The Iteration of HashMap is: ");
hmp.hashMapIterate(hash,(key,value)->System.out.println("Key: " + key + ", Value: " + value));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of Key-Value pairs to be inserted");
num=sc.nextInt();
sc.nextLine();
Map<String,String> hash=hmp.getHashMap();
for(int i=0;i<num;i++){
System.out.println("Enter the Key"+(i+1));
String key=sc.nextLine();
System.out.println("Enter the String value for key"+(i+1));
String value=sc.nextLine();
hmp.putPairsToMap(hash,key,value);
}
size=hmp.getSize(hash);
System.out.println("The HashMap is " +hash);
System.out.println("The HashMap is created and the size of the HashMap is "+size);
hmp.hashMapClear(hash);
size=hmp.getSize(hash);
System.out.println("After clearing of HashMap is " +hash);
System.out.println("The HashMap is cleared and the size of the HashMap is "+size);
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


}
}
