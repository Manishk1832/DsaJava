package HackerBlocks;

import java.util.Scanner;

public class Product_Of_Array_Except_Self {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long N = scn.nextLong();
        int []arr = new int[(int) N];

        for(int i = 0; i<N; i++){
            arr[i] = scn.nextInt();
        }
        // multiply(arr);
        int[] ans =  product(arr);
        for (int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }



    }
    //Brutforce Approcach
//    public static void multiply(int[]arr){
//        int[]product = new int[arr.length];
//        for(int i = 0; i<arr.length; i++){
//            int productExclcurr =1;
//            for(int j = 0; j<arr.length;j++){
//                if(i==j){
//                    continue;
//                }
//                productExclcurr = productExclcurr*arr[j];
//            }
//            product[i] = productExclcurr;
//        }
//        for (int i = 0 ; i<arr.length; i++){
//            System.out.print(product[i]+" ");
//        }
//
//
//    }
    //optimized approach
    public static int[] product(int[]arr){
        int n = arr.length;
        int[]left = new int[n];
        int[]right = new int[n];
        left[0] = 1;
        for (int i = 1 ; i<n; i++){
            left[i] = left[i-1]*arr[i-1];
        }
        right[n-1]=1;
        for (int i = n-2; i>=0; i--){
            right[i] = right[i+1]*arr[i+1];
        }
        for(int i = 0; i< n; i++){
            arr[i] = left[i]* right[i];
        }
        return arr;

    }

}
