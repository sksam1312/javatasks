package com.string;


public class StringClass{


public int stringLength(String input){
int output=input.length();
return output;
}

public char[] getCharArray(String input){
char[] ch=input.toCharArray();
return ch;
}


public char getPenultimateChar(String input){
char penultimate=input.charAt(input.length()-2);
return penultimate;
}


public int noOfOccurencesOfChar(String input,char c){
int charCount=0;
for(int i=0;i<input.length();i++){
if(c==input.charAt(i)){
charCount++;
}
}
return charCount;
}


public  int greatPositionOfChar(String input,char c){
int index=input.lastIndexOf(c);
return index;
}


public String toSubstring(String input){
int lastNoOfChar=5;
int index=input.length()-lastNoOfChar;
String substr=input.substring(index);
return substr;
}


public String printFirstThreeChar(String input){
int index=0;
int firstThreeChar=3;
String substr=input.substring(index,firstThreeChar);
return substr;
}


public String charReplace(String input){
String output=input.replace(input.substring(0,3),"XYZ");
return output;
}


public boolean stringStartsWith(String input,String start){
boolean isStart=input.startsWith(start);
return isStart;
}



public boolean stringEndsWith(String input,String end){
boolean isEnds=input.endsWith(end);
return isEnds;
}


public String upperCase(String input){
String output=input.toUpperCase();
return output;
}



public  String lowerCase(String input){
String output=input.toLowerCase();
return output;
}



public String stringReverse(String input){
char[] ch =new char[input.length()];
ch=input.toCharArray();
char[] rev=new char[input.length()];
int l=ch.length;
for (int i=0;i<l;i++)
{
rev[i]=ch[(l-1)-i];
}
String output=new String(rev);
return output;
}


public String lineWithMultipleString(String input){
return input;
}


public  String concatStrings(String input){
String[] s=input.split("\\s+");
String output="";
for(int i=0;i<s.length;i++){
output=output+s[i];
}
return output;
}


public String stringArray(String input){
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
return output;
}


public String mergeWithHiphen(String[] inputs){
String output=String.join("-",inputs[0],inputs[1],inputs[2],inputs[3],inputs[4],inputs[5]);
return output;
}


public  boolean isEqualStrings(String one,String two){
boolean isEqual=one.equals(two);
return isEqual;
}


public boolean isEqualCaseIgnore(String one,String two){
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}


public String spaceTrim(String input){
String output =input.trim();
return output;
}


}
