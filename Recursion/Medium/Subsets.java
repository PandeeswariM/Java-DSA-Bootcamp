package Recursion.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Subsets {

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        uniqueSets(0,a,new ArrayList<>(),ans);
        return ans;
    }

    public static void uniqueSets(int ind,ArrayList<Integer> arr,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.size();i++){
            if(i!=ind && Objects.equals(arr.get(i), arr.get(i - 1))) continue;
            ds.add(arr.get(i));
            uniqueSets(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(Arrays.toString(new ArrayList[]{subsets(arr)}));
    }

}
