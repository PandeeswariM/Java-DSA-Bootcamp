package Binary_Search_Programs;

public class Smallest_Letter_greater_than_target {

	public static void main(String[] args) {
		char[] arr= {'c','d','e','f'};
		char target='d';
		System.out.println(SmallestLetter(arr,target));
}

	static char SmallestLetter(char[] arr,char target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start + (end-start)/2;
			if(target<arr[mid])
				end=mid-1;
			else 
				start=mid+1;
		}
		return arr[start];

	}
}
