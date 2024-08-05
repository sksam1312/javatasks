package com.collectionz;
import com.utility.*;
import java.util.*;


public class ClearList<T> implements ListOperations<List<T>> {

private List<T> list;


public ClearList(List<T> list) throws InvalidDataException {
DataValidation.nullCheck(list);
this.list=list;
}


@Override
public List<T> perform()throws InvalidDataException{
list.clear();
return list;
}



}


