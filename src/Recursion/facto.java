package Recursion;

public class facto {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        //Basecase
        if(n==0){
            return 1;
        }
        //sp n-1
        int fn =fact(n-1); //recursion (n-1)!
        return fn*n;
    }
}
