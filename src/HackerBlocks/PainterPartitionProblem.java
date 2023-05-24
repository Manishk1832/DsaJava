package HackerBlocks;

import java.util.Scanner;

public class PainterPartitionProblem {
    public static boolean isPossible(int[] arr, int k, int n, int mid) {
        int Painter = 1;
        int BoardSUm = 0;
        for (int i = 0; i < n; i++) {
            if (BoardSUm + arr[i] <= mid) {
                BoardSUm += arr[i];
            } else {
                Painter++;
                if (Painter > k || arr[i] > mid) {
                    return false;
                }

                BoardSUm = arr[i];
            }
        }
        return true;
    }


    public static int painterPartionProblem(int[] arr, int k, int n) {
        int s = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int e = sum;
        int mid = s + (e - s) / 2;
        int ans = -1;
        while (s <= e) {
            if (isPossible(arr, k, n, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(painterPartionProblem(arr, k, n));


    }


}
