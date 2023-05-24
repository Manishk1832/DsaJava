package Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        StringCompression(str);
    }
    public static void StringCompression(String str){
        char prev = str.charAt(0);
        int count = 1;
        String ans  ="";
        for (int i = 1; i<str.length();i++){
            char curr = str.charAt(i);
            if(prev==curr){
                count++;
            }
            else {
                ans = ans + prev + count;
                prev=curr;
                count = 1;

            }
        }
        ans = ans + str.charAt(str.length()-1)+count;
        System.out.println(ans);
    }
}
