package Stack_and_Queue;

public class Queue {
   protected int[] data;
   protected   int front = 0;
   protected int size  = 0;

   public Queue(){
       this.data = new int[5];

   }
   public  Queue(int cap){
       this.data = new int[cap];
   }
   public boolean isEmpty(){
       return  this.size==0;
   }
   public boolean isFull(){
       return  this.size==data.length;
   }
   public int size(){
       return this.size;
   }
   public void Enqueue(int item) throws Exception {
       if(isFull()){
           throw new Exception("Queue is Empty!");
       }
       int i = (this.size+this.front)%this.data.length;
       this.data[i]=item;
       this.size++;
   }
   public int Dequeue () throws Exception {
      if (isEmpty()){
           throw new Exception("Queue is already Empty") ;
       }
       int removeValue = this.data[this.front];
       this.front = (this.front+1)%this.data.length;
       this.size--;
       return removeValue;
   }
   public int getFront() throws Exception {
       if (isEmpty()){
           throw new Exception("Queue is already Empty") ;
       }
       return this.data[this.front];

   }
   public void Display(){
       for (int i = 0; i<this.size; i++){
           int idx = (this.front+i)%this.data.length;
           System.out.print(this.data[idx]+" ");
       }
       System.out.println();
   }


}
