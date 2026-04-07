import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        String user = "";
        ArrayList<Integer> list= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (!(user.equals("exit"))) {
            System.out.print("Input a no you want to add to the list: ");
            input = scanner.nextInt();
            System.out.print("If you don't want to continue type exit: ");
            user = scanner.next();
            list.add(input);
        }
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        scanner.close();
    }
}
