package com.collectionz;
import java.util.*;


public class ArrayListRunner{
public static void main(String[] args){
int size, num, index, startIndex, endIndex;
String input,output;
Scanner sc=new Scanner(System.in);
ArrayListProject alp = new ArrayListProject();


try{
ArrayList<Object> al = alp.getArrayList();
ListOperations<Integer> lobj=new GetSize<>(al);
size=alp.performOperation(lobj);
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
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
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
List<Integer> intList = alp.getList(intArray);
ListOperations<Integer> lobj=new GetSize<>(intList);
size = alp.performOperation(lobj);;
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
List<ArrayListProject> al = alp.getList(obj);
ListOperations<Integer> lobj=new GetSize<>(al);
size = alp.performOperation(lobj);
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
List<String> stringList = alp.getList(stringInputs);
List<Integer> intList = alp.getList(intInputs);
List<ArrayListProject> customObjectList = alp.getList(customObjects);
List<Object> combinedList = new ArrayList<>();
combinedList.addAll(stringList);
combinedList.addAll(intList);
combinedList.addAll(customObjectList);
ListOperations<Integer> lobj=new GetSize<>(combinedList);
size = alp.performOperation(lobj);
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
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter a String from the ArrayList to find the index of that String:");
input = sc.nextLine();
lobj=new FindIndexOfElement<>(strList, input);
index = alp.performOperation(lobj);
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
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
ListOperations<Iterator<String>> iter=new IteratingList<>(strList);
Iterator<String> iterator =alp.performOperation(iter);
System.out.println("The iteration of given ArrayList is:");
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
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter the index from the ArrayList to find a String: ");
index = sc.nextInt();
sc.nextLine();
ListOperations<String> strOperation=new FindingElementAtIndex<>(strList,index);
output = alp.performOperation(strOperation);
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
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter a String from the ArrayList to find the index of that String:");
input=sc.nextLine();
lobj=new FindIndexOfElement<>(strList, input);
int firstIndex= alp.performOperation(lobj);
lobj=new FindingLastIndexOfElement<>(strList, input);
int lastIndex= alp.performOperation(lobj);
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
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1));
inputs[i] = sc.nextLine();
}
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter a String to insert into the ArrayList");
input=sc.nextLine();
System.out.println("Enter the index position to put the element at the list");
index = sc.nextInt();
sc.nextLine();
ListOperations<List<String>> loStr=new InsertIntoList<>(strList,input,index);
strList= alp.performOperation(loStr);
size = alp.performOperation(lobj);
System.out.println("The Final ArrayList is " + strList);
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
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter the start index to be sublisted:");
startIndex = sc.nextInt();
System.out.println("Enter the end index to be sublisted:");
endIndex = sc.nextInt();
sc.nextLine();
ListOperations<List<String>> loStr=new ListSubList<>(strList, startIndex, endIndex);
List<String> newSubList = alp.performOperation(loStr);
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
ListOperations<List<String>> loStr=new MergeLeftList<>(list1,list2);
List<String> mergedLeft = alp.performOperation(loStr);
System.out.println("Merged List (Left): " + mergedLeft);
loStr=new MergeRightList<>(list1,list2);
List<String> mergedRight = alp.performOperation(loStr);
System.out.println("Merged List (Right): " + mergedRight);
} 
catch (Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
}


try {
System.out.println("Enter the number of elements you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs= new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter element " + (i + 1));
inputs[i] = sc.nextLine();
}
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter a string to remove from the ArrayList:");
input = sc.nextLine();
ListOperations<Boolean> loBool =new RemoveElement<>(strList, input);
Boolean isRemoved = alp.performOperation(loBool);
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
ListOperations<Integer> lobj=new GetSize<>(floatList);
size = alp.performOperation(lobj);
System.out.println("The original ArrayList is: " + floatList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Enter the index of the decimal value you want to remove:");
index = sc.nextInt();
sc.nextLine(); 
ListOperations<Float> loFloat =new RemoveElementAt<>(floatList,index);
Float fout=alp.performOperation(loFloat);
if(fout!=null){
System.out.println("Element removed at given index is "+fout+".The updated ArrayList is " + floatList);
} else {
System.out.println("Element not found. The ArrayList remains the same.");
}
} 
catch (Exception exp) {
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine(); 
}


try {
System.out.println("Enter the number of elements you are going to give:");
num = sc.nextInt();
sc.nextLine();
String[] inputs = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter element " + (i + 1));
inputs[i] = sc.nextLine();
}
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is " + strList);
System.out.println("The size of given ArrayList is " + size);
System.out.println("Clearing the ArrayList...");
ListOperations<List<String>> loStr=new ClearList<>(strList);
alp.performOperation(loStr);
System.out.println("The cleared ArrayList is " + strList);
} catch (Exception exp) {
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine();
}


try {
System.out.println("Enter the number of string inputs for the ArrayList:");
num = sc.nextInt();
sc.nextLine(); 
String[] inputs = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + ":");
inputs[i] = sc.nextLine();
}
List<String> strList = alp.getList(inputs);
ListOperations<Integer> lobj=new GetSize<>(strList);
size = alp.performOperation(lobj);
System.out.println("The ArrayList is: " + strList);
System.out.println("Enter the String to check if it is present in the ArrayList:");
String elementToCheck = sc.nextLine();
ListOperations<Boolean> loBool =new ContainsElement<>(strList,elementToCheck);
Boolean isPresent= alp.performOperation(loBool);
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
sc.nextLine(); 
String[] inputs2 = new String[num];
for (int i = 0; i < num; i++) {
System.out.println("Enter String " + (i + 1) + " for the second ArrayList:");
inputs2[i] = sc.nextLine();
}
List<String> list2 = alp.getList(inputs2);
System.out.println("The second ArrayList is: " + list2);
ListOperations<List<String>> loStr=new RemoveSubList<>(list1, list2);
List<String> removedList = alp.performOperation(loStr);
System.out.println("The first ArrayList after removing elements present in the second ArrayList is: " + removedList);
loStr=new RetainSubList<>(list1,list2);
List<String> retainedList = alp.performOperation(loStr);
System.out.println("The first ArrayList after retaining only elements present in the second ArrayList is: " + retainedList);
} 
catch (Exception exp) {
System.out.println("Error during list creation: " + exp.getMessage());
exp.printStackTrace();
sc.nextLine(); 
}

}
}




                