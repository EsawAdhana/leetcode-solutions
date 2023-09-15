// Question #226: Invert Binary Tree
// Time complexity: O(n) && Space complexity: O(n)

import javax.swing.tree.TreeNode;

class IBT226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left =  invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}
