package LinkedList;

public class cycle_Client {
    public static void main(String[] args) {
        Linked_list_cycle ll = new Linked_list_cycle();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.CreateCycle();

        System.out.println(ll.hasCycle());

    }
}
