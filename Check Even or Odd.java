import java.io.*;

public class EvenOddFile {
    public static void main(String[] args) throws Exception {
        String fileName = "data.txt";

        // Read the number from the file
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int number = Integer.parseInt(br.readLine().trim());
        br.close();

        // Check even or odd and write result to the same file
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(number + " is " + (number % 2 == 0 ? "even" : "odd") + ".");
        bw.close();
    }
}
