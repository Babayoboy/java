import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.ZonedDateTime;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Alarm {
    LocalTime alarmTime;
    void setAlarmTime(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    void alarmClock(){
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupt occured");
            }
            System.out.println(LocalTime.now());
        }
        try {
            for(int i = 0; i < 10; i++){
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("3dabrar-funny-alarm-317531.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(i);
            clip.start();
        }
        } catch (LineUnavailableException e) {
            System.out.println("LineAvaliable");
        } catch(IOException e){
            System.out.println("Input output exception");
        } catch(UnsupportedAudioFileException e){
            System.out.println("File not supported");
        }
    }
}
