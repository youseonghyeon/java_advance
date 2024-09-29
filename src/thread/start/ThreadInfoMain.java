package thread.start;

import static thread.start.project.ThreadExtension.log;

public class ThreadInfoMain {

    public static void main(String[] args) {

        Thread thread = HelloThread.currentThread();
        log("thread = " + thread);
        log("thread.threadId() = " + thread.threadId());
        log("thread.getName() = " + thread.getName());
        log("thread.getPriority() = " + thread.getPriority());
        log("thread.getThreadGroup() = " + thread.getThreadGroup());
        log("thread.getState() = " + thread.getState());


        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("thread = " + myThread);
        log("thread.threadId() = " + myThread.threadId());
        log("thread.getName() = " + myThread.getName());
        log("thread.getPriority() = " + myThread.getPriority());
        log("thread.getThreadGroup() = " + myThread.getThreadGroup());
        log("thread.getState() = " + myThread.getState());
    }
}
