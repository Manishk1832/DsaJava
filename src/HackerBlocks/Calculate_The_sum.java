package HackerBlocks;

import java.util.Scanner;

public class Calculate_The_sum {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr= new  int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int q = scn.nextInt();
        while(q-- > 0){
            int x = scn.nextInt();
            int [] brr = new int[n];
            for (int i = 0 ; i<arr.length; i++){
                int j = i-x;
                if(j<0){
                    j = j+n;
                }
                brr[i]=arr[i]+arr[j];
            }
            arr = brr;
        }
        int sum = 0;
        for (int i  = 0 ; i<arr.length; i++ ){
            sum = sum+arr[i];
        }
        sum = sum%1000000007;
        System.out.println(sum);
    }
}
