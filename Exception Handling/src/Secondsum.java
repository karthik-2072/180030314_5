import java.util.*;
public class Secondsum {
public static void main(String arr[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the index of the array element you want to access");
	int inar=sc.nextInt();
	try {
		System.out.println("The array element at index "+a[inar]);
		System.out.println("The array element successfully accessed");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	sc.close();
}
}
