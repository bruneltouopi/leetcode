package org.leetcode.amazon;

import java.util.ArrayList;
import java.util.List;

public class ZigZagOrderLevel {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        System.out.println(2%2);
    }

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<Integer> zigag = new ArrayList<>();
        int i = 1;
        while (root != null) {
            zigag.add(root.val);
           if (root.left!=null)zigag.add(root.left.val);
            if (root.right!=null) zigag.add(root.right.val);
            if (i % 2 == 0) {
                root = root.right;
            } else {
                root = root.left;
            }
            i++;
            result.add(zigag);
        }

        return result;


    }

}
