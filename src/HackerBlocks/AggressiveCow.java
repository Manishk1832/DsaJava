package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        int[]arr = new  int[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(StallsPlace(arr,n,c));
    }
    public static int StallsPlace(int[]arr, int n, int c){
        Arrays.sort(arr);
        int s = 0;
        int max = -1;
        for(int i = 0; i<n; i++){
            max = Math.max(max,arr[i]);
        }
        int e = max;
        int ans = -1;
        int mid  = s + (e-s)/2;
        while (s<=e){
            if(isPossible(arr,n,c,mid)){
                ans = mid;
                s = mid+1;
            }else {
                e = mid-1;
            }
            mid = s + (e-s)/2;

        }
        return ans;


    }

    public static  boolean isPossible(int[]arr, int n, int c, int mid){
         int cowCount =1;
         int lastPos = arr[0];
         for (int i = 0; i<n;i++){
             if(arr[i]-lastPos>=mid){
                 cowCount++;
                 if(cowCount==c){
                     return true;
                 }
                 lastPos = arr[i];
             }
         }
         return false;
    }
}
