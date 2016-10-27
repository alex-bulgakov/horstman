package part7;

import java.awt.*;

/**
 * Created by alebul on 27.10.16.
 */
public class ScreenSize {
    public static void main(String[] args) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        System.out.println("Ширина экрана: " + screenWidth + ", высота экрана: " + screenHeight);
    }
}
