public void rotate(int[][] matrix) {
	if (matrix.length < 2) {
		return;
	}
	int matrixLength = matrix.length - 1;
	for(int i = 0; i < (matrixLength + 1) / 2; i++) {
		for(int j = i; j < matrixLength - i; j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[matrixLength - j][i];
			matrix[matrixLength - j][i] = matrix[matrixLength - i][matrixLength - j];
			matrix[matrixLength - i][matrixLength - j] = matrix[j][matrixLength - i];
			matrix[j][matrixLength - i] = temp;
		}
	}
	return;
}