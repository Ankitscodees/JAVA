import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox");
        JCheckBox cb1 = new JCheckBox("Java");
        JCheckBox cb2 = new JCheckBox("Python");

        cb1.setBounds(100, 50, 100, 30);
        cb2.setBounds(100, 80, 100, 30);

        frame.add(cb1);
        frame.add(cb2);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
