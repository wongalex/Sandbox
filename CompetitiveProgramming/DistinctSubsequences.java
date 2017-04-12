public int numDistinct(String s, String t) {
    if (s.length() == 0) {
        if (t.length() == 0) {
            return 1;
        }
        return 0;
    }
    if (t.length() == 0) {
        return 1;
    }
    if (t.length() > s.length()) {
        return 0;
    }
    int m = t.length() + 1;
    int n = s.length() + 1;
    int[][] dp = new int[m][n];
    for (int i = 0; i < n; i++) {
        dp[0][i] = 1;
    }
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (t.charAt(i - 1) == s.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
            } else {
                dp[i][j] = dp[i][j - 1];
            }
        }
    }
    return dp[m - 1][n - 1];
}
