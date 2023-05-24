package Recursion;

import java.util.Scanner;

public class fact2 {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        System.out.println(fact(n,1));
    }
    public static int fact(int n , int ans){
        if(n==0){
            return ans;
        }

        //tail recursion
       // int ans = fact(n-1);
        return fact(n-1,ans*n); //head recursion
    }

}
