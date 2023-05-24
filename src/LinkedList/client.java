package LinkedList;

public class client {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
//        LL.add(10);
//        LL.add(20);
//        LL.add(30);
//        LL.add(40);
//        LL.Disp();
//        LL.addAt(2, 25);
//
//
//        LL.Rev();
//        LL.Disp();

        for(int i = 0; i<9 ; i++){
            LL.add(i*10);
        }
        LL.Disp();
        LL.kRev(3);
        LL.Disp();

    }
}
