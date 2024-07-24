package com.collectionz;
import java.util.*;
import java.util.function.BiConsumer;
import com.utility.*;

public class HashMapProject{

private String name;


public HashMapProject(){
}


public HashMapProject(String name) throws InvalidDataException{
DataValidation.nullCheck(name);
this.name=name;
}


public String toString(){
return name;
}


public <K,V> int getSize(HashMap<K,V> hash) throws InvalidDataException{
DataValidation.nullCheck(hash);
int size=hash.size();
return size;
}


public <K,V> HashMap<K,V> getHashMap(K[] keys ,V[] values){
HashMap<K,V> hash=new HashMap<>();
for(int i=0;i<keys.length;i++){
hash.put(keys[i],values[i]);
}
return hash;
}


public <K, V> boolean mapContainsKey(HashMap<K,V> hash,K key) throws InvalidDataException{
DataValidation.nullCheck(hash);
return hash.containsKey(key);
}


public <K, V> boolean mapContainsValue(HashMap<K,V> hash,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
return hash.containsValue(value);
}


public <K, V> HashMap<K,V> updateValues(HashMap<K,V> hash,V[] newValues) throws InvalidDataException{
DataValidation.nullCheck(hash);
Set<K> keys = hash.keySet();
int i = 0;
for (K key : keys) {
hash.put(key, newValues[i]);
i++;
}
return hash;
}


public <K,V> V getValueOfKey(HashMap<K,V> hash,K key) throws InvalidDataException{
DataValidation.nullCheck(hash);
return hash.get(key);
}


public  <K,V> HashMap<K,V> putValueForNullKey(HashMap<K,V> hash,K key,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
if(hash.containsKey(key) || hash.get(key)==null)
{
hash.put(key,value);
}
return hash;
}


public  <K,V> HashMap<K,V> removeKey(HashMap<K,V> hash,K key) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.remove(key);
return hash;
}


public  <K,V> HashMap<K,V> removeKeyAsPerValue(HashMap<K,V> hash,K key,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.remove(key,value);
return hash;
}


public <K,V> HashMap<K,V> replaceValue(HashMap<K,V> hash,K key,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.replace(key,value);
return hash;
}


public <K,V> HashMap<K,V> replaceValueIfMatch(HashMap<K,V> hash,K key,V oldValue,V newValue) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.replace(key,oldValue,newValue);
return hash;
}


public <K,V> HashMap<K,V> hashMapTransfer(HashMap<K,V> hash,HashMap<K,V> map) throws InvalidDataException{
DataValidation.nullCheck(hash);
DataValidation.nullCheck(map);
map.putAll(hash);
return map;
}


public  <K,V> void hashMapIterate(HashMap<K,V> hash, BiConsumer<K,V> action) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.forEach(action);
}


public <K,V> HashMap<K,V> hashMapClear(HashMap<K,V> hash) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.clear();
return hash;
}


}
