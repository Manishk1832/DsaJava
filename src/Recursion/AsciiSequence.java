package Recursion;

import java.util.Scanner;

public class AsciiSequence {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        String str = Scn.next();
        System.out.println("\n"+ Ascii_Sequence(str,""));
    }
    public static int Ascii_Sequence(String ques,String ans ){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return 1;
        }


        char ch = ques.charAt(0);
        int ascii = (int)ch;

       int f1 =  Ascii_Sequence(ques.substring(1),ans);
       int f2 = Ascii_Sequence(ques.substring(1),ans+ch);
        int f3 = Ascii_Sequence(ques.substring(1),ans+ascii);
        return f1+f2+f3;
    }
}
