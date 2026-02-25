package projects.shoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        String item;
        double price;
        char currency = '₹';
        int quantity;
        double totalPrice;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the item name: ");
        item = scanner.nextLine();
        System.out.print("Enter the price of each " + item + " " + currency);
        price = scanner.nextDouble();
        System.out.print("Enter the quantity of the item: ");
        quantity = scanner.nextInt();

        totalPrice = price * quantity;

        System.out.println("You have bought " + quantity + " of " + item + "/s \nAnd the total price of your purchase of " + item + " is " + currency + totalPrice);

        scanner.close();
    }
}
