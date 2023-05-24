package Recursion;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new  int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int m= scn.nextInt();
        System.out.println(firstId(arr,0,m));
    }
    public static int firstId(int[]arr, int i , int m){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==m){
            return i ;
        }
        return  firstId(arr,i+1,m);
    }

}
