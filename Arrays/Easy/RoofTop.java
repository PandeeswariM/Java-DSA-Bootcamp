package Arrays.Easy;

public class RoofTop {

    public static int maxStep(int arr[]) {
        // Your code here
        int maxSteps=0,currentStep=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                currentStep++;
                maxSteps= Math.max(maxSteps, currentStep);
            }else{
                currentStep=0;
            }
        }
        return maxSteps;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(maxStep(arr));
    }
}
