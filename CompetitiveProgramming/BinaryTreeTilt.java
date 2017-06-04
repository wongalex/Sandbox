public int findTilt(TreeNode root) {
    int[] solution = findTiltHelper(root);
    return solution[1];
}

private int[] findTiltHelper(TreeNode root) {
    if (root == null) {
        return new int[] {0,0};
    }
    int[] left = findTiltHelper(root.left);
    int[] right = findTiltHelper(root.right);
    return new int[] {left[0] + right[0] + root.val, left[1] + right[1] + Math.abs(left[0] - right[0])};
}
