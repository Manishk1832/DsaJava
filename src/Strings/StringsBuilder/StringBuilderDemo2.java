package Strings.StringsBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("HelloHello");
//        System.out.println(sb.capacity());
//        ArrayList<Integer>list = new ArrayList<>();
        System.out.println(sb.charAt(2));
        System.out.println(sb.substring(2,5));
//      System.out.println(list.size());
       // StringPrint();
        //StringBuilderPrint();

    }
    public static void StringPrint(){
        String s = " ";
        for (int i =1 ; i<=100; i++){
            s=s+i;
            System.out.println(s);

        }
    }
    public static void StringBuilderPrint(){
        StringBuilder s = new StringBuilder();

        for (int i =1 ; i<100000; i++){
            s=s.append(i);
            System.out.println(s);

        }
    }
}
