import java.awt.*;
import java.awt.event.*;

public class MD extends Frame implements MouseListener {

    MD() {
        TextField t = new TextField(30);
        add(t);
        addMouseListener(this);
        setSize(300, 200);
        setLayout(new FlowLayout());
        setTitle("Mouse Event Demo");
        setVisible(true);

        // Close window properly
 //       addWindowListener(e -> System.exit(0));
    }

    public void mouseClicked(MouseEvent me) {
        ((TextField) getComponent(0)).setText("Mouse Clicked at (" + me.getX() + ", " + me.getY() + ")");
    }

    // Empty methods for other mouse events
    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    public static void main(String[] args) {
        new MD();
    }
}
