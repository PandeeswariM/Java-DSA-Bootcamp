package Binary_Search_Programs;

public class _875_koko_eating_Bananas {

	//https://leetcode.com/problems/koko-eating-bananas/submissions/
	
    public static int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        if(h==piles.length)
            return max;
        int start=0,end=max,k=0;
        while(start<=end) {
			int mid=start + (end-start)/2;
            if(ispossible(piles,mid,h)){
                k=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return k;
    }
    static boolean ispossible(int[] piles,int mid,int h){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+= (int) Math.ceil(piles[i]*1.0/mid);
        }
        return time<=h;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] piles= {3,6,7,11};
		int h=8;
		System.out.println(minEatingSpeed(piles,h));
	}

}
