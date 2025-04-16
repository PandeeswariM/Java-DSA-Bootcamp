package Arrays.Easy;

public class PairsWithDifK {

    static int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int pairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                if(Math.abs(arr[i]-arr[j])==k){
                   pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr={8, 12, 16, 4, 0, 20};
        System.out.println(countPairsWithDiffK(arr,4));
    }
}
