package LinkedList;

public class Linked2List {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }

    }
    private  Node head;
    private  int size;
    private  Node tail;

    public  void  addFirst(int item){
        Node nn = new Node(item);
        if(this.size==0){
            this.head = nn;
            this.tail=nn;
            this.size++;
        }
        else {
            nn.next = this.head;
            this.head = nn;
            this.size++;
        }

    }
    public  void  addLast(int item){
       if(this.size==0){
           addFirst(item);
       }
       else{
           Node nn = new Node(item);
           this.tail.next = nn;
           this.tail = nn;
           this.size++;
       }

    }
    public  void addatindex(int item, int k) throws Exception {
        if(k<0||k>size){
            throw new Exception("Index out of Bound k can't be Negative ");
        }
        if(k==0){
            addFirst(item);
        } else if (k==size) {
          addLast(item);
        }
        else{
            Node nn = new Node(item);
            Node k_1th = GetNode(k-1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            this.size++;
        }

    }
    public int removeatindex( int k) throws Exception {
        if(k<0||k>=size){
            throw new Exception("Index out of Bound k can't be Negative ");
        }
        if(k==0){
           return removeFirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else {
            Node kth = GetNode(k);
            Node k_1th = GetNode(k-1);
            k_1th.next = kth.next;
            kth.next = null;
            this.size--;
            return kth.data;

        }


    }

    //get
    public int getfirst() throws Exception {
        if(this.head==null){
            throw new Exception("LinkedList is already Null");
        }
        return this.head.data;

    }
    public int getLast() throws Exception {
        if(this.head==null){
            throw new Exception("LinkedList is already Null");
        }
       return this.tail.data;
    }
    public int getatIndex(int k) throws Exception {
        return GetNode(k).data;
    }
    private  Node GetNode(int k) throws Exception {
         if(k<0||k>=size){
             throw new Exception("Index out of Bound k can't be Negative ");
         }
         Node temp  = head;
        for (int i = 1; i <=k ; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public  int removeFirst() throws Exception {
        if(this.head==null){
            throw new Exception("LinkedList is Empty");
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.size--;
        return temp.data;

    }
    public  int removeLast() throws Exception {
        if(this.head==null){
              throw new Exception("LinkedList is Empty");
        }
       if(this.size==1){
           return removeFirst();
       }
       Node temp = GetNode(this.size-2);//40
       int rv = tail.data; //50
        this.tail = temp;
        this.tail.next = null;
        return rv;

    }


    public void Display(){
       Node temp = this.head;
       while (temp!=null){
           System.out.print(temp.data+"-->");
           temp = temp.next;
       }
        System.out.println(".");
    }


}

