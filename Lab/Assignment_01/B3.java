import java.util.Scanner;

public class B3 {

    public static int[][] inputMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols2 = matrix2[0].length;
        int[][] product = new int[rows][cols2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMatrix Operations Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter dimensions for matrices (rows and columns):");
                    int rows = sc.nextInt();
                    int cols = sc.nextInt();

                    System.out.println("Enter first matrix:");
                    int[][] matrix1 = inputMatrix(sc, rows, cols);
                    System.out.println("Enter second matrix:");
                    int[][] matrix2 = inputMatrix(sc, rows, cols);

                    int[][] sum = addMatrices(matrix1, matrix2);
                    System.out.println("Result of addition:");
                    printMatrix(sum);
                    break;

                case 2:
                    System.out.println("Enter dimensions of first matrix (rows and columns):");
                    rows = sc.nextInt();
                    cols = sc.nextInt();
                    System.out.println("Enter first matrix:");
                    matrix1 = inputMatrix(sc, rows, cols);

                    System.out.println("Enter columns of second matrix:");
                    int cols2 = sc.nextInt();
                    System.out.println("Enter second matrix:");
                    matrix2 = inputMatrix(sc, cols, cols2);

                    int[][] product = multiplyMatrices(matrix1, matrix2);
                    System.out.println("Result of multiplication:");
                    printMatrix(product);
                    break;

                case 3:
                    System.out.println("Enter dimensions of the matrix (rows and columns):");
                    rows = sc.nextInt();
                    cols = sc.nextInt();

                    System.out.println("Enter matrix:");
                    matrix1 = inputMatrix(sc, rows, cols);

                    int[][] transpose = transposeMatrix(matrix1);
                    System.out.println("Transpose of the matrix:");
                    printMatrix(transpose);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}