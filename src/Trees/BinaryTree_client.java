package Trees;

public class BinaryTree_client {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(73));
        System.out.println(bt.ht());

    }
}
