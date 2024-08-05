package com.collectionz;
import com.utility.*;
import java.util.*;


public class FindingElementAtIndex<T> implements ListOperations<T>{

private int index;
private List<T> list;

public FindingElementAtIndex(List<T> list,int index) throws InvalidDataException {
DataValidation.nullCheck(list);
this.list=list;
this.index=index;
}


@Override
public T perform() throws InvalidDataException {
ArrayListProject alp=new ArrayListProject();
ListOperations<Integer> lobj=new GetSize<>(list);
int size = alp.performOperation(lobj);
DataValidation.indexRangeCheck(size, index);
return list.get(index);
}



}


