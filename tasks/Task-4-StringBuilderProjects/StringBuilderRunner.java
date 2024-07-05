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
System.out.println("Enter a String to append and get its length:");
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
System.out.println("Enter a String to append and get its length:");
str=sc.nextLine();
sb=sbp.getStringBuilder(str);
System.out.println("The length of the String is "+sbp.stringLength(sb));
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] stringArray=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
stringArray[i]=sc.nextLine();
}
StringBuilder[] inputs = new StringBuilder[stringArray.length];
for (int i = 0;i<stringArray.length;i++) {
inputs[i] = new StringBuilder(stringArray[i]);
}
System.out.println("Enter any character/special character to seperate the given strings in between:");
charInput=sc.next().charAt(0);
sc.nextLine();
output=sbp.seperateWithChar(sb,inputs,charInput);
System.out.println("The final string is "+output.toString());
System.out.println("The length of the final String is "+sbp.stringLength(output));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter multiple Strings with space in between:");
input=sc.nextLine();
sb=sbp.getStringBuilder(input);
if(input.contains(" ")){
System.out.println("Enter a String to insert in between the two Strings:");
str=sc.nextLine();
System.out.println("Enter the space number where you want to insert in between the Strings:");
num=sc.nextInt();
sc.nextLine();
System.out.println("The length of the String is "+sbp.stringLength(sb));
output=sbp.insertString(sb,str,num);
System.out.println("The final String is "+output.toString());
System.out.println("The length of the Final String is "+sbp.stringLength(output));
}
else{
System.out.println("There is no space found in the given String.Please provide valid input String.");
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
charInput=sc.nextLine().charAt(0);
output=sbp.replaceCharacterWithOther(sb,toReplace,charInput);
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