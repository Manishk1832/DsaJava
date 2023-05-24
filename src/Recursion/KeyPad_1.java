package Recursion;

import java.util.Scanner;

public class KeyPad_1 {
    static int count = 0;
    static  String[] key = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        print_keypad(str,"");
        System.out.println();
        System.out.println(count);

    }
    public static  void print_keypad(String ques, String ans){ //12
        if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }

        char ch = ques.charAt(0); // '1' ---> 49
        String pressString = key[ch-48]; //ch --->49
        for (int i = 0 ; i<pressString.length() ; i++){
          print_keypad(ques.substring(1),ans+pressString.charAt(i));
        }


    }
}
