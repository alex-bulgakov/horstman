package part7;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alebul on 27.10.16.
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new SizedFrame();
                frame.setTitle("Грибочек");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame {
    public SizedFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        setSize(screenWidth/2, screenHeight/2);
        setLocationByPlatform(true);

        Image img = new ImageIcon("/home/alebul/java/horstman/src/part7/icon.ico").getImage();
        setIconImage(img);
    }
}
