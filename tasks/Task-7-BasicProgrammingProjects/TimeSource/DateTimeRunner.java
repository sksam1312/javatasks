package com.basics;
import java.time.*;
import java.time.format.*;

public class DateTimeRunner{
private static long milliseconds=1707229306744L;
public static void main(String[] args){
DateTime.currentTime();
DateTime.currentTimeInMillis();
DateTime.currentZonedDateTime();
DateTime.getDayOfWeek(milliseconds);
DateTime.getMonth(milliseconds);
DateTime.getYear(milliseconds);
}
}