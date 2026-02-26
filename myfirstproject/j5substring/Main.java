package myfirstproject.j5substring;

public class Main {
    public static void main(String[] args) {
        String email = "anshjoshi1234@gmail.com";
        String username;
        String domain;

        username = email.substring(0, email.indexOf("@"));
        domain = email.substring((email.indexOf("@") + 1));
        System.out.printf("Your username is: %s\n", username);
        System.out.printf("Your doamin is: %s\n", domain);
    }
}
