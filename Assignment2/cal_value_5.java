package Assignment_2;
import java.util.*;

//Take  two numbers & an operator(+,-,*,/) & calculate the value 
public class cal_value_5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	char c=sc.next().charAt(0);
	int result=0;
	if(c=='+')
		result = a+b;
	else if(c=='-')
		result= a-b;
	else if(c=='/')
		result= a/b;
	else if(c=='*')
		result = a*b;
	else if(c=='%')
		if(b!=0) {
		result = a%b;
		}

	
	System.out.println(result);
	sc.close();
    
		
	   

	}

}
