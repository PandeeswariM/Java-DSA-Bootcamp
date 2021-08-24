package Binary_Search_Programs;

public class Order_Agnostic_BS {

	public static void main(String[] args) {
		int[] arr= {99,80,56,44,35,22,10,9,4,2,1,0};
		int target=20;
		System.out.println(OrderAgnosticBS(arr,target));

	}
	static int OrderAgnosticBS(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		while(start<=end) {
	       int mid=start + (end-start)/2;
           if(arr[mid]==target)
        	   return mid;
           if(isAsc) {
   			if(target>arr[mid])
				start=mid+1;
			else
				end=mid-1;
           }
           else {
   			if(target>arr[mid])
				end=mid-1;
			else 
				start=mid+1;
           }
		
	}
    return -1;
}
}