package Recursion;

public class Coin_Toss_without2Head {
    public static void main(String[] args) {
        int n = 3;
        Toss(n,"");
    }
    public static void Toss(int n, String ans){
        if(n==0){
            System.out.println(ans);
                return;

        }
        if(ans.length()==0||ans.charAt(ans.length()-1)!='H'){
            Toss(n-1,ans+"H");
        }

        Toss(n-1,ans+"T");
    }
}
