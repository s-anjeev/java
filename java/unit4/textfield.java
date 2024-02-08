package unit4;
import java.awt.*;
public class textfield {
    public static void main(String arg[]){
        Frame f = new Frame("frame ");
        TextField t = new TextField();

        t.setBounds(50,50,100,20);
        f.add(t);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}