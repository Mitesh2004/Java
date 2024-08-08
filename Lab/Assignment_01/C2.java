import java.util.*;

public class C2 {

    // Function to sum diagonal elements
    public static int sumDiagonalElements(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    // Function to sum upper diagonal elements
    public static int sumUpperDiagonalElements(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Function to sum lower diagonal elements
    public static int sumLowerDiagonalElements(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the square matrix
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[n][n];

        // Input the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Menu-driven operations
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sum of diagonal elements");
            System.out.println("2. Sum of upper diagonal elements");
            System.out.println("3. Sum of lower diagonal elements");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int diagonalSum = sumDiagonalElements(matrix, n);
                    System.out.println("Sum of diagonal elements: " + diagonalSum);
                    break;
                case 2:
                    int upperDiagonalSum = sumUpperDiagonalElements(matrix, n);
                    System.out.println("Sum of upper diagonal elements: " + upperDiagonalSum);
                    break;
                case 3:
                    int lowerDiagonalSum = sumLowerDiagonalElements(matrix, n);
                    System.out.println("Sum of lower diagonal elements: " + lowerDiagonalSum);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}