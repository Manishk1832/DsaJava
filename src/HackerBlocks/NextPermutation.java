package HackerBlocks;

import java.util.Scanner;

public class NextPermutation {

    public  static  void  nextPermutation(int[]arr){
        if (arr==null||arr.length<=1){
            return;
        }
        int i = arr.length-2;
        while (i>=0 && arr[i]>=arr[i+1]){
            i--;

            }
        if(i>=0){
            int j = arr.length-1;
            while (arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
    }
    public static void swap(int[]arr, int i, int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[]arr, int i , int j){
        while (i<j){
            swap(arr, i++, j--);
        }
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0){
            int n = scn.nextInt();
            int[]arr = new int[n];
            for (int i = 0; i<n ; i++){
                arr[i] = scn.nextInt();
            }
            System.out.println();
            nextPermutation(arr);

            for (int ele : arr){
                System.out.print(ele + " ");

            }


            T--;
        }
    }
}
