package Recursion.Bactracking;

import java.util.*;

public class Leetcode_Palindrome_Partitioning {
    public static void main(String[] args) {
        String str = "aab";

        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList <>();
        PrintPartitioning(str,ll,ans);
        System.out.println(ans);
    }
    public  static  void  PrintPartitioning(String ques,  List<String> ll,List<List<String>> ans ){

        if (ques.length()==0){
           ans.add(new ArrayList<String>(ll));
        }



         for (int i = 1 ; i<=ques.length(); i++){
            String s = ques.substring(0,i);
            if (isPalindromeSubstring(s)) {
                ll.add(s);
                PrintPartitioning(ques.substring(i), ll,ans);
                ll.remove(ll.size()-1);
            }
         }
    }
    public static boolean isPalindromeSubstring(String s){
        int i = 0 ;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
