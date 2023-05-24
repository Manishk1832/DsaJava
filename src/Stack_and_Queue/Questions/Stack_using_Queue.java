package Stack_and_Queue.Questions;

import Stack_and_Queue.DynamicQueue;

public class Stack_using_Queue {
    private DynamicQueue data;
    public Stack_using_Queue(){
        this.data = new DynamicQueue();
    }
    public  boolean isEmpty(){
        return this.data.isEmpty();
    }
    public  int size(){
        return this.data.size();
    }
    public void push(int item) throws Exception {
        DynamicQueue temp = new DynamicQueue();
    while(!this.data.isEmpty()){
        temp.Enqueue(data.Dequeue());
    }
     this.data.Enqueue(item);
     while(!temp.isEmpty()){
        data.Enqueue(temp.Dequeue());
     }
    }
    public int pop() throws Exception {
        return this.data.Dequeue();
    }
    public int peek() throws Exception {
        return this.data.getFront();
    }
}
