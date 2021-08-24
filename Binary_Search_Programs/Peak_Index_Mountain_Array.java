package Binary_Search_Programs;

import java.util.Arrays;

public class Peak_Index_Mountain_Array {

	public static void main(String[] args) {
		int[] arr= {-18,-12,-4,0,2,3,14,12,10,8,5,3};
		System.out.println(Arrays.toString(PeakIndex(arr)));

	}
	static int[] PeakIndex(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				end=mid;
			else
				start=mid+1;
				
		}
		return new int[] {arr[start],start};
	}

}
