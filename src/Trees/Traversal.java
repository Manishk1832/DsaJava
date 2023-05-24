package Trees;

import java.util.LinkedList;
import java.util.Scanner;

public class Traversal {

        Scanner sc = new Scanner(System.in);
        public class  Node{
            int data;
            Node left;
            Node right;

        }
        private Node root;
        public  Traversal(){
            this.root = CreateTree();
        }

        private Node CreateTree() {
            int item = sc.nextInt();
            Node nn =  new Node();
            nn.data = item;
            boolean hasLeftChild = sc.nextBoolean();
            if(hasLeftChild==true){
                nn.left =CreateTree(); //leftSubTreeCreate
            }
            boolean hasRightChild = sc.nextBoolean();
            if(hasRightChild==true){
                nn.right = CreateTree(); //RightSubTreeCreate
            }
            return  nn;

        }
        public  void  PreOrder(){
            PreOrder(this.root);
            System.out.println();
        }
        private void PreOrder(Node node){
            if(node==null){
                return;
            }
            System.out.print(node.data+" ");
            PreOrder(node.left);
            PreOrder(node.right);

        }

        public  void  PostOrder(){
            PostOrder(this.root);
            System.out.println();
        }
        private void  PostOrder(Node node){
            if(node==null){
                return;
            }

            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.data+" ");
        }

        public  void  InOrder(){
            InOrder(this.root);
            System.out.println();
        }
        private  void  InOrder(Node node){
            if(node ==null){
                return;
            }

            InOrder(node.left);
            System.out.print(node.data+" ");
            InOrder(node.right);

        }
        public void  levelOrder(){
            LinkedList<Node> queue = new LinkedList<>();
            //Queue<Node> queue = new LinkedList<>();
            queue.add(this.root); //add list
            while (!queue.isEmpty()){
                Node rv = queue.remove(); //remove first
                System.out.print(rv.data+" ");
                if(rv.left!=null){
                    queue.add(rv.left);
                }
                if(rv.right!=null){
                    queue.add(rv.right);
                }

            }
            System.out.println();

        }

}
