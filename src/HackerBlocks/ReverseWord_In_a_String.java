package HackerBlocks;

import java.util.Scanner;

public class ReverseWord_In_a_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        while (true) {
            int last_sp = str.lastIndexOf(" ");
            String Word = str.substring(last_sp + 1);
            System.out.print(Word + " ");
            if(last_sp==-1){
                break;
            }
            str = str.substring(0,last_sp);
        }
    }
}
