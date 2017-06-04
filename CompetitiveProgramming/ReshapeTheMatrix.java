public int[][] matrixReshape(int[][] nums, int r, int c) {
    if (r < 1 || c < 1 || nums.length == 0) {
        return nums;
    }
    int rows = nums.length;
    int cols = nums[0].length;
    if ((rows * cols) != (r * c)) {
        return nums;
    }
    int[][] solution = new int[r][c];
    int currRow = 0;
    int currCol = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            solution[currRow][currCol] = nums[i][j];
            currCol++;
            currCol %= c;
            if (currCol == 0) {
                currRow++;
            }
        }
    }
    return solution;
}
