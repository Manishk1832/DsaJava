package LinkedList;

import java.util.LinkedList;

public class LinkedList_java {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1,90);
        list.add(50);
        list.add(60);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list);

    }
}
