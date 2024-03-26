package com.string;
import java.util.*;

public class StringRunner{


public static void main(String[] args){


String input,one,two,inputStart,inputEnd,replacingCharSequence;
int index,start,end,num;
char c;
StringClass s=new StringClass();
Scanner sc=new Scanner(System.in);

try{
System.out.println("Enter a String to get its length");
input=sc.nextLine();
System.out.println(s.stringLength(input));


System.out.println("Enter a String to convert it into char array");
input=sc.nextLine();
System.out.println(Arrays.toString(s.getCharArray(input)));


System.out.println("Enter a String to get its penultimate character");
input=sc.nextLine();
System.out.println(s.getPenultimateChar(input));


System.out.println("Enter a String to get its character from last based on the given number");
input=sc.nextLine();
System.out.println("Enter a number to get character from the end of the string");
num=sc.nextInt();
sc.nextLine();
System.out.println(s.getCharFromLast(input,num));


System.out.println("Enter a String to get its character at the given index");
input=sc.nextLine();
System.out.println("Enter a number to get character at the index position");
index=sc.nextInt();
sc.nextLine();
System.out.println(s.getCharAt(input,index));


System.out.println("Enter a String to get no of occurences of a given character ");
input=sc.nextLine();
System.out.println("Enter a character to check its count at the given string");
c=sc.next().charAt(0);
sc.nextLine();
System.out.println(s.noOfOccurencesOfChar(input,c));


System.out.println("Enter a String to get its greatest position of a given character");
input=sc.nextLine();
System.out.println("Enter a character to find its greatest position in the given string");
c=sc.next().charAt(0);
sc.nextLine();
System.out.println(s.greatPositionOfChar(input,c));


System.out.println("Enter a String to create substring from the given index position ");
input=sc.nextLine();
System.out.println("Enter a number to get character at the index position");
index=sc.nextInt();
sc.nextLine();
System.out.println(s.toSubstringFromFirst(input,index));


System.out.println("Enter a String to create substring from the given position from last");
input=sc.nextLine();
System.out.println("Enter a number to get character from the last position");
num=sc.nextInt();
sc.nextLine();
System.out.println(s.toSubstringFromLast(input,num));


System.out.println("Enter a String to create substring from the given bounding(begin & end) index positions ");
input=sc.nextLine();
System.out.println("Enter a starting index number");
start=sc.nextInt();
sc.nextLine();
System.out.println("Enter a ending index number");
end=sc.nextInt();
sc.nextLine();
System.out.println(s.toSubstringAdvanced(input,start,end));


System.out.println("Enter a String to print its first n number of characters");
input=sc.nextLine();
System.out.println("Enter a number to print first n number of characters in the givenn string");
num=sc.nextInt();
sc.nextLine();
System.out.println(s.printFirstNNoOfChar(input,num));


System.out.println("Enter a String to replace with character sequence");
input=sc.nextLine();
System.out.println("Enter a starting index number");
start=sc.nextInt();
sc.nextLine();
System.out.println("Enter a ending index number");
end=sc.nextInt();
sc.nextLine();
System.out.println("Enter the character sequence for replacing in the given string");
replacingCharSequence=sc.nextLine();
System.out.println(s.charReplace(input,start,end,replacingCharSequence));


System.out.println("Enter a String to check whether it starts with given character sequence");
input=sc.nextLine();
System.out.println("Enter the character sequence to check the given string starts with");
inputStart=sc.nextLine();
System.out.println(s.stringStartsWith(input,inputStart));


System.out.println("Enter a String to check whether it ends with given character sequence");
input=sc.nextLine();
System.out.println("Enter the character sequence to check the given string ends with");
inputEnd=sc.nextLine();
System.out.println(s.stringEndsWith(input,inputEnd));


System.out.println("Enter a String to convert it into uppercase");
input=sc.nextLine();
System.out.println(s.upperCase(input));


System.out.println("Enter a String to convert it into lowercase");
input=sc.nextLine();
System.out.println(s.lowerCase(input));


System.out.println("Enter a String to reverse");
input=sc.nextLine();
System.out.println(s.stringReverse(input));

System.out.println("Enter a line of multiple string to print the string");
input=sc.nextLine();
System.out.println(s.lineWithMultipleString(input));


System.out.println("Enter a line of multiple string to concatenate without any spaces and print the string");
input=sc.nextLine();
System.out.println(s.concatStrings(input));

System.out.println("Enter multiple string in a line to convert it into string array");
input=sc.nextLine();
System.out.println(s.stringArray(input));


System.out.println("Enter the number of string inputs you are going to give");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
System.out.println(s.mergeWithHiphen(inputs));


System.out.println("Enter String 1 to compare for equality (case sensitive) with string 2:");
one=sc.nextLine();
System.out.println("Enter String 2:");
two=sc.nextLine();
System.out.println(s.isEqualStrings(one,two));


System.out.println("Enter String 1 to compare for equality (case insensitive) with string 2:");
one=sc.nextLine();
System.out.println("Enter String 2:");
two=sc.nextLine();
System.out.println(s.isEqualCaseIgnore(one,two));


System.out.println("Enter a String with space on either left,right or both sides to trim its spaces");
input=sc.nextLine();
System.out.println(s.spaceTrim(input));
}


catch(Exception e){
System.out.println("Please check and provide valid inputs");
e.printStackTrace();
}


}
}