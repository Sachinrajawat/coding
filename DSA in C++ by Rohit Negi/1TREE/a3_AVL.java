// import a2_BinaryTree.Node;

public class a3_AVL {
    static class Node{
    int data,height;
    Node left,right;
    Node(int value){
        data=value;
        height=1;
        left=right=null;
    }
}
    static int getBalance(Node root){
        return getHeight(root.left)-getHeight(root.right);
    }

    //Right Rotation
    static Node rightRotation(Node root){
        Node child=root.left;
        Node childRight=child.right;

        child.right=root;
        root.left=childRight;

        //Update the height
        root.height=1+Math.max(getHeight(root.left),getHeight(root.right));
        child.height=1+Math.max(getHeight(child.left),getHeight(child.right));

        return child;
    }

    //Left Rotation

    //R R
    static Node leftRotation(Node root){
        Node child=root.right;
        Node childLeft=child.left;

        child.left=root;
        root.right=childLeft;

        //Update the height
        root.height=1+Math.max(getHeight(root.left),getHeight(root.right));
        child.height=1+Math.max(getHeight(child.left),getHeight(child.right));

        return child;
    }

    static Node insert(Node root,int key){
        //doesn't exist
        if(root==null) return new Node(key);
        // Exist hai

        if(key<root.data) //left side
        root.left=insert(root.left,key);
        else if(key>root.data)
        root.right=insert(root.right,key);
        else return root; //duplicate not allowed

        //Update height
        root.height=1+Math.max(getHeight(root.left),getHeight(root.right));

        //balancing check
        int balance=getBalance(root);

        //Left Left Case
        if(balance>1 && key<root.left.data){
            return rightRotation(root);
        }
        //Right Right Case
        else if(balance<-1 && key>root.right.data){
            return leftRotation(root);
        }
        //Left Right Case
        else if(balance>1 && key>root.left.data){
            root.left=leftRotation(root.left);
            return rightRotation(root);
        }
        //Right Left Case
        else if(balance<-1 && key<root.right.data){
            root.right=rightRotation(root.right);
            return leftRotation(root);
        }
        //No Unbalancing
        else{
            return root;
        }


    }
    static int getHeight(Node root){
        if(root==null) return 0;
        return root.height;
    }

    static void Preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    static void Inorder(Node root){
        if(root==null) return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        
        Inorder(root.right);
    }
    

    public static void main(String[] args) {
        //duplicate element not allowed
        Node root=null;
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,50);
        root=insert(root,70);
        root=insert(root,5);
        root=insert(root,100);
        root=insert(root,95);

        System.out.println("PreOrder");
        Preorder(root);
        System.out.println("InOrder");
        Inorder(root);
        
    }
}
