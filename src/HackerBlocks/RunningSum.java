package HackerBlocks;

import java.util.Scanner;



public class RunningSum {

    public static void RunningSuum(int[]arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
            arr[i] = sum;
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new  int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        RunningSuum(arr);
        for (int ans : arr){
            System.out.print(ans+" ");
        }
    }
}
