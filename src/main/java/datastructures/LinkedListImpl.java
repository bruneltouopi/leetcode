package datastructures;

public class LinkedListImpl {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null && last == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void deleteFirst() {
        if(first == last){
            first = last = null;
        }
        Node second = first.next;
        first.next = null;
        first = second;
    }

    public void deleteLast() {
        Node current = first;
        while (current.next != last) {
            current = current.next;
        }
        current.next = null;
        last = current;
    }

    public boolean contains(int item) {
      return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        Node current = first;
        int i = 0;
        while (current != null) {
            if (current.value == item) {
                return i;
            }
            i++;
            current = current.next;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void print() {
        if (first == null) {
            return;
        }
        int i = 0;
        while (first != null) {
            System.out.printf("node%d -> %s ", i++, first.value);
            first = first.next;
        }
    }

}
