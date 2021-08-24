package Binary_Search_Programs;

  //https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class _852_Peak_Index_in_a_Mountain_Array {
 
    public static int peakIndexInMountainArray(int[] arr) {
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
        int[] arr= {0,1,2,4,5,2,1,0};
		System.out.print(peakIndexInMountainArray(arr));
		//expected output 4 - Index of 5 is 4
	}

}
