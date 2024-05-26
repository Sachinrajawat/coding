import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a2_levelOrderTrav {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> wrapList=new LinkedList<>();
        if(root==null) return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> subList=new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(6);
        root.left.right=new TreeNode(7);
        root.left.left=new TreeNode(9);
        root.right.left=new TreeNode(8);
        List<List<Integer>> l=levelOrder(root);
        System.out.println(l);
    }
}
