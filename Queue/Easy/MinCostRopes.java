package Queue.Easy;

import java.util.Arrays;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostRopes {
    //https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1?page=1&category=Queue&difficulty=Easy&sortBy=submissions
    public static long minCost(long arr[], int n)
    {
        return costRope(arr,0,0);
    }

    public static long QueueMinCost(long arr[],int n){
        PriorityQueue<Long> queue=new PriorityQueue<>();
        for(long num:arr){
            queue.add(num);
        }
        long totalCost=0;
        while(queue.size()>1){
            long first=queue.poll();
            long second=queue.poll();
            long cost=first+second;
            totalCost+=cost;
            queue.add(cost);
        }
        return totalCost;
    }

    static long costRope(long[] arr,int index,long sum){
        if(index==arr.length-1){
            return sum;
        }
        Arrays.sort(arr);
        long cal=arr[index]+arr[index+1];
        arr[index+1]=cal;
        return costRope(arr,index+1,sum+cal);
    }

    public static void main(String[] args) {
        long[] arr={4,2,3,6};
        //System.out.println(minCost(arr, arr.length));
        System.out.println(QueueMinCost(arr, arr.length));
    }
}
