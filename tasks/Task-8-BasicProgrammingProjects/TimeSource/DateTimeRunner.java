package com.basics;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import com.utility.InvalidDataException;


public class DateTimeRunner{

public static void main(String[] args){

try{
LocalDateTime currentDateTime = DateTime.getCurrentDateTime();
System.out.println("Current Date and Time: " + currentDateTime);

long currentTimeMillisInstant = DateTime.getCurrentTimeMillisUsingInstant();
System.out.println("Current time in millis (using Instant): " + currentTimeMillisInstant);

long currentTimeMillisSystem = DateTime.getCurrentTimeInMillisUsingSystem();
System.out.println("Current time in millis (using System): " + currentTimeMillisSystem);

String zoneId = "America/New_York";
ZonedDateTime currentZonedDateTime = DateTime.getCurrentZonedDateTime(zoneId);
System.out.println("Current ZonedDateTime in " + zoneId + ": " + currentZonedDateTime);
         
DayOfWeek dayOfWeek = DateTime.getDayOfWeek(currentTimeMillisSystem);
System.out.println("Day of the week for current millis: " + dayOfWeek);

Month month = DateTime.getMonth(currentTimeMillisSystem);
System.out.println("Month for current millis: " + month);

int year = DateTime.getYear(currentTimeMillisSystem);
System.out.println("Year for current millis: " + year);
} 

catch(Exception exp){
System.out.println("Error: " + exp.getMessage());
exp.printStackTrace();
}

}

}