package thread.start.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class ThreadStopMainV1 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task);
        thread.start();

        sleep(5000);
        thread.interrupt();


    }

    static class MyTask implements Runnable {

        volatile boolean runFlag = true;

        @Override
        public void run() {
            try {
                while (runFlag) {
                    Thread.sleep(1000);
                    log("작업중");
                }
            } catch (InterruptedException e) {
                log("work 쓰레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());
                log("work 쓰레드 인터럽트 상태2 = " + e.getMessage());
                log("work 쓰레드 인터럽트 상태2 = " + Thread.currentThread().getState());
            }
            log("작업 종료");


        }
    }
}
