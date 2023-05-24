package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0) {
            int n = scn.nextInt();
            int[] roses = new int[n];
            for (int i = 0; i < n; i++) {
                roses[i] = scn.nextInt();
            }
            int money = scn.nextInt();

            pair1(roses, money);
            System.out.println();
            T--;
        }




    }
    //brutForce approach
    public static void pair(int[]roses, int money){
        int R1 = 0; int R2 = 0;
        int min_diff=Integer.MAX_VALUE;
        for(int i = 0 ; i<roses.length;i++){
            for (int j = i+1; j<roses.length;j++){
                if(roses[i]+roses[j]==money){
                    int diff = Math.abs( roses[i]-roses[j]);
                    if (diff<min_diff){
                        min_diff = diff;
                        R1 = Math.min(roses[i],roses[j]);
                        R2 = Math.max(roses[i],roses[j]);

                    }

                }

            }
        }
        System.out.println("Deepak should buy roses whose prices are "+R1 + " and " +R2+".");
    }

    //optimize approach
    public static void pair1(int[]roses, int money){
        Arrays.sort(roses);
        int L = 0;
        int R = roses.length-1;
        int R1 = 0;
        int R2 = 0;
        while (L<R){
            if (roses[L]+roses[R]>money){
                R--;
            } else if (roses[L]+roses[R]==money) {
              R1 = roses[L];
              R2 = roses[R];
              L++;
              R--;
            }
            else {
              L++;
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+R1 + " and " +R2+".");

    }

}
