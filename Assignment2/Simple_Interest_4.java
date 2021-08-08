package Assignment_2;
import java.util.Scanner;

//Find simple interest for given principal,time,rate
public class Simple_Interest_4 {
     
	public static double sinterest(int p,int t,int r) {
		
		return (p*t*r)/100;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		int time=sc.nextInt();
		int rate=sc.nextInt();
		System.out.println(sinterest(principal,time,rate));
		sc.close();

	}

}
