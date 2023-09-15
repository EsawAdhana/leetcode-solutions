// Question #104: Maximum Depth of Binary Tree
// Time complexity: O(n) && Space complexity: O(n)


import javax.swing.tree.TreeNode;

class MDOBT104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
