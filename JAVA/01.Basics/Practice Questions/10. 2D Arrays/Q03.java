/*
 * Question 3 : Write a program to FindTranspose ofa Matrix.
What is Transpose?
Transpose of a matrix is the process ofswapping the rows to columns. For a 2x3 matrix,
Matrix
a11    a12    a13
a21    a22    a23
Transposed Matrix
a11    a21
a12    a22
a13    a23
 */

public class Q03 {
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 } };

        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
