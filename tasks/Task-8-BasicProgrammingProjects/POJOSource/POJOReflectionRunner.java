package com.reflect;
import java.lang.reflect.*;
import java.util.Arrays;


public class POJOReflectionRunner{

public static void main(String[] args){
String classname="com.basics.POJO";
try{
Class<?> pojo=Class.forName(classname);
classname=pojo.getSimpleName();
System.out.println("List of fields in POJO class:" );
Field[] fields=pojo.getDeclaredFields();
for(Field f:fields)
{
Type fieldtype=f.getGenericType();
System.out.println(fieldtype.getTypeName()+" "+f.getName());
}
System.out.println("List of Constructors in POJO class:" );
Constructor<?>[]constructors=pojo.getDeclaredConstructors();
for(Constructor c:constructors){
Class<?>[] parameters=c.getParameterTypes();
System.out.println("Constructor name: "+classname+",Parameter types: "+Arrays.toString(parameters));
}

System.out.println("List of Methods in POJO class:" );
Method[] methods=pojo.getDeclaredMethods();
for(Method m:methods){
System.out.println(m.getName());
}

Constructor<?> defaultconstructor=pojo.getDeclaredConstructor(); 
Object defaultobj=defaultconstructor.newInstance();
System.out.println("Object created with default constructor: "+defaultobj);

Constructor<?> overloadedconstructor=pojo.getDeclaredConstructor(String.class,int.class); 
Object overloadobj=overloadedconstructor.newInstance("samkamal",34);
System.out.println("Object created with overloaded constructor: "+overloadobj);

Method gettermethod=pojo.getDeclaredMethod("getName");
String s=(String)gettermethod.invoke(overloadobj);
System.out.println("Name of Overloadobj:"+s);

Method settermethod=pojo.getDeclaredMethod("setName",String.class);
settermethod.invoke(overloadobj,"sksam");
System.out.println("Name updated for overloadobj using setter method");

gettermethod=pojo.getDeclaredMethod("getName");
String r=(String)gettermethod.invoke(overloadobj);
System.out.println("Updated name:"+r);

}
catch(Exception e){
e.printStackTrace();
}
}
}
