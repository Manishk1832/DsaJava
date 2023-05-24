package HackerBlocks;

import java.util.Scanner;

public class PatternWithZero {

    public static void PatternZero(int n){
        int row = 1;
        while (row<=n){
            int col = 1;
            while (col<=row){
                if(col==1||col==row){
                    System.out.print(row+ " ");
                }
                else {
                    System.out.print("0 ");
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PatternZero(n);

    }
}
