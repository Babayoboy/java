package projects.quizGame;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("WELCOME TO JAVA QUIZ");
        System.out.println("====================");

        String[] questions = question(); 
        String[][] answers = answer();
        int[] correct = {2, 3, 3, 2, 2, 2, 3, 3, 4, 3};
        int userChoice;
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String choice : answers[i]) {
                System.out.println(choice);
            }
            userChoice = scanner.nextInt();
            if (userChoice > 4 || userChoice < 1) {
                System.out.println("Enter a valid choice");
            }
            else if (correct[i] == userChoice) {
                score++;
            }
        }
        System.out.println("You have scored " + score + "/10");
    }
    static String[] question(){
        String[] questions = {
            "1. Which of these is the default value of a boolean variable in Java?",
            "2. What is the size of an int variable in Java?",
            "3. Which keyword is used to prevent a method from being overridden by a subclass?",
            "4. What is the output of System.out.println(10 + 20 + \"Java\");?",
            "5. Which of the following is NOT a feature of Java?",
            "6. Which class is the superclass of every class in Java?",
            "7. What happens if a static method is called without an object?",
            "8. Which of these packages contains the Scanner class?",
            "9. Which of these access modifiers offers the most restrictive access?",
            "10. What is the extension of a compiled Java class file?"
        };
        return questions;
    }
    static String[][] answer(){
        String[][] answers = {
            {"1. true", "2. false", "3. 0", "4. null"},
            {"1. 8bit", "2. 16bit", "3. 32bit", "4. 64bit"},
            {"1. static", "2. abstract", "3. final", "4. volatile"},
            {"1. 1020Java", "2. 30Java", "3. Java30", "4. Error"},
            {"1. Object-oriented", "2. Use of pointers", "3. Platform independent", "4. Dynamic"},
            {"1. String", "2. Object", "3. Abstract", "4. System"},
            {"1. Compilation error", "2. Runtime error", "3. Executes normally", "4. Memory Leak"},
            {"1. java.lang", "2. java.io", "3. java.util", "4. java.net"},
            {"1. public", "2. protected", "3. default", "4. private"},
            {"1. .java", "2. .js", "3. .class", "4. .exe"}
        };
        return answers;
    }
}