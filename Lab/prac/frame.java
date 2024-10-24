import javax.swing.*;

public class frame {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("My Simple Frame");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Close the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
