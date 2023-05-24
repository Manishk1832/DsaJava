package HackerBlocks;

import java.util.Scanner;

public class BuySellStock {

    public static  int stock(int[]arr){
        int maximumProfit = 0;
        int minimum_Sofar = arr[0];

        for (int i = 0 ; i<arr.length; i++){
            minimum_Sofar = Math.min(minimum_Sofar,arr[i]);
            int profit = arr[i] - minimum_Sofar;
            maximumProfit = Math.max(maximumProfit,profit);
        }
        return  maximumProfit;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int []arr = new  int[n];

        for(int i = 0; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }

        int maximumProfit = stock(arr);
        System.out.println(maximumProfit);

    }
}
