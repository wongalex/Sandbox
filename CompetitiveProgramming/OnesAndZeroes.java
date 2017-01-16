public int findMaxForm(String[] strs, int m, int n) {
	int[][] dp = new int[m + 1][n + 1];
	for(String str : strs) {
		int m0 = 0;
		int n1 = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '0') {
				m0++;
			} else {
				n1++;
			}
		}
		for(int i = m; i >= m0; i--) {
			for(int j = n; j >= n1; j--) {
				dp[i][j] = Math.max(1 + dp[i - m0][j - n1], dp[i][j]);
			}
		}
	}
	return dp[m][n];
}