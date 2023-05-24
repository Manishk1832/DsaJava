package Arrays;

import java.util.Scanner;

public class MatrixSearch {



    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //int N=scn.nextInt();
        int N=scn.nextInt();
        int M=scn.nextInt();
        //create an array
        int [][]mat=new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
                mat[i] [j]=scn.nextInt();
        }
        int ele = scn.nextInt();
         System.out.println( matrixSearch2D(mat,ele));
    }
    public static int matrixSearch2D(int[][]mat,int ele){
        int row = 0; int col  = mat[0].length-1;
         while (col>=0&&row<mat.length){
             if(mat[row][col]==ele){
                 return 1;
             } else if (mat[row][col]>ele) {
                 col--;
             }
             else {
                 row++;
             }
         }
         return 0;
    }
}
