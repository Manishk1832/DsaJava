package HackerBlocks;

import java.util.Scanner;

public class Sort_Zeroes_and_ones {
    public  static  void sort(int[]arr){
        int count =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==0){
              count++;
            }
        }
        for(int i = 0; i<count; i++){
            arr[i] = 0;
        }
        for (int i = count; i<arr.length; i++){
            arr[i] = 1;
        }

    }




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        sort(arr);
        for (int print : arr){
            System.out.print(print+" ");
        }
        System.out.println();
    }


}
