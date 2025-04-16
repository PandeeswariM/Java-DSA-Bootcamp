package Tree.Easy;
import Tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class SumBT {

    static int sumBT(Node root){
        //Code
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int sum=0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            sum+=node.data;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return sum;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println(sumBT(root));
    }
}
