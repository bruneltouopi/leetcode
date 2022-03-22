package org.leetcode.interviews.ms.array_string;

/**
 * @author bruno-fabrice touopi
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;
        StringBuilder leftBuild = new StringBuilder();


        while (left < str.length && right > 0) {
            leftBuild.append(str[left]);
        }
        return leftBuild.toString();
    }
}
