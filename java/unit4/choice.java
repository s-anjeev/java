package unit4;
import java.awt.*;
public class choice {
    public static void main(String[] args) {
        Frame f = new Frame("my frame");
        Choice c = new Choice();

        c.addItem("item 1");
        c.addItem("item 2");
        c.addItem("item 3");
        c.setBounds(50,50,100,60);
        f.add(c);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
