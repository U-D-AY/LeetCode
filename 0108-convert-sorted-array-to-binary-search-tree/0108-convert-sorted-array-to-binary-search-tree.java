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
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if(len<=0) return null;
        return create(nums, 0, len - 1);
    }
    private TreeNode create(int[] nums, int l, int r){
        if(l>r) return null;

        int mid = l + (r-l)/2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = create(nums, l, mid-1);
        node.right = create(nums, mid+1, r);

        return node;
    }
}