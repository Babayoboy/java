import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String alarmTime;
        try(Scanner scanner = new Scanner(System.in)){
            Alarm alarm = new Alarm();
            System.out.print("Enter the time you want to set alarm for(HH:MM:SS): ");
            alarmTime = scanner.next();
            LocalTime Time = LocalTime.parse(alarmTime);
            alarm.setAlarmTime(Time);
            alarm.alarmClock();
        }
    }
}