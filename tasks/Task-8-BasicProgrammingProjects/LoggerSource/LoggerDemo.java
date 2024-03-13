package com.basics;

import java.util.logging.*;
import java.io.IOException;


public class LoggerDemo{

private static Logger logger=Logger.getLogger("LoggerDemo");

public static void main(String[] args){
configureLogger();
String s="sam";
logger.finest(s+" logger initialized");
logger.finer(s+" logger initialized");
logger.fine(s+" logger initialized");
logger.config(s+" logger initialized");
logger.info(s+" logger initialized");
logger.warning(s+" logger initialized");
logger.severe(s+" logger initialized");
logger.log(Level.FINEST,s+" logger initialized");
logger.log(Level.FINER,s+" logger initialized");
logger.log(Level.FINE,s+" logger initialized");
logger.log(Level.CONFIG,s+" logger initialized");
logger.log(Level.INFO,s+" logger initialized");
logger.log(Level.WARNING,s+" logger initialized");
logger.log(Level.SEVERE,s+" logger initialized");
logger.setLevel(Level.FINEST);
Handler consolehandler=new ConsoleHandler();
consolehandler.setLevel(Level.FINEST);
logger.addHandler(consolehandler);
logger.finest(s+" logger initialized");

}


private static void configureLogger() {
try {
Handler fileHandler = new FileHandler("example.log", true);
fileHandler.setFormatter(new SimpleFormatter());
System.out.println("Type of file : " + fileHandler.getFormatter().toString());
fileHandler.setLevel(Level.ALL);
logger.addHandler(fileHandler);
logger.setLevel(Level.ALL);
} 
catch (IOException e) {
logger.log(Level.SEVERE, "Error configuring logger:", e);
}
}
}      