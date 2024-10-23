import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String msg) {
        super(msg);
    }
}

public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();
        
        System.out.print("Enter password: ");
        String password = sc.next();

        try {
            if (!username.equals(password)) {
                throw new InvalidPasswordException("Invalid Password: Username and password do not match!");
            }
            System.out.println("Login Successful! Welcome, " + username + "!");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
