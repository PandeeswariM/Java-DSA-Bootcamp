package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class ModifyArray {

    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(i<arr.length-1 && arr[i]!=0 && (arr[i]==arr[i+1])){
              list.add(arr[i]*2);
              arr[i+1]=0;
           }else if(arr[i]!=0){
               list.add(arr[i]);
           }
       }
       while(list.size()<arr.length){
           list.add(0);
       }
       return list;
    }


    public static void main(String[] args) {
        int[] arr={0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        System.out.println(modifyAndRearrangeArr(arr));
    }
}
