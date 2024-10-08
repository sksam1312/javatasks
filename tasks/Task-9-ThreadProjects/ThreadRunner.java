package com.thread;

import java.util.ArrayList;
import java.util.List;
import com.utility.DataValidation;
import com.utility.InvalidDataException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRunner {

private static final Logger logger = Logger.getLogger(ThreadRunner.class.getName());

public static void main(String[] args) {

try {
List<ExtendedThread> extendedThreads = new ArrayList<>();
List<Thread> runnableThreads = new ArrayList<>();
List<RunnableThread> runnableTasks = new ArrayList<>();

for (int i = 1; i <= 5; i++) {
ExtendedThread extThread = new ExtendedThread("ExtendedThread-" + i, 5000 * i);
extendedThreads.add(extThread);
logger.log(Level.INFO, "Before starting {0}: Priority: {1}, State: {2}",
new Object[]{extThread.getName(), extThread.getPriority(), extThread.getState()});
extThread.start();
logger.log(Level.INFO, "After starting {0}: Priority: {1}, State: {2}",
new Object[]{extThread.getName(), extThread.getPriority(), extThread.getState()});
}

for (int i = 1; i <= 5; i++) {
RunnableThread runTask = new RunnableThread("RunnableThread-" + i, 3000 * i);
runnableTasks.add(runTask);
Thread runThread = new Thread(runTask);
runnableThreads.add(runThread);
logger.log(Level.INFO, "Before starting {0}: Priority: {1}, State: {2}",
new Object[]{runThread.getName(), runThread.getPriority(), runThread.getState()});
runThread.start();
logger.log(Level.INFO, "After starting {0}: Priority: {1}, State: {2}",
new Object[]{runThread.getName(), runThread.getPriority(), runThread.getState()});
}

Thread.sleep(15000);

for (ExtendedThread extThread : extendedThreads) {
extThread.stopThread();
extThread.join();
logger.log(Level.INFO, "Stopped: {0}", extThread.getName());
Thread.sleep(2000);
}

for (int i = 0; i < runnableTasks.size(); i++) {
runnableTasks.get(i).stopThread();
runnableThreads.get(i).join();
logger.log(Level.INFO, "Stopped: RunnableThread-{0}", i + 1);
Thread.sleep(2000);
}

logger.log(Level.INFO, "Checking if all threads have exited...");
for (ExtendedThread extThread : extendedThreads) {
logger.log(Level.INFO, "{0} isAlive: {1}", new Object[]{extThread.getName(), extThread.isAlive()});
}
for (Thread runThread : runnableThreads) {
logger.log(Level.INFO, "{0} isAlive: {1}", new Object[]{runThread.getName(), runThread.isAlive()});
}

logger.log(Level.INFO, "All tasks completed.");
for (ExtendedThread extThread : extendedThreads) {
logger.log(Level.INFO, "After Task completion: {0}: Priority: {1}, State: {2}",
new Object[]{extThread.getName(), extThread.getPriority(), extThread.getState()});
}
for (Thread runThread : runnableThreads) {
logger.log(Level.INFO, "After Task completion: {0}: Priority: {1}, State: {2}",
new Object[]{runThread.getName(), runThread.getPriority(), runThread.getState()});
}
}
catch (Exception exp) {
logger.log(Level.SEVERE, "Error: {0}", exp.getMessage());
logger.log(Level.SEVERE, "Exception occurred", exp);
}


}
}
