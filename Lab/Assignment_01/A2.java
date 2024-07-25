import java.util.*;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double b = sc.nextDouble();
        double perimeter = 2 * (l + b);
        double area = l * b;
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }
}