package org.leetcode.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author bruno-fabrice touopi
 */
public class MinStack {

    private List<Integer> stash;


    public MinStack() {
        stash = new ArrayList<>();
    }

    public void push(int val) {
        stash.add(val);
    }

    public void pop() {
        stash.remove(stash.size()-1);
    }

    public int top() {
        return stash.get(stash.size()-1);
    }

    public int getMin() {
       return stash.stream().min(Comparator.comparingInt(o -> o)).get();
    }
}
