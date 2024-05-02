// package DSA in java by PW.11TREE;

public class a1_BinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    static void preorder(Node root){ //Root Left Right //time O(n) space O(n)
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){ //Left Root Right //time O(n) space O(n)
        if(root==null){
            return;
        }
        preorder(root.left);
        System.out.print(root.val+" ");
        preorder(root.right);
    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(5);
        // x.right=new Node(5);
        // System.out.println(root);
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.print("InOrder: ");
        inorder(root);
        System.out.println();
    } 
}
