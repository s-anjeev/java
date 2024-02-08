package unit4;
import java.awt.*;
public class menu {
    public static void main(String[] args) {
        Frame f = new Frame("my frame");
        MenuBar menubar = new MenuBar();

        Menu filemenu = new Menu("file");

        MenuItem m1  = new MenuItem("new");
        MenuItem m2  = new MenuItem("save");
        MenuItem m3  = new MenuItem("open");
        MenuItem m4  = new MenuItem("exit");

        filemenu.add(m1);
        filemenu.add(m2);
        filemenu.add(m3);
        filemenu.addSeparator();
        filemenu.add(m4);

        menubar.add(filemenu);
        f.setMenuBar(menubar);

        f.setSize(400,400);
        f.setVisible(true);
    }
}
