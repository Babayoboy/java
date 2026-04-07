import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double amount;
        double principal;
        double rate;
        double noOfCompounded;
        double noOfYears;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate of intrest: ");
        rate = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        noOfCompounded = scanner.nextDouble();
        System.out.print("Enter the number of years the money is invested or borrowed: ");
        noOfYears = scanner.nextDouble();
        amount = principal * (Math.pow(1+(rate/100/noOfCompounded), (noOfCompounded * noOfYears)));
        System.out.printf("The Total Amout after compound intrest is %.2f\n", amount);
        scanner.close();
    }
}