package HackerBlocks;

import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String newStr = " ";
        for(int i = 0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                newStr = newStr+Character.toLowerCase(s.charAt(i));
            }
            else{
                newStr = newStr+Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(newStr);
    }
}
