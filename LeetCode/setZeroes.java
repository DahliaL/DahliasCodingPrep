class Solution {
    public void zeroRowCol(int[][] matrix, int rowCol, String rowOrCol) {
        if(rowOrCol == "r") {
            for(int i = 0; i < matrix[rowCol].length; i++) {
                matrix[rowCol][i] = 0;
            }
        } else {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][rowCol] = 0;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> col = new ArrayList<Integer>();

        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[0].length; c++) {
                if(matrix[r][c] == 0) {
                    rows.add(r);
                    col.add(c);
                }
            }
        }

        for(int r : rows) {
            zeroRowCol(matrix, r, "r");
        }

         for(int c : col) {
            zeroRowCol(matrix, c, "c");
        }
    }
}
