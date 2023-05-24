package Stack_and_Queue;

public class DynamicStack extends stack {
    @Override
    public void push(int item) throws Exception {
        if(super.isFull()) {
            int[] arr = new int[2 * super.data.length];
            for (int i = 0; i < super.data.length; i++) {
                arr[i] = super.data[i];

            }
            super.data = arr;

        }
        super.push(item);

    }

}
