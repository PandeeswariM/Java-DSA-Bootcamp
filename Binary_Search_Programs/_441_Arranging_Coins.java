package Binary_Search_Programs;

     /*https://leetcode.com/problems/arranging-coins/
         You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
         Given the integer n, return the number of complete rows of the staircase you will build.
         
         Input: n = 5
         Output: 2
         Explanation: Because the 3rd row is incomplete, we return 2.
         
         Input: n = 8
         Output: 3
         Explanation: Because the 4th row is incomplete, we return 3.

      */

public class _441_Arranging_Coins {

    public static int arrangeCoins(int n) {
        int start=1,end=n;
        while(start<=end) {
			int mid=start + (end-start)/2;
             int total=mid*(mid+1)/2;
             if(total==n)
            	 return mid;
             else if(total>n)
            	 end=mid-1;
             else
            	 start=mid+1;
            	 
        }
        return end;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print(arrangeCoins(8));
	}

}
