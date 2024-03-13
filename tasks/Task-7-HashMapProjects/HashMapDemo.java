package com.hash;
import java.util.*;
import java.util.function.BiConsumer;

public class HashMapDemo{

private static Scanner sc=new Scanner(System.in);
private String name;

public HashMapDemo(){
}

public HashMapDemo(String s){
this.name=name;
}

public String toString(){
return name;
}

public void printSize(){
System.out.println("CREATING HASHMAP AND PRINTING ITS SIZE:-");
HashMap<String,Integer> hash= new HashMap<>();
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}

public void putStrings(){
System.out.println("HASHMAP WITH  3 KEY VALUE PAIRS OF STRING AND PRINTING ITS SIZE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("sam","charu");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}

public void putIntegers(){
System.out.println("HASHMAP WITH  3 KEY VALUE PAIRS OF INTEGER AND PRINTING ITS SIZE:-");
HashMap<Integer,Integer> hash= new HashMap<>();
hash.put(123,32);
hash.put(456,34);
hash.put(789,24);
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}

public void putStringInteger(){
System.out.println("HASHMAP WITH 3 KEY OF STRING & VALUE OF INTEGER AND PRINTING ITS SIZE:-");
HashMap<String,Integer> hash= new HashMap<>();
hash.put("sam",32);
hash.put("vicky",34);
hash.put("vimi",24);
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}


public void putCustomObject(){
System.out.println("HASHMAP WITH  3 KEY OF STRING & VALUE OF CUSTOM OBJECT AND PRINTING ITS SIZE:-");
HashMapDemo a= new HashMapDemo("a");
HashMapDemo b= new HashMapDemo("b");
HashMapDemo c= new HashMapDemo("c");
HashMap<String,HashMapDemo> hash= new HashMap<>();
hash.put("sam",a);
hash.put("appa",b);
hash.put("nadhira",c);
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}

public void nullValueToKey(){
System.out.println("HASHMAP OF KEY VALUE PAIRS OF STRING ONE OF ITS KEY'S VALUE IS NULL:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("sam",null);
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}

public void nullKey(){
System.out.println("HASHMAP WITH NULL KEY:-");
HashMap<String,String> hash= new HashMap<>();
hash.put(null,"sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}

public void mapContainsKey(){
System.out.println("CHECKING HASHMAP CONTAINS A KEY AND PRINTING ITS SIZE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("Enter the key to check whether the HashMap contains or not:");
String key=sc.nextLine();
System.out.println(hash.containsKey(key));
System.out.println("The Size of HashMap is "+hash.size());
}


public void mapContainsValue(){
System.out.println("CHECKING HASHMAP CONTAINS A VALUE AND PRINTING ITS SIZE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("Enter the value to check whether the HashMap contains or not:");
String value=sc.nextLine();
System.out.println(hash.containsValue(value));
System.out.println("The Size of HashMap is "+hash.size());
}

public void updateValues(){
System.out.println("UPDATE THE VALUE OF KEY IN HASHMAP AND PRINTING ITS SIZE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
hash.put("kamal","charu");
hash.put("appa","vicky");
hash.put("nadhira","vimi");
System.out.println("The HashMap after updation is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}


public void existingKeyValue(){
System.out.println("GET THE VALUE OF EXISTING KEY IN HASHMAP AND PRINTING ITS SIZE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("Enter the key to get the value associated with the key:");
String key=sc.nextLine();
System.out.println("The value of the given key is "+hash.get(key));
}

public static void nonExistingKeyValue(){
System.out.println("GET THE VALUE OF NOO EXISTING KEY IN HASHMAP AND PRINTING ITS SIZE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("Enter a non existing key to get the value associated with the key:");
String key=sc.nextLine();
System.out.println("The value of the given key is "+hash.get(key));
}


public void getZohoAsValue(){
System.out.println("GETTING ZOHO AS VALUE OF NON EXISTING KEY IN HASHMAP AND PRINTING ITS SIZE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
System.out.println("Enter a non existing key:");
String key=sc.nextLine();
if(hash.get(key)==null)
{
hash.put(key,"zoho");
}
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
System.out.println("The value of given key is "+hash.get(key));
}



public void removeKey(){
System.out.println("REMOVING A KEY:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
System.out.println("Enter a key to remove from HashMap:");
String key=sc.nextLine();
hash.remove(key);
System.out.println("The HashMap after removing the given key  is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}



public void removeKeyAsPerValue(){
System.out.println("REMOVING A KEY AS PER VALUE:- ");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value to check it is associated with the key:");
String s=sc.nextLine();
if(hash.remove("kamal",s))
{
System.out.println("Yes,the key value is matched with the given value so it is removed from hashmap");
}
else
{
System.out.println("NO ,the key value is not matched with the given value so it can't be removed from hashmap");
}
System.out.println("The HashMap after the key is removed as per value given is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}



public void replaceValue(){
System.out.println("REPLACE A VALUE WITH NEW VALUE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
System.out.println("Enter the key whose value to be replaced:");
String key=sc.nextLine();
System.out.println("Enter the new value for the given key:");
String value=sc.nextLine();
hash.replace(key,value);
System.out.println("The HashMap value after replacement is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}



public void replaceValueAsPerValue(){
System.out.println("REPLACE VALUE AS PER VALUE:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("kamal","sam");
hash.put("appa","amma");
hash.put("nadhira","nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value to check whether it is matched with the old value");
String v=sc.nextLine();
if(hash.replace("kamal","sam",v))
{
System.out.println("Yes,the key old value is matched with the given value so it can be replaced with new value in hashmap");
System.out.println("Enter a new value to replace");
String newValue=sc.nextLine();
hash.replace("kamal",newValue);
}
else
{
System.out.println("No ,the key old value is not matched with the given value so it can't be replaced in hashmap");
}
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}



public void hashMapTransfer(){
System.out.println("TRANSFER KEY VALUE PAIRS FROM ONE HASHMAP TO NEW HASHMAP:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("Kamal","Sam");
hash.put("Appa","Amma");
hash.put("Nadhira","Nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
HashMap<String,String> map= new HashMap<>();
map.put("Dhoni","Sachin");
map.put("Vijay","Ajith");
map.put("Simbu","Dhanush");
System.out.println(map);
System.out.println(map.size());
map.putAll(hash);
System.out.println("The New HashMap is "+map);
System.out.println("The Size of New HashMap is "+map.size());
}


public void hashMapIterate(){
System.out.println("ITERATING A HASHMAP:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("Kamal","Sam");
hash.put("Appa","Amma");
hash.put("Nadhira","Nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
hash.forEach(new BiConsumer<String,String>(){
public void accept(String key,String value)
{
System.out.println("Key :"+key+",Value :"+value);
}
});
}


public void hashMapClear(){
System.out.println("CLEARING A HASHMAP:-");
HashMap<String,String> hash= new HashMap<>();
hash.put("Kamal","Sam");
hash.put("Appa","Amma");
hash.put("Nadhira","Nakshathra");
System.out.println("The HashMap is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
hash.clear();
System.out.println("The HashMap after cleared is "+hash);
System.out.println("The Size of HashMap is "+hash.size());
}


}
