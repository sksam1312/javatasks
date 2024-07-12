package com.string;
import com.utility.*;

public class StringBuilderProject{


public StringBuilder getStringBuilder(){
return new StringBuilder();
}


public StringBuilder getStringBuilder(String input) throws InvalidDataException{
DataValidation.nullCheck(input);
return new StringBuilder(input);
}


public int stringLength(StringBuilder sb) throws InvalidDataException{
DataValidation.nullCheck(sb);
int output=sb.length();
return output;
}


public StringBuilder seperateWithChar(StringBuilder sb,char charInput) throws InvalidDataException{
int lengthOfString=stringLength(sb);
if (!Character.isDefined(charInput)) {
throw new InvalidDataException("Invalid character: " + charInput);
}
for(int i=0;i<lengthOfString;i++){
if(sb.charAt(i)==' '){
sb.setCharAt(i,charInput);
}
}
return sb;
}


public StringBuilder insertString(StringBuilder sb,String toInsert,int index) throws InvalidDataException{
DataValidation.nullCheck(sb);
DataValidation.nullCheck(toInsert);
sb.insert(index,toInsert);
return sb;
}


public StringBuilder deleteString(StringBuilder sb ,int startIndex,int endIndex) throws InvalidDataException{
int lengthOfString=stringLength(sb);
DataValidation.indexRangeCheck(lengthOfString,startIndex,endIndex);
sb.delete(startIndex,endIndex);
return sb;
}


public StringBuilder replaceCharacterWithOther(StringBuilder sb,char toReplace,char replacingChar) throws InvalidDataException{
int lengthOfString=stringLength(sb);
if (!Character.isDefined(toReplace)) {
throw new InvalidDataException("Invalid character: " + toReplace);
}
if (!Character.isDefined(replacingChar)) {
throw new InvalidDataException("Invalid character: " + replacingChar);
}
for(int i=0;i<lengthOfString;i++){
if(sb.charAt(i)==toReplace){
sb.setCharAt(i,replacingChar);
}
}
return sb;
}


public StringBuilder stringReverse(StringBuilder sb) throws InvalidDataException{
DataValidation.nullCheck(sb);
sb.reverse();
return sb;
}


public StringBuilder deleteCharacterAt(StringBuilder sb,int index) throws InvalidDataException{
int lengthOfString=stringLength(sb);
DataValidation.indexRangeCheck(lengthOfString,index);
sb.deleteCharAt(index);
return sb;
}


public StringBuilder replaceWithCharSequence(StringBuilder sb,String str,int startIndex,int endIndex) throws InvalidDataException{
int lengthOfString=stringLength(sb);
DataValidation.nullCheck(str);
DataValidation.indexRangeCheck(lengthOfString,startIndex,endIndex);
sb.replace(startIndex,endIndex,str);
return sb;
}


public int findFirstIndexOf(StringBuilder sb,String firstIndex) throws InvalidDataException{
DataValidation.nullCheck(sb);
DataValidation.nullCheck(firstIndex);
int index=sb.indexOf(firstIndex);
return index;
}


public int findLastIndexOf(StringBuilder sb,String lastIndex) throws InvalidDataException{
DataValidation.nullCheck(sb);
DataValidation.nullCheck(lastIndex);
int index=sb.lastIndexOf(lastIndex);
return index;
}

}