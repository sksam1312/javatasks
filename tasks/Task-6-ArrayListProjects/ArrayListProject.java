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


public <T> ArrayList<T> getArrayList() {
return new ArrayList<>();
}


public <T> ArrayList<T> getList(T[] array) throws InvalidDataException {
DataValidation.nullCheck(array);
ArrayList<T> list = new ArrayList<>();
for (T element : array) {
list.add(element);
}
return list;
}


public <T> T performOperation(ListOperations<T> operation) throws InvalidDataException {
DataValidation.nullCheck(operation);
return operation.perform();
}

}


