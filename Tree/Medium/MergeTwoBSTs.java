package Tree.Medium;
import java.util.ArrayList;
import java.util.List;

import Tree.Node;

public class MergeTwoBSTs {

    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Step 1: Perform in-order traversal of both trees to get sorted lists
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);

        // Step 2: Merge the two sorted lists
        return mergeSortedLists(list1, list2);
    }

    // Helper function for in-order traversal
    private void inOrderTraversal(Node root, List<Integer> result) {
        if (root == null) return;
        inOrderTraversal(root.left, result);
        result.add(root.data);
        inOrderTraversal(root.right, result);
    }

    // Helper function to merge two sorted lists
    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Two-pointer merge
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
