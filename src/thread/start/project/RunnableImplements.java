package thread.start.project;

import static thread.util.MyLogger.log;

public class RunnableImplements {

    public static void main(String[] args) {
        Thread thread1 = Thread.currentThread();
        thread1.setDaemon(true);


        Thread thread = new Thread(new MyRunnable("A", 1000));
        thread.setDaemon(true);
        thread.start();
//        new Thread(new MyRunnable("B", 500)).start();
    }


    static class MyRunnable implements Runnable {
        private final String name;
        private final int interval;

        public MyRunnable(String name, int interval) {
            this.interval = interval;
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log( name + ": " + i);
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
