import java.util.*;
public class InvalidInput {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an integer: ");
	String val=sc.next();
	try {
		int num=Integer.parseInt(val);
		System.out.println("The square value is "+num*num);
		System.out.println("The work has been done successfully");
	}
	catch(Exception e) {
		System.out.println("Entered input is not a valid format for an integer.");
		
	}
	sc.close();
	
}
}