package org.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * In-order traversal is to traverse the left subtree first. Then visit the root.
 * Finally, traverse the right subtree.
 *
 * @author bruno-fabrice touopi
 */
public class InorderTraversal {
    final static List<Integer> l = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val = 10;
        node.left = new TreeNode(25);
        node.left.left=new TreeNode(8);
        node.right = new TreeNode(0);
        inorderTraversal(node).forEach(System.out::println);
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return l;
        }
        inorderTraversal(root.left);
        l.add(root.val);
        inorderTraversal(root.right);
        return l;
    }
}
