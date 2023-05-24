package ArrayList;

import java.util.ArrayList;

public class ArrayList_demo {
    public static void main(String[] args) {
        int[]arr = new int [5];
        ArrayList<Integer> AL = new ArrayList<Integer>();
        System.out.println(AL);
        AL.add(10);
        AL.add(20);
        AL.add(30);
        System.out.println(AL);
        AL.add(40);
        AL.add(50);
        AL.add(60);
        System.out.println(AL);
        //size
        System.out.println(arr.length);
        System.out.println(AL.size());
        //indexing
        arr[0] = 10;
        AL.set(0,99);
        System.out.println(AL);
        System.out.println(AL.get(3));
        AL.add(2,70);
        System.out.println(AL);
        AL.add(AL.size(),80);
        System.out.println(AL);

        int ali = AL.remove(2);
        System.out.println(AL);
    }
}
