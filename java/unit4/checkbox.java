package unit4;
import java.awt.*;
import java.awt.Checkbox;

public class checkbox {
    public static void main(String[] args) {
        Frame f = new Frame("my frame");
        Checkbox ch = new Checkbox("check me");
        Checkbox ch1 = new Checkbox("check me");
        Checkbox ch2 = new Checkbox("check me");

        ch1.setBounds(50, 70, 80, 30);
        ch2.setBounds(50, 90, 80, 30);
        ch.setBounds(50, 50, 80, 30);

        f.add(ch);
        f.add(ch1);
        f.add(ch2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
