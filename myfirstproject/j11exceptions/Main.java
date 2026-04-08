import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args){

        double a;
        double b;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the no as numerator: ");
            a = scanner.nextInt();
            System.out.print("Enter the no as denominator: ");
            b = scanner.nextInt();
            System.out.println("Your result is: " + a/b);
        }
        catch(InputMismatchException e){
            System.out.println("Enter a valid no!");
        }
        catch(ArithmeticException e){
            System.out.println("The denominator can't be zero! ");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("Ended!");
        }
    }
}