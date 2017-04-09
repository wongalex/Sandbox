public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        int sum = 0;
        List<Integer> nums = new ArrayList<Integer>();
        traverse(root, nums);
        Collections.sort(nums);
        Collections.reverse(nums);
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!hash.containsKey(num)) {
                sum += num;
                hash.put(num, sum);
            }
        }
        traverseAdd(root, hash);
        return root;
    }

    private void traverse(TreeNode root, List<Integer> nums) {
        if (root == null) {
            return;
        }
        nums.add(root.val);
        traverse(root.left, nums);
        traverse(root.right, nums);
        return;
    }

    private void traverseAdd(TreeNode root, Map<Integer, Integer> hash) {
        if (root == null) {
            return;
        }
        root.val = hash.get(root.val);
        traverseAdd(root.left, hash);
        traverseAdd(root.right, hash);
        return;
    }
