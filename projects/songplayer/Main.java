import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main (String[] args){
        String filePath = "Din Bisre.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            String response="";
            while (!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Restart");
                System.out.println("Q = Quit");
                System.out.println("Enter your choice");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P"-> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid value!");
                }
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Audio can't be located!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio not supported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource!");
        }
        catch (IOException e) {
            System.out.println("An error occurred!");
        }
    }
}
