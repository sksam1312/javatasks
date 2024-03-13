package com.al;
import java.util.*;




public class ArrayListDemo{

private static Scanner sc=new Scanner(System.in);
private String name;

public ArrayListDemo(){
}

public ArrayListDemo(String name){
this.name=name;
}

public String toString(){
return name;
}


public void arrayListSize(){
System.out.println("ARRAYLIST SIZE:-");
ArrayList al=new ArrayList();
System.out.println("The Size of Arraylist is "+ al.size());
}

public void arrayListString(){
System.out.println("ARRAYLIST STRING:-");
ArrayList<String> al=new ArrayList<String>();
for(int i=0;i<5;i++){
System.out.println("Enter a value for String"+(i+1));
String s=sc.nextLine();
al.add(s);
}
System.out.println("The ArrayList of string is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}



public void arrayListInteger(){
System.out.println("ARRAYLIST INTEGER:-");
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<5;i++){
System.out.println("Enter the value for Integer "+(i+1));
int a=sc.nextInt();
al.add(a);
}
System.out.println("The ArrayList of integer is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}


public void addCustomObject(){
System.out.println("ARRAYLIST ADD CUSTOM OBJECTS:-");
ArrayListDemo lion=new ArrayListDemo("lion");
ArrayListDemo tiger=new ArrayListDemo("tiger");
ArrayListDemo wolf=new ArrayListDemo("wolf");
ArrayList<ArrayListDemo> al=new ArrayList<ArrayListDemo>();
al.add(lion);
al.add(tiger);
al.add(wolf);
System.out.print("The ArrayList of custom objects is ");
for(ArrayListDemo s:al){
System.out.print(s.name+" ");
}
System.out.println();
System.out.println("The Size of Arraylist is "+ al.size());
}


public  void addVariousObjects(){
System.out.println("ARRAYLIST ADD VARIOUS OBJECTS:-");
ArrayList <Object>al=new ArrayList<>();
for(int i=0;i<2;i++){
System.out.println("Enter a value for integer "+(i+1)); 
int a=sc.nextInt();
al.add(a);
}
for(int i=0;i<2;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
ArrayListDemo shark=new ArrayListDemo("shark");
ArrayListDemo whale=new ArrayListDemo("whale");
al.add(shark);
al.add(whale);
for(int i=0;i<al.size();i++){
System.out.print(al.get(i)+" ");
}
System.out.println();
System.out.println("The Size of Arraylist is "+ al.size());
}


public  void findIndexOfString(){
System.out.println("ARRAYLIST FINDING INDEX OF STRING:-");
ArrayList<String> al=new ArrayList<String>();
for (int i=0;i<4;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
System.out.println("Enter a value for string to find the index: ");
String index=sc.nextLine();
int a=al.indexOf(index);
System.out.println("The ArrayList of String is "+al);
System.out.println("The index of "+index+" is: "+a);
System.out.println("The Size of Arraylist is "+ al.size());
}


public void iteratingList(){
System.out.println("ARRAYLIST ITERATING-");
ArrayList<String> al=new ArrayList<String>();
for (int i=0;i<5;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
Iterator<String> iterator=al.iterator();
System.out.println("The ArrayList is printed using iterator method:");
for(;iterator.hasNext();){
System.out.println(iterator.next());
}
}


public  void  findingStringAtIndex(){
System.out.println("ARRAYLIST FINDING STRING AT INDEX:-");
ArrayList<String> al=new ArrayList<String>();
for (int i=0;i<5;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
System.out.println("Enter a index position to find the value :");
int value=sc.nextInt();
String str=al.get(value);
System.out.println("The String at the index "+value+" is : "+str);
System.out.println("The Size of Arraylist is "+ al.size());
}



public void findingIndexOfDuplicates(){
System.out.println("ARRAYLIST FINDING INDEX OF DUPLICATES:-");
ArrayList<String> al=new ArrayList<String>();
for (int i=0;i<5;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
System.out.println("Enter a duplicate string which you added before to find the first and last index of the string:");
String str=sc.nextLine();
int a=al.indexOf(str);
int b=al.lastIndexOf(str);
System.out.println("The ArrayList of String is:"+al);
System.out.println("The first position of duplicate String at the index : "+a);
System.out.println("The last position of duplicate String at the index : "+b);
System.out.println("The Size of Arraylist is "+ al.size());
}



public  void insertIntoArrayList(){
System.out.println("INSERT INTO ARRAYLIST:-");
ArrayList<String> al=new ArrayList<String>();
for (int i=0;i<5;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
System.out.println("Enter a value for string to be inserted in the array list at the index position 2");
String str=sc.nextLine();
al.add(2,str);
System.out.println("The ArrayList of string is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}




public void arrayListSublist(){
System.out.println("ARRAYLIST SUBLIST");
ArrayList<String> al=new ArrayList<String>();
for (int i=0;i<10;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
System.out.println("The Arraylist of string is "+al);
ArrayList<String> newlist=new ArrayList<>(al.subList(3,8));
System.out.println("The Sublist from  Arraylist of elements from 3 to 8  is "+ newlist);
System.out.println("The Size of Arraylist is "+ al.size());
System.out.println("The Size of Arraylist is "+ newlist.size());
}



public  void mergeLeftArrayList(){
System.out.println("MERGE LEFT ARRAYLIST:-");
ArrayList<String> al=new ArrayList<String>();
System.out.println("ARRAY LIST 1:-"); 
for (int i=0;i<3;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
System.out.println(al);
System.out.println("ARRAY LIST 2:-"); 
ArrayList<String> list=new ArrayList<String>();
for (int i=0;i<5;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
list.add(s);
}
ArrayList<String> newlist=new ArrayList<>(al);
newlist.addAll(list);
System.out.println("The Final ArrayList is "+newlist);
System.out.println("The Size of Arraylist is "+ al.size());
System.out.println("The Size of Arraylist is "+ list.size());
System.out.println("The Size of Arraylist is "+ newlist.size());
}



public  void  mergeRightArrayLists(){
System.out.println("MERGE RIGHT ARRAYLIST:-");
ArrayList<String> al=new ArrayList<String>();
System.out.println("ARRAY LIST 1:-"); 
for (int i=0;i<5;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
al.add(s);
}
System.out.println(al);
System.out.println("ARRAY LIST 2:-"); 
ArrayList<String> list=new ArrayList<String>();
for (int i=0;i<3;i++){
System.out.println("Enter a value for string "+(i+1)); 
String s=sc.nextLine();
list.add(s);
}
ArrayList<String> newlist=new ArrayList<>(list);
newlist.addAll(al);
System.out.println("The Third Arraylist created using two arraylists is "+  newlist);
System.out.println("The Size of Arraylist is "+ al.size());
System.out.println("The Size of Arraylist is "+ list.size());
System.out.println("The Size of Arraylist is "+ newlist.size());
}


public void removeDecimalValue(){
System.out.println("REMOVE DECIMAL VALUE:-");
ArrayList<Float> al=new ArrayList<>();
for (int i=0;i<5;i++){
System.out.println("Enter the decimal value:"+(i+1));
Float f=sc.nextFloat();
al.add(f);
}
System.out.println(al);
System.out.println("The Size of Arraylist is "+ al.size());
System.out.println("Enter the index value to remove from the arraylist:");
int index=sc.nextInt();
al.remove(index);
System.out.println("The Arraylist is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}


public void removeDecimalValueAt(){
System.out.println("REMOVE DECIMAL VALUE AT INDEX 4:-");
ArrayList<Float> al=new ArrayList<>();
for (int i=0;i<5;i++){
System.out.println("Enter the decimal value:"+(i+1));
Float f=sc.nextFloat();
al.add(f);
}
System.out.println("The Arraylist is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
al.remove(4);
System.out.println("The Arraylist is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}




public  void removeSublist(){
System.out.println("REMOVE SUBLIST:-");
ArrayList<String> al=new ArrayList<>();
for (int i=0;i<5;i++){
System.out.println("Enter the value for string:"+(i+1));
String s=sc.nextLine();
al.add(s);
}
System.out.println("The  First Arraylist is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
ArrayList<String> list=new ArrayList<>();
for (int i=0;i<3;i++){
list.add(al.get(i));
}
System.out.println("The Second Arraylist is "+list);
System.out.println("The Size of Arraylist is "+ list.size());
al.removeAll(list);
System.out.println("After removing the elements in the First Arraylist by the values present in the Second Arraylist is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}




public  void retainSublist(){
System.out.println("RETAIN SUBLIST:-");
ArrayList<String> al=new ArrayList<>();
for (int i=0;i<5;i++){
System.out.println("Enter the value for string:"+(i+1));
String s=sc.nextLine();
al.add(s);
}
System.out.println("The  First Arraylist is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
ArrayList<String> list=new ArrayList<>();
for (int i=0;i<3;i++){
list.add(al.get(i));
}
System.out.println("The Second Arraylist is "+list);
System.out.println("The Size of Arraylist is "+ list.size());
al.retainAll(list);
System.out.println("After removing the elements in the First Arraylist by the values which are not present in the Second Arraylist is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}



public void longArrayList(){
System.out.println("LONG ARRAYLIST REMOVE:-");
ArrayList<Long> al=new ArrayList<>();
for (int i=0;i<5;i++){
System.out.println("Enter the value for long:"+(i+1));
Long l=sc.nextLong();
al.add(l);
}
System.out.println("The ArrayList of Long values is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
al.clear();
System.out.println("The ArrayList after the values are removed from it is "+al);
System.out.println("The Size of Arraylist is "+ al.size());
}


public  void containsString(){
System.out.println("ARRAYLIST CONTAINS STRING:-");
ArrayList<String> al=new ArrayList<>();
for (int i=0;i<5;i++){
System.out.println("Enter the value for string:"+(i+1));
String s=sc.nextLine();
al.add(s);
}
System.out.println("The Arraylist of string is "+al);
System.out.println("Enter a string to check whether the string is present(True) or not(False):-" );
String str=sc.nextLine();
System.out.println(al.contains(str));
System.out.println("The Size of Arraylist is "+ al.size());
}

}


