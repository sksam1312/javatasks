package com.basics;
import java.util.Arrays;


public class RainbowRunner{

public static void main (String[] args){
Rainbow v=Rainbow.VIOLET;
Rainbow i=Rainbow.INDIGO;
Rainbow b=Rainbow.BLUE;
Rainbow g=Rainbow.GREEN;
Rainbow y=Rainbow.YELLOW;
Rainbow o=Rainbow.ORANGE;
Rainbow r=Rainbow.RED;
Rainbow[] rainbow=Rainbow.values();
Rainbow t=Rainbow.valueOf("VIOLET");
System.out.println(t);
System.out.println(Arrays.toString(rainbow));
for(Rainbow s:rainbow){
System.out.println("Color code of "+s+" is "+s.getColorCode()+",Ordinal Value:"+s.ordinal());
}
}
}