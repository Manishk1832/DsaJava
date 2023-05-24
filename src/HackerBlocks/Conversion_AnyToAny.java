package HackerBlocks;

import java.util.Scanner;

public class Conversion_AnyToAny {

   public static int conversion(int sb, int db, int n){
        int ans = 0;
        int i = 1;
        while (n != 0)
        {
            int digit = n % 10;
            ans = ans + digit * i;
            i = i * sb;
            n = n / 10;
        }
        i = 1;
        n = ans;
        ans = 0;
        while (n != 0)
        {
            int rem = n % db;
            ans = ans + rem * i;
            i = i * 10;
            n = n / db;
        }

        return ans;
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sb = scn.nextInt();
        int db = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(conversion(sb,db,n));
    }
}
