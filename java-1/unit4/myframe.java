package unit4;

import java.awt.*;
import java.awt.event.*;

public class myframe {
    public static void main(String[] args) {
        // Create a new frame
        Frame frame = new Frame("My Frame");

        // Set the size of the frame
        frame.setSize(600, 500);

        // Create a label with the desired text
        Label label = new Label("Hello, World!");

        // Add the label to the frame
        frame.add(label);

        // Set the frame layout
        frame.setLayout(new FlowLayout());
        // Set the frame to be visible
        frame.setVisible(true);
        // close the frame
        frame.addWindowListener(new myclass());

    }
}
class myclass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}