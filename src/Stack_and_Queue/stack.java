package Stack_and_Queue;
// Stack Implementation
public class stack {

    protected int[]data; //data hiding
    private int top = 0;
    public stack(){
        this.data = new int[5];
    }
    public stack( int cap){
        this.data = new int [cap];
    }
    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return this.top==this.data.length;
    }

    public void push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Stack is already Full");
        }
        this.data[this.top]=item;
        this.top++;
    }
    public int pop() throws Exception { //override
        if(isEmpty()){
            throw new Exception("Stack is already Empty");
        }
        this.top--; //top = top-1
        return this.data[this.top];
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is already Empty");
        }
        return this.data[this.top-1];
    }
    public int size(){

        return this.top;
    }
    public void display(){
        for (int i = 0; i<top; i++){
            System.out.print(this.data[i]+" ");
        }
        System.out.println();
    }


}
