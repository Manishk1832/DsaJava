package Recursion;

import java.util.Scanner;

public class Board_Path {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.println("\n"+BoardPath1(n,0,m,""));

    }
    // Brutforce one way
    public static int BoardPath(int end,int curr,String ans){
        if(curr==end){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }


        int fp = BoardPath(end,curr+1,ans+1);
        int sp = BoardPath(end,curr+2,ans+2);
        int tp = BoardPath(end, curr+3,ans+3);
        return fp+sp+tp;


    }
    //Optimized 2nd Ways
    public static int BoardPath1(int end,int curr,int m,String ans){
        if(curr==end){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }


//        int fp = BoardPath1(end,curr+1,ans+1);
//        int sp = BoardPath1(end,curr+2,ans+2);
//        int tp = BoardPath1(end, curr+3,ans+3);
        int count = 0;
        for (int dice = 1; dice<=m ; dice++){
           count = count+ BoardPath1(end,curr+dice,m,ans+dice);
        }
        return count;


    }
}
