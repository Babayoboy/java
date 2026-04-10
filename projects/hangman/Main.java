import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("""
                =======================
                Welcome to hangman game
                =======================
                """);
        String path = "Hangman.txt";
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }    
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch(IOException e){
            System.out.println("Something occered!");
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        char guess;
        int wrongGuesses=0;
        boolean found;
        ArrayList<String> wordState = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < word.length(); i++){
            wordState.add("_");
        }
        while (!word.equals(String.join("", wordState)) && wrongGuesses < 6) {
            System.out.print("Enter your guess: ");
            guess = scanner.next().toLowerCase().charAt(0); 
            found = false;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == guess){
                    wordState.set(j, String.valueOf(guess));
                    System.out.println(String.join(" ", wordState));
                    System.out.println(hangman(wrongGuesses));
                    found = true;
                }
            }
            if(!found){
                wrongGuesses++;
                System.out.println(String.join(" ", wordState));
                System.out.print(hangman(wrongGuesses));
            }
        }
        System.out.println("The correct word is " + word);
        scanner.close();
    }
    static String hangman(int wrongGuesses){
        String[] hangmanStages = {
    """
      +---+
      |   |
          |
          |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
          |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
      |   |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|   |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|\\  |
          |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|\\  |
     /    |
          |
    =========
    """,
    """
      +---+
      |   |
      O   |
     /|\\  |
     / \\  |
          |
    =========
    """
        };
        return hangmanStages[wrongGuesses];
    }
}

