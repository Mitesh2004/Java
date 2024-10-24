public class ToD {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        int[][] transpose = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = array[j][i];
            }
        }
        for (int[] row : transpose) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
