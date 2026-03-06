package projects.slotMachine;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bet;
        int payout = 0;
        int totalPayout = 0;
        boolean wannaPlay = true;
        Random random = new Random();
        String[] reel = {"Cherry", "Lemon", "Orange", "Plum", "Bell", "Bar", "Seven"};
        String reel1, reel2, reel3;

        Scanner scanner = new Scanner(System.in);
        welcome();
        while (wannaPlay && balance > 0) {
            System.out.print("Enter the bet amount: ₹");
            bet = scanner.nextInt();
            if (bet <= balance && bet > 0){
                balance = balance - bet;
                reel1 = reel[random.nextInt(7)];
                reel2 = reel[random.nextInt(7)];
                reel3 = reel[random.nextInt(7)];
                payout = calculatingPayout(bet, reel1, reel2, reel3, reel);
                totalPayout += payout;
                System.out.println("Spin result: " + reel1 + " | " + reel2 + " | " + reel3);
                System.out.println("Do you want to play again (true/false): ");
                String playAgainInput;
                while (true) {
                    playAgainInput = scanner.next();
                    if (playAgainInput.equalsIgnoreCase("true")) {
                        wannaPlay = true;
                        break;
                    } else if (playAgainInput.equalsIgnoreCase("false")) {
                        wannaPlay = false;
                        break;
                    } else {
                        System.out.print("Invalid input. Please enter 'true' or 'false': ");
                    }
                }
                balance += payout;
                System.out.println("Your current balance: ₹" + balance);
            } else {
                System.out.println("Invalid bet amount. Please enter a value between 1 and your current balance.");
            }
        }
        System.out.println("Your final payout is ₹" + (balance + totalPayout));
        scanner.close();
    }

    static void welcome(){
        System.out.println("=======================");
        System.out.println("WELCOME TO SLOT MACHINE");
        System.out.println("=======================");
    }

    static int calculatingPayout(int bet, String reel1, String reel2, String reel3, String[] reel){
        int payout;
        if (reel1.equalsIgnoreCase(reel2) && reel1.equalsIgnoreCase(reel3)) {
            if (reel1.equalsIgnoreCase(reel[6])) {
                payout = bet * 500;
            }
            else if (reel1.equalsIgnoreCase(reel[5])){
                payout = bet * 100;
            }
            else if (reel1.equalsIgnoreCase(reel[4])){
                payout = bet * 50;
            }
            else if (reel1.equalsIgnoreCase(reel[3])){
                payout = bet * 20;
            }
            else if (reel1.equalsIgnoreCase(reel[2])){
                payout = bet * 10;
            }
            else if (reel1.equalsIgnoreCase(reel[1])){
                payout = bet * 5;
            }
            else{
                payout = bet * 2;
            }
            return payout;
        }
        return 0;
    }
}