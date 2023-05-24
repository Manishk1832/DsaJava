package HackerBlocks;

import java.util.Scanner;

public class BookAllocationProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0){
            int n= scn.nextInt();
            int m = scn.nextInt();
            int[]arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            t--;
           int ans = allocateBooks(arr,n,m);
            System.out.println(ans);
        }
    }
   public static int allocateBooks(int[]arr, int n, int m){
        int s = 0;
        int sum =0;
        for (int i = 0; i<n; i++){
            sum+=arr[i];
        }
        int e = sum;
        int ans = -1;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(isPossible(arr,n,m,mid)){
               ans = mid;
               e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
   }
    public static  boolean isPossible(int[]arr,int n, int m,int mid){
        int StudentCount = 1;
        int pageSum = 0;
        for(int i = 0; i<n; i++){
            if(pageSum+arr[i]<=mid){
                pageSum+=arr[i];
            }
            else{
                StudentCount++;
                if(StudentCount>m||arr[i]>mid){
                    return false;
                }

                pageSum =arr[i];
            }
        }
        return true;
   }
}
