package org.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Pre-order traversal is to visit the root first. Then traverse the left subtree.
 * Finally, traverse the right subtree
 */
public class PreorderTraversal {
    final List<Integer> l = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return l;
        l.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return l;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }
}

