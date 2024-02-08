package unit4;
import java.awt.*;
public class gui_components extends Frame{
    gui_components(){
        setSize(500,400);
        setTitle("my frame");
        //create a button
        Label l = new Label("my label");
        //set position on screen
        l.setBounds(60,20,60,20);
        //add button to frame
        add(l);
        setVisible(true);
    }
    public static void main(String[] args) {
        gui_components g = new  gui_components();
        Component c = g;
        c.setBackground(Color.red);
    }
}

