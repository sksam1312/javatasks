package com.string;

public class StringBuilderDemo{

public void stringLength(){
System.out.println("LENGTH OF THE STRING");
StringBuilder sb=new StringBuilder();
int a=sb.length();
System.out.println("The length of the input string which is empty "+a);
String output="sam";
sb.append(output);
a=sb.length();
System.out.println("The final string is "+ sb);
System.out.println("The length of the string after appending a string is "+a);
System.out.println(" ");
}

public void seperateByHash(){
System.out.println("STRING SEPERATED BY #");
String input="Hello";
StringBuilder sb=new StringBuilder(input);
int a=sb.length();
System.out.println("The length of the input string:"+input+" is "+a);
sb.append("#sam");
sb.append("#how");
sb.append("#are");
sb.append("#you");
a=sb.length();
System.out.println("The output string after appending 4 strings with  # is "+sb.toString());
System.out.println("The length of the string after appending with # is "+a);
System.out.println(" ");
}

public void insertString(){
System.out.println("INSERTING A STRING INTO A STRING");
String input="Hello";
int l=input.length();
StringBuilder sb=new StringBuilder(input);
sb.append(" ");
sb.append("sam");
int a=sb.length();
System.out.println("The string is "+sb.toString());
System.out.println("The length of the string is "+ a);
sb.insert((l)," how ");
a=sb.length();
System.out.println("The output string is "+sb.toString());
System.out.println("The length of the string after inserting a string is "+a);
System.out.println(" ");
}

public void deleteFirstString(){
System.out.println("DELETE FIRST STRING");
String input="Hello";
int l=input.length();
StringBuilder sb=new StringBuilder(input);
sb.append(" ");
sb.append("sam");
int a=sb.length();
System.out.println("The string is "+ sb.toString());
System.out.println("The length of the string is "+a);
sb.delete(0,5);
a=sb.length();
System.out.println("The final string after deletion is "+sb.toString());
System.out.println("The length of the string after deletion "+a);
System.out.println(" ");
}

public void replaceSpaceWithHiphen(){
System.out.println("REPLACE SPACE WITH HIPHEN");
String input="Hello";
int l=input.length();
StringBuilder sb=new StringBuilder(input);
sb.append(" ");
sb.append("sam");
sb.append(" ");
sb.append("mask");
int a=sb.length();
System.out.println("The string is "+sb.toString());
System.out.println("The length of the string is "+a);
sb.replace(0,a,sb.toString().replace(' ','-'));
System.out.println("The final string is "+sb.toString());
System.out.println("The length of the final string is "+a);
System.out.println(" ");
}

public void stringReverse(){
System.out.println("STRING REVERSE");
String input="Hello";
int l=input.length();
StringBuilder sb=new StringBuilder(input);
sb.append(" ");
sb.append("sam");
sb.append(" ");
sb.append("mask");
int a=sb.length();
System.out.println("The string is "+sb.toString());
System.out.println("The length of the string is "+a);
sb.reverse();
System.out.println("The reverse of the string is "+sb.toString());
System.out.println("The length of the string after reverse "+a);
System.out.println(" ");
}

public void deleteCharacters(){
System.out.println("DELETE CHARACTERS");
String input="Helloworld";
int l=input.length();
StringBuilder sb=new StringBuilder(input);
int a=sb.length();
System.out.println("The string is "+sb.toString());
System.out.println("The length of the string is "+a);
sb.delete(6,8);
a=sb.length();
System.out.println("The final string is "+sb.toString());
System.out.println("The length of the string after deleting characters is "+a);
System.out.println(" ");
}

public void replaceWithXYZ(){
System.out.println("REPLACE WITH XYZ");
String input="Helloworld";
int l=input.length();
StringBuilder sb=new StringBuilder(input);
int a=sb.length();
System.out.println("The string is "+sb.toString());
System.out.println("The length of the string is "+a);
sb.replace(6,9,"XYZ");
a=sb.length();
System.out.println("The final string is "+sb.toString());
System.out.println("The length of the string after replaced with XYZ is "+a);
System.out.println(" ");
}

public void findFirstHash(){
System.out.println("FINDING FIRST # INDEX");
String input="Hello";
StringBuilder sb=new StringBuilder(input);
sb.append("#sam");
sb.append("#how");
int a=sb.length();
System.out.println("The string is "+sb.toString());
int index=sb.indexOf("#",0);
System.out.println("The length of the string is "+a);
System.out.println("The index of first # of the string  is "+index);
System.out.println(" ");
}

public void findLastHash(){
System.out.println("FINDING LAST # INDEX");
String input="Hello";
StringBuilder sb=new StringBuilder(input);
sb.append("#sam");
sb.append("#how");
int a=sb.length();
System.out.println("The string is "+sb.toString());
int index=sb.lastIndexOf("#");
System.out.println("The length of the string is "+a);
System.out.println("The index of last # of the string is "+index);
System.out.println(" ");
}
}