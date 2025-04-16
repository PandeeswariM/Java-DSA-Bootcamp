package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    //39 - https://leetcode.com/problems/combination-sum/description/
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7}; int target = 7;
        System.out.println(combinationSum(candidates,target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        comSum(0,candidates,l1,ans,target);
        return ans;
    }

    public static void comSum(int index , int arr[]  ,List<Integer> l1 ,List<List<Integer>> ans , int target){

        if(index == arr.length){

            if(target==0){
                ans.add(new ArrayList<>(l1));
            }
            return ;
        }

        if(arr[index]<= target){
            l1.add(arr[index]);
            comSum(index,arr,l1,ans,target-arr[index]);
            l1.remove(l1.size()-1);
        }

        comSum(index+1,arr,l1,ans,target);

    }

}
