package Recursion;

import java.util.Scanner;

public class PrintDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PD(n);

    }
    public static void PD(int n){
        //Base case
        if(n==0){
            return ;
        }
        System.out.println(n);
        //smaller problem
           PD(n-1);

    }
}
