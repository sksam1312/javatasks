package com.collectionz;
import com.utility.*;
import java.util.*;


public class FindIndexOfElement<T> implements ListOperations<Integer>{

private List<T> list;
private T element;

public FindIndexOfElement(List<T> list,T element)  throws InvalidDataException{
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
this.list=list;
this.element=element;
}

@Override
public Integer perform() throws InvalidDataException{
return list.indexOf(element);
}


}


