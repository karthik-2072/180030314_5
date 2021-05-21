import java.util.*;
public class SumAverage {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	int sum=0;
	int num=sc.nextInt();
	System.out.print("Enter the elements in the array: ");
	int arr[]=new int[num];
	
	try {	
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			sum=sum+arr[i];
		}
		double avg=sum/5;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		}
	catch(Exception e) {
		System.out.println(e);
	}
	sc.close();
	}
}