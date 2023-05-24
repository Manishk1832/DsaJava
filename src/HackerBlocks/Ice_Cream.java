package HackerBlocks;

import java.util.Scanner;

public class Ice_Cream {

    public static  int lightweight(int[]arr){
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
            min =  arr[i] ;
            count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int [n];

        for(int i  = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
      int ans  = lightweight(arr);
        System.out.println(ans);
    }
}
