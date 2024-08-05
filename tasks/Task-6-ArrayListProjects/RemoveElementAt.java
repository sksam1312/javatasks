package com.collectionz;
import com.utility.*;
import java.util.*;


public class RemoveElementAt<T> implements ListOperations<T> {

private List<T> list;
private int index;


public RemoveElementAt(List<T> list, int index) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(index);
this.list=list;
this.index=index;
}


@Override
public T perform()throws InvalidDataException{
ArrayListProject alp=new ArrayListProject();
ListOperations<Integer> lobj=new GetSize<>(list);
int size = alp.performOperation(lobj);
DataValidation.indexRangeCheck(size, index);
return list.remove(index);
}


}





