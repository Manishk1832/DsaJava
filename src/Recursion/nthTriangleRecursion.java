package Recursion;

import java.util.Scanner;

public class nthTriangleRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        System.out.println(TriangleRecursion(i,n,0));
    }
    public static int TriangleRecursion(int i , int n , int ans){
        if(i==n){
            return ans+n;
        }

        return TriangleRecursion(i+1,n,ans+i);
    }

}
