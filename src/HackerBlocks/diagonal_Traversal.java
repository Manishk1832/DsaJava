package HackerBlocks;

import java.util.Scanner;

public class diagonal_Traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][]mat = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        DiagonalTraversal(mat);
        System.out.println();
        for(int i = 0 ; i<mat.length;i++ ){
            for(int j = 0; j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
        }
    }
    public static void DiagonalTraversal(int[][] mat){
        if(mat.length==0||mat[0].length==0){
            return ;
        }
        int m = mat.length;
        int n = mat[0].length;
        int[]arr = new int[m*n];
        int i = 0;
        int row=  0;
        int col = 0;
        boolean up = true;
        while (row<m && col<n){
            //if diagonal  is going up
            if(up){
                while (row>0&&col<n-1){
                    arr[i] = mat[row][col];
                    row--;
                    col++;
                    i++;
                }
                arr[i] = mat[row][col];
                i++;
                if(col==n-1){
                    row++;
                }
                else {
                    col++;
                }
            }
            else{
             while (col>0&&row<m-1){
                 arr[i] = mat[row][col];
                 row++;
                 col--;
                 i++;
             }
                arr[i] = mat[row][col];
                i++;

                if(row==m-1){
                   col++;
               }
                else{
                    row++;
                }
            }
            up =!up;


        }

        // Print the diagonal traversal array
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
