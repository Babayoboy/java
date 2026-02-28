package projects.numberGuesserGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guess = 0;
        int noOfGuesses = 0;
        Random random = new Random();
        int no = random.nextInt(1, 101);
        
        Scanner scanner = new Scanner(System.in);
        while (guess != no) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            noOfGuesses++;
            if (guess < no){
                System.out.println("The no is higher!");
            }
            else{
                System.out.println("The no is lower!");
            }
        }

        System.out.printf("You guessed the no %d in %d no of guesses\n", no, noOfGuesses);
        scanner.close();
    }
}