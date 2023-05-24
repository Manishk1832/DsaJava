package HackerBlocks;

import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space =  0;
        int star = 2*n+1;
        int row = 1;
        int val = n;
        while(row<=2*n+1){
            int i = 1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int v = val;
            while (j<=star){
                System.out.print(v +" ");
                if(j<=star/2){
                    v--;
                }
                else {
                    v++;
                }
                j++;
            }
            //next row;
            if(row<=n){
                space++;
                star-=2;
                val--;

            }
            else {
                space--;
                star+=2;
                val++;
            }
            System.out.println();
            row++;
        }
    }
}
