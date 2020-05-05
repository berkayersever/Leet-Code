/**
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
class Binary-Tree-Maximum-Path-Sum {
  int max_sum = Integer.MIN_VALUE;

  public int max_gain(TreeNode node) {
    if (node == null) return 0;
	
    // Max sum on the left and right sub-trees of node
    int left_gain = Math.max(max_gain(node.left), 0);
    int right_gain = Math.max(max_gain(node.right), 0);

    // The price to start a new path where 'node' is a highest node
    int price_newpath = node.val + left_gain + right_gain;

    // Update max_sum if it's better to start a new path
    max_sum = Math.max(max_sum, price_newpath);

    // For Recursion => Return the max gain if continue the same path
    return node.val + Math.max(left_gain, right_gain);
  }

  public int maxPathSum(TreeNode root) {
    max_gain(root);
    return max_sum;
  }
}
