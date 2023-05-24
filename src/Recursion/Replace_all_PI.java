package Recursion;

import java.util.Scanner;

public class Replace_all_PI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t  = scn.nextInt();
        while(t-- > 0){
            String str = scn.next();
            String ans = "";
            ans = ans+str.charAt(0);
            Replace_Pi(str.substring(1),ans);
        }

    }
    public static void Replace_Pi(String ques ,String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }


     if(ans.charAt(ans.length()-1)==ques.charAt(0)){
         Replace_Pi(ques.substring(1),ans.substring(0,ans.length()-1)+"3.14");
     }
     else{
         Replace_Pi(ques.substring(1), ans+ques.charAt(0));
     }


    }
}
