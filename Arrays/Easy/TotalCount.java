package Arrays.Easy;

public class TotalCount {

    static int totalCount(int k, int[] arr) {
        // code here
        int count=0;
        for(int num:arr){
            if(num % k == 0){
                count+=num/k;
            }else{
                count+=(num/k)+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={10,2,3,4,7};
        System.out.println(totalCount(4,arr));
    }

}
