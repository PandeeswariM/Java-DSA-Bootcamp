package Recursion.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueSubsets {
    //https://www.geeksforgeeks.org/problems/subsets-1587115621/1

    //Input: N = 4, arr[] = {1,2,3,3}
    //Output: (),(1),(1 2),(1 2 3)
    //(1 2 3 3),(1 3),(1 3 3),(2),(2 3)
    //(2 3 3),(3),(3 3)

    public static ArrayList<ArrayList<Integer>> AllSubsets(int[] arr, int n)
    {
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       uniqueSets(0,arr,new ArrayList<>(),ans);
       return ans;
    }

    public static void uniqueSets(int ind,int[] arr,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            uniqueSets(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,3};
        for(ArrayList<Integer> list:AllSubsets(arr,n)){
            System.out.println(list);
        }
    }
}
