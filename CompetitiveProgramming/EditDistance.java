public int minDistance(String word1, String word2) {
    int[][] dp = new int[word1.length() + 1][word2.length() + 1];
    for (int i = 0; i < word1.length() + 1; i++) {
        for (int j = 0; j < word2.length() + 1; j++) {
            dp[i][j] = -1;
        }
    }
    return min(word1, word2, word1.length(), word2.length(), dp);
}

private int min(String word1, String word2, int i, int j, int[][] dp) {
    if (dp[i][j] >= 0) {
        return dp[i][j];
    } else if (i == 0 || j == 0) {
        dp[i][j] = i + j;
    } else if (word1.charAt(i-1) == word2.charAt(j-1)) {
        dp[i][j] = min(word1, word2, i-1, j-1, dp);
    } else {
        dp[i][j] = Math.min(min(word1, word2, i-1, j, dp), Math.min(min(word1, word2, i, j-1, dp), min(word1, word2, i-1, j-1, dp))) + 1;
    }
    return dp[i][j];
}
