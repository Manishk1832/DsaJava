package LinkedList;

public class Cycle_Removal {
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
        this.tail.next = this.head.next.next;  // cycle
    }
    public Node hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }

    public void removeCycle(){
        Node meetup = hasCycle();
        if(meetup==null){
            return;
        }
        Node start = head;
        while (start!=null){
            Node temp = meetup;
            while (temp.next!=meetup){
                if(temp.next==start){
                    temp.next =null;
                    return;
                }
                temp = temp.next;
            }
            start= start.next;
        }

    }
    public  void removeCycle1(){
        Node meetup = hasCycle();
        if(meetup==null){
            return;
        }
        int count =1 ;
        Node temp = meetup;
        while (temp.next!=meetup){
            count++;
            temp = temp.next;
        }
        //m step ahead
        Node fast = head;
        for (int i = 1; i <count ; i++) {
            fast = fast.next;
        }
        Node start = head;
        while (start.next!=fast.next){
            start=start.next;
            fast=fast.next;
        }
        fast.next=null;
    }

    public  void  FylodCycleRemoval(){
        Node meetup = hasCycle();
        if(meetup==null){
            return;
        }
        Node fast = meetup;
        Node start = head;
        while (start.next!=fast.next){
            start=start.next;
            fast=fast.next;
        }
        fast.next=null;

    }

}
