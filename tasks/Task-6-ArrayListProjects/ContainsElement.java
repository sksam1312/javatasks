package com.collectionz;
import com.utility.*;
import java.util.*;


public class ContainsElement<T> implements ListOperations<Boolean> {

private List<T> list;
private T element;


public ContainsElement(List<T> list,T element) throws InvalidDataException{
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
this.list=list;
this.element=element;
}


@Override
public Boolean perform() throws InvalidDataException{
return list.contains(element);
}


}