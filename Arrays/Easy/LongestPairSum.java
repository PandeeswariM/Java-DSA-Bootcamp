package Arrays.Easy;

public class LongestPairSum {

    public static int pairsum(int[] arr) {
        // code here
        int firstLargest=0,secondLargest=0;
        for(int i:arr){
            if(i>firstLargest){
                secondLargest=firstLargest;
                firstLargest=i;
            }
           else if(i>secondLargest){
               secondLargest=i;
           }
        }
        return secondLargest+firstLargest;
    }

    public static void main(String[] args) {
        int[] arr={100,20,3,40,9};
        System.out.println("/apps/los/batch_import.zip?121".replaceAll("[^a-zA-Z0-9 _./-]", "_"));
        System.out.println(pairsum(arr));
    }
}
