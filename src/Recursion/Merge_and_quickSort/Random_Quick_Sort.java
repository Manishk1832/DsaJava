package Recursion.Merge_and_quickSort;

import java.util.Random;

public class Random_Quick_Sort {
    public static void main(String[] args) {
        int[]arr={7,5,3,1,9,4};
        QuickSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }

    }
    public static void QuickSort(int[]arr, int lo, int hi){
        if(lo>=hi){
            return;
        }
        int idx = Partition(arr,lo, hi);
        QuickSort(arr,lo,idx-1);
        QuickSort(arr,idx+1,hi);
    }

    public static int Partition(int[]arr, int lo, int hi){
        Random_number(arr,lo,hi);
        int Pivot = arr[hi];
        int idx = lo;
        for (int i = lo; i <hi; i++) {
            if(arr[i]<=Pivot){
                //i ,idx
                int t = arr[i];
                arr[i]=arr[idx];
                arr[idx]=t;
                idx++;
            }


        }
        //idx, hi
        int t = arr[idx];
        arr[idx]=arr[hi];
        arr[hi]=t;
        return idx;

    }
    public static void Random_number(int[]arr,int si, int ei){
        Random rand  = new Random();
        int lo = si;
        int hi = ei;
        int ri = rand.nextInt(hi-lo+1)+lo;
        int temp = arr[ei];
        arr[ei]=arr[ri];
         arr[ri]=temp;
    }

}
