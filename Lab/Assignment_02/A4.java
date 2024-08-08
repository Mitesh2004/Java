import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the first, middle, and last name
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        /*
         * // Capitalize the first character of the middle name
         * if (middleName.length() > 0) {
         * middleName = middleName.substring(0, 1).toUpperCase() +
         * middleName.substring(1).toLowerCase();
         * }
         */

        middleName = middleName.toUpperCase();

        // Print the name in the format last, first, middle
        System.out.println("Formatted Name: " + lastName + " " + firstName + " " + middleName);

        sc.close();
    }
}