package com.collectionz;
import com.utility.*;
import java.util.*;


public class RemoveElement<T> implements ListOperations<Boolean> {

private List<T> list;
private T element;


public RemoveElement(List<T> list, T element) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
this.list=list;
this.element=element;
}


@Override
public Boolean perform()throws InvalidDataException{
return list.remove(element);
}


}


