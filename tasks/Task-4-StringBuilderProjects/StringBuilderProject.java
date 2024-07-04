package com.string;
import com.utility.*;

public class StringBuilderProject{

public int stringLength(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
StringBuilder sb=new StringBuilder();
sb.append(input);
int output=sb.length();
return output;
}


public String seperateWithChar(String input,String[] inputs,char charInput) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(inputs);
if (!Character.isDefined(charInput)) {
throw new InvalidDataException("Invalid character: " + charInput);
}
StringBuilder sb=new StringBuilder(input);
for(int i=0;i<inputs.length;i++){
sb.append(charInput);
sb.append(inputs[i]);
}
String output=sb.toString();
return output;
}


public String insertString(String input,String toInsert,int spaceNum) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(toInsert);
String[] strArray=input.split(" ");
if(spaceNum<1||spaceNum>=strArray.length){
throw new InvalidDataException("The space number value is out of range.Please provide valid input.");
}
int index=0;
for(int i=0;i<spaceNum;i++){
index=index+(strArray[i].length())+1;
}
StringBuilder sb=new StringBuilder(input);
sb.insert(index,toInsert+" ");
String output=sb.toString();
return output;
}


public String deleteString(String input,int startIndex,int endIndex) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.indexRangeCheck(lengthOfString,startIndex,endIndex);
StringBuilder sb=new StringBuilder(input);
String output=sb.delete(startIndex,endIndex).toString();
return output;
}


public String replaceCharacterWithOther(String input,char toReplace,char replacingChar) throws InvalidDataException{
int lengthOfString=stringLength(input);
if (!Character.isDefined(toReplace)) {
throw new InvalidDataException("Invalid character: " + toReplace);
}
if (!Character.isDefined(replacingChar)) {
throw new InvalidDataException("Invalid character: " + replacingChar);
}
StringBuilder sb=new StringBuilder(input);
sb.replace(0,lengthOfString,sb.toString().replace(toReplace,replacingChar));
String output=sb.toString();
return output;
}


public String stringReverse(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
StringBuilder sb=new StringBuilder(input);
String output=sb.reverse().toString();
return output;
}


public String deleteCharacterAt(String input,int index) throws InvalidDataException{
int lengthOfString=stringLength(input);
DataValidation.indexRangeCheck(lengthOfString,index);
StringBuilder sb=new StringBuilder(input);
String output=sb.deleteCharAt(index).toString();
return output;
}


public String replaceWithCharSequence(String input,String str,int startIndex,int endIndex) throws InvalidDataException{
DataValidation.nullCheck(str);
int lengthOfString=stringLength(input);
DataValidation.indexRangeCheck(lengthOfString,startIndex,endIndex);
StringBuilder sb=new StringBuilder(input);
String output=sb.replace(startIndex,endIndex,str).toString();
return output;
}


public int findFirstIndexOf(String input,String firstIndex) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(firstIndex);
StringBuilder sb=new StringBuilder(input);
int index=sb.indexOf(firstIndex);
return index;
}


public int findLastIndexOf(String input,String lastIndex) throws InvalidDataException{
DataValidation.nullCheck(input);
DataValidation.nullCheck(lastIndex);
StringBuilder sb=new StringBuilder(input);
int index=sb.lastIndexOf(lastIndex);
return index;
}

}