package com.collectionz;
import com.utility.*;
import java.util.*;


public class RetainSubList<T> implements ListOperations<List<T>>{

private List<T> list;
private List<T> subList;


public RetainSubList(List<T> list, List<T> subList) throws InvalidDataException {
DataValidation.nullCheck(list);
DataValidation.nullCheck(subList);
this.list=list;
this.subList=subList;
}


@Override
public List<T> perform() throws InvalidDataException {
list.retainAll(subList);
return list;
}



}


