package unit4;
import java.awt.*;
public class label {
    public static void main(String[] args) {
        Frame f = new Frame("my frame");
        Label l = new Label("label for button");

        l.setBounds(50, 80, 80, 40);
        f.add(l);

        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
