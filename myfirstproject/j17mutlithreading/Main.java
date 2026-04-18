public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunning());
        Thread thread2 = new Thread(new MyRunning());
        Thread thread3 = new Thread(new MyRunning());
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
