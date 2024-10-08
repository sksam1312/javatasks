package com.thread;

import java.util.ArrayList;
import java.util.List;
import com.utility.DataValidation;
import com.utility.InvalidDataException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExtendedThread extends Thread{

private static final Logger logger = Logger.getLogger(ExtendedThread.class.getName());
private boolean keepRunning = true;
private long sleepTime;

public ExtendedThread(String name, long sleepTime) throws InvalidDataException{
super(name);
DataValidation.nullCheck(name);
this.sleepTime = sleepTime;
}


@Override
public void run(){
logger.log(Level.INFO, "Going to Sleep: {0} for {1}ms.", new Object[]{getName(), sleepTime});
while (keepRunning){
try{
Thread.sleep(sleepTime);
} 
catch (InterruptedException ie){
logger.log(Level.SEVERE, "Thread interrupted: " + getName(), ie);
}
logger.log(Level.INFO, "Running: {0}, Priority: {1}, State: {2}", new Object[]{getName(), getPriority(), getState()});
}
logger.log(Level.INFO, "Thread Exiting: " + getName());
}


public void stopThread(){
keepRunning = false;
}

}