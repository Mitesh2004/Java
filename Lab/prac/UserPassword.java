import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

class InvalidPasswordException extends Exception {}

class UserPassword extends JFrame implements ActionListener { 
    private JLabel nameLabel, passLabel; 
    private JTextField nameText; 
    private JPasswordField passText; 
    private JButton loginButton, endButton; 
    private static int attemptCount = 0; 

    UserPassword() { 
        nameLabel = new JLabel("Name: "); 
        passLabel = new JLabel("Password: "); 
        nameText = new JTextField(20); 
        passText = new JPasswordField(20); 
        loginButton = new JButton("Login"); 
        endButton = new JButton("End"); 

        loginButton.addActionListener(this); 
        endButton.addActionListener(this); 

        setLayout(new GridLayout(3, 2)); 
        add(nameLabel); 
        add(nameText); 
        add(passLabel); 
        add(passText); 
        add(loginButton); 
        add(endButton); 

        setTitle("Login Check"); 
        setSize(300, 150); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); 
    } 

    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == endButton) { 
            System.exit(0); 
        } 
        if (e.getSource() == loginButton) { 
            try { 
                String username = nameText.getText(); 
                String password = new String(passText.getPassword()); 
                if (username.equals(password)) { 
                    JOptionPane.showMessageDialog(this, "Login Successful", "Login", JOptionPane.INFORMATION_MESSAGE); 
                    System.exit(0); 
                } else { 
                    throw new InvalidPasswordException(); 
                } 
            } catch (InvalidPasswordException e1) { 
                attemptCount++; 
                JOptionPane.showMessageDialog(this, "Login Failed", "Login", JOptionPane.ERROR_MESSAGE); 
                nameText.setText(""); 
                passText.setText(""); 
                nameText.requestFocus(); 

                if (attemptCount >= 3) { 
                    JOptionPane.showMessageDialog(this, "3 Attempts Over", "Login", JOptionPane.ERROR_MESSAGE); 
                    System.exit(0); 
                } 
            } 
        } 
    } 

    public static void main(String[] args) { 
        new UserPassword(); 
    } 
}
