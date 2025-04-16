package Tree.Easy;
import Tree.Node;

import java.util.ArrayList;

public class InoderTraversal {

    static ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list=new ArrayList<>();
        inOrderHelper(root,list);
        return list;
    }

    public static void inOrderHelper(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        inOrderHelper(root.left,list);
        list.add(root.data);
        inOrderHelper(root.right,list);
    }

    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        preorderHelper(root,list);
        return list;
    }

    public static void preorderHelper(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        preorderHelper(root.left,list);
        preorderHelper(root.right,list);
    }

    static ArrayList<Integer> postOrder(Node root)
    {

        ArrayList<Integer> list=new ArrayList<>();
        postorderHelper(root,list);
        return list;
    }

    public static void postorderHelper(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        postorderHelper(root.left,list);
        postorderHelper(root.right,list);
        list.add(root.data);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println(postOrder(root));
    }
}
