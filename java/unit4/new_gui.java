package unit4;
import java.awt.*;
public class new_gui {
    public static void main(String[] args) {
        Frame f = new Frame("my frame");
        f.setSize(300, 300);
        f.setVisible(true);
        f.setLayout(null);
        //creating a button
        Button b = new Button("click me");
        b.setBounds(100,100,60,20);
        f.add(b);
        //creating lable
        Label l = new Label("button :");
        l.setBounds(100,70,50,40);
        f.add(l);
        //input field
    }
}
