package Strings;

import java.util.Scanner;

public class StringOddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        OddEven(str);

    }
    public static void OddEven(String str){
        String ans = "";
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(i%2==0){
                ans  = ans + (char)  (ch+1);
            }
            else{
                ans = ans + (char) (ch-1);
            }
        }
        System.out.println(ans);

    }

}
