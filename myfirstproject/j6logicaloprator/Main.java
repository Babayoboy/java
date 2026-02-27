package myfirstproject.j6logicaloprator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username: ");
        username = scanner.nextLine();
        boolean hasValidLenght = 4 <= username.length() && username.length() <=12;
        if(!hasValidLenght){
            System.out.println("Username must be between 4-12 characters!");
        }
        boolean hasSpecialChar = !(username.contains(" ") || username.contains("_"));
        if(!hasSpecialChar){
            System.out.println("Username must not contain space or underscore!");
        }
        boolean validUsername = hasSpecialChar && hasValidLenght;
        if(validUsername) {
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}
