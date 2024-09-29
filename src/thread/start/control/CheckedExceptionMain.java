package thread.start.control;


import thread.util.ThreadUtils;

import static thread.util.MyLogger.log;

public class CheckedExceptionMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new CheckedExceptionRunnable(), "myThread");
        log("myThread.start1 = " + thread.getState());
        log("myThread.start()");
        thread.start();
        ThreadUtils.sleep(1000);
        log("myThread.state3 = " + thread.getState());
        ThreadUtils.sleep(3000);
        log("myThread.state5 = " + thread.getState());

    }

    static class CheckedExceptionRunnable implements Runnable {
        @Override
        public void run() {
            log("start");
            log("myThread.state2 = " + Thread.currentThread().getState());
            log("sleep() start");
            ThreadUtils.sleep(3000);
            log("myThread.state4 = " + Thread.currentThread().getState());
            log("sleep() end");
        }
    }
}
