package Binary_Search_Programs;

public class Flooring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int target=-6;
		System.out.println(flooring(arr,target));

	}
	static int flooring(int[] arr,int target) {
		int start=0;
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
		return arr[end%arr.length];

}
}