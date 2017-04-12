public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> solution = new ArrayList<Integer>();
        if (root == null) {
            return solution;
        } else if (root.left == null && root.right == null) {
            solution.add(root.val);
            return solution;
        } else {
            solution.add(root.val);
            getLeft(root.left, solution);
            getLeaves(root, solution);
            Stack<Integer> stack = new Stack<Integer>();
            getRight(root.right, stack);
            while (!stack.isEmpty()) {
                solution.add(stack.pop());
            }
            return solution;
        }

    }

    private void getLeft(TreeNode node, List<Integer> solution) {
        if (node == null) {
            return;
        } else if (!isLeaf(node)) {
            solution.add(node.val);
        }
        if (node.left != null) {
            getLeft(node.left, solution);
        } else {
            getLeft(node.right, solution);
        }
        return;
    }

    private void getLeaves(TreeNode node, List<Integer> solution) {
        if (node == null) {
            return;
        } else if (isLeaf(node)) {
            solution.add(node.val);
            return;
        } else {
            getLeaves(node.left, solution);
            getLeaves(node.right, solution);
            return;
        }
    }

    private void getRight(TreeNode node, Stack<Integer> stack) {
        if (node == null) {
            return;
        } else if (!isLeaf(node)) {
            stack.push(node.val);
        }
        if (node.right != null) {
            getRight(node.right, stack);
        } else {
            getRight(node.left, stack);
        }
        return;
    }

    private boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        } else {
            return false;
        }
    }
