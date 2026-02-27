package projects.weightconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight;
        double newWeight;
        String convertTo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight: ");
        weight = scanner.nextDouble();
        System.out.print("Enter the measurement unit you want to convert to (lbs, kgs): ");
        convertTo = scanner.next().toUpperCase();
        if (convertTo.equals("LBS")) {
            newWeight = weight * 2.20462;
            System.out.printf("%.2fkgs when converted to kgs is %.2flbs!\n", weight, newWeight);
        }
        else if(convertTo.equals("KGS")){
            newWeight = weight * 0.45359237;
            System.out.printf("%.2flbs when converted to kgs is %.2fkgs!\n", weight, newWeight);
        }
        else{
            System.out.println("Not a valid unit! ");
        }
        scanner.close();
    }
}