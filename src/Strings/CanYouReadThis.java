package Strings;

import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        PrintString(str);



    }
    public static void PrintString(String str) {
        String ans = "";
        ans = ans+str.charAt(0);
        for(int i = 1 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                System.out.println(ans);
                ans = "";
                ans = ans + ch;
            }
            else {
                ans = ans + ch;
            }
        }
        System.out.println(ans);
    }


}
