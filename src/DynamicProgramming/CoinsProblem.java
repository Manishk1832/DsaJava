package DynamicProgramming;

import java.util.Scanner;

public class CoinsProblem {
    public static void main(String[] args) {
        int[]coins = {2,3,5,7};
        int n = coins.length-1;
        int Amount = 10;
        System.out.println(solveTD(0,n,coins,new Integer[coins.length][n+1]));
    }

    public static int solveTD(int idx,int A, int [] coins,Integer[][]dp){

        if(A==0){
            return 1;
        }
        if(idx==coins.length){
            return 0;
        }
        if(dp[idx][A]!=null) {
            return dp[idx][A];
        }
        int sp1 = solveTD(idx,A-coins[idx],coins,dp);
        int sp2 = solveTD(idx+1,A,coins,dp);
        dp[idx][A] = sp1+sp2;
        return sp1+sp2;
    }
//    public static  int BU(int[]coins,int Amount){
//       // for(int idx = coins.length,idx>=0)
//    }
}




