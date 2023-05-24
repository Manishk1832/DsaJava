//package DynamicProgramming;
//
//public class climbingStairs {
//    public static void main(String[] args) {
//        int sp1 = (solve(0,arr)+arr[0];
//        int sp2 = (solve(1,arr)+arr[1];
//        return Math.min(sp1,sp2);
//
//
//    }
//    public static  int solve(int curr, int[]arr){
//
//
//        int sp1 = 0;
//        if(curr+1<arr.length){
//            int sp1 = solve((curr +1,arr)+arr[curr+1]);
//        }
//        int sp2 = 0;
//        if (curr+2<arr.length){
//            int sp2 = solve((curr+2,arr)+arr[curr+2]);
//        }
//
//        return  Math.min(sp1,sp2);
//    }
//    public static int solveTD(int curr, Integer[] arr) {
//        if (curr <= 1) {
//            return curr;
//        }
//        if (arr[curr] != null) {
//            return arr[curr];
//        }
//        int sp1 = solveTD(curr - 1, arr);
//        int sp2 = solveTD(curr - 2, arr);
////		fibo(n) = sp1+sp2;
//        arr[curr] = sp1 + sp2;
//        return  Math.min(sp1,sp2) ;
//
//    }
//
//}
