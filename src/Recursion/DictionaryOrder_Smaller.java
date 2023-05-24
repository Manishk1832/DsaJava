package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryOrder_Smaller {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            ArrayList<String> list = new ArrayList<>();
            printPermutation(str,"",str,list);
            Collections.sort(list);
            for (int i = 0 ; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        }
        public static void printPermutation(String ques, String ans,String org,ArrayList<String>list){
            if(ques.length()==0){
                if(ans.compareTo(org)<0) {
                    list.add(ans);
                }
                return;
            }

            for (int i = 0 ; i<ques.length(); i++){
                char ch = ques.charAt(i);
                String ros = ques.substring(0, i)+ques.substring(i+1);
                printPermutation(ros,ans+ch,org,list);

            }
        }
}


