package Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PowerSetinLexicographicOrder {
    //https://www.geeksforgeeks.org/powet-set-lexicographic-order/

//    Input : abc
//    Output : a ab abc ac b bc c

    public static void main(String[] args) {
        ArrayList<String> subsets=new ArrayList<>();
        printSubset("","abc",subsets);
        Collections.sort(subsets);
        for(String sub:subsets){
            System.out.print(sub+" ");
        }
    }

    public static void printSubset(String p,String up,ArrayList<String> subsets){
        if(up.isEmpty()){
            subsets.add(p);
            return;
        }
        char ch=up.charAt(0);
        printSubset(p+ch,up.substring(1),subsets);
        printSubset(p,up.substring(1),subsets);
    }
}
