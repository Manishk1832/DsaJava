package WrapperClasses;

public class wrapper_classes_demo {
    public static void main(String[] args) {
        int i = 10;
        Integer I  = 11;
        System.out.println(I);
       // i = null;
        I = null;
        System.out.println(I);
        I = 99;
        System.out.println(I);

        I = i; //auto boxing
        System.out.println(I);
        i = I; //unboxing
        System.out.println(i);
    }
}
