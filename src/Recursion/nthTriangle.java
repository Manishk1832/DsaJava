package Recursion;

import java.util.Scanner;

public class nthTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(countTriangle(n));

    }
    public static int countTriangle(int n){
        if(n==0){
            return 0;
        }
        int fn = countTriangle(n-1);
        return fn+n;
    }
}
