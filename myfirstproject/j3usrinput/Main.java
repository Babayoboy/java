package myfirstproject.j3usrinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double widht;
        double length;
        double area;
        
        // Calculating area of a rectangle

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter widht: ");
        widht = scanner.nextDouble();
        
        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        area = widht * length;

        System.out.println("The area is: " + area + "cm^2");
        scanner.close();
    }
}
