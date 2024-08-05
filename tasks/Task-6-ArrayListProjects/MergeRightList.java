package com.collectionz;
import com.utility.*;
import java.util.*;


public class MergeRightList<T> implements ListOperations<List<T>>{

private List<T> one;
private List<T> two;


public MergeRightList(List<T> one, List<T> two) throws InvalidDataException{
DataValidation.nullCheck(one);
DataValidation.nullCheck(two);
this.one=one;
this.two=two;
}


@Override
public List<T> perform() throws InvalidDataException{
List<T> newList = new ArrayList<>(two);
newList.addAll(one);
return newList;
}


}







