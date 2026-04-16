import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String userInput = sc.nextLine().toUpperCase();
        try{
            Day day = Day.valueOf(userInput);

            switch (day) {
                case MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Not a valid day!!");
        }
        sc.close();
    }
}
