package Trees;

public class Lowest_Common_ancestor_2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(find(root,p)==false||find(root,q)==false){
                return null;
            }
            return LCA(root,p,q);
        }
        public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
            if(root==null){
                return null;
            }
            if(root==p||root== q){
                return root;
            }

            TreeNode left = LCA(root.left, p,q);
            TreeNode right = LCA(root.right,p,q);
            if(left!=null && right!=null){
                return root;
            }
            if(left==null){
                return  right;
            }
            else{
                return left;
            }
        }
        public  boolean find(TreeNode root, TreeNode p){
            if(root==null){
                return  false;
            }
            if(root==p){
                return true;
            }
           return  find(root.left, p)||find(root.right,p);

        }
    }
}
