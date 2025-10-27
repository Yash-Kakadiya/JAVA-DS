public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;
        if (n != m) {
            System.out.println("Number of Rows and Coloums should be Same!");
            return sum;
        }

        // Brute Force O(n^2)
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (i == j) {
        //             sum = +matrix[i][j];
        //         } else if (i + j == n - 1) {
        //             sum = +matrix[i][j];
        //         }
        //     }
        // }

        // O(n)
        for (int i = 0; i < matrix.length; i++) {
            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            if (i != n - 1 - i) // condition for odd square matrix
                sum += matrix[i][n - 1 - i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        System.out.println(diagonalSum(matrix));
    }
}
