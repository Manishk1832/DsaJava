package Strings;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char find  = scn.next().charAt(0);
        System.out.println(Count(str,find));
    }
    public static int Count(String str, char find){
        int count = 0;
        for( int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i)==find){
               count++;
            }
        }
        return count;
    }

}
