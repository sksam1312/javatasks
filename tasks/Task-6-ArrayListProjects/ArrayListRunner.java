package com.collectionz;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.utility.InvalidDataException;


public class ArrayListRunner{
public static void main(String[] args){
int size, num, index, startIndex, endIndex;
String input,output;
Scanner sc=new Scanner(System.in);
ArrayListProject alp = new ArrayListProject();


try{
ArrayList<Object> al = alp.getArrayList();
size = alp.getSize(al);
System.out.println("The ArrayList is " + al);
System.out.println("The size of given ArrayList is " + size);
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs = new String[num];
for (int i = 0; i < num; i++){
System.out.println("Enter String " + (i + 1));
inputs[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(inputs);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of integer inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
Integer[] intArray = new Integer[num];
for (int i = 0; i < num; i++){
System.out.println("Enter Integer " + (i + 1));
intArray[i] = sc.nextInt();
}
ArrayList<Integer> intList = alp.getList(intArray);
size = alp.getSize(intList);
System.out.println("The ArrayList is " + intList);
System.out.println("The size of given ArrayList is " + size);
}
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
ArrayListProject alp1 = new ArrayListProject("Custom obj1");
ArrayListProject alp2 = new ArrayListProject("Custom obj2");
ArrayListProject alp3 = new ArrayListProject("Custom obj3");
ArrayListProject[] obj = {alp1, alp2, alp3};
ArrayList<ArrayListProject> al = alp.getList(obj);
size = alp.getSize(al);
System.out.println("The ArrayList is " + al);
System.out.println("The size of given ArrayList is " + size);
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try {
System.out.println("Enter the number of string inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] stringInputs = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + ":");
stringInputs[i] = sc.nextLine();
}
System.out.println("Enter the number of integer inputs you are going to give:");
num = sc.nextInt();
sc.nextLine(); 
Integer[] intInputs = new Integer[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter Integer " + (i + 1) + ":");
intInputs[i] = sc.nextInt();
}
ArrayListProject alp1 = new ArrayListProject("Custom obj1");
ArrayListProject alp2 = new ArrayListProject("Custom obj2");
ArrayListProject alp3 = new ArrayListProject("Custom obj3");
ArrayListProject[] customObjects = {alp1, alp2, alp3};
ArrayList<String> stringList = alp.getList(stringInputs);
ArrayList<Integer> intList = alp.getList(intInputs);
ArrayList<ArrayListProject> customObjectList = alp.getList(customObjects);
ArrayList<Object> combinedList = new ArrayList<>();
combinedList.addAll(stringList);
combinedList.addAll(intList);
combinedList.addAll(customObjectList);
size = alp.getSize(combinedList);
System.out.println("The ArrayList is: " + combinedList);
System.out.println("The size of the given ArrayList is: " + size);
} 
catch (Exception exp) {
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine(); 
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs = new String[num];
for (int i = 0; i < num; i++){
System.out.println("Enter String " + (i + 1));
inputs[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(inputs);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter a String from the ArrayList to find the index of that String:");
input = sc.nextLine();
index = alp.findIndexOfElement(strList, input);
if (index == -1){
System.out.println("The given input String doesn't present in the ArrayList. Please Check.");
} else {
System.out.println("The Index of the given input String in the ArrayList is " + index);
}
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs = new String[num];
for (int i = 0; i < num; i++){
System.out.println("Enter String " + (i + 1));
inputs[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(inputs);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("The iteration of given ArrayList is:");
Iterator<String> iterator = alp.iteratingList(strList);
while (iterator.hasNext()){
System.out.println(iterator.next());
}
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1));
inputs[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(inputs);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter the index from the ArrayList to find a String: ");
index = sc.nextInt();
sc.nextLine();
output = alp.findingElementAtIndex(strList, index);
System.out.println("The value of String at the given index is " + output);
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1));
inputs[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(inputs);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter a String from the ArrayList to find the index of that String:");
input = sc.nextLine();
int firstIndex = alp.findIndexOfElement(strList, input);
int lastIndex = alp.findingLastIndexOfElement(strList, input);
if(firstIndex == -1){
System.out.println("The given input String doesn't present in the ArrayList. Please Check.");
} 
else{
System.out.println("The First Index of the given input String in the ArrayList is " + firstIndex);
System.out.println("The Last Index of the given input String which is duplicate in the ArrayList is " + lastIndex);
}
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of string inputs you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs = new String[num];
for (int i = 0; i < num; i++){
System.out.println("Enter String " + (i + 1));
inputs[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(inputs);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter the start index to be sublisted:");
startIndex = sc.nextInt();
System.out.println("Enter the end index to be sublisted:");
endIndex = sc.nextInt();
sc.nextLine();
List<String> newSubList = alp.listSubList(strList, startIndex, endIndex);
ArrayList<String> subList=new ArrayList<>(newSubList);
System.out.println("The sublist of the given ArrayList is " + subList);
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try{
System.out.println("Enter the number of strings for the first list:");
num = sc.nextInt();
sc.nextLine(); 
String[] inputs1 = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + " for the first list:");
inputs1[i] = sc.nextLine();
}
List<String> list1 = alp.getList(inputs1);
System.out.println("Enter the number of strings for the second list:");
num = sc.nextInt();
sc.nextLine();
String[] inputs2 = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + " for the second list:");
inputs2[i] = sc.nextLine();
}
List<String> list2 = alp.getList(inputs2);
List<String> mergedLeft = alp.mergeLeftList(list1, list2);
System.out.println("Merged List (Left): " + mergedLeft);
List<String> mergedRight = alp.mergeRightList(list1, list2);
System.out.println("Merged List (Right): " + mergedRight);
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
}


try {
System.out.println("Enter the number of string inputs for the first ArrayList:");
num = sc.nextInt();
sc.nextLine();
String[] inputs1 = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + " for the first ArrayList:");
inputs1[i] = sc.nextLine();
}
List<String> list1 = alp.getList(inputs1);
System.out.println("The first ArrayList is: " + list1);
System.out.println("Enter the number of string inputs for the second ArrayList:");
num = sc.nextInt();
sc.nextLine(); // Consume newline
String[] inputs2 = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + " for the second ArrayList:");
inputs2[i] = sc.nextLine();
}
List<String> list2 = alp.getList(inputs2);
System.out.println("The second ArrayList is: " + list2);
List<String> removedList = alp.removeSubList(list1, list2);
System.out.println("The first ArrayList after removing elements present in the second ArrayList is: " + removedList);
List<String> retainedList = alp.retainSubList(list1, list2);
System.out.println("The first ArrayList after retaining only elements present in the second ArrayList is: " + retainedList);
} catch (Exception exp) {
System.out.println("Error during list creation: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine(); 
}


try {
System.out.println("Enter the number of elements you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] strArray = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter element " + (i + 1));
strArray[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(strArray);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter a string to remove from the ArrayList:");
input = sc.nextLine();
boolean isRemoved = alp.removeElement(strList, input);
if(isRemoved){
System.out.println("Element removed. The updated ArrayList is " + strList);
} else {
System.out.println("Element not found. The ArrayList remains the same.");
}
} catch (Exception exp) {
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try {
System.out.println("Enter the number of float/decimal inputs you are going to give:");
num = sc.nextInt();
sc.nextLine(); 
Float[] floatInputs = new Float[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter decimal value " + (i + 1) + ":");
floatInputs[i] = sc.nextFloat();
}
List<Float> floatList = alp.getList(floatInputs);
System.out.println("The original ArrayList is: " + floatList);
System.out.println("Enter the index of the decimal value you want to remove:");
index = sc.nextInt();
sc.nextLine(); 
floatList = alp.removeElementAt(floatList, index);
System.out.println("The ArrayList after removing the element at index " + index + " is: " + floatList);
} catch (Exception exp) {
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine(); 
}


try {
System.out.println("Enter the number of elements you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] strArray = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter element " + (i + 1));
strArray[i] = sc.nextLine();
}
ArrayList<String> strList = alp.getList(strArray);
size = alp.getSize(strList);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Clearing the ArrayList...");
alp.clearList(strList);
System.out.println("The cleared ArrayList is " + strList);
} catch (Exception exp) {
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try {
System.out.println("Enter the number of string inputs for the ArrayList:");
num = sc.nextInt();
sc.nextLine(); // Consume newline
String[] inputs = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + ":");
inputs[i] = sc.nextLine();
}
List<String> list = alp.getList(inputs);
System.out.println("The ArrayList is: " + list);
System.out.println("Enter the String to check if it is present in the ArrayList:");
String elementToCheck = sc.nextLine();
boolean isPresent = alp.containsElement(list, elementToCheck);
if (isPresent) {
System.out.println("The given String is present in the ArrayList.");
} else {
System.out.println("The given String is not present in the ArrayList.");
}
} 
catch (Exception exp) {
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}

sc.close();





}
}




                