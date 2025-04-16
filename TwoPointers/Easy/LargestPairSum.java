package TwoPointers.Easy;

public class LargestPairSum {

    public static int pairsum(int[] arr) {
        // code here
        int left = 0, right =  1;
        int maxSum = 0;

        // Step 2: Use two pointers
        while (right < arr.length) {
            int currentSum = arr[left] + arr[right];
            if(maxSum!=0 && maxSum<currentSum){
                left++;
            }
            System.out.println(maxSum+" "+currentSum);
            maxSum = Math.max(maxSum, currentSum);
            right++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={5, 6, 7, 1 ,2, 3 ,4};
        System.out.println(pairsum(arr));
    }
}
