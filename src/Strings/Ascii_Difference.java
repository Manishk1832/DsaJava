package Strings;

import java.util.Scanner;

public class Ascii_Difference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Ascii_Codes(str);
    }
    public static  void Ascii_Codes(String str){
        String ans = "";
        char prev = str.charAt(0);
        for (int i = 1;i<str.length();i++){
            char curr = str.charAt(i);
            ans = ans + prev+(curr-prev); //c-a = 99-97 =2
            prev=curr;
        }
        ans =  ans + prev;
        System.out.println(ans);

    }
}
