package Binary_Search_Programs;
import java.util.*;

public class _34_Find_first_last_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums= {5,7,7,8,8,9};
      int target=8;
      System.out.println(Arrays.toString(searchRange(nums,target)));
	}
	static int[] searchRange(int[] nums,int target) {
		int[] ans= {-1,-1};
		ans[0]=search(nums,target,true);
		if(ans[0]!=-1)
			ans[1]=search(nums,target,false);
		return ans;
	}
	static int search(int[] arr,int target,boolean st) {
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start + (end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else {
			   ans=mid;
			   if(st)
				   end=mid-1;
			   else
				   start=mid+1;
			}
			
		}

		return ans;	
	}

}
