package Arrays;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class input_2D_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int R = scn.nextInt();
        int C = scn.nextInt();
        int[][] mat = new int[R][C];
        for(int i = 0; i<mat.length;i++){
            for(int j = 0; j<mat[0].length;j++){
                mat[i][j]  = scn.nextInt();
            }
        }

        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length;col++){
                System.out.print(mat[row][col] +"  ");
            }
            System.out.println();
        }

    }
}
