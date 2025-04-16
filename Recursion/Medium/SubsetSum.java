package Recursion.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    public static boolean AllSubsets(int[] arr, int n)
    {
        Arrays.sort(arr);
        return uniqueSets(0,arr,new ArrayList<>(),n);
    }

    public static boolean uniqueSets(int ind,int[] arr,ArrayList<Integer> ds,int sum){
        for(int i=ind;i<arr.length;i++){
            ds.add(arr[i]);
            int count=0;
            for(int j:ds){
                count+=j;
            }
            if(count==sum){
                return true;
            }
            uniqueSets(i+1,arr,ds,sum);
            ds.remove(ds.size()-1);
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 11;
        int[] arr = {14, 17, 11, 4,3, 14, 16, 4, 14, 2, 11};
        System.out.println(AllSubsets(arr,n));
    }
}
