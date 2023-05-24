package Recursion.Bactracking;

import java.util.Scanner;

public class N_Knight {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][]board = new boolean[n][n];
        nknight(board,0,0,"",n);

        System.out.println("\n"+count);

    }
    public static void  nknight(boolean[][]board, int row, int col, String ans, int totalKnight){
        if(totalKnight==0){
            System.out.print(ans+" ");
            count++;
            return;
        }

        if(col==board.length){
            row++;
            col=0;
        }
        if(row==board.length){
            return;
        }

        //yes
        if(isitsafe(board,row,col)){
            board[row][col]=true;
            nknight(board,row,col+1,ans+"{"+row+"-"+col+"} ",totalKnight-1);
            board[row][col]=false;

        }
        //no
        nknight(board,row,col+1,ans,totalKnight);


    }

    public static boolean isitsafe(boolean[][] board, int row, int col) {
        int r[]={-1,-1,-2,-2};
        int c[]={2,-2,-1,-1};
        for (int i = 0; i <c.length ; i++) {
            int x = row+r[i];
            int y = col+c[i];
            if(x>=0 && y>=0 && y<board.length && board[x][y]==true){
                return false;
            }

        }
        return true;
    }
}
