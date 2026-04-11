import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH-mm-ss");
        String newDateTime = dateTime.format(dateTimeFormatter);

        LocalDateTime ansh = LocalDateTime.of(2006,11,5,3,55,00);
        LocalDateTime pihu = LocalDateTime.of(2006,9,20,3,15,00);

        if (ansh.isBefore(pihu)) {
            System.out.println(ansh + " comes before " + pihu);
        }
        else{
            System.out.println(pihu + " comes before " + ansh);
        }

        System.out.println(newDateTime);
    }
}
