package Binary_Search_Programs;
  
    //https://leetcode.com/problems/sqrtx/
         //Input: x = 8
        //Output: 2
    //Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
      //Example 2
        //Input: x = 4
        //Output: 2

public class _69_sqrt_x {
        public static int mySqrt(int x) {
            if(x==0 || x==1)
                    return x;
                
                int start=1,end=x/2,ans=0;
                
                while(start<=end)
                {
                    int mid=start+(end-start)/2;
                    
                    if(mid<=x/mid)          
                        {ans=mid;
                        start=mid+1;}
                    else
                        end=mid-1;
                }
                return ans;
        }

	
	public static void main(String[] args) {
	  System.out.print(mySqrt(8));

	}

}
