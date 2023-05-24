package HackerBlocks;

import java.util.Scanner;

public class PatternDoubleSideArrow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space1 = n-1;
        int space2 = -1;
        int star = 1;
        int row = 1;
        int val = 1;
        while (row<=n){
            //space 1
            int i = 1;
            while(i<=space1){
                System.out.print("  ");
                i++;
            }
            //star 1
            int j = 1;
            int p = val;
            while (j<=star){
                System.out.print(p+" ");
                p--;
                j++;
            }

            //space 2
            int k = 1;
            while (k<=space2){
                System.out.print("  ");
                k++;
            }
            //star2
            j = 1;
            p++;
            if (row==1 ||row==n){
                j=2;
            }
            while (j<=star){
                System.out.print(p+" ");
                p++;
                j++;
            }
            //next row preparation
            if(row<=n/2){
                space1-=2;
                space2+=2;
                val++;
                star++;
            }
            else {
                space1+=2;
                star--;
                val--;
                space2-=2;
            }
            row++;
            System.out.println();
        }

    }
}
