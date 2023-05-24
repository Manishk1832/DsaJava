//package HackerBlocks;
//
//import java.util.Scanner;
//
//public class NthRootOfM {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int t  = scn.nextInt();
//        while (t>0){
//
//             int n = scn.nextInt();
//             int[]arr = new int[n];
//             int  m = scn.nextInt();
//             double root = nthRoot(n,m);
//            System.out.println();
//            System.out.println(root);
//         t--;
//        }
//
//
//    }
//    public  static  double nthRoot(int n, int m){
//        double s = 0;
//        double e = m;
//        double eps =  1e-7;
//        while ((s-e)>eps){
//            if(multiply(mid,n)<m){
//                double mid = (s+e)/2;
//               double exp = power
//            }
//            else {
//                e = mid;
//            }
//        }
//        return s;
//
//    }
//    public static double multiply(double mid,int n){
//        double ans = 1.0;
//        for(int i = 0 ; i<n; i++){
//            ans = ans *mid;
//        }
//        return ans;
//    }
//
//}
