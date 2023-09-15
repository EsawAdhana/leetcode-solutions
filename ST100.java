// Question #100: Same Tree
// Time complexity: O(p + q) && Space complexity: O(p + q)

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

class Solution {
    ArrayList<Integer> pArr = new ArrayList<>();
    ArrayList<Integer> qArr = new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        dfs(p, pArr);
        dfs(q, qArr);
        return pArr.equals(qArr);
    }
    public void dfs(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            list.add(Integer.MAX_VALUE);
            return;
        }
        list.add(node.val);
        dfs(node.left, list);
        dfs(node.right, list);
    }
}
