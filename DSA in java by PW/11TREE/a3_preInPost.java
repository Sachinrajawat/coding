import java.util.*;

public class a3_preInPost{

    // Node structure for the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize
        // the node with a value
        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    // Function to get the Preorder,
    // Inorder and Postorder traversal
    // Of Binary Tree in One traversal
    public static List<List<Integer>> preInPostTraversal(Node root) {
        // Lists to store traversals
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        // If the tree is empty,
        // return empty traversals
        if (root == null) {
            return new ArrayList<>();
        }

        // Map to maintain nodes and their traversal state
        Map<Node, Integer> stateMap = new HashMap<>();
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            int state = stateMap.getOrDefault(node, 1);

            if (state == 1) {
                pre.add(node.data);
                stateMap.put(node, 2);
                stack.push(node);
                if (node.left != null) {
                    stack.push(node.left);
                }
            } else if (state == 2) {
                in.add(node.data);
                stateMap.put(node, 3);
                stack.push(node);
                if (node.right != null) {
                    stack.push(node.right);
                }
            } else {
                post.add(node.data);
            }
        }

        // Returning the traversals
        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }

    // Function to print the elements of a list
    public static void printList(List<Integer> list) {
        // Iterate through the list
        // and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting the pre-order, in-order,
        // and post-order traversals
        List<Integer> pre, in, post;
        List<List<Integer>> traversals = preInPostTraversal(root);

        // Extracting the traversals
        // from the result
        pre = traversals.get(0);
        in = traversals.get(1);
        post = traversals.get(2);

        // Printing the traversals
        System.out.print("Preorder traversal: ");
        printList(pre);

        System.out.print("Inorder traversal: ");
        printList(in);

        System.out.print("Postorder traversal: ");
        printList(post);
    }
}
