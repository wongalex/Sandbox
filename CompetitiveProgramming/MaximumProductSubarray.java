public int maxProduct(int[] nums) {
    int length = nums.length;
    if (length == 0) {
        return 0;
    }
    if (length == 1) {
        return nums[0];
    }
    int max = nums[0];
    int[][] dp = new int[length][2];
    dp[0][0] = nums[0];
    dp[0][1] = nums[0];
    for (int i = 1; i < length; i++) {
        dp[i][0] = Math.min(nums[i], Math.min(dp[i-1][0]*nums[i], dp[i-1][1]*nums[i]));
        dp[i][1] = Math.max(nums[i], Math.max(dp[i-1][0]*nums[i], dp[i-1][1]*nums[i]));
        max = Math.max(max, dp[i][1]);
    }
    return max;
}
