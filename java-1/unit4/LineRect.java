package unit4;

import java.awt.*;

public class LineRect {
    public static void main(String arg[]) {
        Frame frame = new Frame("Line and Rectangles");

        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}

// Canvas canvas = new Canvas() {
// @Override
// public void paint(Graphics g) {
// g.drawLine(10,10,50,50);
// g.drawRect(10,60, 40, 30);
// g.fillRect(60, 10, 30, 80);
// g.drawRoundRect(10, 100, 80, 50, 10, 10);
// g.fillRoundRect(20, 110, 60, 30, 5, 5);
// g.drawLine(100, 10, 230, 140);
// g.drawLine(100, 140, 230, 10);
// }
// };
// frame.add(canvas);