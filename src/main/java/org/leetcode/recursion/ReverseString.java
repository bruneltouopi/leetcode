package org.leetcode.recursion;

/**
 * @author bruno-fabrice touopi
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    public static void reverseString(char[] s) {
        helper(0, s.length - 1, s);
    }

    public static void helper(int start, int end, char[] s) {
        if (s == null || start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper(start + 1, end - 1, s);
    }

}
