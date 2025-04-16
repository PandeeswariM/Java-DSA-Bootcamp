package Tree.Easy;

import Tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumBST {

    static int minValue(Node root) {

        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int minValue=root.data;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            minValue=Math.min(minValue,node.data);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return minValue;
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(4);
        root.right=new Node(3);
        root.left.left=new Node(2);
        root.left.right=new Node(1);
        System.out.println(minValue(root));
    }
}
