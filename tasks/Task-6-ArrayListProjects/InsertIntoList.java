package com.collectionz;
import com.utility.*;
import java.util.*;


public class InsertIntoList<T> implements ListOperations<List<T>> {

private List<T> list;
private T element;
private int index;

public InsertIntoList(List<T> list,T element,int index) throws InvalidDataException {
DataValidation.nullCheck(element);
this.list=list;
this.element=element;
this.index=index;
}

@Override
public List<T> perform() throws InvalidDataException {
ArrayListProject alp=new ArrayListProject();
ListOperations<Integer> lobj=new GetSize<>(list);
int size = alp.performOperation(lobj);
DataValidation.indexRangeCheck(size, index);
list.add(index, element);
return list;
}






}


