package LeetcodeQuestions;

import java.util.*;
import java.util.List;

public class Leetcode_78_Subset {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList <>();
        Subset(arr,0,ll,ans);

        System.out.println(ans);
    }
    public static void Subset(int[]arr, int i, List<Integer> ll,List<List<Integer>> ans){
        if(i==arr.length){
           ans.add(new ArrayList<Integer>(ll));
            return;
        }

        Subset(arr, i+1, ll,ans);//no element
        ll.add(arr[i]);
        Subset(arr,i+1, ll,ans); //element add
        ll.remove(ll.size()-1);
    }
}
