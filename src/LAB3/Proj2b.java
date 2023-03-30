package LAB3;

public class Proj2b {
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] B = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] result = new int[3][3];
        int i, j;

        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A.length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = i; j < 3; j++) {
                int temp = result[j][i];
                result[j][i] = result[i][j];
                result[i][j] = temp;
            }

        }

        for (i = 0; i < 3; i++) {
            System.out.print("[");
            for (j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
