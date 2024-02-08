package unit4;
import java.awt.*;
public class c_color {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("my frame");
        f.setSize(600,500);
        f.setVisible(true);
         // Change to the desired color
         
        Component c = f;
        c.setBackground(Color.red);
    }
}