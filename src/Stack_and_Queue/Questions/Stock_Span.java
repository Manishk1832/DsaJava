package Stack_and_Queue.Questions;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new  int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= scn.nextInt();

        }
//        int[]arr = {30, 35 ,40, 38, 35};
        StockSpan(arr);
    }
    public static void  StockSpan(int[]arr){
        int [] span = new  int [arr.length];
        Stack<Integer> st  = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            //span calculate
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]= i+1;

            }
            else {
                span[i]= i-st.peek();
            }
            st.push(i);

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(span[i]+" ");

        }
        System.out.println("End");



    }
}
