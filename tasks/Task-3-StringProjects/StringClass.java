package com.string;


public class StringClass{


public int stringLength(String input){
try{
int output=input.length();
return output;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value 0");
e.printStackTrace();
return 0;
}
}



public char[] getCharArray(String input){
try{
char[] ch=input.toCharArray();
return ch;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value new char[0]");
e.printStackTrace();
return new char[0];
}
}


public char getPenultimateChar(String input){
try{
char penultimate=input.charAt(input.length()-2);
return penultimate;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value 0");
e.printStackTrace();
return '0';
}
}


public char getCharFromLast(String input,int fromLast){
try{
char penultimate=input.charAt(input.length()-fromLast);
return penultimate;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value 0");
e.printStackTrace();
return '\0';
}
}


public char getCharAt(String input,int index){
try{
char c=input.charAt(index);
return c;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value /0");
e.printStackTrace();
return '\0';
}
}


public int noOfOccurencesOfChar(String input,char c){
try{
int charCount=0;
for(int i=0;i<input.length();i++){
if(c==input.charAt(i)){
charCount++;
}
}
return charCount;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value 0");
e.printStackTrace();
return 0;
}
}


public  int greatPositionOfChar(String input,char c){
try{
int index=input.lastIndexOf(c);
return index;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value -1");
e.printStackTrace();
return -1;
}
}


public String toSubstringFromFirst(String input,int startIndex){
try{
String substr=input.substring(startIndex);
return substr;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public String toSubstringFromLast(String input,int lastNNoOfChar){
try{
int index=input.length()-lastNNoOfChar;
String substr=input.substring(index);
return substr;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public String toSubstringAdvanced(String input,int startIndex,int endIndex){
try{
String substr=input.substring(startIndex,endIndex);
return substr;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public String printFirstNNoOfChar(String input,int n){
try{
int index=0;
int firstNChar=n;
String substr=input.substring(index,firstNChar);
return substr;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public String charReplace(String input,int start,int end,String replacingCharSequence){
try{
String output=input.replace(input.substring(start,end),replacingCharSequence);
return output;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public boolean stringStartsWith(String input,String start){
try{
boolean isStart=input.startsWith(start);
return isStart;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value-false");
e.printStackTrace();
return false;
}
}


public boolean stringEndsWith(String input,String end){
try{
boolean isEnds=input.endsWith(end);
return isEnds;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value-false");
e.printStackTrace();
return false;
}
}


public String upperCase(String input){
try{
String output=input.toUpperCase();
return output;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public  String lowerCase(String input){
try{
String output=input.toLowerCase();
return output;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public String stringReverse(String input){
try{
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
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public String lineWithMultipleString(String input){
try{
return input;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public  String concatStrings(String input){
try{
String[] s=input.split("\\s+");
String output="";
for(int i=0;i<s.length;i++){
output=output+s[i];
}
return output;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public String stringArray(String input){
try{
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
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please  check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}

public String mergeWithHiphen(String[] inputs){
try{
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
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


public  boolean isEqualStrings(String one,String two){
try{
boolean isEqual=one.equals(two);
return isEqual;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value-false");
e.printStackTrace();
return false;
}
}


public boolean isEqualCaseIgnore(String one,String two){
try{
boolean isEqual=one.equalsIgnoreCase(two);
return isEqual;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid inputs. 3.Now it will return default value-false");
e.printStackTrace();
return false;
}
}


public String spaceTrim(String input){
try{
String output =input.trim();
return output;
}
catch(Exception e)
{
System.out.println("1.Input String values cannot be null. 2.Please check and provide valid input String. 3.Now it will return default value an empty string");
e.printStackTrace();
return "";
}
}


}
