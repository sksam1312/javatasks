package com.thread;
import java.util.logging.*;


public class ExtendedThread extends Thread{

private static final Logger logger=Logger.getLogger("Threadclass.class");
private long millis;
private boolean condition;


public ExtendedThread(long millis){
this.millis=millis;
this.condition=true;
}

public void setCondition(boolean condition){
this.condition=condition;
}

public void run(){

Thread.State state = Thread.currentThread().getState();
logger.log(Level.INFO,"The Name of the Thread after starting is "+Thread.currentThread().getName());
logger.log(Level.INFO,"The Priority of the ExtendedThread after starting is "+Thread.currentThread().getPriority());
logger.log(Level.INFO,"The State of the ExtendedThread after starting is "+state);
logger.log(Level.INFO,"Going to sleep: "+Thread.currentThread().getName());
try{
Thread.sleep(millis);
}
catch(InterruptedException e){
logger.log(Level.SEVERE,"InterruptedException ",e);
}
logger.log(Level.INFO,"After sleeping: "+Thread.currentThread().getName());
while(condition){
logger.log(Level.INFO, "Loop started for "+Thread.currentThread().getName());
}
logger.log(Level.INFO,"Loop ended for " +Thread.currentThread().getName());
}
}