package org.leetcode.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bruno-fabrice touopi
 */
public class StackImpl {
    // "static void main" must be defined in a public class.
    private List<Integer> data;               // store elements
    public StackImpl() {
        data = new ArrayList<>();
    }
    public static void main(String[] args) {
        StackImpl s = new StackImpl();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i < 4; ++i) {
            if (!s.isEmpty()) {
                System.out.println(s.top());
            }
            System.out.println(s.pop());
        }
    }
        /** Insert an element into the stack. */
        public void push(int x) {
            data.add(x);
        }
        /** Checks whether the queue is empty or not. */
        public boolean isEmpty() {
            return data.isEmpty();
        }
        /** Get the top item from the queue. */
        public int top() {
            return data.get(data.size() - 1);
        }
        /** Delete an element from the queue. Return true if the operation is successful. */
        public boolean pop() {
            if (isEmpty()) {
                return false;
            }
            data.remove(data.size() - 1);
            return true;
        }
    };

