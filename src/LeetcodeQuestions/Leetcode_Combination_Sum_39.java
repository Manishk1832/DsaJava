package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_Combination_Sum_39 {

        public static void main(String[] args) {
            int[]coins = {2,3,6,7};
            int amount = 7;

            List<Integer>ll = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList <>();
            combination(coins,amount,ll,0,ans);
            System.out.println(ans);

        }
        public static void combination(int[]coins,int amount, List<Integer>ll,int idx, List<List<Integer>> ans){
            if(amount==0){
                ans.add(new ArrayList<>(ll));
                return;
            }

            for (int i = idx; i<coins.length;i++){
                if(amount>=coins[i]){
                      ll.add(coins[i]);
                    combination(coins,amount-coins[i],ll,i,ans);
                     ll.remove(ll.size()-1);
                }
            }

        }
    }


