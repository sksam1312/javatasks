package com.string;


public class StringClass{


public int stringLength(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
int output=input.length();
return output;
}


public char[] getCharArray(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
char[] ch=input.toCharArray();
return ch;
}


public char getPenultimateChar(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
char penultimate=input.charAt(input.length()-2);
return penultimate;
}


public char getCharFromLast(String input,int fromLast){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
if (fromLast <= 0 || fromLast > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
char penultimate=input.charAt(input.length()-fromLast);
return penultimate;
}


public char getCharAt(String input,int index){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
if (index < 0 || index > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
char c=input.charAt(index);
return c;
}


public int noOfOccurencesOfChar(String input,char c){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
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
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
if (!Character.isDefined(c)) {
throw new IllegalArgumentException("Invalid character: " + c);
}
int index=input.lastIndexOf(c);
return index;
}


public String toSubstringFromFirst(String input,int startIndex){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
if (startIndex < 0 || startIndex > input.length()) {
throw new IllegalArgumentException("Invalid integer value for index which is out of bound/range.");
}
String substr=input.substring(startIndex);
return substr;
}


public String toSubstringFromLast(String input,int lastNNoOfChar){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
if (lastNNoOfChar < 0 || lastNNoOfChar > input.length()) {
throw new IllegalArgumentException("Invalid integer value out of range to calculate");
}
int index=input.length()-lastNNoOfChar;
String substr=input.substring(index);
return substr;
}


public String toSubstringAdvanced(String input,int startIndex,int endIndex){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
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
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
if (n < 0 || n > input.length()){
throw new IllegalArgumentException("Invalid value for n which is out of bound/range.");
}
int index=0;
int firstNChar=n;
String substr=input.substring(index,firstNChar);
return substr;
}


public String charReplace(String input,int start,int end,String replacingCharSequence){
if (input==null || replacingCharSequence==null) {
throw new IllegalArgumentException("Input cannot be null");
}
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
if (input==null || start==null) {
throw new IllegalArgumentException("Input cannot be null");
}
boolean isStart=input.startsWith(start);
return isStart;
}


public boolean stringEndsWith(String input,String end){
if (input==null || end==null) {
throw new IllegalArgumentException("Input cannot be null");
}
boolean isEnds=input.endsWith(end);
return isEnds;
}


public String upperCase(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
String output=input.toUpperCase();
return output;
}


public  String lowerCase(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
String output=input.toLowerCase();
return output;
}


public String stringReverse(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
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
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
return input;
}


public  String concatStrings(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
String[] s=input.split("\\s+");
String output="";
for(int i=0;i<s.length;i++){
output=output+s[i];
}
return output;
}


public String stringArray(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
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
for(String element:inputs){
if (element==null) {
throw new IllegalArgumentException("Inputs cannot be null");  
}
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
if (one==null || two==null) {
throw new IllegalArgumentException("Inputs cannot be null");
}
boolean isEqual=one.equals(two);
return isEqual;
}


public boolean isEqualCaseIgnore(String one,String two){
if (one==null || two==null) {
throw new IllegalArgumentException("Inputs cannot be null");
}
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}


public String spaceTrim(String input){
if (input==null) {
throw new IllegalArgumentException("Input cannot be null");
}
String output =input.trim();
return output;
}


}
