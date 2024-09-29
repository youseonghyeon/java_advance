package thread.start;

import static thread.util.MyLogger.log;

public class InnerRunnableMainV2 {

    public static void main(String[] args) {
        log("main() start");

        new Thread(() -> log("run")).start();

        log("main() end");
    }

}
