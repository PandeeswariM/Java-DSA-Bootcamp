package Tree.Easy;

import Tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CountNonLeaf {

    static int nonLeaf(Node root) {
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count=0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if(node.left!=null || node.right!=null){
                count++;
            }
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return count;
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(4);
        root.right=new Node(3);
        root.left.left=new Node(2);
        root.left.right=new Node(1);
        System.out.println(nonLeaf(root));
    }
}
