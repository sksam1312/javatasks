package com.basics;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.DayOfWeek;
import java.time.Month;
import com.utility.DataValidation;
import com.utility.InvalidDataException;


public class DateTime{


public static LocalDateTime getCurrentDateTime(){
return LocalDateTime.now();
}


public static long getCurrentTimeMillisUsingInstant() {
return Instant.now().toEpochMilli();
}


public static long getCurrentTimeInMillisUsingSystem(){
return System.currentTimeMillis();
}


public static ZonedDateTime getCurrentZonedDateTime(String zoneId) throws InvalidDataException{
DataValidation.nullCheck(zoneId);
ZoneId country=ZoneId.of(zoneId);
LocalDateTime timeAtCountry=LocalDateTime.now(country);
ZonedDateTime zonedDateTime=timeAtCountry.atZone(country);
return zonedDateTime;
}


public static DayOfWeek getDayOfWeek(long millis){
LocalDateTime givenDateTime=Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
return givenDateTime.getDayOfWeek();
}


public static Month getMonth(long millis){
LocalDateTime givenDateTime=Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
return givenDateTime.getMonth();
}


public static int getYear(long millis){
LocalDateTime givenDateTime=Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
return givenDateTime.getYear();
}


}