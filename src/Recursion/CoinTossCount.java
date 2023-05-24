package Recursion;

public class CoinTossCount {
    public static void main(String[] args) {
        int  n = 3;
        System.out.println("\n"+Toss(n,""));

    }
    public static int Toss(int n, String ans ){

        if(n==0){
            System.out.print(ans+" ");
            return 1;
        }
        int f1 =   Toss(n-1,ans+"H");
        int f2= Toss(n-1,ans+"T");
        return f1+f2;

    }
}
