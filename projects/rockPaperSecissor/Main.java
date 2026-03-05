package projects.rockPaperSecissor;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        String computerChoice;
        boolean wanaPlay = true;
        Random random = new Random();
        String[] choices = {"ROCK", "PAPER", "SCISSOR"};
        while (wanaPlay) {
            System.out.print("Enter your choice (rock, paper, scissor): ");
            userChoice = scanner.nextLine();
            if (userChoice.toUpperCase().equals("ROCK") || userChoice.toUpperCase().equals("PAPER") || userChoice.toUpperCase().equals("SCISSOR")) {
                computerChoice = choices[random.nextInt(choices.length)];
                checker(userChoice, computerChoice);
                System.out.println("Do you want to play again! (true / false)");
                wanaPlay = scanner.nextBoolean();
            }
        }
        
        scanner.close();
    }
    static void checker(String user, String computer) {
        user = user.toUpperCase();
        if (user.equals(computer)) {
            System.out.println("Draw!");
        }
        else if((user.equals("ROCK") && computer.equals("SCISSOR")) || (user.equals("PAPER") && user.equals("ROCK")) || (user.equals("SCISSOR") && computer.equals("PAPER"))){
            System.out.println("You won!");
        }
        else{
            System.out.println("Computer won!");
        }
    }
}
