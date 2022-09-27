package datastructures;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedListImpl();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.addFirst(15);
        list.deleteFirst();
        list.deleteLast();
        System.out.println(list.contains(10));
        System.out.println(list.contains(12));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(158));
        list.print();
    }
}
