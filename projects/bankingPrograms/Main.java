package projects.bankingPrograms;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option = 0;
        double balance = 0;
        boolean isrunning = true;
        /*
        while(isrunning){
            System.out.print("Enter a option form (1-4): ");
            option = scanner.nextInt();
            if (option ==1){
                System.out.println("Balance in your account is ₹" + balance);
            }
            else if (option == 2){
                System.out.print("Enter the amount you want to deposit: ");
                input = scanner.nextDouble();
                balance = balance + input;
                System.out.println("You have sucessfully deposited ₹" + input);
            }
            else if (option == 3){
                System.out.print("Enter the amount you want to withdraw: ");
                input = scanner.nextDouble();
                if (balance < input){
                    System.out.println("You don't have balance to withdraw ₹" + input);
                }
                else{
                    balance = balance - input;
                    System.out.println("You success fully withdrawn ₹" + input);
                }
            }
            else if (option == 4){
                isrunning = false;
            }
            else {
                continue;
            }
        }
        */

        while (isrunning) {
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = withdraw(balance);
                case 4 -> isrunning = false;
                default -> System.out.println("===================\n Not valid option!\n===================");
            }
        }
        scanner.close();
    }
    static void menu(){
        System.out.println(" ___________________");
        System.out.println("|--Banking Program--|");
        System.out.println("|===================|");
        System.out.println("|  1. Show Balance  |");
        System.out.println("|  2. Deposit       |");
        System.out.println("|  3. Withdraw      |");
        System.out.println("|  4. Exit          |");
        System.out.println("|___________________|");
    }
    static void showBalance(double balance){
        System.out.println("Your current balance is: ₹" + balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount you want to deposit: ₹");
        amount = scanner.nextDouble();
        System.out.println("You have sucessfully deposited ₹" + amount);
        return amount;
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount you want to deposit: ₹");
        amount = scanner.nextDouble();
        if (balance < amount){
            System.out.println("You dont have enough balance to withdraw ₹" + amount);
            return 0;
        }
        else{
            balance = balance - amount;
            return balance;
        }
    }
}