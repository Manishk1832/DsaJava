package MonubhaiyaOOps;

public class OverLoading {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,4,9));
        System.out.println(add(2,4,9.7));
        System.out.println(add(7,2,2,2,2,2,2,2,24,4,5));

    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a , int b ,double c){
        return (int)(a+b+c);
    }
    //variable no of argument
    public  static  int add(int b, int...a){
        int sum = 0;
        for (int i =0 ;  i<a.length;i++){
            sum = sum+a[i];
        }
        return sum;
    }
}
