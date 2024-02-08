package unit4;
import java.awt.*;
public class list {
    public static void main(String[] args) {
        Frame f = new Frame("my frame");
        List l = new List();

        l.add("item 1");
        l.add("item 2");
        l.add("item 3");
        l.add("item 4");
        l.setBounds(50,50,100,100);
        f.add(l);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

