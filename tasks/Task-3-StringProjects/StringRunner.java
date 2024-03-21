package com.string;
import java.util.*;

public class StringRunner{


public static void main(String[] args){

String input;
String output;
int out;
Scanner sc=new Scanner(System.in);
StringClass s=new StringClass();


if(args.length<=0){
System.out.println("No input String received from command line so please enter a string to calculate its length:");
input=sc.nextLine();
out=s.stringLength(input);
System.out.println("The length of the given string "+input+" is:"+out);
}
else{
input=String.join(" ",args);
out=s.stringLength(input);
System.out.println("The length of the given string "+input+" is:"+out);
}


System.out.println("Enter a string to convert it into a char Array:");
input=sc.nextLine();
char[] ch=s.getCharArray(input);
System.out.println("The char Array of a given string is: "+Arrays.toString(ch));


System.out.println("Enter a string to get the penultimate character(second character from last):");
input=sc.nextLine();
while(input.length()<2){
System.out.println("Enter a valid string having length greater than or equal to 2 to get the penultimate character(second character from last):");
input=sc.nextLine();
}
if(input.length()>=2){
char penultimate=s.getPenultimateChar(input);
System.out.println("The Penultimate char of a given string is: "+penultimate);
}


System.out.println("Enter a string to check no of occurences of given character below:");
input=sc.nextLine();
System.out.println("Enter a character to check for no of occurences in the given string above :");
char c=sc.next().charAt(0);
sc.nextLine();
int charCount=s.noOfOccurencesOfChar(input,c);
System.out.println("The no of occurences of a given character in given string is: "+charCount);


System.out.println("Enter a string to check for greatest index of given character below:");
input=sc.nextLine();
System.out.println("Enter a character to check for greatest index in the given string above :");
c=sc.next().charAt(0);
sc.nextLine();
int index=s.greatPositionOfChar(input,c);
if(index==-1){
System.out.println("The string doesn't contains the given charcter");
}
else{
System.out.println("The greatest postion of a character  in the given string is:"+index);
}


System.out.println("Enter a string to print its last 5 characters:");
input=sc.nextLine();
while(input.length()<5){
System.out.println("Enter a valid string have characters greater than or equal to 5 to print the last 5 characters of the given string");
input=sc.nextLine();
}
String substr=s.toSubstring(input);
System.out.println("The last 5 characters of a given string is "+substr);


System.out.println("Enter a string to print its first 3 characters:");
input=sc.nextLine();
while(input.length()<3){
System.out.println("Enter a valid string have characters greater than or equal to 3 to print its first 3 characters of the given string");
input=sc.nextLine();
}
substr=s.printFirstThreeChar(input);
System.out.println("The first 3 characters of a given string is "+substr); 


System.out.println("Enter a string to replace its first 3 characters with XYZ");
input=sc.nextLine();
while(input.length()<3){
System.out.println("Enter a valid string have characters greater than or equal to 3 to replace its first 3 characters of the given string with XYZ");
input=sc.nextLine();
}
output=s.charReplace(input);
System.out.println("The first 3 characters of a given string is replaced with XYZ is "+output);


System.out.println("Enter a string to check the string starting with:");
input= sc.nextLine().toLowerCase();
System.out.println("Enter a string to check whether the input string starts with:");
String start= sc.nextLine().toLowerCase();
boolean isStart=s.stringStartsWith(input,start);
if(isStart==true){
System.out.println("YES...the input string:"+" "+input+" " +"starts with:"+" "+start+" or "+start.toUpperCase());
}
else
{
System.out.println("NO...the input string:"+" "+input+" " +"does not starts with:"+" "+start+" or "+start.toUpperCase());
}


System.out.println("Enter a string to check the string ending with:");
input= sc.nextLine().toLowerCase();
System.out.println("Enter a string to check whether the input string ends with:");
String end= sc.nextLine().toLowerCase();
boolean isEnds=s.stringEndsWith(input,end);
if(isEnds==true){
System.out.println("YES...the input string:"+" "+input+" " +"ends with:"+" "+end+" or "+end.toUpperCase());
}
else
{
System.out.println("NO...the input string:"+" "+input+" " +"does not ends with:"+" "+end+" or "+end.toUpperCase());
}


System.out.println("Enter a string to convert it into uppercase:");
input= sc.nextLine();
output=s.upperCase(input);
System.out.println("The Uppercase for the given string"+" "+input+" "+"is:"+" "+output);


System.out.println("Enter a string to convert it into lowercase:");
input= sc.nextLine();
output=s.lowerCase(input);
System.out.println("The Lowercase for the given string"+" "+input+" "+"is:"+" "+output);


System.out.println("Enter a string to reverse:");
input= sc.nextLine();
output=s.stringReverse(input);
System.out.println("The reverse of a given string "+input+" is:"+" "+output);


System.out.println("Enter consecutive multiple strings to print:");
input= sc.nextLine();
output=s.lineWithMultipleString(input);
System.out.println("The given multiple string is:"+" "+output);


System.out.println("Enter multiple strings to concatenate them  without space :");
input= sc.nextLine();
output=s.concatStrings(input);
System.out.println("The concatenated string from multiple strings without space is: "+output);


System.out.println("Enter a String to convert it into String array:");
input= sc.nextLine();
output=s.stringArray(input);
System.out.println("The string array of given string: "+ output);


System.out.println("Enter a String to merge with hiphen:");
String [] inputs=new String[6];
for(int i=0;i<6;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
output=s.mergeWithHiphen(inputs);
System.out.println("The given String Merged with hiphen is: "+output);


System.out.println("Enter two Strings to check for equal 'case sensitive' :");
String[] strings=new String[2];
for(int i=0;i<2;i++){
System.out.println("Enter String "+(i+1));
strings[i]= sc.nextLine();
}
boolean isEqual=s.isEqualStrings(strings[0],strings[1]);
if(isEqual){
System.out.println("The given strings are equal");
}
else
{
System.out.println("The given strings are not equal");
}


System.out.println("Enter two Strings to check for equal 'case insensitive' :");
for(int i=0;i<2;i++){
System.out.println("Enter String "+(i+1));
strings[i]= sc.nextLine();
}
isEqual=s.isEqualCaseIgnore(strings[0],strings[1]);
if(isEqual){
System.out.println("The given strings are equal");
}
else
{
System.out.println("The given strings are not equal");
}


System.out.println("Enter a String with space at front and back to trim:");
input= sc.nextLine();
output =s.spaceTrim(input);
System.out.println("The given input is:"+input);
System.out.println("The output is:"+output);

}
}