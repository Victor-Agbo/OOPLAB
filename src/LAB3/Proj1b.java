package LAB3;

public class Proj1b {
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] B = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        int[][] result = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            int count = 0;

            while (count < A.length) {
                int pos = 0;
                for (int j = 0; j < B.length; j++) {
                    pos += A[i][j] * B[j][count];
                }
                result[i][count] = pos;
                count++;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
