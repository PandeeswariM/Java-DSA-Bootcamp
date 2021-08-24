package Binary_Search_Programs;
  
  //https://leetcode.com/problems/find-peak-element/
     //Input: nums = [1,2,1,3,5,6,4]
     //Output: 5
 //Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

public class _162_Find_peak_element {
     
    public static int findPeakElement(int[] arr) {
       	int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				end=mid;
			else
				start=mid+1;
				
		}
		return start; 
    }

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,5,6,4};
		 System.out.print(findPeakElement(arr));		
	}

}
