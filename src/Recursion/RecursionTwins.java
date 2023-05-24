package Recursion;

import java.util.Scanner;

public class RecursionTwins {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str  = scn.next();
        System.out.println(Twins(str));

    }
    public static int Twins(String ques){
        if (ques.length()<3){
            return 0;
        }
        int count = 0;
        if(ques.charAt(0)==ques.charAt(2)){
            count++;
        }
        count = count+Twins(ques.substring(1));
        return count;



    }
}
