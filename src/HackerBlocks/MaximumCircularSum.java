package HackerBlocks;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            int n = scn.nextInt();
            int[]arr = new  int[n];
            for(int i = 0; i<n ; i++){
                arr[i] = scn.nextInt();
            }
            System.out.println(maximumSum(arr));
            t--;
        }

    }
    public static  int maximumSum(int[]arr){
        int linear_kadane = kadane(arr);
        int sum = 0;
        for(int i = 0; i<arr.length ; i++){
            sum = sum+arr[i];
            arr[i]= arr[i]* -1;
        }
        int Inverted_kadane = kadane(arr);
        int Circular_kadane = Inverted_kadane+sum;
        return Math.max(linear_kadane,Circular_kadane);

    }
    public static int kadane(int[]arr){
        int ans = Integer.MIN_VALUE;
        int prevSum = 0;
        for(int i = 0 ; i<arr.length; i++){
            prevSum+=arr[i];
            ans = Math.max(ans,prevSum);

            if(prevSum<0){
                prevSum = 0;
            }
        }
        return  ans;
    }

}
