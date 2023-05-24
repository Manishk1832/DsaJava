package Recursion.Bactracking;

public class coin_Combination {
    public static void main(String[] args) {
        int[]coins = {2,3,5,6};
        int amount = 10;
        combination(coins,amount,"",0);

    }
    public static void combination(int[]coins,int amount, String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return;
        }

        for (int i = idx; i<coins.length;i++){
            if(amount>=coins[i]){

                combination(coins,amount-coins[i],ans+coins[i],i);
            }
        }

    }
}
    