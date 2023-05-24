package HackerBlocks;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0){
            int c1 = scn.nextInt();
            int c2 = scn.nextInt();
            int c3 = scn.nextInt();
            int c4  = scn.nextInt();
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] rickshaw = new int[n];
            int[] cab = new  int[m];
            for (int i = 0; i<rickshaw.length; i++){
                rickshaw[i] = scn.nextInt();
            }
            for (int i = 0 ; i<cab.length ; i++){
                cab[i] = scn.nextInt();
            }
            int rickshaw_ride = 0;
            int cab_ride = 0;
            for(int i = 0 ; i<rickshaw.length; i++){
                rickshaw_ride +=Math.min(rickshaw[i]*c1,c2);
            }
            for(int i = 0 ; i<cab.length ; i++){
                cab_ride +=Math.min(cab[i]*c1,c2);
            }
            rickshaw_ride=Math.min(rickshaw_ride,c3);
            cab_ride = Math.min(cab_ride,c3);
            int ans = Math.min(rickshaw_ride+cab_ride,c4);
            System.out.println(ans);

        }

    }


}
