package LinkedList;

public class LinkedList_Client {
    public static void main(String[] args) throws Exception {
        Linked2List ll = new Linked2List();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);

        ll.Display();

        ll.addLast(40);
        ll.Display();
//        System.out.println();
//        System.out.println(ll.getfirst());
//
//        System.out.println(ll.getLast());
//        ll.removeFirst();
//        ll.removeLast();
        ll.Display();
        System.out.println(ll.removeatindex(2));
        ll.Display();
        ll.addatindex(50,2);
        ll.Display();

        System.out.println( ll.getatIndex(3));


    }
}
