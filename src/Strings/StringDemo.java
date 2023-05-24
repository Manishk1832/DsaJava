package Strings;

public class StringDemo {
    public static void main(String[] args) {
//        String str = "Hello";
//        System.out.println(str.length());
//        //char at an index?
//        char ch = str.charAt(4);
//        System.out.println(ch);
//
//        //index out of Bound
//       // System.out.println(str.charAt(999));
//
//        //last char of String?
//        System.out.println(str.charAt(str.length()-1));
//
//        Scanner scn = new Scanner(System.in);
////        String input = scn.next();
//        //char ch1 = input.charAt(0);
//
//      //  System.out.println(input);
//
//        str = "Hello Babblu";
//        System.out.println(str.indexOf("b"));
//        System.out.println(str.lastIndexOf("l"));
//
////        str = "abcd";
////        for (int s = 0; s<str.length();s++){
////            for (int e =s+1;e<=str.length();e++){
////                System.out.println(str.substring(s,e));
////            }
//////        }
////        str = "Hi There this manish how can i help you";
////        char ch4 = str.charAt(9);
////        System.out.println(str.charAt(ch4));
//
//        str = "Hello Ramu";
////        System.out.println(str.substring(1,4));
////        System.out.println(str.substring(1));
////        System.out.println(str.startsWith("LOL"));//check prefix
////        System.out.println(str.endsWith("Bhai")); //check suffix
//
////        String ss = scn.next();
////        String ss2 = scn.next();
////        System.out.println(ss+">==<");
//
////        String sentences = scn.nextLine();
////        System.out.println(sentences);
//
//        String Word1 = "Hello";
//        String Word2 = str.substring(0,5);
//        System.out.println(Word1==Word2);
//        //address compare
//
//        System.out.println(Word1+"=="+Word2);
//        //compare Content
//        System.out.println(Word1.equals(Word1));

        String str = "hello";
        String s2 = "abx";
        if(str.compareTo(s2)>0){
            System.out.println(str);
        }
        else {
            System.out.println(s2);
        }
        System.out.println(str+10+20);

    }
}
