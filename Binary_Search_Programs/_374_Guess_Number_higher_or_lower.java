package Binary_Search_Programs;

//https://leetcode.com/problems/guess-number-higher-or-lower/submissions/
      //We are playing the Guess Game. The game is as follows:
      //I pick a number from 1 to n. You have to guess which number I picked.
      //Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
       //You call a pre-defined API int guess(int num), which returns 3 possible results:

          //-1: The number I picked is lower than your guess (i.e. pick < num).
          //1: The number I picked is higher than your guess (i.e. pick > num).
           //0: The number I picked is equal to your guess (i.e. pick == num).
           //Return the number that I picked.

 //Example 1:

//Input: n = 10, pick = 6
//Output: 6
/*
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1*/


public class _374_Guess_Number_higher_or_lower extends Guess {

	public static int guessNumber(int n) {
	       int start=1,end=n;
	        while(start<=end){
	            int mid=start+(end-start)/2;
	            if(guess(mid)==0)
	                return mid;
	            else if(guess(mid)==-1)
	                end=mid-1;
	            else
	                start=mid+1;
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print(guessNumber(10));
	}

}
class Guess{
	static int guess(int num) {
		int pick=6;
		if(pick==num)
			return 0;
		if(pick>num)
			return 1;
		
		return -1;
	}
}
