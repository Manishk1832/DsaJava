package Arrays;

import java.util.Scanner;

public class Toeplitz_matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]mat = new  int[n][m];
       for (int i = 0 ; i< mat.length;i++){
           for (int j = 0 ; j<mat[0].length; j++) {
               mat[i][j] = scn.nextInt();
           }
       }
        System.out.println(Toeplitz(mat));



    }
    public static boolean Toeplitz (int[][]mat){
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if(mat[i][j]==mat[i+1][j+1]){
                    return true;
                }

            }

        }
        return false;
    }
}
