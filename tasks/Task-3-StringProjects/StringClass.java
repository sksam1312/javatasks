package com.string;


public class StringClass{


public static void nullCheck(String input) throws IllegalArgumentException {
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
}


public static void nullCheck(String input,String str) throws IllegalArgumentException {
if (input==null || str==null) {
throw new IllegalArgumentException("Input cannot be null");
}
}

public int stringLength(String input){
nullCheck(input);
int output=input.length();
return output;
}


public char[] getCharArray(String input){
nullCheck(input);
char[] ch=input.toCharArray();
return ch;
}


public char getPenultimateChar(String input){
nullCheck(input);
char penultimate=input.charAt(input.length()-2);
return penultimate;
}


public char getCharFromLast(String input,int fromLast){
nullCheck(input);
if (fromLast <= 0 || fromLast > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
char penultimate=input.charAt(input.length()-fromLast);
return penultimate;
}


public char getCharAt(String input,int index){
nullCheck(input);
if (index < 0 || index > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
char c=input.charAt(index);
return c;
}


public int noOfOccurencesOfChar(String input,char c){
nullCheck(input);
if (!Character.isDefined(c)) {
throw new IllegalArgumentException("Invalid character: " + c);
}
int charCount=0;
for(int i=0;i<input.length();i++){
if(c==input.charAt(i)){
charCount++;
}
}
return charCount;
}


public  int greatPositionOfChar(String input,char c){
nullCheck(input);
if (!Character.isDefined(c)) {
throw new IllegalArgumentException("Invalid character: " + c);
}
int index=input.lastIndexOf(c);
return index;
}


public String toSubstringFromFirst(String input,int startIndex){
nullCheck(input);
if (startIndex < 0 || startIndex > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
String substr=input.substring(startIndex);
return substr;
}


public String toSubstringFromLast(String input,int lastNNoOfChar){
nullCheck(input);
if (lastNNoOfChar < 0 || lastNNoOfChar > input.length()) {
throw new IllegalArgumentException("Invalid integer value out of range to calculate");
}
int index=input.length()-lastNNoOfChar;
String substr=input.substring(index);
return substr;
}


public String toSubstringAdvanced(String input,int startIndex,int endIndex){
nullCheck(input);
if (startIndex < 0 || startIndex > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
if (endIndex < 0 || endIndex > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
String substr=input.substring(startIndex,endIndex);
return substr;
}


public String printFirstNNoOfChar(String input,int n){
nullCheck(input);
if (n < 0 || n > input.length()){
throw new IllegalArgumentException("Invalid value for n which is out of bound/range.");
}
int index=0;
int firstNChar=n;
String substr=input.substring(index,firstNChar);
return substr;
}


public String charReplace(String input,int start,int end,String replacingCharSequence){
nullCheck(input,replacingCharSequence);
if (start < 0 || start > input.length()){
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
if (end < 0 || end > input.length()){
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
String output=input.replace(input.substring(start,end),replacingCharSequence);
return output;
}


public boolean stringStartsWith(String input,String start){
nullCheck(input,start);
boolean isStart=input.startsWith(start);
return isStart;
}


public boolean stringEndsWith(String input,String end){
nullCheck(input,end);
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
nullCheck(input);
return input;
}


public  String concatStrings(String input){
nullCheck(input);
String[] s=input.split("\\s+");
String output="";
for(int i=0;i<s.length;i++){
output=output+s[i];
}
return output;
}


public String stringArray(String input){
nullCheck(input);
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
output=output+"-";
}
output=output+s[i];
firstelement=false;
}
return output;
}

public  boolean isEqualStrings(String one,String two){
nullCheck(one,two);
boolean isEqual=one.equals(two);
return isEqual;
}


public boolean isEqualCaseIgnore(String one,String two){
nullCheck(one,two);
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}


public String spaceTrim(String input){
nullCheck(input);
String output =input.trim();
return output;
}


}
