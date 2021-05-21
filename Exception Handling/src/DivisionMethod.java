import java.util.*;
public class DivisionMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Values: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			double div=division(num1,num2);
			System.out.println("Value: "+div);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	public static double division(int num1,int num2) throws ArithmeticException {
		return num1/num2;
		
	}
}