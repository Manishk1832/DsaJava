package LeetcodeQuestions;


import java.util.*;

public class Leetcode_Combination_sum_II {
    public static void main(String[] args) {
        int[]arr = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr);
        List<Integer>ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList <>();
        combination(arr,target,ll,0,ans);
        System.out.println(ans);
    }
    public static void combination(int[]coins, int amount, List<Integer> ll, int idx, List<List<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i = idx; i<coins.length;i++){
            if(i!=idx  && coins[i]==coins[i-1]){
                continue;
            }
            if(amount>=coins[i]){
                ll.add(coins[i]);
                combination(coins,amount-coins[i],ll,i+1,ans);
                ll.remove(ll.size()-1);
            }
        }

    }
}
