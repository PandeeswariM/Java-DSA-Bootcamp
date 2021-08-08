package Assignment_2;
import java.util.Scanner;

//Take name as input & print a greeting message for that
public class greeting_3 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      String name=sc.next();
      String greeting="Hello "+name+"\nWishing you all the best!";
      System.out.println(greeting);
      sc.close();
	}

}
