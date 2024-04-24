package com.string;
import java.util.*;

public class StringRunner{


public static void main(String[] args){


String input,one,two,inputStart,inputEnd,replacingCharSequence,delimit;
int index,start,end,num;
char c;
StringClass s=new StringClass();
Scanner sc=new Scanner(System.in);


try{
System.out.println("Enter a String to get its length:");
input=sc.nextLine();
System.out.println(s.stringLength(input));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to convert it into char array:");
input=sc.nextLine();
System.out.println(Arrays.toString(s.getCharArray(input)));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to get its character from last based on the given number:");
input=sc.nextLine();
System.out.println("Enter a number to get character from the end of the string:");
num=sc.nextInt();
sc.nextLine();
System.out.println(s.getCharFromLast(input,num));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to get its character at the given index:");
input=sc.nextLine();
System.out.println("Enter a number to get character at the index position:");
index=sc.nextInt();
sc.nextLine();
System.out.println(s.getCharAt(input,index));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to get no of occurences of a given character: ");
input=sc.nextLine();
System.out.println("Enter a character to check its count at the given string:");
c=sc.next().charAt(0);
sc.nextLine();
System.out.println(s.noOfOccurencesOfChar(input,c));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}

try{
System.out.println("Enter a String to get its greatest position of a given character:");
input=sc.nextLine();
System.out.println("Enter a character to find its greatest position in the given string:");
c=sc.next().charAt(0);
sc.nextLine();
index=s.greatPositionOfChar(input,c);
if(index==-1){
System.out.println("The given character doesn't present in the given string.Please check!!!");
}
else{
System.out.println(index);
}
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to create substring from the given index position: ");
input=sc.nextLine();
System.out.println("Enter a number to make substring from string that start  at the index position:");
index=sc.nextInt();
sc.nextLine();
System.out.println(s.toSubstringFromFirst(input,index));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to create substring from the given position from last:");
input=sc.nextLine();
System.out.println("Enter a number to get substring from the last index position:");
num=sc.nextInt();
sc.nextLine();
System.out.println(s.toSubstringFromLast(input,num));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to create substring from the given bounding(begin & end) index positions: ");
input=sc.nextLine();
System.out.println("Enter a starting index number:");
start=sc.nextInt();
sc.nextLine();
System.out.println("Enter a ending index number:");
end=sc.nextInt();
sc.nextLine();
System.out.println(s.toSubstringAdvanced(input,start,end));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to print its first n number of characters:");
input=sc.nextLine();
System.out.println("Enter a number to print first n number of characters in the given string:");
num=sc.nextInt();
sc.nextLine();
System.out.println(s.printFirstNNoOfChar(input,num));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter a String to replace with character sequence:");
input=sc.nextLine();
System.out.println("Enter a starting index number:");
start=sc.nextInt();
sc.nextLine();
System.out.println("Enter a ending index number:");
end=sc.nextInt();
sc.nextLine();
System.out.println("Enter the character sequence for replacing in the given string:");
replacingCharSequence=sc.nextLine();
System.out.println(s.charReplace(input,start,end,replacingCharSequence));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to check whether it starts with given character sequence:");
input=sc.nextLine();
System.out.println("Enter the character sequence to check the given string starts with:");
inputStart=sc.nextLine();
System.out.println(s.stringStartsWith(input,inputStart));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to check whether it ends with given character sequence:");
input=sc.nextLine();
System.out.println("Enter the character sequence to check the given string ends with:");
inputEnd=sc.nextLine();
System.out.println(s.stringEndsWith(input,inputEnd));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter a String to convert it into uppercase:");
input=sc.nextLine();
System.out.println(s.upperCase(input));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter a String to convert it into lowercase:");
input=sc.nextLine();
System.out.println(s.lowerCase(input));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to reverse:");
input=sc.nextLine();
System.out.println(s.stringReverse(input));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a line of multiple string to print the string:");
input=sc.nextLine();
System.out.println(s.lineWithMultipleString(input));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a line of multiple string to concatenate and print the string:");
input=sc.nextLine();
System.out.println("Enter a character sequence for delimiter to remove and concatenate the multiple string:");
delimit=sc.nextLine();
System.out.println(s.concatStrings(input,delimit));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter multiple string in a line to convert it into string array:");
input=sc.nextLine();
System.out.println("Enter a character sequence for delimiter to split the multiple string to array:");
delimit=sc.nextLine();
System.out.println(s.stringArray(input,delimit));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
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
System.out.println("Enter a symbol to seperate the given strings in between:");
c=sc.next().charAt(0);
sc.nextLine();
System.out.println(s.mergeWithSymbol(inputs,c));
}
catch(InputMismatchException ime){
System.out.println("Error:InputMismatchException caught.Please provide only integer values. ");
ime.printStackTrace();
sc.nextLine();
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter String 1 to compare for equality (case sensitive) with string 2:");
one=sc.nextLine();
System.out.println("Enter String 2:");
two=sc.nextLine();
System.out.println(s.isEqualStrings(one,two));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter String 1 to compare for equality (case insensitive) with string 2:");
one=sc.nextLine();
System.out.println("Enter String 2:");
two=sc.nextLine();
System.out.println(s.isEqualCaseIgnore(one,two));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String with space on either left,right or both sides to trim its spaces:");
input=sc.nextLine();
System.out.println(s.spaceTrim(input));
}
catch(Exception e){
System.out.println("Error: "+ e.getMessage());
e.printStackTrace();
sc.nextLine();
}
sc.close();
}
}
