package HackerBlocks;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][]arr = new  int[n][n];
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for (int col1 = arr[0].length-1;col1>=0;col1--){
            for (int row =0;row<arr.length;row++){
                int idx = row;
                System.out.print(arr[idx][col1]+" ");
            }
            System.out.println();
        }
    }
}
