package HackerBlocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOf2Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int[] arr1 = new  int [n];
        int[] arr2 = new  int[n];
        ArrayList<Integer>Al = new ArrayList<>();
        for (int i = 0 ; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        for (int i = 0 ; i<arr2.length ; i++){
            arr2[i]= scn.nextInt();
        }
        PrintIntersection(arr1,arr2,Al);
        System.out.println(Al);
    }
    public static void PrintIntersection(int[]arr1,int[]arr2,ArrayList<Integer>Al){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int  i =0 ;
        int j = 0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else {
                Al.add(arr2[j]);
                i++;
                j++;
            }
        }
    }
}
