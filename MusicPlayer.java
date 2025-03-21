import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the audio file: ");
        String filePath = scanner.nextLine();
        scanner.close();

        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("Playing music... Press Enter to stop.");
            clip.start();
            scanner.nextLine(); 
            clip.stop();

            clip.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
