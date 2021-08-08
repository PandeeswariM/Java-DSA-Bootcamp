package Assignment_2;
import java.util.Scanner;

//largest of two numbers
public class largest_6 {

	public static int large(int a,int b) {
  	  if(a<b)
  		  return b;
  	  else
  		  return a;
    }
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(large(a,b));
      sc.close();
      
	}

}
