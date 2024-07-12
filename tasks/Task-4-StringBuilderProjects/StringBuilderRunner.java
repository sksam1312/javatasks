package com.string;
import java.util.*;

public class StringBuilderRunner{

public static void main(String[] args){
String input,str,delimit;
char charInput;
int num,index,startIndex,endIndex;
StringBuilderProject sbp=new StringBuilderProject();
Scanner sc=new Scanner(System.in);
StringBuilder sb=sbp.getStringBuilder();
StringBuilder output;

try{
System.out.println("Enter a String to  get its length:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a line of multiple String:");
str=sc.nextLine();
if(str.contains(" ")){
sb=sbp.getStringBuilder(str);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter any character/special character to seperate the given strings in between:");
charInput=sc.next().charAt(0);
sc.nextLine();
output=sbp.seperateWithChar(sb,charInput);
System.out.println("The final string is "+output.toString());
System.out.println("The length of the final String is "+sbp.stringLength(output));
}
else{
System.out.println("The given input String doesn't contain a space for seperating the strings with a character/special character.");
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a line of multiple string:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("Enter a String to insert in the input String:");
str=sc.nextLine();
System.out.println("Enter the index where you want to insert the String:");
num=sc.nextInt();
sc.nextLine();
System.out.println("The length of the String is "+sbp.stringLength(sb));
output=sbp.insertString(sb,str,num);
System.out.println("The final String is "+output.toString());
System.out.println("The length of the Final String is "+sbp.stringLength(output));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter starting index of a string to delete from:");
startIndex=sc.nextInt();
sc.nextLine();
System.out.println("Enter ending index of a string to delete upto one index before:");
endIndex=sc.nextInt();
sc.nextLine();
output=sbp.deleteString(sb,startIndex,endIndex);
System.out.println("The final String is "+output.toString());
System.out.println("The length of the Final String is "+sbp.stringLength(output));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter a character from the string to replace:");
char toReplace=sc.nextLine().charAt(0);
if(input.contains(String.valueOf(toReplace))){
System.out.println("Enter the replacing character to update:");
char replacingChar=sc.nextLine().charAt(0);
output=sbp.replaceCharacterWithOther(sb,toReplace,replacingChar);
System.out.println("The final String is "+output.toString());
System.out.println("The length of the Final String is "+sbp.stringLength(output));
}
else{
System.out.println("The given character doesn't present in the input String");
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to reverse:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
output=sbp.stringReverse(sb);
System.out.println("The Reverse of the given String is "+output.toString());
System.out.println("The length of the Final String is "+sbp.stringLength(output));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to delete a character:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter the position/index of a character to delete from the given string:");
index=sc.nextInt();
sc.nextLine();
output=sbp.deleteCharacterAt(sb,index);
System.out.println("The Final String is "+output.toString());
System.out.println("The length of the Final String is "+sbp.stringLength(output));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}



try{
System.out.println("Enter a String:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter the replacing string/character sequence:");
str=sc.nextLine();
System.out.println("Enter the starting index for the replacing string:");
startIndex=sc.nextInt();
sc.nextLine();
System.out.println("Enter the ending index for the replacing string:");
endIndex=sc.nextInt();
sc.nextLine();
output=sbp.replaceWithCharSequence(sb,str,startIndex,endIndex);
System.out.println("The Final String is "+output.toString());
System.out.println("The length of the Final String is "+sbp.stringLength(output));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter a character to find its index of first occurence in the given String:");
charInput=sc.nextLine().charAt(0);
str=String.valueOf(charInput);
index=sbp.findFirstIndexOf(sb,str);
if(index==-1){
System.out.println("The given character is not present in the given String!!!");
}
else{
System.out.println("The First occurence of a given character at the index is "+index);
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter a character to find its index of last occurence in the given String:");
charInput=sc.nextLine().charAt(0);
str=String.valueOf(charInput);
index=sbp.findLastIndexOf(sb,str);
if(index==-1){
System.out.println("The given character is not present in the given String!!!");
}
else{
System.out.println("The last occurence of a given character at the index is "+index);
}
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


}
}