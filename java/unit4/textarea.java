package unit4;
import java.awt.*;
public class textarea {
    public static void main(String arg[]){
        Frame f = new Frame("framr");
        TextArea t = new TextArea();

        t.setText("hello world");
        t.setBounds(50,50,100,100);
        f.add(t);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
