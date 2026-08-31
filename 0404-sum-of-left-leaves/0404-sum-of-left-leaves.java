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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null)return 0;

         int sum = 0;
        
        // Check if the left child exists and is a leaf node
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        } else {
            // If it is not a leaf node, explore the left subtree
            sum += sumOfLeftLeaves(root.left);
        }
        
        // Always explore the right subtree for potential left leaves
        sum += sumOfLeftLeaves(root.right);
        
        return sum;
    }
}