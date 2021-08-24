package Binary_Search_Programs;

public class _278_Find_Bad_version extends versionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5;
      System.out.print(firstBadVersion(n));
	}
	public static int firstBadVersion(int n) {
	       int start=1,end=n;
	        while(start<=end){
	           int mid=start + (end-start)/2;
	           if(!isBadVersion(mid))
	               start=mid+1;
	            else
	                end=mid-1;
	        }
	        return start;
	    }

}
 class versionControl{
	static boolean isBadVersion(int version) {
		if(version==4)
			return true;
		else
			return false;

	}
}
