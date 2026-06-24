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
class Solution {
    private int maxDepth = -1;
    private TreeNode deepestSubtreeRoot = null;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root, 0);
        return deepestSubtreeRoot;
    }

    private int dfs(TreeNode node, int currentDepth) {
        if (node == null) {
            return currentDepth;
        }

        // Find the deepest level reached by both sides
        int leftDeepest = dfs(node.left, currentDepth + 1);
        int rightDeepest = dfs(node.right, currentDepth + 1);

        // Calculate the maximum depth seen by either branch
        int currentMax = Math.max(leftDeepest, rightDeepest);

        // Update the global maximum depth tracker
        maxDepth = Math.max(maxDepth, currentMax);

        // If both paths reach the global absolute maximum depth, 
        // this node upgrades to the current winner candidate!
        if (leftDeepest == maxDepth && rightDeepest == maxDepth) {
            deepestSubtreeRoot = node;
        }

        return currentMax;
    }
}
