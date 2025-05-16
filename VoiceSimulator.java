import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VoiceSimulator extends JFrame {
    JTextField commandField;
    JLabel responseLabel;

    public VoiceSimulator() {
        setTitle("Voice Command Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        commandField = new JTextField();
        responseLabel = new JLabel("Speak something...", SwingConstants.CENTER);
        responseLabel.setFont(new Font("Arial", Font.BOLD, 16));

        commandField.addActionListener(e -> handleCommand(commandField.getText().toLowerCase()));
        add(commandField, BorderLayout.SOUTH);
        add(responseLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void handleCommand(String cmd) {
        switch (cmd) {
            case "hello" -> responseLabel.setText("Hi there!");
            case "time" -> responseLabel.setText("It's: " + java.time.LocalTime.now().withNano(0));
            case "date" -> responseLabel.setText("Today is: " + java.time.LocalDate.now());
            case "bye" -> responseLabel.setText("Goodbye!");
            default -> responseLabel.setText("I didn't understand that.");
        }
    }

    public static void main(String[] args) {
        new VoiceSimulator();
    }
}
