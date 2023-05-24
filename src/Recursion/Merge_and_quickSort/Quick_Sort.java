package Recursion.Merge_and_quickSort;

public class Quick_Sort {
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
}
