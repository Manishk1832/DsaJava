package Strings;

public class CountPali {
        public static void main(String[] args) {
            String str = "abaab";
            substring(str);

        }
        public static void  substring(String str){
            int count = 0;
            for(int i = 0; i<str.length(); i++){

                for(int j = i+1; j<=str.length();j++){
                    String s1 = str.substring(i,j);

                    if(isPalindromeString(s1)==true){

                        count++;
                    }

                }

            }
            System.out.println(count);
        }
        public static boolean isPalindromeString(String str){
            int i = 0;
            int j = str.length()-1;
            while (i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }


