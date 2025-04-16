package Arrays.Easy;

import java.util.Arrays;

public class TripletFamily {

    public static boolean checkTriplet(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i< arr.length-2;i++){
            if(arr[i]+arr[i+1]==arr[i+2]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,5,2,3,4};
        System.out.println(checkTriplet(arr));
    }
}
