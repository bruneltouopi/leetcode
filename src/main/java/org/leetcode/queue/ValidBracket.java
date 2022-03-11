package org.leetcode.queue;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

/**
 * @author bruno-fabrice touopi
 */
public class ValidBracket {
    private static final Map<Character, Character> params = Map.of('{', '}',
            '(', ')',
            '[', ']');


    public static void main(String[] args) {
        String input = "[]";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (params.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (params.get(stack.pop()).compareTo(c) != 0) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
