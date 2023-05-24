package Strings;

import java.util.Scanner;

public class PalindromeSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ss1(str);
        //PalinSS(str);

    }
    public static void PalinSS(String str){
        for(int s = 0 ; s<=str.length();s++){
            for(int e = s+1; e<=str.length();e++){
                String ss = str.substring(s,e);
              if (PalindromeString(ss)) {
                  System.out.println(ss);
              }

            }
        }
    }

    //efficient code
    //This will create odd substring
    public static void ss1(String str){
        for(int axis = 0; axis<str.length();axis++){
            for(int radius =0;axis-radius>=0&&axis+radius<str.length();radius++){
                int L_idx = axis-radius;
                int R_idx =  axis+radius;
                 char L = str.charAt(L_idx);
                 char R = str.charAt(R_idx);
                 if(L==R){
                     System.out.println(str.substring(L_idx,R_idx+1));
                 }else {
                     break;
                 }
            }
        }
        for(double axis = 0.5; axis<str.length();axis++){
            for(double radius =0.5;axis-radius>=0&&axis+radius<str.length();radius++){
                int L_idx =  (int)(axis-radius);
                int R_idx = (int) (axis+radius);
                char L = str.charAt(L_idx);
                char R = str.charAt(R_idx);
                if(L==R){
                    System.out.println(str.substring(L_idx,R_idx+1));
                }else {
                    break;
                }
            }
        }
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
