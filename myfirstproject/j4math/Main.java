package myfirstproject.j4math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // // Hypotinus
        // double a;
        // double b;
        // double c;


        // System.out.print("length of side a: ");
        // a = scanner.nextInt();
        // System.out.print("legth of side b: ");
        // b = scanner.nextInt();

        // c = Math.sqrt(((a*a) + (b*b)));

        // System.out.println("The value of side c is " + c + "cm");
        
        // Circle
        double radius;
        double circumference;
        double area;
        double volume;
        
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference of the circle with radius of " + radius + " is %.1f" + circumference + "cm\n");
        System.out.printf("Area of the circle with radius of " + radius + " is %.1f" + area + "cm²\n");
        System.out.printf("Volume of the circle with radius of " + radius + " is %.1f" + volume + "cm³\n");
        scanner.close();
    }
}