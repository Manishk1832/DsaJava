package Stack_and_Queue.Questions;

public class client_stack_using_queue {
    public static void main(String[] args) throws Exception {
        Stack_using_Queue st = new Stack_using_Queue();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }

}
