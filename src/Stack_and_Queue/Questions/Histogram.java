package Stack_and_Queue.Questions;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[]arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scn.nextInt();

        }
//        int[]arr = {1,2,3,4,5};
        System.out.println(Area(arr));

    }
    public  static  long Area(long[]arr) {
        Stack<Integer> st = new Stack<>();
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                long r = i;
                long h = arr[st.pop()];
                if (st.isEmpty()) {
                    ans = Math.max(ans, h * r);

                } else {
                    long l = st.peek();
                    ans = Math.max(ans, h * (r - l - 1));

                }

            }
            st.push(i);

        }
        long r = arr.length;
        while (!st.isEmpty()){
            long h = arr[st.pop()];
            if(st.isEmpty()){
                ans = Math.max(ans,h*r);
            }
            else {
                long l = st.peek();
                ans = Math.max(ans, h * (r - l - 1));
            }
        }
        return ans;
    }

}
