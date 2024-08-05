package com.collectionz;
import com.utility.*;
import java.util.*;


public class ListSubList<T> implements ListOperations<List<T>>{

private List<T> list;
private int startIndex;
private int endIndex;


public ListSubList(List<T> list, int startIndex, int endIndex) throws InvalidDataException {
DataValidation.nullCheck(list);
this.list=list;
this.startIndex=startIndex;
this.endIndex=endIndex;
}


@Override
public List<T> perform()  throws InvalidDataException{
ArrayListProject alp=new ArrayListProject();
ListOperations<Integer> lobj=new GetSize<>(list);
int size = alp.performOperation(lobj);
DataValidation.indexRangeCheck(size, startIndex, endIndex);
return list.subList(startIndex, endIndex);
}


}


