package com.basics;
import java.time.*;
import java.time.format.*;


public class DateTime{

public static void currentTime(){
LocalDateTime localdatetime=LocalDateTime.now();
DateTimeFormatter formatLike =DateTimeFormatter.ofPattern("dd-MM-YYYY,HH:mm:ss");
String format=localdatetime.format(formatLike);
System.out.println(format);
Instant i=Instant.now();
System.out.println(i);
LocalDateTime l=LocalDateTime.now();
System.out.println(l);
}
public static void currentTimeInMillis(){
Instant ldt=Instant.now();
long milliseconds=ldt.toEpochMilli();
long millis=System.currentTimeMillis();
System.out.println(milliseconds);
System.out.println(millis);
}
public static void currentZonedDateTime(){
ZoneId newyork=ZoneId.of("America/New_York");
ZoneId london=ZoneId.of("Europe/London");
LocalDateTime timeatnewyork=LocalDateTime.now(newyork);
LocalDateTime timeatlondon=LocalDateTime.now(london);
ZonedDateTime newyorkTime= timeatnewyork.atZone(newyork);
ZonedDateTime londonTime= timeatlondon.atZone(london);
System.out.println(newyorkTime);
System.out.println(londonTime);
}
public static void getDayOfWeek(long millis){
LocalDateTime givendatetime=Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
DayOfWeek day=givendatetime.getDayOfWeek();
ZoneId s=ZoneId.systemDefault();
System.out.println(givendatetime);
System.out.println(s);
System.out.println(day);
}
public static void getMonth(long millis){
LocalDateTime givendatetime=Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
Month month=givendatetime.getMonth();
System.out.println(month);
}
public static void getYear(long millis){
LocalDateTime givendatetime=Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
int year=givendatetime.getYear();
System.out.println(year);
}

}