package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        System.out.println(fibo(n));

    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }

        int  f1 = fibo(n-1);
        int f2 = fibo(n-2);
        return f1+f2;
    }

}