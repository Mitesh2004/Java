import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginScreen extends JFrame implements ActionListener {
    private final JTextField username = new JTextField(20);
    private final JPasswordField password = new JPasswordField(20);
    private final JLabel msg = new JLabel();
    private int attempts = 0;

    LoginScreen() {
        setLayout(new FlowLayout());
        add(new JLabel("Username:"));
        add(username);
        add(new JLabel("Password:"));
        add(password);
        add(createButton("Login"));
        add(createButton("Clear"));
        add(msg);
        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        return button;
    }

    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action.equals("Login")) {
            handleLogin();
        } else if (action.equals("Clear")) {
            username.setText("");
            password.setText("");
            msg.setText("");
        }
    }

    private void handleLogin() {
        attempts++;
        if (username.getText().equals(password.getText())) {
            msg.setText("Login Successful!");
        } else {
            msg.setText(attempts < 3 ? "Invalid credentials. Attempts left: " + (3 - attempts) : "Account locked after 3 attempts.");
        }
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}
