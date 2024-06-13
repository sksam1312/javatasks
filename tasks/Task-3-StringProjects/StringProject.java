package com.string;


public class StringProject{

int lengthOfString;

public void nullCheck(Object input) throws InvalidDataException {
if (input==null) {
throw new InvalidDataException("Input cannot be null");
}
}


public void indexRangeCheck(int strLength,int index) throws InvalidDataException{
if (index < 0 || index >=strLength) {
throw new InvalidDataException("Invalid integer value for index which is out of bound/range.");
}
}


public  void indexRangeCheck(int strLength,int startIndex,int endIndex) throws InvalidDataException {
if (startIndex < 0) {
throw new InvalidDataException("Start index cannot be negative");
}
if (endIndex >= strLength) {
throw new InvalidDataException("End index cannot be greater than or equal to the string length");
}
if (startIndex>endIndex) {
throw new InvalidDataException("Start index  cannot be greater than end index");
}
}


public void validateNumber(int strLength, int num) throws InvalidDataException {
if (num<=0||num>strLength){
throw new InvalidDataException("Invalid integer value/number which is out of bound/range.");
}
}


public  int stringLength(String input) throws InvalidDataException{
nullCheck(input);
int output=input.length();
return output;
}


public char[] getCharArray(String input) throws InvalidDataException{
nullCheck(input);
char[] charArray=input.toCharArray();
return charArray;
}


public char getCharFromLast(String input,int fromLast) throws InvalidDataException{
lengthOfString=stringLength(input);
validateNumber(lengthOfString,fromLast);
char penultimate=input.charAt(stringLength(input)-fromLast);
return penultimate;
}


public char getCharAt(String input,int index) throws InvalidDataException{
lengthOfString=stringLength(input);
indexRangeCheck(lengthOfString,index);
char character=input.charAt(index);
return character;
}


public int noOfOccurencesOfChar(String input,char charInput) throws InvalidDataException{
lengthOfString=stringLength(input);
if (!Character.isDefined(charInput)) {
throw new InvalidDataException("Invalid character: " + charInput);
}
int charCount=0;
for(int i=0;i<lengthOfString;i++){
if(charInput==input.charAt(i)){
charCount++;
}
}
return charCount;
}


public int greatPositionOfChar(String input,char charInput) throws InvalidDataException{
nullCheck(input);
if (!Character.isDefined(charInput)) {
throw new InvalidDataException("Invalid character: " + charInput);
}
int index=input.lastIndexOf(charInput);
return index;
}


public String toSubstringFromFirst(String input,int index) throws InvalidDataException{
lengthOfString=stringLength(input);
indexRangeCheck(lengthOfString,index);
String substr=input.substring(index);
return substr;
}


public String toSubstringFromLast(String input,int lastNNoOfChar) throws InvalidDataException{
lengthOfString=stringLength(input);
validateNumber(lengthOfString,lastNNoOfChar);
int index=stringLength(input)-lastNNoOfChar;
String substr=input.substring(index);
return substr;
}


public String toSubstringAdvanced(String input,int start,int end) throws InvalidDataException{
lengthOfString=stringLength(input);
indexRangeCheck(lengthOfString,start,end);
String substr=input.substring(start,end);
return substr;
}


public String printFirstNNoOfChar(String input,int num) throws InvalidDataException{
lengthOfString=stringLength(input);
validateNumber(lengthOfString,num);
int index=0;
String substr=input.substring(index,num);
return substr;
}


public String charReplace(String input,int start,int end,String replacingCharSequence) throws InvalidDataException{
nullCheck(replacingCharSequence);
lengthOfString=stringLength(input);
indexRangeCheck(lengthOfString,start,end);
String output=input.replace(input.substring(start,end),replacingCharSequence);
return output;
}


public boolean stringStartsWith(String input,String start) throws InvalidDataException{
nullCheck(input);
nullCheck(start);
boolean isStart=input.startsWith(start);
return isStart;
}


public boolean stringEndsWith(String input,String end) throws InvalidDataException{
nullCheck(input);
nullCheck(end);
boolean isEnds=input.endsWith(end);
return isEnds;
}


public String upperCase(String input) throws InvalidDataException{
nullCheck(input);
String output=input.toUpperCase();
return output;
}


public  String lowerCase(String input) throws InvalidDataException{
nullCheck(input);
String output=input.toLowerCase();
return output;
}


public String stringReverse(String input) throws InvalidDataException{
nullCheck(input);
char[] charArray=input.toCharArray();
int left=0;
int right=charArray.length-1;
while(left<right){
char temp=charArray[left];
charArray[left]=charArray[right];
charArray[right]=temp;
left++;
right--;            
}
String output=new String(charArray);
return output;
}


public String lineWithMultipleString(String input) throws InvalidDataException{
nullCheck(input);
return input;
}


public  String concatStrings(String input,String splitter) throws InvalidDataException{
nullCheck(input);
nullCheck(splitter);
String[] stringArray=input.split(splitter);
String output="";
for(int i=0;i<stringArray.length;i++){
output=output+stringArray[i];
}
return output;
}


public String[] stringToArray(String input,String splitter) throws InvalidDataException{
nullCheck(input);
nullCheck(splitter);
String[] output=input.split(splitter);
return output;
}


public String mergeWithSymbol(String[] inputs,char charInput) throws InvalidDataException{
nullCheck(inputs);
if (!Character.isDefined(charInput)) {
throw new InvalidDataException("Invalid character: " + charInput);
}
String output="";
boolean firstelement=true;
for(int i=0;i<inputs.length;i++)
{
if(!firstelement)
{
output=output+charInput;
}
output=output+inputs[i];
firstelement=false;
}
return output;
}


public  boolean isEqualStrings(String one,String two) throws InvalidDataException{
nullCheck(one);
nullCheck(two);
boolean isEqual=one.equals(two);
return isEqual;
}


public boolean isEqualCaseIgnore(String one,String two) throws InvalidDataException{
nullCheck(one);
nullCheck(two);
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}


public String spaceTrim(String input) throws InvalidDataException{
nullCheck(input);
String output =input.trim();
return output;
}


}
