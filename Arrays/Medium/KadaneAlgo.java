package Arrays.Medium;

import LinkedList.Node;

import java.util.ArrayList;

public class KadaneAlgo {

    //https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
    private static long maxSubarraySum(int[] arr) {
        long max_so_far=Integer.MIN_VALUE;
        long max_ending_here=0;
        for(int num:arr){
            max_ending_here+=num;
            if(max_so_far < max_ending_here){
                max_so_far=max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here=0;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr={2,23,-11,45,-78};
        System.out.println(maxSubarraySum(arr));
    }
}
