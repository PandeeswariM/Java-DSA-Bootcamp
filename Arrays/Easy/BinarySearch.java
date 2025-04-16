package Arrays.Easy;

public class BinarySearch {

    //https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&category=Arrays&company=Amazon,Zoho,Goldman%20Sachs,TCS,Swiggy&difficulty=Easy&sortBy=submissions
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int left=0;
        int right=arr.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow

            if (arr[mid] == k) {
                return mid;
            } else if (k < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
