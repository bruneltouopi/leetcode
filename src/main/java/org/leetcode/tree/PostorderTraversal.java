package org.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Post-order traversal is to traverse the left subtree first.
 * Then traverse the right subtree. Finally, visit the root.
 *
 * @author bruno-fabrice touopi
 */
public class PostorderTraversal {
    final List<Integer> l = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return l;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
        return l;
    }
}
