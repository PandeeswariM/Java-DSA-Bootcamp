package Tree.Easy;
import Tree.Node;
import java.util.Queue;
import java.util.LinkedList;

public class HeightTree {

    //recursion
    static int maxDepth(Node node) {
        if (node == null)
            return 0;

        // compute the depth of left and right subtrees
        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);

        return Math.max(lDepth, rDepth) + 1;
    }

    //Level Order Traversal
    static int height(Node root) {
        if (root == null) return 0;

        // Initializing a queue to traverse
        // the tree level by level
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int h = 0;

        // Loop until the queue is empty
        while (!q.isEmpty()) {
            int size = q.size();

            // Traverse all nodes at the current level
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }

            // Increment height after traversing each level
            h++;
        }
        return h;
    }

    public static void main(String[] args) {

        // Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(maxDepth(root));
        System.out.println(height(root));
    }
}
