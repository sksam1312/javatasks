package com.collectionz;
import com.utility.*;
import java.util.*;


public class FindingLastIndexOfElement<T> implements ListOperations<Integer> {

private T element;
private List<T> list;


public FindingLastIndexOfElement(List<T> list,T element) throws InvalidDataException {
DataValidation.nullCheck(list);
this.list=list;
this.element=element;
}


public Integer perform() throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(element);
return list.lastIndexOf(element);
}




}


