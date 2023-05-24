package HackerBlocks;

import java.util.Scanner;

public class FromABiggestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t>0){
            int n = scn.nextInt();
            int []arr = new  int [n];
            for(int i = 0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            t--;
            sort(arr);
            for (int i = 0 ; i<arr.length; i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
    public static  void sort(int[]arr){
        for (int count = 1; count<arr.length; count++){
            for (int i = 0; i<=arr.length-2;i++){
                if(compare(arr[i],arr[i+1])>0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
        }
    }
    public static int compare(int x1, int x2){
        String s1 = ""+x1+x2;
        String s2 = ""+x2+x1;
        if(Long.parseLong(s2)>Long.parseLong(s1)){
            return 1;
        }
        else {
            return -1;
        }
    }

}
