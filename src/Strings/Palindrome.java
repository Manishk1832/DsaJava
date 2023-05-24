package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

       Boolean ans =  PalindromeString(str);
        System.out.println(ans);
    }
    public static boolean PalindromeString(String str){
        int idx1 = 0;
        int idx2 = str.length()-1;
        while (idx1<idx2){
            if(str.charAt(idx1)!=str.charAt(idx2)){
                return false;
            }
            idx1++;
            idx2--;

        }
        return true;

    }

}
