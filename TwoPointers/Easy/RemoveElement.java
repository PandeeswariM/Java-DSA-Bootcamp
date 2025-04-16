package TwoPointers.Easy;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int r=0,l=0;
        while(r< nums.length){
            if(nums[r]!=val){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
