c/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Maximum-Depth-of-Binary-Tree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        else {
            int left_depth = maxDepth(root.left);
            int right_depth = maxDepth(root.right);
            return Math.max(left_depth, right_depth) + 1;
        }
    }
}
