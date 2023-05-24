//package DynamicProgramming;
//
//public class Longest_increasing_Subsequence {
//    public static void main(String[] args) {
//        return LIS(0,Integer.MIN_VALUE,arr);
//    }
//    public static int LIS(int idx, int prev, int[]arr){
//
//        if(idx==arr.length){
//            return 0;
//        }
//        int sp1 = 0;
//        if(prev<arr[idx]){
//            sp1 = 1+ LIS(idx+1,arr[idx],arr); //include
//        }
//
//        int sp2 = LIS(idx+1,prev,arr); //exclude
//        return Math.max(sp1,sp2);
//
//
//    }
//    public static int Bu(int[]arr){
//        int[][]dp = int [arr.length+1][arr.length+1];
//        for(int idx = arr.length;idx>=0;idx--){
//            for(int prev = arr.length-1;prev>=-1;prev--){
//                int sp1 = 0;
//                if(prev=-1||arr[prev]<arr[idx]){
//                    sp1 = 1+dp([idx+1][idx]); //include
//                }
//                  int sp2 = 0;
//                if(prev>=0){
//                    sp2 = dp[idx+1][prev];
//                }
//                  dp[idx+1][prev]=Math.max(sp1,sp2);
//
//            }
//        }
//        return dp[0][0];
//    }
//
//}
