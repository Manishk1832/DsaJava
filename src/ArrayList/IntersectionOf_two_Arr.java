package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOf_two_Arr {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new  int [n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int[]brr = new int[n];
        for (int i = 0 ; i<arr.length;i++){
            brr[i] = scn.nextInt();
        }
        ArrayList<Integer> list  = Intersection(arr,brr);
        System.out.println(list);

    }
    public static ArrayList<Integer> Intersection(int[]arr, int[]brr){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);

        for(int i = 0 ; i<arr.length; i++){
            for(int j=0; j<brr.length; j++){
                if(arr[i]==brr[j]){
                    list.add(arr[i]) ;
                    break;
                }


            }

        }
        return list;

    }

}
