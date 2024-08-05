package com.collectionz;
import com.utility.*;
import java.util.*;


public class GetSize<T> implements ListOperations<Integer> {

private List<T> list;


public GetSize(List<T> list) throws InvalidDataException{
DataValidation.nullCheck(list);
this.list=list;
}


@Override
public Integer perform() throws InvalidDataException{
return list.size();
}

}


