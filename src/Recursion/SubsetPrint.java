package Recursion;

import java.util.Scanner;

public class SubsetPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int [n];
        for(int i =0; i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println("\n"+ SubsetProblem(arr,0,"",0,target));

        //printSubset(arr,0,"");
    }
    public static void printSubset(int[]arr, int i, String ans){
        if(i==arr.length){
            System.out.println(ans);
            return;
        }

        printSubset(arr, i+1, ans);//no element add
        printSubset(arr,i+1, ans+arr[i]+" "); //element add
    }

    public static int SubsetProblem(int[]arr, int i, String ans, int sum, int target){
        if(i==arr.length){
            if(sum==target){
                System.out.println(ans);
                return 1;
            }

            return 0;
        }
        int fs = SubsetProblem(arr,i+1, ans+arr[i]+" ",sum+arr[i],target); //element add
       int ss =  SubsetProblem(arr, i+1, ans,sum,target);//no element add
        return  fs+ss;

    }


}
