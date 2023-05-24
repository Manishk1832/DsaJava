package Arrays;

import java.util.Scanner;

public class Spiral_AntiClockWise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M = scn.nextInt();
        int n = scn.nextInt();
        int [][]mat = new int[M][n];
        for(int i=0 ; i< mat.length;i++){
            for(int j = 0; j<mat[0].length;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        print(mat);
    }
    public static void print(int[][]mat){


            int cnt = 0;
            int product = mat.length*mat[0].length;
            int min_row = 0;
            int min_col = 0;
            int max_row = mat.length - 1;
            int max_col = mat[0].length - 1;

        while (min_row<=max_row&&min_col<=max_col) {


            for (int r = min_row; r <= max_row &&cnt<product; r++) {
                System.out.print(mat[r][min_col] + ", ");
                cnt++;
            }
            for (int c = min_col + 1; c <= max_col&&cnt<product; c++) {
                System.out.print(mat[max_row][c] + ", ");
                cnt++;

            }

            for (int r = max_row - 1; r >= min_row&&cnt<product; r--) {
                System.out.print(mat[r][max_col] + ", ");
                cnt++;

            }
            for (int c = max_col - 1; c >= min_col + 1&&cnt<product; c--) {
                System.out.print(mat[min_row][c] + ", ");
                cnt++;

            }

            min_row++;
            min_col++;
            max_row--;
            max_col--;

        }
        System.out.print("END");

    }

}
