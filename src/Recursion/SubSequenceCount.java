package Recursion;

import java.util.Scanner;

public class SubSequenceCount {
    static int count  =0;
    //1st way
    public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
                String str = scn.next();
               // printSubSeq(str, "");
                  // System.out.println();
                //System.out.println(count);
        System.out.println( printSubSeq2(str,""));


    }
    public static void printSubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }


        char ch = ques.charAt(0);

        printSubSeq(ques.substring(1),ans);
        printSubSeq(ques.substring(1),ans + ch);

    }
    //2nd way
    public static int printSubSeq2(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");

            return 1;
        }


        char ch = ques.charAt(0);//a

       int  f1 =  printSubSeq2(ques.substring(1),ans);
       int f2 =  printSubSeq2(ques.substring(1),ans + ch);
       return f1+f2;

    }
}
