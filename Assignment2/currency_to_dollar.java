package Assignment_2;
import java.util.*;

//Convert currency to dollar
public class currency_to_dollar {
    
	public static double convert(double rupee) {
		return rupee/65.25;
		// 1 dollar = 65.25 rupees
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double rupee=sc.nextDouble();
		System.out.print(convert(rupee));
		sc.close();
	}

}
