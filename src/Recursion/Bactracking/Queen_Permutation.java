package Recursion.Bactracking;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n = 4;
        boolean [] board = new boolean[n];
        int  queen = 2;
        Queen(board,queen,0,"");
    }
    public static void  Queen(boolean[]board,int tq , int qpsf, String ans){
        //tq --> total queen
        //qpsf --> Queen place sofar
        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i<board.length;i++){
            if(board[i]==false){//queen placed nahi hai
                board[i]=true;
                Queen(board,tq,qpsf+1,ans+"board ->"+i+" queen "+qpsf+" ");
                board[i]=false;
            }
        }
    }

}
