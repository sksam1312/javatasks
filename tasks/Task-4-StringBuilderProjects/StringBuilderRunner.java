package com.string;
import java.util.*;

public class StringBuilderRunner{

public static void main(String[] args){
String input,str,delimit;
String output;
char charInput;
int num,index,startIndex,endIndex;
StringBuilderProject sbp=new StringBuilderProject();
Scanner sc=new Scanner(System.in);


try{
System.out.println("Enter a String to append and get its length:");
input=sc.nextLine();
System.out.println("The length of the String is "+sbp.stringLength(input));
}
catch(Exception exp){
System.out.println("Error: "+ exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter a String to append and get its length:");
str=sc.nextLine();
System.out.println("The length of the String is "+sbp.stringLength(str));
System.out.println("Enter the number of string inputs you are going to give:");
num=sc.nextInt();
sc.nextLine();
String[] inputs=new String[num];
for(int i=0;i<num;i++){
System.out.println("Enter String "+(i+1));
inputs[i]=sc.nextLine();
}
System.out.println("Enter any character/special character to seperate the given strings in between:");
charInput=sc.next().charAt(0);
sc.nextLine();
output=sbp.seperateWithChar(str,inputs,charInput);
System.out.println("The final string is "+output);
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
if(input.contains(" ")){
System.out.println("Enter a String to insert in between the two Strings:");
str=sc.nextLine();
System.out.println("Enter the space number where you want to insert in between the Strings:");
num=sc.nextInt();
sc.nextLine();
System.out.println("The length of the String is "+sbp.stringLength(input));
output=sbp.insertString(input,str,num);
System.out.println("The final String is "+output);
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
System.out.println("The length of the String is "+sbp.stringLength(input));
System.out.println("Enter starting index of a string to delete from:");
startIndex=sc.nextInt();
sc.nextLine();
System.out.println("Enter ending index of a string to delete upto one index before:");
endIndex=sc.nextInt();
sc.nextLine();
output=sbp.deleteString(input,startIndex,endIndex);
System.out.println("The final String is "+output);
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
System.out.println("The length of the String is "+sbp.stringLength(input));
System.out.println("Enter a character from the string to replace:");
char toReplace=sc.nextLine().charAt(0);
if(input.contains(String.valueOf(toReplace))){
System.out.println("Enter the replacing character to update:");
charInput=sc.nextLine().charAt(0);
output=sbp.replaceCharacterWithOther(input,toReplace,charInput);
System.out.println("The final String is "+output);
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
System.out.println("The length of the String is "+sbp.stringLength(input));
output=sbp.stringReverse(input);
System.out.println("The Reverse of the given String is "+output);
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
System.out.println("The length of the String is "+sbp.stringLength(input));
System.out.println("Enter the position/index of a character to delete from the given string:");
index=sc.nextInt();
sc.nextLine();
output=sbp.deleteCharacterAt(input,index);
System.out.println("The Final String is "+output);
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
System.out.println("The length of the String is "+sbp.stringLength(input));
System.out.println("Enter the replacing string/character sequence:");
str=sc.nextLine();
System.out.println("Enter the starting index for the replacing string:");
startIndex=sc.nextInt();
sc.nextLine();
System.out.println("Enter the ending index for the replacing string:");
endIndex=sc.nextInt();
sc.nextLine();
output=sbp.replaceWithCharSequence(input,str,startIndex,endIndex);
System.out.println("The Final String is "+output);
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
System.out.println("The length of the String is "+sbp.stringLength(input));
System.out.println("Enter a character to find its index of first occurence in the given String:");
charInput=sc.nextLine().charAt(0);
str=String.valueOf(charInput);
index=sbp.findFirstIndexOf(input,str);
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
System.out.println("The length of the String is "+sbp.stringLength(input));
System.out.println("Enter a character to find its index of last occurence in the given String:");
charInput=sc.nextLine().charAt(0);
str=String.valueOf(charInput);
index=sbp.findLastIndexOf(input,str);
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