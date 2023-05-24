package HackerBlocks;

import java.util.Scanner;

public class FindingCBnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        scn.nextLine(); // consume newline character

        // Read in string of digits
        String str = scn.nextLine();
        System.out.println(PrintSubstring(str));

    }
    public static int  PrintSubstring(String str){
        int count = 0;
        boolean[]vistited = new boolean[str.length()];
        for (int len = 1; len<=str.length();len++){
             for (int si = 0; si<=str.length()-len;si++){
                 int ei = si+len;
                 String s = str.substring(si,ei);//CB number check
                 //String int
                 //Integer.parseInt(s); //String to Integer
                // Long.parseLong(s);
                 if(isCBNumber(Long.parseLong(s))==true && isVisited(vistited,si,ei-1)==false){
                     for (int i = si; i<=ei-1;i++){
                         vistited[i]=true;
                     }
                     count++;
                 }

             }
        }
        return count;
    }
    public static boolean isVisited(boolean[]visted,int si,int ei){
        for (int i = si; i<=ei;i++){
            if(visted[i]==true){
                return true;
            }
        }
        return false;
    }
    public static boolean isCBNumber(long n){
        int[]arr= {2,3,5,7,11,13,17,19,23,29};
        //point 1 check
        if(n==0||n==1){
            return  false;
        }
        //point 2
        for (int i = 0; i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        //Point 3
        for (int i = 0; i<arr.length;i++){
            if(n%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
