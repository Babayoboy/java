public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("Game Started!");
        
        thread1.start();
        thread2.start();
        try{
        thread1.join();
        thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interupted!!");
        }
        System.out.println("Game Over!");
    }
}
