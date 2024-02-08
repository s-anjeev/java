package unit4;
import java.awt.*;
public class button {
    public static void main(String[] args) {
        //creating instance of frame and button class
        Frame f = new Frame("MY FRAME");
        Button b = new Button("click me");
        
        b.setBounds(50,50,80,30);
        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
