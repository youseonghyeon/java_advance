package thread.start;

import static thread.util.MyLogger.log;

public class HelloRunnable implements Runnable {

    private int count = 0;

    @Override
    public void run() {
        log("run()" + count++);
    }
}
