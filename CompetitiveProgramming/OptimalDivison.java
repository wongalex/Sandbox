public String optimalDivision(int[] nums) {
    StringBuilder solution = new StringBuilder();
    if (nums.length == 0) {
        return "";
    }
    solution.append(nums[0]);
    if (nums.length == 1) {
        return solution.toString();
    }
    solution.append('/');
    if (nums.length == 2) {
        solution.append(nums[1]);
        return solution.toString();
    }
    solution.append('(');
    for (int i = 1; i < nums.length; i++) {
        solution.append(nums[i]);
        solution.append('/');
    }
    solution.deleteCharAt(solution.length() - 1);
    solution.append(')');
    return solution.toString();
}
