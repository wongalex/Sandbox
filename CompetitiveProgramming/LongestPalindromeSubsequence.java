public int longestPalindromeSubseq(String s) {
    if (s.length() == 0) {
        return 0;
    }
    int[][] dp = new int[s.length()][s.length()];
    for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j < s.length(); j++) {
            dp[i][j] = -1;
        }
    }
    return longestPalindromeSubseq(s, 0, s.length() - 1, dp);
}

private int longestPalindromeSubseq(String s, int start, int end, int[][] dp) {
    if (dp[start][end] != -1) {
        return dp[start][end];
    } else if (start == end) {
        return 1;
    } else if (start > end) {
        return 0;
    }
    if (s.charAt(start) == s.charAt(end)){
        dp[start][end] = longestPalindromeSubseq(s, start + 1, end - 1, dp) + 2;
    } else {
        dp[start][end] = Math.max(longestPalindromeSubseq(s, start + 1, end, dp), longestPalindromeSubseq(s, start, end - 1, dp));
    }
    return dp[start][end];
}
