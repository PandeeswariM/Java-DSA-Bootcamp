package Assignment_2;
import java.util.*;

public class find_factors {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	while(i<=n/2) {
		if(n%i==0) {
			System.out.print(i+" ");
		}
		i++;
	}
	sc.close();    

	}

}
