package com.regex;
import java.util.regex.*;
import java.util.logging.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RegexDemo {
private static final Logger logger=Logger.getLogger("RegexDemo.class");
private static Scanner sc=new Scanner(System.in);
public void mobileNoValidation(){
Scanner sc=new Scanner(System.in);
logger.log(Level.INFO,"Enter a number:");
String number=sc.nextLine();
if(number.length()!=10){
logger.log(Level.INFO,"The Entered number is not a valid mobile number");
}
else{
Pattern p=Pattern.compile("[6-9][0-9]{9}");
Matcher m=p.matcher(number);
if(m.find())
{
logger.log(Level.INFO,m.group() +" is a valid mobile number");
}
else
{
logger.log(Level.INFO,"The "+number+" is not a valid mobile number");
}
}
}
public void alphaNumericValidation(){
logger.log(Level.INFO,"Enter a string:");
String str=sc.nextLine();
Pattern p=Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])[a-zA-Z0-9]+$");
Matcher m=p.matcher(str);
if(m.find())
{
logger.log(Level.INFO,m.group() +" is a valid AlphaNumeric characters");
}
else{
logger.log(Level.INFO,"The given String "+str+" is not a valid AlphaNumeric characters");
}
}
public void stringMatch(){
logger.log(Level.INFO,"Enter a string:");
String givenString=sc.nextLine();
logger.log(Level.INFO,"Enter a matching string to check whether the given string starts with matching string:");
String matchingString=sc.nextLine();
Pattern p=Pattern.compile("^"+matchingString);
Matcher m=p.matcher(givenString);
if(m.find()){
logger.log(Level.INFO,"Yes..The matching string starts with given string");
}
else
{
logger.log(Level.INFO,"NO..The matching string does not start with given string");
}


logger.log(Level.INFO,"Enter a string:");
givenString=sc.nextLine();
logger.log(Level.INFO,"Enter a matching string to check whether the given string ends with matching string:");
matchingString=sc.nextLine();
Pattern q=Pattern.compile(matchingString+"$");
Matcher n=q.matcher(givenString);
if(n.find()){
logger.log(Level.INFO,"Yes..The matching string ends with given string");
}
else
{
logger.log(Level.INFO,"NO..The matching string does not end with given string");
}

logger.log(Level.INFO,"Enter a string:");
givenString=sc.nextLine();
logger.log(Level.INFO,"Enter a matching string to check whether the given string contains the matching string:");
matchingString=sc.nextLine();
Pattern r=Pattern.compile(matchingString);
Matcher o=r.matcher(givenString);
if(o.find()){
logger.log(Level.INFO,"Yes..The given string contains the matching string");
}
else
{
logger.log(Level.INFO,"NO..The given string does not contain the matching string");
}

logger.log(Level.INFO,"Enter a string:");
givenString=sc.nextLine();
logger.log(Level.INFO,"Enter a matching string to check whether the given string and the matching string are exact matches");
matchingString=sc.nextLine();
Pattern s=Pattern.compile(matchingString);
Matcher l=s.matcher(givenString);
if(l.matches()){
logger.log(Level.INFO,"Yes..The given string and the matching string is a exact match");
}
else
{
logger.log(Level.INFO,"NO..The given string and the matching string is not a exact match");
}
}

public void listOfString(){
List<String> list=new ArrayList<String>();
logger.log(Level.INFO,"Enter a string1:");
String a=sc.nextLine();
logger.log(Level.INFO,"Enter a string2:");
String b=sc.nextLine();
logger.log(Level.INFO,"Enter a string3:");
String c=sc.nextLine();
list.add(a);
list.add(b);
list.add(c);
logger.log(Level.INFO,"Enter a matching string:");
String matching=sc.nextLine();
for(int i=0;i<list.size();i++){
Pattern p=Pattern.compile("(?i)"+list.get(i));
Matcher m=p.matcher(matching);
if(m.matches()){
logger.log(Level.INFO,"The string"+(i+1)+"is matched with matching string");
}
else{
logger.log(Level.INFO,"The string"+(i+1)+"is not matched with matching string");
}
}
}
public void emailValidation(){
logger.log(Level.INFO,"Enter an EmailID:");
String matching=sc.nextLine();
Pattern p=Pattern.compile("^(?i)[a-z][a-z0-9[-#$%^!:_|.]]*[@][a-z]*{5}[.][a-z]{2,3}$");
Matcher m=p.matcher(matching);
if(m.matches()){
logger.log(Level.INFO,"The given emailID is vaild");
}
else{
logger.log(Level.INFO,"The given emailID is invaild");
}
}
public void stringValidation(){
List<String> list=new ArrayList<String>();
logger.log(Level.INFO,"Enter a string1:");
String a=sc.nextLine();
logger.log(Level.INFO,"Enter a string2:");
String b=sc.nextLine();
logger.log(Level.INFO,"Enter a string3:");
String c=sc.nextLine();
list.add(a);
list.add(b);
list.add(c);
for(int i=0;i<list.size();i++){
Pattern p=Pattern.compile("^.{1,6}$");
Matcher m=p.matcher(list.get(i));
if(m.matches()){
logger.log(Level.INFO,"The given string"+(i+1)+" is a valid string with length ranges from 1to6");
}
else{
logger.log(Level.INFO,"The given string is not a valid string");
}
}
}

public void stringListValidation(){
List<String> list1=new ArrayList<String>();
List<String> list2=new ArrayList<String>();
Map<String,Integer> map=new HashMap<String,Integer>();
logger.log(Level.INFO,"Enter strings for list1:-");
for(int i=0;i<10;i++){
logger.log(Level.INFO,"Enter a string"+(i+1)+":");
String a=sc.nextLine();
list1.add(a);
}
logger.log(Level.INFO,"Enter strings for list2:-");
for(int i=0;i<3;i++){
logger.log(Level.INFO,"Enter a string"+(i+1)+":");
String b=sc.nextLine();
list2.add(b);
}
int count=0;
for(int i=0;i<list2.size();i++){
for(int j=0;j<list1.size();j++){
Pattern p=Pattern.compile(list2.get(i));
Matcher m=p.matcher(list1.get(j));
if(m.matches()){
logger.log(Level.INFO,"The string at list2 Index position "+i+" matches with the string at list1 Index position "+j  );
map.put(list2.get(i),j);
}
else{
count++;
}
}
}
if(count==30){
logger.log(Level.INFO,"The two lists have unique string values so no match found");
}
else{
logger.log(Level.INFO,"The matched key value pairs of map "+map);
}
}
public void printHTMLTags(){

logger.log(Level.INFO,"Enter a HTML type string :");
String a=sc.nextLine();
Pattern p=Pattern.compile("<[^>]+>");
Matcher m=p.matcher(a);
logger.log(Level.INFO,"The HTML tags from a given string as follows:");
while(m.find()){
logger.log(Level.INFO,""+m.group());
}


}
}
