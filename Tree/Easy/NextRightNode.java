package Tree.Easy;

import Tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightNode {

    static Node nextRight(Node root,int key) {
        if (root == null) return new Node(-1);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null){
                if(node.left.data==key){
                    return node.right;
                }else {
                    queue.add(node.left);
                }
            }
            if (node.right != null) queue.add(node.right);
        }
        return new Node(-1);    }

    public static void main(String[] args) {
        Node root=new Node(1);
//        root.left=new Node(4);
//        root.right=new Node(3);
//        root.left.left=new Node(2);
//        root.left.right=new Node(1);
        System.out.println(nextRight(root,1).data);
    }
}
