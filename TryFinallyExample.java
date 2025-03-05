import java.io.*;

public class TryFinallyExample {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("test.txt");
            System.out.println("File opened successfully.");
        } finally {
            if (file != null) {
                try {
                    file.close();
                    System.out.println("File closed.");
                } catch (IOException e) {
                    System.out.println("Error closing file.");
                }
            }
        }
    }
}
