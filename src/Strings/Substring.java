package Strings;

public class Substring {
    public static void main(String[] args) {
        String str = "Nitin";
        Substrings(str);
    }
    public  static  void   Substrings (String str){
        for(int i = 0; i<str.length() ;i++){
            for(int j = i+1; j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
