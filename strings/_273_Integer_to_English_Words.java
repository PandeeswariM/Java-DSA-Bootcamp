package strings;

  //https://leetcode.com/problems/integer-to-english-words/submissions/
   /*
   Example 1:

Input: num = 123
Output: "One Hundred Twenty Three"
Example 2:

Input: num = 12345
Output: "Twelve Thousand Three Hundred Forty Five"
Example 3:

Input: num = 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
   
   */


public class _273_Integer_to_English_Words {
  
	 private final static String[] lesstwenty= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
	 private final static String[] tens= {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	 private final static String[] Thousands= {"","Thousand","Million","Billion"};
	static String numberWords(int num) {
		if(num==0)
			return "Zero";
		int i=0;
		String words="";
		while(num>0) {
			if(num%1000!=0) {
				words=helper(num%1000)+Thousands[i]+words;
			}
			num/=1000;
			i++;
		}
		return words.trim();
	}
	static String helper(int num) {
		if(num==0)
			return "";
		else if(num<20)
			return lesstwenty[num]+" ";
		else if(num<100)
			return tens[num/10]+" "+helper(num%10);
		else
			return lesstwenty[num/100]+" Hundred "+helper(num%100);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(numberWords(1234567));
	}

}
