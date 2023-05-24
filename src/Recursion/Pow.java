package Recursion;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(pow(a,b));

    }
    public static int pow(int a,int b){
        //base case
        if(b==0){
            return 1;
        }


        //sp
        int ans = pow(a,b-1);//a^b-1
        return ans*a;

    }
}
