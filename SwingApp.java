import javax.swing.*;

public class SwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Application");
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Welcome to Java Swing!");

        label.setBounds(50, 50, 200, 30);
        button.setBounds(70, 100, 120, 30);

        frame.add(label);
        frame.add(button);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
