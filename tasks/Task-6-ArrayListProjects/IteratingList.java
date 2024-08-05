package com.collectionz;
import com.utility.*;
import java.util.*;


public class IteratingList<T> implements ListOperations<Iterator<T>>{

private List<T> list;


public IteratingList(List<T> list) throws InvalidDataException {
DataValidation.nullCheck(list);
this.list=list;
}


@Override
public Iterator<T> perform() throws InvalidDataException{
return list.iterator();
}


}


