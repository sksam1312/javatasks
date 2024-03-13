package com.string;
import java.util.Scanner;

public class StringClass{

public void stringLength(String[] args){
String[] s = new String[args.length];
int count;
if(args.length>0)
{
try
{
for(int i=0;i<s.length;i++){
s[i]=args[i];
count=i+1;
int stringlength =s[i].length();
System.out.println("String"+" "+count+" "+s[i]+"  " +":"+" "+"The length of the given string is:" +" "+stringlength);
}
}
catch(Exception e){
System.out.println("Exception caught"); 
}
}
else{
System.out.println("Note:To calculate length of a given string command line input strings are required.So please run the code again with command line string inputs");
}
}


public void toCharacterArray(){
System.out.println("Enter a string to convert it into a character array:");
Scanner sc = new Scanner(System.in);
String input= sc.nextLine();
char [] ch=input.toCharArray();
System.out.print("The character array for a given string is:{");
for(int i=0;i<input.length();i++){
System.out.print(ch[i]);
if(i<(input.length())-1)
{
System.out.print(",");
}
else{
System.out.print("}");
System.out.println();

}
}
}

public void charPenultimate(){
System.out.println("Enter a string to find the penultimate character:");
Scanner sc = new Scanner(System.in);
String input= sc.nextLine();
char [] ch=input.toCharArray();
System.out.print("The character array for a given string:{");
for(int i=0;i<input.length();i++){
System.out.print(ch[i]);
if(i<(input.length())-1)
{
System.out.print(",");
}
else{
System.out.println("}");
}
}
char penultimate=ch[(input.length())-2];
System.out.println("Character at last but one place of the given string is:" +penultimate);
}


public void noOfOccurencesChar(){
System.out.println("Enter a string to find number of occurences of the character given by us:");
Scanner sc = new Scanner(System.in);
String input= sc.nextLine();
System.out.println("Enter a character to find number of occurences in a given string:");
char c= sc.next().charAt(0);
char [] ch=input.toCharArray();
System.out.print("The character array for a given string:{");
for(int i=0;i<input.length();i++){
System.out.print(ch[i]);
if(i<(input.length())-1)
{
System.out.print(",");
}
else{
System.out.println("}");
}
}
int charcount=0;
for(int i=0;i<ch.length;i++){
if(c==ch[i])
{
charcount++;
}
}
System.out.println("No of occurences of given character"+" "+"'"+c+"'"+" in the input string is:"+charcount);
}


public  void greatPositionOfChar(){
System.out.println("Enter a string with some repeated characters to check gretaest position:");
Scanner sc = new Scanner(System.in);
String input= sc.nextLine();
System.out.println("Enter a character to find the greatest position of repeated character in a given string:");
char c= sc.next().charAt(0);
char [] ch=input.toCharArray();
System.out.print("The character array for a given string:{");
for(int i=0;i<input.length();i++){
System.out.print(ch[i]);
if(i<(input.length())-1)
{
System.out.print(",");
}
else{
System.out.println("}");
}
}
boolean matchfound=false;
int maxposition=0;
for(int i=0;i<ch.length;i++){
if(c==ch[i])
{
maxposition=i;
matchfound=true;
}
}
if(matchfound==true){
System.out.println("The greatest position of repeated character"+" "+"'"+c+"'"+" "+ "of given string "+" "+"'"+input+"'"+" "+" is:"+maxposition);
}
else
{
System.out.println("The given character " +c+" "+"is not found in the given string"+" "+input);
}
}


public  void toSubstring(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to make a substring:");
String input= sc.nextLine();
int start,end;
System.out.println("Enter starting index for a substring from given string:");
start = sc.nextInt();
System.out.println("Enter ending index for a substring from given string:");
end = sc.nextInt();
String substr=input.substring(start,end);
System.out.println("The substring of given string"+" "+input+" is:"+substr);
}



public void firstThreeChar(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to print its first three characters:");
String input= sc.nextLine();
if(input.length()>=3){
for(int i=0;i<3;i++){
char c=input.charAt(i);
System.out.println("character at index" +" "+ (i)+ "-"+c);
}
}
else
{
System.out.println("The given string length is lesser than 3 characters");
}
}


public void charReplace(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to replace its first 3 characters:");
String input= sc.nextLine();
if (input.length()>=3){
System.out.println("Enter 3 characters to replace first 3 characters of a given string:");
char[] ch=new char[3];
for(int i=0;i<ch.length;i++){
System.out.println("Enter character"+(i+1));
ch[i]= sc.next().charAt(0);
}
String replaceword=new String(ch);
String output=input.replace(input.substring(0,3),replaceword);
System.out.println("The replaced first 3 characters of a given string"+" "+input+" is:"+output);
}
else {
System.out.println("Enter a string should have length greater than or equal to 3!!!");
}
}


public void stringStartsWith(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a input string for to check the string starting with:");
String input= sc.nextLine().toLowerCase();
System.out.println("Enter a string to check whether the input string starts with:");
String start= sc.nextLine().toLowerCase();
boolean isstart=input.startsWith(start);
if(isstart==true){
System.out.println("YES...the input string:"+" "+input+" " +"starts with:"+" "+start);
}
else
{
System.out.println("NO...the input string:"+" "+input+" " +"does not starts with:"+" "+start);
}
}



public  void stringEndsWith(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a input string for to check the string ending with:");
String input= sc.nextLine().toLowerCase();
System.out.println("Enter a string to check whether the input string ends with:");
String end= sc.nextLine().toLowerCase();
boolean isends=input.endsWith(end);
if(isends==true){
System.out.println("YES...the input string:"+" "+input+" " +"ends with:"+" "+end);
}
else
{
System.out.println("NO...the input string:"+" "+input+" " +"does not ends with:"+" "+end);
}
}


public void upperCase(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to convert it into uppercase:");
String input= sc.nextLine();
String output=input.toUpperCase();
System.out.println("The Uppercase for the given string"+" "+input+" "+"is:"+" "+output);
}



public  void lowerCase(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to convert it into lowercase:");
String input= sc.nextLine();
String output=input.toLowerCase();
System.out.println("The Lowercase for the given string"+" "+input+" "+"is:"+" "+output);
}



public void stringReverse(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to reverse:");
String input= sc.nextLine();
char[] ch =new char[input.length()];
ch=input.toCharArray();
char[] rev=new char[input.length()];
int l=ch.length;
for (int i=0;i<l;i++)
{
rev[i]=ch[(l-1)-i];
}
String output=new String(rev);
System.out.println("The reverse of a given string "+input+" is:"+" "+output);
}


public void lineWithMultipleString(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter consecutive multiple strings to print:");
String input= sc.nextLine();
System.out.println("The given string is: "+" "+input);
}

public  void concatStrings(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to concatenate without space :");
String input= sc.nextLine();
String[] s=input.split("\\s+");
String output="";
for(int i=0;i<s.length;i++){
output=output+s[i];
}
System.out.println("The concatenated string from multiple string input without space is: "+output);
}


public void stringArray(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String to convert it into String array:");
String input= sc.nextLine();
String[] s=input.split("\\s+");
String output="{";
char c='"';
char d='}';
boolean firstelement=true;
for(int i=0;i<s.length;i++){
if(!firstelement){
output=output+",";
}
output=output+c+s[i]+c;
firstelement=false;
}
output=output+"}";
System.out.println("The string array of given string: "+ output);
}

public void mergeWithHiphen(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String to merge with hiphen:");
String input= sc.nextLine();
String[] s=input.split("\\s+");
String output="";
boolean firstelement=true;
for(int i=0;i<s.length;i++)
{
if(!firstelement)
{
output=output+"-";
}
output=output+s[i];
firstelement=false;
}
System.out.println("The given String Merged with hiphen is: "+output);
}


public  void isEqualStrings(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two Strings consecutively with space to check for equal 'case sensitive' :");
String input= sc.nextLine();
String[] s=input.split("\\s+");
boolean str=false;
boolean l=false;
if(s.length==2)
{
String one=s[0];
String two=s[1];
char[] arrayone=one.toCharArray();
char[] arraytwo=two.toCharArray();
if(one.length()==two.length()){
l=true;
}
else
{
System.out.println("The given strings lengths are not equal");
}
for(int i=0;i<one.length();i++){
if(arrayone[i]==arraytwo[i]){
str=true;
}
else{
str=false;
break;
}
}
if(l&&str){
System.out.println("The given strings are equal");
}
else
{
System.out.println("The given strings are not equal");
}
}
}

public void isEqualCaseIgnore(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter two Strings consecutively with space to check for equal 'case insensitive' :");
String input= sc.nextLine();
String[] s=input.split("\\s+");
String one=s[0];
String two=s[1];
if(one.equalsIgnoreCase(two)){
System.out.println("The given strings are equal");
}
else{
System.out.println("The given strings are not equal");
}
}


public void spaceTrim(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String with space at front and back to check:");
String input= sc.nextLine();
String output =input.trim();
System.out.println(output);
}


}
