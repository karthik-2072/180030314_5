import java.util.*;
public class Firstsum {
public static void main(String arr[]) {
	Scanner sc=new Scanner(System.in);
	try {
	int a=sc.nextInt();
	int c=a*a;
	System.out.println(c);
}
	catch(Exception e) {
		System.out.println("Entered input is not a valid format for an integer.");
	}
	sc.close();
}
}
