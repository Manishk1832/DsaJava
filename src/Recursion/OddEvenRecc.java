package Recursion;

import java.util.Scanner;

public class OddEvenRecc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Odd_Even(n);
    }
    public static void Odd_Even(int n){
        if(n<0){
            return;
        }

        if(n%2==1){

            System.out.println(n);
            Odd_Even(n-2);
            Odd_Even(n+2);
            System.out.println(n);

        }


    }

}
