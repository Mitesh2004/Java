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




import java.util.*;

class InvalidUsernameException extends Exception {
    InvalidUsernameException(String u) {
        System.out.println("Invalid Username: " + u);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String p) {
        System.out.println("Invalid Password: " + p);
    }
}

class LoginDemo {
    static String username = "Mitesh", password = "123";  // Declared as static

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Username: ");
        String u = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String p = sc.nextLine();
        
        try {
            if (!username.equals(u)) throw new InvalidUsernameException(u);  // Access static variables directly
            System.out.println("Username is Valid");

            if (!password.equals(p)) throw new InvalidPasswordException(p);  // Access static variables directly
            System.out.println("Password is Valid");

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e);
        }
    }
}
