import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNo;
        double secondNo;
        String operator;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        firstNo = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^)");
        operator = scanner.next();
        System.out.print("Enter the second number: ");
        secondNo = scanner.nextDouble();

        if (secondNo == 0.00 && operator.equals("/")) {
            System.out.println("Zero devision error!");
        }
        else{
            switch (operator) {
                case "+" -> System.out.printf("%f + %f = %f", firstNo, secondNo, firstNo + secondNo);
                case "-" -> System.out.printf("%f - %f = %f", firstNo, secondNo, firstNo - secondNo);
                case "*" -> System.out.printf("%f * %f = %f", firstNo, secondNo, firstNo * secondNo);
                case "/" -> System.out.printf("%f / %f = %f", firstNo, secondNo, firstNo / secondNo);
                case "^" -> System.out.printf("%f ^ %f = %f", firstNo, secondNo, Math.pow(firstNo, secondNo));
                default -> System.out.println("Not a valid oprator");
        }
        }
        
        scanner.close();
    }
}
