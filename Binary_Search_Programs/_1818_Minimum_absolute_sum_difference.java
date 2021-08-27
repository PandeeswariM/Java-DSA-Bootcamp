package Binary_Search_Programs;
import java.util.Arrays;

public class _1818_Minimum_absolute_sum_difference {

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int mod=1_000_000_7;
    	int[] dif=new int[nums1.length];
        int sum=0,ans=0;
        for(int i=0;i<nums1.length;i++) {
        	dif[i]=Math.abs(nums1[i]-nums2[i]);
        	sum+=dif[i];
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++) {
        	int BestDif=BestMatch(nums1,nums2[i]);
        	ans=Math.max(ans, dif[i]-BestDif);
        }
        int result=sum-ans;
        return (int) result%mod; 
    }
    static int BestMatch(int[] arr,int target) {
		int start=0,val=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start + (end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else
				return arr[mid];
		}
		if(start!=-1)
			val=Math.abs(target-arr[start]);
		if(end!=-1)
			val=Math.min(val,Math.abs(target-arr[end]));
	
		return val;
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums1= {1,10,4,4,2,7};
      int[] nums2= {9,3,5,1,7,4};
    		  System.out.print(minAbsoluteSumDiff(nums1,nums2));
      
	}

}
