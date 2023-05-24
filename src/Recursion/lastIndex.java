package Recursion;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new  int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int m= scn.nextInt();
        System.out.println(LastIdx(arr,n-1,m));
    }
    public static int LastIdx(int[]arr, int i , int m){
        if(i<=0){
            return -1;
        }
        if(arr[i]==m){
            return i ;
        }
        return  LastIdx(arr,i-1,m);
    }
}
