package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Code {
  static   String[]arr = {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> list =  new ArrayList<>();
        Codes_String_Of_String(str,"", list);
        System.out.println(list);
    }
    public static void Codes_String_Of_String(String ques, String ans,ArrayList<String>list){
        if(ques.length()==0){
            list.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String s = arr[ch-48];
        Codes_String_Of_String(ques.substring(1),ans+s,list);

        if(ques.length()>=2){
            String s1 = ques.substring(0,2);
            int n = Integer.parseInt(s1) ; //numeric String --> int convert Karega
            if(n<=26) {
                Codes_String_Of_String(ques.substring(2), ans + arr[n], list);
            }
        }
    }
}
