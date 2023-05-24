package HackerBlocks;

import java.util.Scanner;

public class Move_All_Zero_to_end {

    public static  void Move(int[]arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }

        }


        for (int i = count; i<arr.length; i++){
            arr[count] = 0;
            count++;
        }
    }



    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new  int[n];
        for(int i = 0; i<n; i++ ){
            arr[i]  = scn.nextInt();
        }
        Move(arr);
        for(int print : arr){
            System.out.print(print+ " ");
        }
    }
}
