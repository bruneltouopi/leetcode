package org.leetcode.interviews.ms;

/**
 * @author bruno-fabrice touopi
 */
public class Atoi {

    public int myAtoi(String s) {
        StringBuilder stringNumber = new StringBuilder();
        for (Character c : s.toCharArray()) {

            if (!Character.isSpaceChar(c)) {
                if (c.compareTo('-') == 0) {
                    stringNumber.append('-');
                } else if (Character.isDigit(c)) {
                    stringNumber.append(c);
                } else if (stringNumber.length() <= 1 && !Character.isDigit(c)) {
                    return 0;
                } else if (stringNumber.length() > 1) {
                    break;
                }
            }
        }
        return Integer.parseInt(stringNumber.toString());
    }
}
