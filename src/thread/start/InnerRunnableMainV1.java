package thread.start;

import static thread.util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");

        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        log("main() end");
    }

    static class MyRunnable implements Runnable {
        private int count = 0;

        @Override
        public void run() {
            log("run()" + count++);
        }
    }
}
