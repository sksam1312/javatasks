package com.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.utility.DataValidation;
import com.utility.InvalidDataException;

public class RegexProject {


public boolean mobileNoValidation(String number) throws InvalidDataException{
DataValidation.nullCheck(number);
Pattern patt=Pattern.compile("[6-9][0-9]{9}");
Matcher match=patt.matcher(number);
if(match.find())
{
return true;
}
else
{
return false;
}
}


public boolean alphaNumericValidation(String alphaNumeric) throws InvalidDataException{
DataValidation.nullCheck(alphaNumeric);
Pattern patt=Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])[a-zA-Z0-9]+$");
Matcher match=patt.matcher(alphaNumeric);
if(match.find())
{
return true;
}
else{
return false;
}
}


public boolean validateStringStartsWithMatchingString(String matching,String given) throws InvalidDataException{
DataValidation.nullCheck(matching);
DataValidation.nullCheck(given);
Pattern patt=Pattern.compile("^"+given);
Matcher match=patt.matcher(matching);
if(match.find()){
return true;
}
else
{
return false;
}
}


public boolean validateStringEndsWithMatchingString(String matching,String given) throws InvalidDataException{
DataValidation.nullCheck(matching);
DataValidation.nullCheck(given);
Pattern patt=Pattern.compile(given+"$");
Matcher match=patt.matcher(matching);
if(match.find()){
return true;
}
else
{
return false;
}
}


public boolean validateStringContainsMatchingString(String matching,String given) throws InvalidDataException{
DataValidation.nullCheck(matching);
DataValidation.nullCheck(given);
Pattern patt=Pattern.compile(matching);
Matcher match=patt.matcher(given);
if(match.find()){
return true;
}
else
{
return false;
}
}


public boolean validateStringExactMatchOfMatchingString(String matching,String given) throws InvalidDataException{
DataValidation.nullCheck(matching);
DataValidation.nullCheck(given);
Pattern patt=Pattern.compile(matching);
Matcher match=patt.matcher(given);
if(match.matches()){
return true;
}
else
{
return false;
}
}


public boolean listOfString(String matching,List<String> list) throws InvalidDataException{
DataValidation.nullCheck(matching);
DataValidation.nullCheck(list);
boolean status=false;
int count=0;
for(int i=0;i<list.size();i++){
Pattern patt=Pattern.compile("(?i)"+list.get(i));
Matcher match=patt.matcher(matching);
if(match.matches()){
count++;
}
else{
status=false;
}
}
if(count==list.size()){
status=true;
}
return status;
}


public boolean emailValidation(String emailId) throws InvalidDataException{
DataValidation.nullCheck(emailId);
Pattern patt=Pattern.compile("^(?i)[a-z][a-z0-9[-#$%^!:_|.]]*[@][a-z]*{5}[.][a-z]{2,3}$");
Matcher match=patt.matcher(emailId);
if(match.matches()){
return true;
}
else{
return false;
}
}


public boolean stringValidation(List<String> list)throws InvalidDataException{
DataValidation.nullCheck(list);
int count=0;
boolean status=false;
for(int i=0;i<list.size();i++){
Pattern patt=Pattern.compile("^.{1,6}$");
Matcher match=patt.matcher(list.get(i));
if(match.matches()){
count++;
}
else{
status=false;
}
}
if(count==list.size()){
status=true;
}
return status;
}


public Map<String,Integer> stringListValidation(List<String> list1,List<String> list2) throws InvalidDataException{
DataValidation.nullCheck(list1);
DataValidation.nullCheck(list2);
Map<String,Integer> map=new HashMap<String,Integer>();
int count=0;
for(int i=0;i<list2.size();i++){
for(int j=0;j<list1.size();j++){
Pattern patt=Pattern.compile(list2.get(i));
Matcher match=patt.matcher(list1.get(j));
if(match.matches()){
map.put(list2.get(i),j);
}
else{
count++;
}
}
}
int total=list1.size()*list2.size();
if(count==total){
throw new InvalidDataException("The two lists have unique string values so no match found");
}
else{
return map;
}
}


public String printHTMLTags(String html) throws InvalidDataException{
DataValidation.nullCheck(html);
Pattern patt=Pattern.compile("<[^>]+>");
Matcher match=patt.matcher(html);
String output="";
while(match.find()){
output=output+match.group()+" ";
}
return output;
}


}
