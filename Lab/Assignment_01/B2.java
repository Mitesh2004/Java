import java.util.Scanner;

public class B2 {

    private int n;

    public B2() {
        this.n = 0;
    }

    public B2(int n) {
        this.n = n;
    }

    public boolean isNegative() {
        return this.n < 0;
    }

    public boolean isPositive() {
        return this.n > 0;
    }

    public boolean isZero() {
        return this.n == 0;
    }

    public boolean isOdd() {
        return this.n % 2 != 0;
    }

    public boolean isEven() {
        return this.n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = scanner.nextInt();
        B2 myNumber = new B2(value);
        System.out.println("Number: " + value);
        System.out.println("Is Negative: " + myNumber.isNegative());
        System.out.println("Is Positive: " + myNumber.isPositive());
        System.out.println("Is Zero: " + myNumber.isZero());
        System.out.println("Is Odd: " + myNumber.isOdd());
        System.out.println("Is Even: " + myNumber.isEven());

        scanner.close();
    }
}