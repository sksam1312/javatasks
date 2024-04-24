package com.string;


public class StringClass{


public static class StringClassException extends RuntimeException {

public StringClassException(String message) {
super(message);
}

}


public static void nullCheck(String input) throws StringClassException{
if (input==null) {
throw new StringClassException("Input cannot be null");
}
}

public static void indexRangeCheck(String input,int index,boolean allowZero) throws StringClassException{
if(allowZero){
if (index < 0 || index > stringLength(input)) {
throw new StringClassException("Invalid integer value for index which is out of bound/range.");
}
}
else
{
if (index <= 0 || index > stringLength(input) ) {
throw new StringClassException("Invalid integer value for index which is out of bound/range.");
}
}

}


public static int stringLength(String input){
nullCheck(input);
int output=input.length();
return output;
}


public char[] getCharArray(String input){
nullCheck(input);
char[] ch=input.toCharArray();
return ch;
}



public char getCharFromLast(String input,int fromLast){
nullCheck(input);
indexRangeCheck(input,fromLast,false);
char penultimate=input.charAt(stringLength(input)-fromLast);
return penultimate;
}


public char getCharAt(String input,int index){
nullCheck(input);
indexRangeCheck(input,index,true);
char c=input.charAt(index);
return c;
}


public int noOfOccurencesOfChar(String input,char c){
nullCheck(input);
if (!Character.isDefined(c)) {
throw new StringClassException("Invalid character: " + c);
}
int charCount=0;
for(int i=0;i<stringLength(input);i++){
if(c==input.charAt(i)){
charCount++;
}
}
return charCount;
}


public  int greatPositionOfChar(String input,char c){
nullCheck(input);
if (!Character.isDefined(c)) {
throw new StringClassException("Invalid character: " + c);
}
int index=input.lastIndexOf(c);
return index;
}


public String toSubstringFromFirst(String input,int startIndex){
nullCheck(input);
indexRangeCheck(input,startIndex,true);
String substr=input.substring(startIndex);
return substr;
}


public String toSubstringFromLast(String input,int lastNNoOfChar){
nullCheck(input);
indexRangeCheck(input,lastNNoOfChar,false);
int index=stringLength(input)-lastNNoOfChar;
String substr=input.substring(index);
return substr;
}


public String toSubstringAdvanced(String input,int startIndex,int endIndex){
nullCheck(input);
indexRangeCheck(input,startIndex,true);
indexRangeCheck(input,endIndex,true);
String substr=input.substring(startIndex,endIndex);
return substr;
}


public String printFirstNNoOfChar(String input,int n){
nullCheck(input);
indexRangeCheck(input,n,false);
int index=0;
int firstNChar=n;
String substr=input.substring(index,firstNChar);
return substr;
}


public String charReplace(String input,int start,int end,String replacingCharSequence){
nullCheck(input);
nullCheck(replacingCharSequence);
indexRangeCheck(input,start,true);
indexRangeCheck(input,end,true);
String output=input.replace(input.substring(start,end),replacingCharSequence);
return output;
}


public boolean stringStartsWith(String input,String start){
nullCheck(input);
nullCheck(start);
boolean isStart=input.startsWith(start);
return isStart;
}


public boolean stringEndsWith(String input,String end){
nullCheck(input);
nullCheck(end);
boolean isEnds=input.endsWith(end);
return isEnds;
}


public String upperCase(String input){
nullCheck(input);
String output=input.toUpperCase();
return output;
}


public  String lowerCase(String input){
nullCheck(input);
String output=input.toLowerCase();
return output;
}


public String stringReverse(String input){
nullCheck(input);
char[] ch =new char[stringLength(input)];
ch=input.toCharArray();
char[] rev=new char[stringLength(input)];
int l=ch.length;
for (int i=0;i<l;i++)
{
rev[i]=ch[(l-1)-i];
}
String output=new String(rev);
return output;
}


public String lineWithMultipleString(String input){
nullCheck(input);
return input;
}


public  String concatStrings(String input,String sp){
nullCheck(input);
nullCheck(sp);
String[] s=input.split(sp);
String output="";
for(int i=0;i<s.length;i++){
output=output+s[i];
}
return output;
}


public String stringArray(String input,String sp){
nullCheck(input);
nullCheck(sp);
String[] s=input.split(sp);
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


public String mergeWithSymbol(String[] inputs,char c){
for(String input:inputs){
nullCheck(input);
}
String[] s=inputs;
String output="";
boolean firstelement=true;
for(int i=0;i<s.length;i++)
{
if(!firstelement)
{
output=output+c;
}
output=output+s[i];
firstelement=false;
}
return output;
}

public  boolean isEqualStrings(String one,String two){
nullCheck(one);
nullCheck(two);
boolean isEqual=one.equals(two);
return isEqual;
}


public boolean isEqualCaseIgnore(String one,String two){
nullCheck(one);
nullCheck(two);
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}


public String spaceTrim(String input){
nullCheck(input);
String output =input.trim();
return output;
}


}
