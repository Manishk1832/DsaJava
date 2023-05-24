package Recursion;

import java.util.Scanner;

public class printAllSubsequence {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n-- > 0) {
            String str = scn.next();
            printSubSeq(str, "");
        }
    }
    public static void printSubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }


        char ch = ques.charAt(0);

        printSubSeq(ques.substring(1),ans);
        printSubSeq(ques.substring(1),ans + ch);


    }
}
