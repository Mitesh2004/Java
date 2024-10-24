import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols], matrix2 = new int[rows][cols];
        
        System.out.println("Enter elements of first matrix:");
        fillMatrix(sc, matrix1);
        
        System.out.println("Enter elements of second matrix:");
        fillMatrix(sc, matrix2);
        
        int choice;
        do {
            System.out.println("Menu:\n1. Addition\n2. Multiplication\n3. Exit\nEnter your choice:");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: printMatrix(addMatrices(matrix1, matrix2)); break;
                case 2: printMatrix(multiplyMatrices(matrix1, matrix2)); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);
    }

    static void fillMatrix(Scanner sc, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = sc.nextInt();
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                sum[i][j] = a[i][j] + b[i][j];
        return sum;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] product = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    product[i][j] += a[i][k] * b[k][j];
        return product;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
