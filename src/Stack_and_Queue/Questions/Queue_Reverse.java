package Stack_and_Queue.Questions;

import Stack_and_Queue.DynamicQueue;

public class Queue_Reverse {
    public static void main(String[] args) throws Exception {
        DynamicQueue qq = new DynamicQueue();
        qq.Enqueue(10);
        qq.Enqueue(20);
        qq.Enqueue(30);
        qq.Enqueue(40);
        qq.Enqueue(50);
        qq.Display();
        System.out.println("**************");
        Reverse(qq);
        qq.Display();


    }
    private static void Reverse(DynamicQueue qq) throws Exception {
        if(qq.isEmpty()){
            return;
        }
        int x = qq.Dequeue();
        Reverse(qq);
        qq.Enqueue(x);

    }
}
