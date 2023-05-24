package Arrays;

import java.util.Scanner;

public class Spiral_ClockWise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M  = scn.nextInt();
        int N = scn.nextInt();
        int [][] mat = new int[M][N];

        for(int i = 0 ; i<mat.length; i++){
            for (int j = 0 ; j<mat[0].length;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        print(mat,M,N);
    }
    public static void  print(int[][]mat,int M, int N){
        int minr = 0;
        int minc = 0;
        int maxrow = mat.length-1;
        int maxcol = mat[0].length-1;
        int totalELE = M*N;
        int count = 0;

        while (count<totalELE){

            //top wall
            for (int i = minr,j=minc;j<=maxcol && count<totalELE ;j++){
                System.out.print(mat[i][j]+", ");
                count++;

            }
            minr++;

            //right wall
            for(int i = minr ,j=maxcol;i<=maxrow && count<totalELE;i++){
                System.out.print(mat[i][j]+", ");
                count++;

            }
            maxcol--;
            //bottom wall
            for(int i = maxrow, j = maxcol; j>=minc && count<totalELE;j--){
                System.out.print(mat[i][j]+", ");
                count++;

            }
            maxrow--;



            //left wall
            for(int i = maxrow, j = minc; i>=minr&& count<totalELE;i--){
                System.out.print(mat[i][j]+", ");
                count++;
            }
            minc++;


        }
        System.out.print("END");
    }
}

