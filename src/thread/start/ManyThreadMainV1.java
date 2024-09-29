package thread.start;

import static thread.util.MyLogger.log;

public class ManyThreadMainV1 {


    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();
        for (int i = 0; i < 100; i++) {
            Thread thread1 = new Thread(runnable);
            thread1.start();
        }

    }
}
