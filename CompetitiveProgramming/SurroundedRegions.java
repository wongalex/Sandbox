public void solve(char[][] board) {
	if (board.length <= 2 || board[0].length <= 2) {
		return;
	}
	for (int i = 0; i < board[0].length; i++) {
		if (board[0][i] == 'O') {
			solve(board, 0, i);
		}
		if (board[board.length - 1][i] == 'O') {
			solve(board, board.length - 1, i);
		}
	}
	for (int i = 0; i < board.length; i++) {
		if (board[i][0] == 'O') {
			solve(board, i, 0);
		}
		if (board[i][board[0].length - 1] == 'O') {
			solve(board, i, board[0].length - 1);
		}
	}
	for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board[0].length; j++) {
			if (board[i][j] == 'O') {
				board[i][j] = 'X';
			}
			else if (board[i][j] == 'C') {
				board[i][j] = 'O';
			}
		}
	}
	return;
}

private void solve(char[][] board, int row, int col) {
	if (row < 0 || col < 0 || row >= board.length || col >= board[0].length 
		|| board[row][col] == 'X' || board[row][col] == 'C') {
		return;
	}
	board[row][col] = 'C';
	if (col > 0 && col < board[0].length - 1) {
		solve(board, row - 1, col);
		solve(board, row + 1, col);
	}
	if (col - 1 > 0 && col - 1 < board[0].length - 1) {
		solve(board, row, col - 1);
	}
	if (col + 1 > 0 && col + 1 < board[0].length - 1) {
		solve(board, row, col + 1);
	}
	return;
}