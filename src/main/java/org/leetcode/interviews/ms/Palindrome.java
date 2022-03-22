package org.leetcode.interviews.ms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bruno-fabrice touopi
 */
public class Palindrome {

    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        for (int i = 0, j = builder.length() - 1; i < builder.length() && j > 0; i++, j--) {

            if (builder.charAt(i) != builder.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
