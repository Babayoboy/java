import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        int response = 0;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a no of second you want the task to run: ");
            response = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please input a no!!");
        }
        catch(Exception e){
            System.out.println("Something got wrong!!");
        }

        final int finalResponse = response;
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = finalResponse;
            
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("Timer ended!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
        scanner.close();
    }    
}
