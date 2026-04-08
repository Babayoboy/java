import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args){
        String filePath1 = "Write.txt";
        String Text1 = """
                I happen to be one of the most overthinking guy
                And you happen to not notice that how much i overthink
                                                                    ~~Someone
                """;

        try(FileWriter writer = new FileWriter(filePath1)){
            writer.write(Text1);
        }
        catch(FileNotFoundException e){
            System.out.println("Write file path is not valid! ");
        }
        catch(IOException e){
            System.out.println("Couldn't write the file!");
        }

        String filePath2 = "Read.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Read file path is not valid!");
        }
        catch(IOException e){
            System.out.println("Couldn't read the file!");
        }
    }
}
