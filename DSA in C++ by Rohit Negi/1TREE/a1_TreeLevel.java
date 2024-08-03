import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class a1_TreeLevel {
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
    public static void main(String[] args){
        System.out.print("Enter root elements: ");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int first, second;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(x);
        q.add(root);

        //Build the Binary Tree
        while (!q.isEmpty()) {
            Node temp=q.remove();
            System.out.print("Enter the left child value of "+temp.data+" : ");
            first=in.nextInt();  //left node ki value
            //left Node
            if(first!=-1){
                temp.left=new Node(first);
                q.add(temp.left);
            }
            //right Node
            System.out.print("Enter the right child value of "+temp.data+" : ");
            second=in.nextInt();
            if(second!=-1){
                temp.right=new Node(second);
                q.add(temp.right);
            }
        }
    }
}
