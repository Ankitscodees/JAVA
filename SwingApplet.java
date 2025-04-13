import javax.swing.*;
import java.awt.*;

public class SwingApplet extends JApplet {
    public void init() {
        JLabel label = new JLabel("This is a Swing Applet");
        add(label);
    }
}
