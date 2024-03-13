package com.basics;
import java.io.*;
import java.util.*;

public class PropRunner{
public static void main(String[] args){
Propclass pc=new Propclass();
pc.writeSampleText();
pc.storeValues("sam","32");
pc.storeValues("vicky","34");
pc.storeValues("vimi","23");
pc.storeValues("charu","25");
pc.storeValues("rakesh","17");
pc.loadValues();
}
}