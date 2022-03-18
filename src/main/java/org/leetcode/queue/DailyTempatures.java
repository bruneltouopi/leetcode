package org.leetcode.queue;

import org.leetcode.utils.Utils;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author bruno-fabrice touopi
 */
public class DailyTempatures {

    public static void main(String[] args) {
        int[] input = new int[]{55, 38, 53, 81, 61, 93, 97, 32, 43, 78};
        Utils.printArrayInt(dailyTemperaturesSolution(input));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] answers = new int[temperatures.length];
        int i = 0;
        int j = 0;

        int count = 0;
        while (j < temperatures.length && i <= j) {
            //check if next temperature is superior
            if (temperatures[i] >= temperatures[j]) {
                j++;
                count++;

            } else {
                answers[i] = count;
                count = 0;
                i++;
                j = i;
            }
            if (j == temperatures.length - 1 && temperatures[i] >= temperatures[j]) {

                answers[i] = 0;
                count = 0;
                i++;
                j = i;
            }

        }
        return answers;

    }

    /**
     * Official Solution
     *
     * @param temperatures
     * @return
     */
    public static int[] dailyTemperaturesSolution(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int currDay = 0; currDay < n; currDay++) {
            int currentTemp = temperatures[currDay];
            // Pop until the current day's temperature is not
            // warmer than the temperature at the top of the stack
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }

        return answer;
    }

}
