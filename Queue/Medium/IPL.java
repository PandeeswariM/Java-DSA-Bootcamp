package Queue.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class IPL {

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        return maxofsubarrays(arr,Arrays.copyOfRange(arr,0,k),k,k,0,new ArrayList<>());
    }

    static ArrayList<Integer> maxofsubarrays(int[] original,int arr[],int n,int k,int index,ArrayList<Integer> result) {
        if(original.length-index+2==n){
            return result;
        }
        int max=Integer.MIN_VALUE;
        for(int a:arr){
            max=Math.max(a,max);
        }
        result.add(max);
        return maxofsubarrays(original,Arrays.copyOfRange(original,index,k),n,k+1,index+1,result);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,5,2,3,6};
        System.out.println(max_of_subarrays(arr,arr.length,2));
    }
}
