package com.string;
import com.utility.*;


public class StringProject{


public  int stringLength(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
int output=input.length();
return output;
}


public char[] getCharArray(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
char[] charArray=input.toCharArray();
return charArray;
}


public char getCharFromLast(String input,int fromLast) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.validateNumber(lengthOfString,fromLast);
char penultimate=input.charAt(stringLength(input)-fromLast);
return penultimate;
}


public char getCharAt(String input,int index) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.indexRangeCheck(lengthOfString,index);
char character=input.charAt(index);
return character;
}


public int noOfOccurencesOfChar(String input,char charInput) throws InvalidDataException{
int lengthOfString=stringLength(input);
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
DataValidation.nullCheck(input);
if (!Character.isDefined(charInput)) {
throw new InvalidDataException("Invalid character: " + charInput);
}
int index=input.lastIndexOf(charInput);
return index;
}


public String toSubstringFromFirst(String input,int index) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.indexRangeCheck(lengthOfString,index);
String substr=input.substring(index);
return substr;
}


public String toSubstringFromLast(String input,int lastNNoOfChar) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.validateNumber(lengthOfString,lastNNoOfChar);
int index=stringLength(input)-lastNNoOfChar;
String substr=input.substring(index);
return substr;
}


public String toSubstringAdvanced(String input,int start,int end) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.indexRangeCheck(lengthOfString,start,end);
String substr=input.substring(start,end);
return substr;
}


public String printFirstNNoOfChar(String input,int num) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.validateNumber(lengthOfString,num);
int index=0;
String substr=input.substring(index,num);
return substr;
}


public String charReplace(String input,int start,int end,String replacingCharSequence) throws InvalidDataException{
DataValidation.nullCheck(replacingCharSequence);
int lengthOfString=stringLength(input);
DataValidation.indexRangeCheck(lengthOfString,start,end);
String output=input.replace(input.substring(start,end),replacingCharSequence);
return output;
}


public boolean stringStartsWith(String input,String start) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(start);
boolean isStart=input.startsWith(start);
return isStart;
}


public boolean stringEndsWith(String input,String end) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(end);
boolean isEnds=input.endsWith(end);
return isEnds;
}


public String upperCase(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
String output=input.toUpperCase();
return output;
}


public  String lowerCase(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
String output=input.toLowerCase();
return output;
}


public String stringReverse(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
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
DataValidation.nullCheck(input);
return input;
}


public  String concatStrings(String input,String splitter) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(splitter);
String[] stringArray=input.split(splitter);
String output="";
for(int i=0;i<stringArray.length;i++){
output=output+stringArray[i];
}
return output;
}


public String[] stringToArray(String input,String splitter) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(splitter);
String[] output=input.split(splitter);
return output;
}


public String mergeWithSymbol(String[] inputs,char charInput) throws InvalidDataException{
DataValidation.nullCheck(inputs);
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
DataValidation.nullCheck(one);
DataValidation.nullCheck(two);
boolean isEqual=one.equals(two);
return isEqual;
}


public boolean isEqualCaseIgnore(String one,String two) throws InvalidDataException{
DataValidation.nullCheck(one);
DataValidation.nullCheck(two);
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}


public String spaceTrim(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
String output =input.trim();
return output;
}


}
