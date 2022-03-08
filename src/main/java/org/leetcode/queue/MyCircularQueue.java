package org.leetcode.queue;

import java.util.ArrayList;

/**
 * @author bruno-fabrice touopi
 */
class MyCircularQueue {
    private  final ArrayList<Integer> queue;
    private int size;
    private int count;

    public MyCircularQueue(int k) {
            this.queue=new ArrayList<>(k);
            this.size = k;
            this.count = k;
    }

    public boolean enQueue(int value) {
        queue.add(value);
        count++;
        return !isEmpty();
    }

    public boolean deQueue() {
        if (!isEmpty()){
            queue.remove(0);
            count--;
            return true;
        }
        return false;

    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return queue.get(0);

    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return queue.get(size -1);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}
