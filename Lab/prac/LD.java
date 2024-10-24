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

class LD {
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
