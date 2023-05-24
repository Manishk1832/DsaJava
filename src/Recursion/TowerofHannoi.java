package Recursion;

import java.util.Scanner;

public class TowerofHannoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printSteps(n,"A","B","C");
    }
    public static void printSteps(int n, String s, String h, String d){
        //s is src road
        //h is helper road
        //destination road
        //s-->A
        //H-->B
        //D-->C
        if(n==0){
            return;
        }
        printSteps(n-1,s,d,h); //helper
        System.out.println("Moving ring "+n+" from "+s+" to "+d);
        printSteps(n-1,h,s,d);



    }

}
