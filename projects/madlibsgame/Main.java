package projects.madlibsgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String adjective1;
        String adjective2;
        String verbPastContinious;
        String place;
        String personRelationship;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjective");
        adjective1 = scanner.nextLine();
        System.out.println("Verb in past continous tense");
        verbPastContinious = scanner.nextLine();
        System.out.println("Place");
        place = scanner.nextLine();
        System.out.println("Adjective");
        adjective2 = scanner.nextLine();
        System.out.println("Relationship with you");
        personRelationship = scanner.nextLine();   
        
        System.out.println("Today when i was sleeping i got a dream about a " + adjective1 + " girl. She and I were " + verbPastContinious + ". I was very happy but suddenly we were i a " + place + " it was very " + adjective2 + " . and it ended like always my " + personRelationship + " woke me up.");
        scanner.close();
    }
}