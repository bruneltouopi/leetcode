package org.leetcode.tree;

/**
 * @author bruno-fabrice touopi
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root ==null){
            return 0;
        }
        int depth_left=maxDepth(root.left);
        int depth_right = maxDepth(root.right);
        return Math.max(depth_left,depth_right)+1;
    }
}
