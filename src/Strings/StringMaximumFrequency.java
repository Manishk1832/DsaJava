package Strings;

import java.util.Scanner;

public class StringMaximumFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Max_Frequency_Char(str);
    }
    public static void Max_Frequency_Char(String str){
        int [] freq = new int[26];
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-97]= freq[ch-97]+1;
        }
        int max_i = 0;
        for (int i = 0; i<freq.length;i++){
            if(freq[i]>freq[max_i]){
                max_i = i;
            }
        }
        char ch = (char)(97+max_i);
        System.out.println(ch);

    }
}
