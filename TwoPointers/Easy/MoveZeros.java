package TwoPointers.Easy;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int nonZeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroCount] = num;
                nonZeroCount++;
            }
        }
        for (int i = nonZeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void moveZero(int[] nums) {
        int move=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               int temp=nums[i];
               nums[i]=nums[move];
               nums[move++]=temp;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={1,1,0,3,4};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
