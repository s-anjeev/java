package unit4;
import java.awt.*;
public class flow_layout {
    public static void main(String[] args) {

        Frame f = new Frame("my frame");

        Button b1 =new Button("button");
        Button b2 =new Button("button");
        Button b3 =new Button("button");
        Button b4 =new Button("button");
        Button b5 =new Button("button");

        f.setLayout(new FlowLayout());
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(400,400);
        f.setVisible(true);
    }
}
