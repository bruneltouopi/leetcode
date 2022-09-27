package org.leetcode.interviews.ms.tree;

import org.leetcode.tree.TreeNode;

public class ValidBinaryTree {

    public boolean isValidBinaryTree(TreeNode node) {
        if (node == null) {
            return true;
        }
        boolean valid = node.val > node.left.val || node.val > node.right.val;
        isValidBinaryTree(node.left);
        isValidBinaryTree(node.right);

        return valid;

    }
}
