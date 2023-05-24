package Stack_and_Queue.Questions;

import java.util.Scanner;
import java.util.Stack;

public class NextGreater_Ele {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- >0){
            int n = scn.nextInt();
            int[]arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=scn.nextInt();

            }
            NextG(arr);

        }
//        int[]arr = {11,3,23,9,15};

    }
    public static void  NextG(int[]arr){
        int[]ng = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <arr.length ; i++) {
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                int ii = st.pop();
                ng[ii]= arr[i];
                //nge
            }
            st.push(i);

        }
        while (!st.isEmpty()){
            int ii = st.pop();
            ng[ii]= -1;

        }
        for (int i = 0; i <ng.length ; i++) {
            System.out.println(arr[i]+","+ng[i]);

        }
    }
}
