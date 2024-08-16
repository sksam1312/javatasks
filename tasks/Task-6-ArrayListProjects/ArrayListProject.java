package com.collectionz;
import com.utility.*;
import java.util.*;


public class ArrayListProject {

private String name;

public ArrayListProject(){}

public ArrayListProject(String name) throws InvalidDataException {
DataValidation.nullCheck(name);
this.name = name;
}


@Override
public String toString(){
return name;
}


public <T> T performOperation(ListOperations<T> operation) throws InvalidDataException {
DataValidation.nullCheck(operation);
return operation.perform();
}


public <T> ArrayList<T> getArrayList() {
return new ArrayList<>();
}


public <T> int getSize(List<T> list) throws InvalidDataException {
DataValidation.nullCheck(list);
return list.size();
}


public <T> ArrayList<T> getList(T[] array) throws InvalidDataException {
DataValidation.nullCheck(array);
ArrayList<T> list = new ArrayList<>();
for (T element : array) {
list.add(element);
}
return list;
}


public <T> int findIndexOfElement(List<T> list, T element) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
return list.indexOf(element);
}


public <T> Iterator<T> iteratingList(List<T> list) throws InvalidDataException {
DataValidation.nullCheck(list);
return list.iterator();
}


public <T> T findingElementAtIndex(List<T> list, int index) throws InvalidDataException {
int size = getSize(list);
DataValidation.indexRangeCheck(size, index);
return list.get(index);
}


public <T> int findingLastIndexOfElement(List<T> list, T element) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
return list.lastIndexOf(element);
}


public <T> List<T> insertIntoList(List<T> list, T element, int index) throws InvalidDataException {
int size = getSize(list);
DataValidation.nullCheck(element);
DataValidation.indexRangeCheck(size, index);
list.add(index, element);
return list;
}


public <T> List<T> listSubList(List<T> list, int startIndex, int endIndex) throws InvalidDataException {
int size = getSize(list);
DataValidation.indexRangeCheck(size, startIndex, endIndex);
return list.subList(startIndex, endIndex);
}


public <T> List<T> mergeLeftList(List<T> one, List<T> two) throws InvalidDataException {
DataValidation.nullCheck(one);
DataValidation.nullCheck(two);
List<T> newList = new ArrayList<>(one);
newList.addAll(two);
return newList;
}


public <T> List<T> mergeRightList(List<T> one, List<T> two) throws InvalidDataException {
DataValidation.nullCheck(one);
DataValidation.nullCheck(two);
List<T> newList = new ArrayList<>(two);
newList.addAll(one);
return newList;
}


public <T> boolean removeElement(List<T> list, T element) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
return list.remove(element);
}


public <T> List<T> removeElementAt(List<T> list, int index) throws InvalidDataException {
int size = getSize(list);
DataValidation.indexRangeCheck(size, index);
list.remove(index);
return list;
}


public <T> List<T> removeSubList(List<T> list, List<T> subList) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(subList);
list.removeAll(subList);
return list;
}


public <T> List<T> retainSubList(List<T> list, List<T> subList) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(subList);
list.retainAll(subList);
return list;
}


public <T> List<T> clearList(List<T> list) throws InvalidDataException {
DataValidation.nullCheck(list);
list.clear();
return list;
}


public <T> boolean containsElement(List<T> list, T element) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
return list.contains(element);
}



}


