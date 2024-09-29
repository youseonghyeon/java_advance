package thread.start.control.join;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class JoinMainV0 {

    public static void main(String[] args) throws InterruptedException {
        log("start");
        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();

        thread1.join();
//        thread2.join();


        log("end");
    }

    static class Job implements Runnable {

        @Override
        public void run() {
            log("작업 시작");
            String s = Thread.currentThread().getName().split("-")[1];
            long l = Long.parseLong(s) * 1000;
            sleep(l);
            log("작업 종료");
        }
    }
}
