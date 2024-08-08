import java.util.*;

public class demo_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Accept I/P (char) from user");
        System.out.println("Enter a char:");
        char ch = sc.next().charAt(0);
        System.out.println("Entered of char is " + ch);
        sc.close();
    }
}
