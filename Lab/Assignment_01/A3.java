import java.util.*;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate the volume of a cylinder");
            System.out.println("2. Find the factorial of a given number");
            System.out.println("3. Check if a number is Armstrong or not");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the radius of the cylinder: ");
                    double radius = sc.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    double height = sc.nextDouble();
                    double volume = Math.PI * radius * radius * height;
                    System.out.println("Volume of the cylinder is: " + volume);
                    break;
                case 2:
                    System.out.print("Enter a number to find its factorial: ");
                    int num = sc.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + num + " is: " + factorial);
                    break;
                case 3:
                    System.out.print("Enter a number to check if it is an Armstrong number: ");
                    int anum = sc.nextInt();
                    int onum = anum;
                    int result = 0;
                    int n = String.valueOf(anum).length();

                    while (onum != 0) {
                        int remainder = onum % 10;
                        result += Math.pow(remainder, n);
                        onum /= 10;
                    }

                    if (result == anum) {
                        System.out.println(anum + " is an Armstrong number.");
                    } else {
                        System.out.println(anum + " is not an Armstrong number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 4);

        sc.close();
    }
}