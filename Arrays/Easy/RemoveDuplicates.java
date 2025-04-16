package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int[] arr){
        Arrays.sort(arr);

        // Use two pointers to remove duplicates in place
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i]; //[2,4,5,7,5,7]
            }
        }

        // Create a list from the unique elements
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= uniqueIndex; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}
