package projects.diceRoller;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rolledtime;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int diceFace;
        int total = 0;
        System.out.print("Enter the no you want to roll: ");
        rolledtime = scanner.nextInt();
        for (int i = 0; i < rolledtime; i++) {
            diceFace = random.nextInt(1, 7);
            switch (diceFace) {
                case 1 -> dice1();
                case 2 -> dice2();
                case 3 -> dice3();
                case 4 -> dice4();
                case 5 -> dice5();
                case 6 -> dice6();
            }
            total += diceFace;
        }
        System.out.println("You rolled a die " + rolledtime + " the total of your dice/s is " + total);
        scanner.close();
    }
    static void dice1(){
        System.out.println(" _______ ");
        System.out.println("|       |");
        System.out.println("|   ●   |");
        System.out.println("|       |");
        System.out.println(" ‾‾‾‾‾‾‾ ");
    }
    static void dice2(){
        System.out.println(" _______ ");
        System.out.println("|     ● |");
        System.out.println("|       |");
        System.out.println("| ●     |");
        System.out.println(" ‾‾‾‾‾‾‾ ");
    }
    static void dice3(){
        System.out.println(" _______ ");
        System.out.println("|     ● |");
        System.out.println("|   ●   |");
        System.out.println("| ●     |");
        System.out.println(" ‾‾‾‾‾‾‾ ");
    }
    static void dice4(){
        System.out.println(" _______ ");
        System.out.println("| ●   ● |");
        System.out.println("|       |");
        System.out.println("| ●   ● |");
        System.out.println(" ‾‾‾‾‾‾‾ ");
    }
    static void dice5(){
        System.out.println(" _______ ");
        System.out.println("| ●   ● |");
        System.out.println("|   ●   |");
        System.out.println("| ●   ● |");
        System.out.println(" ‾‾‾‾‾‾‾ ");
    }
    static void dice6(){
        System.out.println(" _______ ");
        System.out.println("| ●   ● |");
        System.out.println("| ●   ● |");
        System.out.println("| ●   ● |");
        System.out.println(" ‾‾‾‾‾‾‾ ");
    }
}