package Arrays.Easy;

import java.util.ArrayList;
import java.util.*;

public class TripletsWithZeroSum {

    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> result = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            // Avoid duplicates for the first element
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 1; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;  // Skip duplicate pairs for the second element
                }

                for (int k = j + 1; k < n; k++) {
                    if (k > j + 1 && arr[k] == arr[k - 1]) {
                        continue;  // Skip duplicate pairs for the third element
                    }

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        result.add(Arrays.asList(i, j, k));
                    }
                }
            }
        }

        return result;
    }
}
