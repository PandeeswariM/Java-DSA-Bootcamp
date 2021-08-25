package Binary_Search_Programs;

   /*https://leetcode.com/problems/search-insert-position/
        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
        You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

     */
public class _35_Search_Insert_position {

    public static int searchInsert(int[] arr, int target) {
    	int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start + (end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else
				return mid;
		}
		return start;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,3,5,6};
      int target=2;
      System.out.println(searchInsert(arr,target));
      int[] nums= {1,3,5,6};
      int target2=7;
      System.out.println(searchInsert(nums,target2));

	}

}
