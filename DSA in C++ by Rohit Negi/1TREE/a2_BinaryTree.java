import java.util.Scanner;

public class a2_BinaryTree {
    static Scanner in =new Scanner(System.in);
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static void PreOrder(Node root){
        if(root==null) return;
        //Node
        System.out.print(root.data+" ");
        //Left
        PreOrder(root.left);
        //Right
        PreOrder(root.right);
    }
    static void InOrder(Node root){
        if(root==null) return;

        //Left
        InOrder(root.left);
        //Node
        System.out.print(root.data+" ");
        //Right
        InOrder(root.right);
    }
    static void PostOrder(Node root){
        if(root==null) return;

        //Right
        PostOrder(root.right);
        //Left
        PostOrder(root.left);
        //Node
        System.out.print(root.data+" ");
        
    }
    
    static Node BinaryTree(){
        
        int x=in.nextInt();
        if(x==-1) return null;
        Node temp=new Node(x);
        
        //Left side create
        System.out.print("enter Left child of "+x+": ");
        temp.left=BinaryTree();
        //Right side create
        System.out.print("enter Right child of "+x+": ");
        temp.right=BinaryTree();
        return temp;
    }
    public static void main(String[] args) {
        System.out.print("enter the root node: ");
        Node root=BinaryTree();

        //Preorder
        System.out.print("PreOrder: ");
        PreOrder(root);

        //Inorder
        System.out.print("\nInOrder: ");
        InOrder(root);

        //Postorder
        System.out.print("\nPostOrder: ");
        PostOrder(root);
        
    }
}
