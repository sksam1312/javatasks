package com.thread;

import java.util.ArrayList;
import java.util.List;
import com.utility.DataValidation;
import com.utility.InvalidDataException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RunnableThread implements Runnable{

private static final Logger logger = Logger.getLogger(RunnableThread.class.getName());
private boolean keepRunning = true;
private long sleepTime;
private String name;

public RunnableThread(String name, long sleepTime) throws InvalidDataException{
DataValidation.nullCheck(name);
this.name = name;
this.sleepTime = sleepTime;
}


@Override
public void run(){
logger.log(Level.INFO, "Going to Sleep: {0} for {1} ms.", new Object[]{name, sleepTime});
while (keepRunning){
try{
Thread.sleep(sleepTime);
} 
catch (InterruptedException ie){
logger.log(Level.SEVERE, "Thread interrupted: " + name, ie);
}
logger.log(Level.INFO, "Running: {0}, State: {1}, Priority: {2}",new Object[]{name, Thread.currentThread().getState(), Thread.currentThread().getPriority()});
}
logger.log(Level.INFO, "Thread Exiting: "+ name);
}


public void stopThread(){
keepRunning = false;
}

}
