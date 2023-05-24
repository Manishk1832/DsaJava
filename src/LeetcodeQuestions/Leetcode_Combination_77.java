package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_Combination_77 {

        public static void main(String[] args) {
            int n = 4;
            boolean [] board = new boolean[n];
            int  queen = 2;
            List<Integer> ll = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList <>();
            Queen(board,queen,0,0,ll,ans);
            System.out.println(ans);
        }
        public static void  Queen(boolean[]board,int tq , int qpsf,int idx,  List<Integer> ll, List<List<Integer>> ans ){
            //tq --> total queen
            //qpsf --> Queen place sofar
            if(tq==qpsf){
               ans.add(new ArrayList<Integer>(ll));
                return;
            }
            for (int i = idx; i<board.length;i++){
                if(board[i]==false){//queen placed nahi hai
                    board[i]=true;
                    ll.add(i+1);
                    Queen(board,tq,qpsf+1,i+1,ll,ans);
                    ll.remove(ll.size()-1);
                    board[i]=false;
                }
            }
        }
    }


