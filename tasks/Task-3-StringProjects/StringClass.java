package com.string;


public class StringClass {


public static void nullCheck(String input) throws StringClassException {
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


public static int stringLength(String input) throws StringClassException{
nullCheck(input);
int output=input.length();
return output;
}


public char[] getCharArray(String input) throws StringClassException{
nullCheck(input);
char[] charArray=input.toCharArray();
return charArray;
}



public char getCharFromLast(String input,int fromLast) throws StringClassException{
nullCheck(input);
indexRangeCheck(input,fromLast,false);
char penultimate=input.charAt(stringLength(input)-fromLast);
return penultimate;
}


public static char getCharAt(String input,int index) throws StringClassException{
nullCheck(input);
indexRangeCheck(input,index,true);
char c=input.charAt(index);
return c;
}


public int noOfOccurencesOfChar(String input,char charInput) throws StringClassException{
nullCheck(input);
if (!Character.isDefined(charInput)) {
throw new StringClassException("Invalid character: " + charInput);
}
int charCount=0;
for(int i=0;i<stringLength(input);i++){
if(charInput==input.charAt(i)){
charCount++;
}
}
return charCount;
}


public  int greatPositionOfChar(String input,char charInput) throws StringClassException{
nullCheck(input);
if (!Character.isDefined(charInput)) {
throw new StringClassException("Invalid character: " + charInput);
}
int index=input.lastIndexOf(charInput);
return index;
}


public String toSubstringFromFirst(String input,int startIndex) throws StringClassException{
nullCheck(input);
indexRangeCheck(input,startIndex,true);
String substr=input.substring(startIndex);
return substr;
}


public String toSubstringFromLast(String input,int lastNNoOfChar) throws StringClassException{
nullCheck(input);
indexRangeCheck(input,lastNNoOfChar,false);
int index=stringLength(input)-lastNNoOfChar;
String substr=input.substring(index);
return substr;
}


public String toSubstringAdvanced(String input,int startIndex,int endIndex) throws StringClassException{
nullCheck(input);
indexRangeCheck(input,startIndex,true);
indexRangeCheck(input,endIndex,true);
String substr=input.substring(startIndex,endIndex);
return substr;
}


public String printFirstNNoOfChar(String input,int num) throws StringClassException{
nullCheck(input);
indexRangeCheck(input,num,false);
int index=0;
int firstNChar=num;
String substr=input.substring(index,firstNChar);
return substr;
}


public String charReplace(String input,int start,int end,String replacingCharSequence) throws StringClassException{
nullCheck(input);
nullCheck(replacingCharSequence);
indexRangeCheck(input,start,true);
indexRangeCheck(input,end,true);
String output=input.replace(input.substring(start,end),replacingCharSequence);
return output;
}


public boolean stringStartsWith(String input,String start) throws StringClassException{
nullCheck(input);
nullCheck(start);
boolean isStart=input.startsWith(start);
return isStart;
}


public boolean stringEndsWith(String input,String end) throws StringClassException{
nullCheck(input);
nullCheck(end);
boolean isEnds=input.endsWith(end);
return isEnds;
}


public String upperCase(String input) throws StringClassException{
nullCheck(input);
String output=input.toUpperCase();
return output;
}


public  String lowerCase(String input) throws StringClassException{
nullCheck(input);
String output=input.toLowerCase();
return output;
}


public String stringReverse(String input) throws StringClassException{
nullCheck(input);
String output="";
for(int i=stringLength(input)-1;i>=0;i--){
output=output+getCharAt(input,i);
}
return output;
}


public String lineWithMultipleString(String input) throws StringClassException{
nullCheck(input);
return input;
}


public  String concatStrings(String input,String splitter) throws StringClassException{
nullCheck(input);
nullCheck(splitter);
String[] stringArray=input.split(splitter);
String output="";
for(int i=0;i<stringArray.length;i++){
output=output+stringArray[i];
}
return output;
}


public String stringArray(String input,String splitter) throws StringClassException{
nullCheck(input);
nullCheck(splitter);
String[] stringArray=input.split(splitter);
String output="{";
char quotes='"';
boolean firstelement=true;
for(int i=0;i<stringArray.length;i++){
if(!firstelement){
output=output+",";
}
output=output+quotes+stringArray[i]+quotes;
firstelement=false;
}
output=output+"}";
return output;
}


public String mergeWithSymbol(String[] inputs,char charInput) throws StringClassException{
for(String input:inputs){
nullCheck(input);
}
String[] stringArray=inputs;
String output="";
boolean firstelement=true;
for(int i=0;i<stringArray.length;i++)
{
if(!firstelement)
{
output=output+charInput;
}
output=output+stringArray[i];
firstelement=false;
}
return output;
}

public  boolean isEqualStrings(String one,String two) throws StringClassException{
nullCheck(one);
nullCheck(two);
boolean isEqual=one.equals(two);
return isEqual;
}


public boolean isEqualCaseIgnore(String one,String two) throws StringClassException{
nullCheck(one);
nullCheck(two);
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}


public String spaceTrim(String input) throws StringClassException{
nullCheck(input);
String output =input.trim();
return output;
}


}
