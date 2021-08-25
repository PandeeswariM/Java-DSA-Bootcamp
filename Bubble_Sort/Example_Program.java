package bubble_Sort;

import java.util.Arrays;

public class Example_Program {

	static void sort(int[] arr) {
		boolean swapped;
		for(int i=0;i<arr.length;i++) {
			swapped=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr={14,33,27,35,10,5};
       sort(arr);
       System.out.print(Arrays.toString(arr));
	}

}
