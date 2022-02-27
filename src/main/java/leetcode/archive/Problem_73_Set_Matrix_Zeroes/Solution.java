package leetcode.archive.Problem_73_Set_Matrix_Zeroes;

/**
 * Runtime: 3 ms, faster than 25.84% of Java online submissions for Set Matrix Zeroes.
 * Memory Usage: 50.6 MB, less than 16.69% of Java online submissions for Set Matrix Zeroes.
 */
class Solution {

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstColsShouldBeNull = false;

        for (int r = 0; r < rows; r++) {
            if (matrix[r][0] == 0) {
                firstColsShouldBeNull = true;
            }

            for (int c = 1; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        /*
        Very important that we no need to touch first row and column.
        So, we need to skip it or we ruined the previous markers.
         */
        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int c = 0; c < cols; c++) {
                matrix[0][c] = 0;
            }
        }

        if (firstColsShouldBeNull) {
            for (int r = 0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }
    }
}