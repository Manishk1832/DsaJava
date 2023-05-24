package Recursion.Lexicographical;

import java.util.Scanner;

public class Lexico_Counting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printcount(0,n);
    }
    public static void printcount(int curr, int end){
        if(curr>end){
            return;
        }

        System.out.println(curr);
        int i = 0;
        if(curr==0){
            i=1;
        }
        for(; i<=9 ; i++ ){
            printcount(curr*10+i,end);
        }
    }
}
