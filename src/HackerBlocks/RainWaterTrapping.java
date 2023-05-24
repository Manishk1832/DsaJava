package HackerBlocks;

import java.util.Scanner;

public class RainWaterTrapping {

    public static int Rain_Water_Trapping(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (Math.min(left[i], right[i]) - arr[i]);
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // number of test

        while (t > 0) {
            int n = scn.nextInt();
            int[]arr  = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            t--;
            System.out.println();
            System.out.println(Rain_Water_Trapping(arr));
        }

    }
}