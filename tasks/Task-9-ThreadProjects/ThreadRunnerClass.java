package com.thread;
import java.util.logging.*;
import java.util.Arrays;

public class ThreadRunnerClass{
private static final Logger logger=Logger.getLogger("ThreadRunner.class");

public static void main(String[] args){
Thread.State state;
int multi=1000;
int numofthreads=5;
ExtendedThread [] et=new ExtendedThread[numofthreads];

for(int i=0;i<numofthreads;i++){
et[i]=new ExtendedThread(1000+(i*multi));
et[i].setName("ExtendableThread "+i);
logger.log(Level.INFO,"The Name of the Thread is "+et[i].getName());
logger.log(Level.INFO,"The Priority of the ExtendedThread is "+et[i].getPriority());
state=et[i].getState();
logger.log(Level.INFO,"The State of the ExtendedThread before running is "+state);
et[i].start();
}

RunnableThread [] r=new RunnableThread[numofthreads];
Thread []rt=new Thread[numofthreads];
for(int i=0;i<numofthreads;i++){
r[i]=new RunnableThread(2000+i*multi);
rt[i]=new Thread(r[i]);
rt[i].setName("RunnableThread "+i);
logger.log(Level.INFO,"The Name of the Thread is "+rt[i].getName());
logger.log(Level.INFO,"The Priority of the RunnableThread is "+rt[i].getPriority());
state=rt[i].getState();
logger.log(Level.INFO,"The State of the RunnableThread before running is "+state);
rt[i].start();
}
try{
Thread.sleep(2*60*1000);
}
catch(InterruptedException e){
logger.log(Level.SEVERE,"InterruptedException ",e);
}
for(int j=0;j<10;j++){
logger.log(Level.INFO,"Thread dump: "+(j+1));
try{
Thread.sleep(45000);
}
catch(InterruptedException e){
logger.log(Level.SEVERE,"InterruptedException ",e);
}

for(int i=0;i<numofthreads;i++){

logger.log(Level.INFO,"The Thread dump of the ExtendedThread");

logger.log(Level.INFO,"The Name of the Thread is "+et[i].getName());
state=et[i].getState();
logger.log(Level.INFO,"The State of the ExtendedThread is "+state);
logger.log(Level.INFO,"The Priority of the ExtendedThread is "+et[i].getPriority());

logger.log(Level.INFO,"The Thread dump of the RunnableThread");

logger.log(Level.INFO,"The Name of the Thread is "+rt[i].getName());
state=rt[i].getState();
logger.log(Level.INFO,"The State of the RunnableThread is "+state);
logger.log(Level.INFO,"The Priority of the RunnableThread is "+rt[i].getPriority());

}
}

for(ExtendedThread etd:et){
try{
Thread.sleep(60000);
}
catch(InterruptedException e){
logger.log(Level.SEVERE,"InterruptedException ",e);
}
etd.setCondition(false);
}

for(RunnableThread rtd:r){
try{
Thread.sleep(60000);
}
catch(InterruptedException e){
logger.log(Level.SEVERE,"InterruptedException ",e);
}
rtd.setCondition(false);
}
try{
rt[numofthreads-1].join();
}
catch(InterruptedException e){
logger.log(Level.SEVERE,"InterruptedException: ",e);
}
logger.log(Level.INFO,"Final Thread dump: ");

int countetd=0;
for(ExtendedThread thread:et){
if(thread.isAlive()==false)
{
countetd++;
}
else{
logger.log(Level.WARNING," The culprit is "+thread.getName());
}
}
int countrtd=0;
for(Thread t:rt){
if(t.isAlive()==false)
{
countrtd++;
}
else{
logger.log(Level.WARNING," The culprit is "+t.getName());
}
}
if(countrtd==numofthreads && countetd==numofthreads){
logger.log(Level.INFO,"Task completed");
}
else
{
logger.log(Level.INFO,"Task incomplete");
}

for(int i=0;i<numofthreads;i++){

logger.log(Level.INFO,"The Thread dump of the ExtendedThread");

logger.log(Level.INFO,"The Name of the Thread is "+et[i].getName());
state=et[i].getState();
logger.log(Level.INFO,"The State of the ExtendedThread is "+state);
logger.log(Level.INFO,"The Priority of the ExtendedThread is "+et[i].getPriority());

logger.log(Level.INFO,"The Thread dump of the RunnableThread");

logger.log(Level.INFO,"The Name of the Thread is "+rt[i].getName());
state=rt[i].getState();
logger.log(Level.INFO,"The State of the RunnableThread is "+state);
logger.log(Level.INFO,"The Priority of the RunnableThread is "+rt[i].getPriority());

}
logger.log(Level.INFO,"Count of ExtendedThread Terminated: "+countetd);
logger.log(Level.INFO,"Count of RunnableThread Terminated: "+countrtd);
}
}