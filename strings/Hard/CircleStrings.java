package Strings.Hard;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class CircleStrings {
    public static int isCircle(String arr[]) {
        // code here
       return circleString(arr,0,arr[0].charAt(arr[0].length()-1));
    }

    public static int circleString(String[] arr,int index,char end){
        if(index== arr.length-1){
            return 1;
        }
        for(String s:arr){
            if(!Objects.equals(arr[index], s) && s.charAt(s.length()-1)!=end){
                return 0;
            }
        }
       return circleString(arr,index+1,arr[index].charAt(arr[index].length()-1));
    }

    public static void main(String[] args) {
        String[] arr={"ayquvhrbaj", "cuttipvula", "jurmvldbwp", "pyynxbcxlc"};
        System.out.println(isCircle(arr));
    }
}
