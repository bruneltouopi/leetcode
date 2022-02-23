package org.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Level-order traversal is to traverse the tree level by level.
 * <p>
 * Breadth-First Search is an algorithm to traverse or search in data structures like a tree or a graph. The
 * algorithm starts with a root node and visit the node itself first. Then traverse its neighbors, traverse its
 * second level neighbors, traverse its third level neighbors, so on and so forth.
 *
 * @author bruno-fabrice touopi
 */
public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            //start with the current level
            levels.add(new ArrayList<>());
            int level_length = queue.size();
            for (int i = 0; i < level_length; i++) {
                levels.get(level).add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            level++;
        }

        return levels;

    }

}
