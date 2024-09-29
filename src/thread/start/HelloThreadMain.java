package thread.start;

public class HelloThreadMain {

        public static void main(String[] args) throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + ": main() start");



            System.out.println(Thread.currentThread().getName() + ": helloThread.start()");
            new HelloThread().start();
            System.out.println(Thread.currentThread().getName() + ": helloThread.start() end");

            System.out.println(Thread.currentThread().getName() + ": main() end");

        }
}
