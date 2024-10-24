import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {
    TextField t;

    MouseEventDemo() {
        t = new TextField(30);
        add(t);
        addMouseListener(this);
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Mouse Event Demo");

        // Closing the window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent me) {
        t.setText("Mouse Clicked at (" + me.getX() + ", " + me.getY() + ")");
    }

    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}

