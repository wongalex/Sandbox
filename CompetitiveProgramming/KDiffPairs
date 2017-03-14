public int findPairs(int[] nums, int k) {
    int count = 0;
    if (nums.length == 0 || k < 0) {
        return count;
    }
    Set<Integer> uniqueNums = new HashSet<Integer>();
    Set<Integer> k0Nums = new HashSet<Integer>();
    for (int num : nums) {
        if (uniqueNums.contains(num)) {
            if (k == 0 && !k0Nums.contains(num)) {
                count++;
                k0Nums.add(num);
            }
            continue;
        }
        if (uniqueNums.contains(num + k)) {
            count++;
        }
        if (uniqueNums.contains(num - k)) {
            count++;
        }
        uniqueNums.add(num);
    }
    return count;
}
