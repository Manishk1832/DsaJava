package HackerBlocks;

import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr  = new  int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int quarries = scn.nextInt();
        while (quarries>0){
            int amount = scn.nextInt();
            int item = scn.nextInt();
            int cnt = 0;
            for(int i =0 ; i<n; i++){
                if(amount%arr[i]==0){
                    cnt++;
                }
            }
            if(cnt>=item){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

            quarries--;

        }
    }
}
