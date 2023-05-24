package HackerBlocks;

import java.util.Scanner;

public class MaximumSumPathArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[]arr = new  int[n];
            int[]brr = new  int[m];
            for(int i = 0; i<n ; i++){
                arr[i] = scn.nextInt();
            }
            for(int i = 0; i<m ; i++){
                brr[i] = scn.nextInt();
            }

            System.out.println(pathSum(arr,brr));
            t--;
        }

    }
    public  static int pathSum(int[]arr, int[]brr){
        int i = 0; //arr track
        int j = 0; //brr track
        int p = 0; //arr start
        int q = 0; //brr start
        int  ans = 0;
        while (i<arr.length&&j<brr.length){
            if(arr[i]<brr[j]){
                i++;
            }
            else if(arr[i]>brr[j]){
                j++;
            }
            else{
                int  sum1  = 0;
                int sum2 = 0;
                for(int k=p; k<=i; k++){
                    sum1 =  sum1 + arr[k];
                }
                for (int k = q; k <=j; k++) {
                    sum2+= brr[k];
                }
                 ans = ans + Math.max(sum1,sum2);
                i++;
                j++;
                p=i;
                q=j;
            }

        }
        if (i==arr.length){
            for(int k = q; k<brr.length; k++){
                ans = ans + brr[k];
            }
        }
        if(j==brr.length){
            for (int k = p; k<arr.length; k++){
                ans = ans+arr[k];
            }
        }
        return  ans ;
    }
}
