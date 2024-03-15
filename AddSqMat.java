public class AddSqMat {
    public static void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        int n = matrixA[0].length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] += matrixB[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int matrixA[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int matrixB[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        AddSqMat.Addition(matrixA, matrixB);
        for (int i = 0; i < matrixA[0].length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
