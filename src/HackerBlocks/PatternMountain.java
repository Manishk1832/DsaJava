package HackerBlocks;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int space = 2*n-3;
        int row = 1;
        while (row<=n){
            //star
            int i = 1;
            int val =1;
            while(i<=star){
                System.out.print(val+" ");
                val++;
                i++;
            }
            //space
            int j = 1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }

            //star
            int k = 1;
            int p =1;
            if(row==n){
                k=2;
                p--;
            }

            while (k<=star){
                System.out.print(p+row-1+" ");
                k++;
                p--;
            }
            //next row prep
            if(row<=n){
                star++;
                space-=2;
            }else{
                star--;
                space+=2;
            }
            System.out.println();
            row++;

        }
    }
}
