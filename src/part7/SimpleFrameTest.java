package part7;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alebul on 26.10.16.
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setTitle("My programm");
            }
        });
    }
}

class SimpleFrame extends JFrame {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;

    public SimpleFrame() {
        setSize(WIDTH, HEIGHT);
    }
}
