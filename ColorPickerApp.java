import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorPickerApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Picker");
        JButton button = new JButton("Pick a Color");
        JPanel panel = new JPanel();

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(frame, "Choose Background Color", panel.getBackground());
                if (color != null) {
                    panel.setBackground(color);
                }
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
