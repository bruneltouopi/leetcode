package org.leetcode.amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthese {
    static Map<Character, Character> mappings;

    static {
        mappings = new HashMap<>();
        mappings.put('}', '{');
        mappings.put(')', '(');
        mappings.put(']', '[');
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(validParanthese(s));
    }
    public static boolean validParanthese(String s) {
        var stack = new Stack<Character>();
        for (int i = 0; i <s.length() ; i++) {

            Character c = s.charAt(i);

            if (mappings.containsKey(c)){
               char topElement=stack.pop();
               if (topElement != mappings.get(c)){
                   return false;
               }
            }else{
                stack.push(c);
            }

        }

        return stack.isEmpty();
    }
}
