package Stack_and_Queue;

public class client_MinStack {
    public static void main(String[] args) throws Exception {
        MinStack s = new MinStack();
        s.push(5);
        s.push(7);
        s.push(2);
        s.push(9);
        s.push(4);
        s.push(3);
        s.push(8);
        s.push(1);
        s.push(17);

        s.Display();
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.min());

    }
}
