package Strings.StringsBuilder;

public class StringBilder_Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
//        System.out.println(sb.reverse());
        sb.append("hellooo");
        sb.append("HelloHelloHelloooo");
        System.out.println(sb.length());
        System.out.println(sb.capacity());


        String s = sb.toString(); //builder to string
    }
}
