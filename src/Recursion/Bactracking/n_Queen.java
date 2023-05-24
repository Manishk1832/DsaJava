package Recursion.Bactracking;

import java.util.Scanner;

public class n_Queen {
    static  int count = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        boolean [][] board = new boolean[n][n];
        PrintPath(board,0,n);
        System.out.println();
        System.out.println(count);


    }
    public static void PrintPath(boolean[][]board,int row,int tq){
        if(tq==0){

            Display(board);

            count++;

            return;
        }
        if(row==board.length){
            return;
        }



        for (int col= 0; col< board.length;col++){
            if(isitPossible(board,row,col)==true){
                board[row][col]=true;
                PrintPath(board,row+1,tq-1);
                board[row][col]=false;
            }
        }

    }

    private static boolean isitPossible(boolean[][] board, int row, int col) {
        //uperCase
        int r = row;
        while (r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        //left diagonal;
        r = row;
        int c = col;
        while(r>=0&& c>=0){
            if(board[r][c]==true){
                return false;
            }
            c--;
            r--;
        }
        //right diagonal
        r = row;
        c = col;
        while(r>=0 &&c<board.length){
            if(board[r][c]==true){
                return false;
            }
            c++;
            r--;
        }
        return true;

    }


//    public static void Display(boolean[][]board){
//        for (int i = 0; i<board.length; i++){
//            for (int j = 0 ; j<board[0].length; j++){
//
//                System.out.print(board[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("************");
//    }
public static void Display(boolean[][] board) {
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[i][j]) {
                System.out.print("{"+(i + 1) + "-" + (j + 1) +"}"+ " ");
            }
        }
    }
    System.out.print(" ");
}
}
