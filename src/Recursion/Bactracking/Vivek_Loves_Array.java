package Recursion.Bactracking;

import java.util.Scanner;

public class Vivek_Loves_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- >0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println();
            System.out.println(Loves_Array(arr,0,n-1));

        }

    }
    public static int Loves_Array(int[]arr, int si, int ei){

        for (int mid = si; mid < ei; mid++) {
            int sum1 = 0;
            for (int i = si; i <=mid ; i++) {
                sum1+=arr[i];


            }
            int sum2=0;
            for (int i = mid+1; i <=ei ; i++) {
                sum2 += arr[i];
            }
            if(sum1==sum2){
                int lf = Loves_Array(arr, si, mid);
                int rf = Loves_Array(arr, mid+1,ei);
                return Math.max(lf,rf)+1; //apna wala

            }

        }
        return 0;
    }
}
