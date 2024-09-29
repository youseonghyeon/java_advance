package thread.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("%s [%9s] %s%n", now.format(formatter), Thread.currentThread().getName(), message);


    }
}
