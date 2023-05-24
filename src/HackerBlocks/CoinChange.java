package HackerBlocks;

import java.util.Scanner;

public class CoinChange {
     static int count = 0;
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            int amount = scn.nextInt();
            int n = scn.nextInt();
            int[]coins = new int[n];
            for (int i = 0; i<n; i++){
                coins[i] = scn.nextInt();
            }

            combination(coins,amount,"",0);
            System.out.println(count) ;

        }
        public static void combination(int[]coins,int amount, String ans,int idx){
            if(amount==0){
              
                count++;

                return ;
            }

            for (int i = idx; i<coins.length;i++){
                if(amount>=coins[i]){

                    combination(coins,amount-coins[i],ans+coins[i],i);
                }
            }


        }
    }


