public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));
        thread1.start();
        thread2.start();
    }
}
