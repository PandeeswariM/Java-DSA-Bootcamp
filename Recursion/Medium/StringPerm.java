package Recursion.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class StringPerm {

    //https://www.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> ans= permutationList("",S);
        Collections.sort(ans);
        return ans;
    }

    public ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i);
            ans.addAll(permutationList(f+ch+l,up.substring(1)));
        }
        return ans;
    }
}
