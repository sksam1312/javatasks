package com.collectionz;
import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;
import com.utility.InvalidDataException;
import com.utility.DataValidation;


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


public <K,V> Map<K,V> getHashMap(){
return new HashMap<K,V>();
}


public <K,V> Map<K,V> putPairsToMap(Map<K,V> hash,K key,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.put(key,value);
return hash;
}


public <K,V> int getSize(Map<K,V> hash) throws InvalidDataException{
DataValidation.nullCheck(hash);
int size=hash.size();
return size;
}


public <K, V> boolean mapContainsKey(Map<K,V> hash,K key) throws InvalidDataException{
DataValidation.nullCheck(hash);
return hash.containsKey(key);
}


public <K, V> boolean mapContainsValue(Map<K,V> hash,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
return hash.containsValue(value);
}


public <K,V> V getValueOfKey(Map<K,V> hash,K key) throws InvalidDataException{
DataValidation.nullCheck(hash);
return hash.get(key);
}


public  <K,V> Map<K,V> updateValueForAKey(Map<K,V> hash,K key,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
if(hash.containsKey(key))
{
hash.put(key,value);
}
else
{
throw new InvalidDataException("The Map doesn't contains the given key.");
}
return hash;
}


public  <K,V> Map<K,V> removeKey(Map<K,V> hash,K key) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.remove(key);
return hash;
}


public  <K,V> Map<K,V> removeKeyAsPerValue(Map<K,V> hash,K key,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.remove(key,value);
return hash;
}


public <K,V> Map<K,V> replaceValue(Map<K,V> hash,K key,V value) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.replace(key,value);
return hash;
}


public <K,V> Map<K,V> replaceValueIfMatch(Map<K,V> hash,K key,V oldValue,V newValue) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.replace(key,oldValue,newValue);
return hash;
}


public <K,V> Map<K,V> hashMapTransfer(Map<K,V> hash,Map<K,V> map) throws InvalidDataException{
DataValidation.nullCheck(hash);
DataValidation.nullCheck(map);
map.putAll(hash);
return map;
}


public  <K,V> void hashMapIterate(Map<K,V> hash, BiConsumer<K,V> action) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.forEach(action);
}


public <K,V> Map<K,V> hashMapClear(Map<K,V> hash) throws InvalidDataException{
DataValidation.nullCheck(hash);
hash.clear();
return hash;
}


}
