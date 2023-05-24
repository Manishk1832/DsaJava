package Recursion;

import java.util.Scanner;

public class Subset2Print {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int [n];
        for(int i =0; i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int target = scn.nextInt();
        SubsetProblem(arr,0,"",0,target);

        //printSubset(arr,0,"");
    }


    public static void SubsetProblem(int[]arr, int i, String ans, int sum, int target){
        if(i==arr.length){
            if(sum==target){
                System.out.print(ans);
                return  ;
            }



        }
         SubsetProblem(arr,i+1, ans+arr[i]+" ",sum+arr[i],target); //element add
        SubsetProblem(arr, i+1, ans,sum,target);//no element add


    }


}
