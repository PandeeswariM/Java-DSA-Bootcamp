package Arrays.Medium;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MaxProductSubarray {
    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    // Function to find the product of max product subarray
    static int maxProduct(int[] arr) {
        int n = arr.length;

        // max product ending at the current index
        int currMax = arr[0];

        // min product ending at the current index
        int currMin = arr[0];

        // Initialize overall max product
        int maxProd = arr[0];

        // Iterate through the array
        for (int i = 1; i < n; i++) {

            // Temporary variable to store the maximum product ending
            // at the current index
            int temp = max(arr[i], arr[i] * currMax, arr[i] * currMin);

            // Update the minimum product ending at the current index
            currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin);

            // Update the maximum product ending at the current index
            currMax = temp;

            // Update the overall maximum product
            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        String s1="1 & 2 north";
        String s2="1 & 2 nor";
        System.out.println(Math.max(s1.length(), s2.length()));
        //System.out.println(maxProduct(arr));
    }

    // function to find the product of max product subarray
    static long maxProduct_2(int[] arr) {
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;

        // leftToRight to store product from left to Right
        int leftToRight = 1;

        // rightToLeft to store product from right to left
        int rightToLeft = 1;

        for (int i = 0; i < n; i++) {
            if (leftToRight == 0)
                leftToRight = 1;
            if (rightToLeft == 0)
                rightToLeft = 1;

            // calculate product from index left to right
            leftToRight *= arr[i];

            // calculate product from index right to left
            int j = n - i - 1;
            rightToLeft *= arr[j];
            maxProd = Math.max(leftToRight,
                    Math.max(rightToLeft, maxProd));
        }
        return maxProd;
    }

}
