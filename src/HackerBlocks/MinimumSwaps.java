package HackerBlocks;

import java.util.Scanner;

public class MinimumSwaps {


    public  static int minimumSwaps (int[]arr){
        int count = 0;
        for(int i = 0; i<arr.length;i++){
           for(int j = i+1; j<arr.length;j++){
               if(arr[i]>=arr[j]){

                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                   count++;
               }

            }
        }
        return  count;

    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new  int[n];
        for(int i = 0; i<arr.length;i++){
           arr[i]= scn.nextInt();
        }
      int ans =  minimumSwaps(arr);
        System.out.println(ans);
    }
}
