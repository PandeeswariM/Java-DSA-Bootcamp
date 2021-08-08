package Assignment_2;
import java.util.Scanner;

//given number even or odd
public class Even_or_odd_2 {
     
	public static String evenorodd(int n) {
		if(n%2==0)
			return "even";
		else
			return "odd";
	}
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(evenorodd(n));
       sc.close();
	}
     
}
