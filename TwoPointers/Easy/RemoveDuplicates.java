package TwoPointers.Easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
          int l=0;
          for(int r=0;r<nums.length;r++){
              if(nums[l]!=nums[r]) {
                  l++;
                  nums[l]=nums[r];
              }
          }
          return l+1;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3,3,4,4,4};
        System.out.println(removeDuplicates(nums));
    }
}
