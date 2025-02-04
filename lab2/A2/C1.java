import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C1 extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup group;

    public C1() {
        setTitle("Traffic Light Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Label for messages
        messageLabel = new JLabel("");  
        messageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(messageLabel);

        // Radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Grouping radio buttons
        group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Adding action listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Adding components
        add(redButton);
        add(yellowButton);
        add(greenButton);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (redButton.isSelected()) {
            messageLabel.setText("STOP");
            messageLabel.setForeground(Color.RED);
        } else if (yellowButton.isSelected()) {
            messageLabel.setText("READY");
            messageLabel.setForeground(Color.ORANGE);
        } else if (greenButton.isSelected()) {
            messageLabel.setText("GO");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new C1();
    }
}

