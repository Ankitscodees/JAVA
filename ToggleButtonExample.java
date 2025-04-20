import javax.swing.*;

public class ToggleButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toggle Button");
        JToggleButton toggle = new JToggleButton("OFF");

        toggle.setBounds(100, 50, 100, 40);

        toggle.addActionListener(e -> {
            if (toggle.isSelected()) toggle.setText("ON");
            else toggle.setText("OFF");
        });

        frame.add(toggle);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
