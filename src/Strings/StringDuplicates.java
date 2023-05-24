package Strings;

import java.util.Scanner;

public class StringDuplicates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Duplicates(str);
    }
    public static void Duplicates(String str){

        String ans = str.charAt(0)+"";
        for (int i = 1; i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(prev!=curr){
                ans = ans + curr ;
            }
        }

        System.out.println(ans);
    }
}
