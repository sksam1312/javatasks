package com.collectionz;
import com.utility.*;
import java.util.*;


public class ArrayListProject{

private String name;


public ArrayListProject(){
}


public ArrayListProject(String name) throws InvalidDataException{
DataValidation.nullCheck(name);
this.name=name;
}


public String toString(){
return name;
}


public ArrayList getArrayList(){
return new ArrayList();
}

public int getSize(ArrayList al)  throws InvalidDataException{
DataValidation.nullCheck(al);
int size=al.size();
return size;
}


public ArrayList<String> getStringList(String[] array)  throws InvalidDataException{
DataValidation.nullCheck(array);
ArrayList<String> al=new ArrayList<String>();
for(int i=0;i<array.length;i++){
al.add(array[i]);
}
return al;
}


public ArrayList<Integer> getIntegerList(int[] num)  throws InvalidDataException{
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<num.length;i++){
al.add(num[i]);
}
return al;
}


public ArrayList<ArrayListProject>  addCustomObject(ArrayListProject[] obj)  throws InvalidDataException{
DataValidation.nullCheck(obj);
ArrayList<ArrayListProject> al=new ArrayList<ArrayListProject>();
for(int i=0;i<obj.length;i++){
al.add(obj[i]);
}
return al;
}


public  ArrayList<Object> addVariousObjects(String[] array,int[] num,ArrayListProject[] obj)  throws InvalidDataException{
DataValidation.nullCheck(array);
DataValidation.nullCheck(obj);
ArrayList <Object>al=new ArrayList<>();
for(int i=0;i<array.length;i++){
al.add(array[i]);
}
for(int i=0;i<num.length;i++){
al.add(num[i]);
}
for(int i=0;i<obj.length;i++){
al.add(obj[i]);
}
return al;
}


public int findIndexOfString(ArrayList<String> al,String input)  throws InvalidDataException{
DataValidation.nullCheck(al);
DataValidation.nullCheck(input);
int index=al.indexOf(input);
return index;
}


public Iterator<String> iteratingList(ArrayList<String> al)  throws InvalidDataException{
DataValidation.nullCheck(al);
Iterator<String> iterator=al.iterator();
return iterator;
}


public String findingStringAtIndex(ArrayList<String> al,int index)  throws InvalidDataException{
int size=getSize(al);
DataValidation.indexRangeCheck(size,index);
String str=al.get(index);
return str;
}


public int findingLastIndexOfString(ArrayList<String> al,String input)  throws InvalidDataException{
DataValidation.nullCheck(al);
DataValidation.nullCheck(input);
int lastIndex=al.lastIndexOf(input);
return lastIndex;
}


public  ArrayList<String>  insertIntoArrayList(ArrayList<String> al,String input,int index)  throws InvalidDataException{
int size=getSize(al);
DataValidation.nullCheck(input);
DataValidation.indexRangeCheck(size,index);
al.add(2,input);
return al;
}


public ArrayList<String> arrayListSubList(ArrayList<String> al,int startIndex,int endIndex)  throws InvalidDataException{
int size=getSize(al);
DataValidation.indexRangeCheck(size,startIndex,endIndex);
ArrayList<String> newList=new ArrayList<String>(al.subList(startIndex,endIndex));
return newList;
}


public ArrayList<String> mergeLeftArrayList(ArrayList<String> one,ArrayList<String> two)  throws InvalidDataException{
DataValidation.nullCheck(one);
DataValidation.nullCheck(two);
ArrayList<String> newList=new ArrayList<>(one);
newList.addAll(two);
return newList;
}


public ArrayList<String>  mergeRightArrayList(ArrayList<String> one,ArrayList<String> two)  throws InvalidDataException{
DataValidation.nullCheck(one);
DataValidation.nullCheck(two);
ArrayList<String> newList=new ArrayList<>(two);
newList.addAll(one);
return newList;
}


public ArrayList<Float> removeDecimalValue(ArrayList<Float> al,Object element)  throws InvalidDataException{
DataValidation.nullCheck(al);
DataValidation.nullCheck(element);
al.remove(element);
return al;
}


public ArrayList<Float>  removeDecimalValueAt(ArrayList<Float> al,int index)  throws InvalidDataException{
int size=getSize(al);
DataValidation.indexRangeCheck(size,index);
al.remove(index);
return al;
}


public ArrayList<String> removeSubList(ArrayList<String> al,ArrayList<String> subList)  throws InvalidDataException{
DataValidation.nullCheck(al);
DataValidation.nullCheck(subList);
al.removeAll(subList);
return al;
}


public ArrayList<String> retainSubList(ArrayList<String> al,ArrayList<String> subList)  throws InvalidDataException{
DataValidation.nullCheck(al);
DataValidation.nullCheck(subList);
al.retainAll(subList);
return al;
}


public ArrayList<Long> clearElements(ArrayList<Long> al)  throws InvalidDataException{
DataValidation.nullCheck(al);
al.clear();
return al;
}


public boolean containsString(ArrayList<String> al,String input)  throws InvalidDataException{
DataValidation.nullCheck(al);
DataValidation.nullCheck(input);
boolean isPresent=al.contains(input);
return isPresent;
}

}


