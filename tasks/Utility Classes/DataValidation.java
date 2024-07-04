package com.utility;

public class DataValidation{


private  DataValidation(){
}


public static void nullCheck(Object input) throws InvalidDataException{
if (input==null) {
throw new InvalidDataException("Input cannot be null");
}
}


public static void indexRangeCheck(int strLength,int index) throws InvalidDataException{
if (index < 0 || index >=strLength) {
throw new InvalidDataException("Invalid integer value for index which is out of bound/range.");
}
}


public  static void indexRangeCheck(int strLength,int startIndex,int endIndex) throws InvalidDataException{
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


public static void validateNumber(int strLength, int num) throws InvalidDataException{
if (num<=0||num>strLength){
throw new InvalidDataException("Invalid integer value/number which is out of bound/range.");
}
}

}