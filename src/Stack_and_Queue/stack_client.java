package Stack_and_Queue;

public class stack_client {
    public static void main(String[] args) throws Exception {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
        s.push(60);
        s.display();

//       s.push(70);
    }
}
