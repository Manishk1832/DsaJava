package Recursion;

import java.util.Scanner;

public class GenerateBinaryString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){

            String str = scn.next();
            Binary_String(str,"");
            System.out.println();

        }
    }
    public static void Binary_String(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        if(ch=='?'){
            Binary_String(ques.substring(1),ans+"0");
            Binary_String(ques.substring(1),ans+"1");
        }
        else{
            Binary_String(ques.substring(1),ans+ch);
        }
    }
}
