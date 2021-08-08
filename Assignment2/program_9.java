package Assignment_2;
import java.util.Scanner;

//Take input as integers till the user enter 0 & print sum of all numbers
public class program_9 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int sum=0;
	 while(true) {
		 int n=sc.nextInt();
		 if(n==0)
			 break;
		 sum += n;
	 }
	 System.out.print(sum);
     sc.close();
	}

}
