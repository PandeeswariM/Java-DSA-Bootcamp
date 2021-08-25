package bubble_Sort;


//input [2,3,5,6,7]
   //output [2,3,7,6,5]

public class Mixed_Sorting {

	static void sort(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int[] arr={2,3,5,6,7};
	       sort(arr);
	       for(int i=0;i<arr.length/2;i++) {
	          System.out.print(arr[i]+" ");
	        }
	       for(int j=arr.length-1;j>=arr.length/2;j--) {
	    	   System.out.print(arr[j]+" ");
	    		
	       }
	}

}
