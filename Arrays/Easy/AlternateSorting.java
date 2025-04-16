package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class AlternateSorting {

    public static ArrayList<Integer> alternateSort(int[] arr) {
        // Your code goes here
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> newList=new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }

        Collections.sort(list);
        int large=list.size()-1,small=0;
        while(small<=large){
            newList.add(list.get(large--));
            if (small <= large) {
                newList.add(list.get(small++));
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        int[] arr={1, 6, 9, 4, 3, 7, 8};
        System.out.println(alternateSort(arr)); //Output: [9, 1, 8, 2, 7, 3, 6, 4]
    }
}
