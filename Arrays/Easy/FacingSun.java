package Arrays.Easy;

public class FacingSun {
    public static int countBuildings(int[] height) {
        // code here
        int max_so_far=height[0];
        int count=1;
        for(int i=1;i<height.length;i++){
            if(max_so_far<height[i]){
                max_so_far=height[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] height={7,3,8,4,9};
        System.out.println(countBuildings(height));
    }
}
