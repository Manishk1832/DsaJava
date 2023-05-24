package Stack_and_Queue;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue qq = new Queue();
        qq.Enqueue(10);
        qq.Enqueue(20);
        qq.Enqueue(30);
        qq.Enqueue(40);
        qq.Enqueue(50);
        qq.Dequeue(); //10
        qq.Dequeue(); //20
        qq.Display();
        qq.Enqueue(60);
        qq.Enqueue(70);
        qq.Display();
    }
}
