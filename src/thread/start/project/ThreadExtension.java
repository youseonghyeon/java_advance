package thread.start.project;

import static thread.util.MyLogger.log;

public class ThreadExtension {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();


    }

    public static void log(String message) {
        System.out.println(message);
    }



    private static class CounterThread extends Thread {

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
