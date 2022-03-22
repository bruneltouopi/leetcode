package org.leetcode.interviews.ms.array_string;

/**
 * @author bruno-fabrice touopi
 */
public class ReverseWord {

    public static void main(String[] args) {
        String input1 = "the sky is blue";
        String input2 = "  hello world  ";
        String input3 = "a good   example";
        System.out.println(input1 + "=" + reverseWords(input1));
        System.out.println(input2 + "=" + reverseWords(input2));
        System.out.println(input3 + "=" + reverseWords(input3));
    }

    public static String reverseWords(String s) {
        String[] splitWord = s.trim().split(" ");
        StringBuilder reverseWord = new StringBuilder();

        for (int i = splitWord.length - 1; i >= 0; i--) {
            if (!splitWord[i].isBlank()) {
                reverseWord.append(splitWord[i]);
                if (i != 0) {
                    reverseWord.append(" ");
                }
            }

        }
        return reverseWord.toString();

    }
}
