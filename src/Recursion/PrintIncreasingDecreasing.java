package Recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        PDI(n);

    }
    public static void PDI(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        //smaller
        PDI(n-1);
        System.out.println(n);

    }

}
