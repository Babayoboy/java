package projects.tempratureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double temp;
        double newTemp;
        String unit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Temprature: ");
        temp = scanner.nextDouble();
        System.out.print("Enter the unit you want to convert to (C or F): ");
        unit = scanner.next().toUpperCase();
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.printf("Converting %.1f to %s is equals to %.1f\n", temp, unit, newTemp);
        scanner.close();
    }
}
