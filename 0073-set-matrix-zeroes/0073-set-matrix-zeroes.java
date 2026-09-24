class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;       // number of rows
        int m = matrix[0].length;    // number of columns

        int col0 = 1;

        // Mark rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0;

                    if (j != 0) {
                        matrix[0][j] = 0;
                    } 
                    else {
                        col0 = 0;
                    }
                }
            }
        }

        // Set inner matrix to zero
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][j] != 0) {

                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Set first row to zero
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set first column to zero
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}