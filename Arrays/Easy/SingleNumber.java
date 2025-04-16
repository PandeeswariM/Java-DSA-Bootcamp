package Arrays.Easy;

import java.util.HashMap;

public class SingleNumber {

    static int getSingle(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int n:arr){
            if(map.get(n)%2!=0){
                return n;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(getSingle(arr));
    }
}
