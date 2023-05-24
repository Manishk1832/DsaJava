package LinkedList;



public class Linked_list_cycle {
    public class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
        }
    }
    private Node head;

    private int size;
    private Node tail;

    public void  addFirst(int item){
        Node nn = new Node(item);
        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            nn.next = this.head;
            this.head = nn;
            size++;
        }

    }

    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn = new Node(item);
            this.tail.next = nn;
            this.tail = nn;
            this.size++;
        }
    }

    public void CreateCycle(){
       // this.tail.next = this.head; //circular Linked_list;
        this.tail.next = this.head.next;  // cycle
    }
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }









    public  void  Display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.println("End");
    }

}
