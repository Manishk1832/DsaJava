package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Intersection {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr =  new  int[n];
        for (int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int[]brr = new  int[n];
        for (int i = 0; i<n ; i++){
            brr[i] = scn.nextInt();
        }
        Intersection(arr,brr);



    }
    public static void Intersection(int[]arr, int[]brr){
        ArrayList<Integer>al  = new ArrayList<Integer>();
       Arrays.sort(arr);
       Arrays.sort(brr);
       int i = 0 , j = 0;
       while (i<arr.length && j<brr.length){
           if(arr[i]>brr[j]){
               j++;
           } else if (arr[i]<brr[j]) {
               i++;
           }
           else {
               al.add(arr[i]);
               i++;
               j++;
           }
       }
        System.out.println(al);



    }
}
