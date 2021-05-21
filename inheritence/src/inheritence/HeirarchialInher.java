package inheritence;
class Bank{
	//single super class multiple sub classes
	int amt=10000;
	void amt() {
		System.out.println(amt);
	}
}
class Icici extends Bank{
	void amtdis1() {
		System.out.println(amt*0.1);
	}
}
class Hdfc extends Bank{
	void amt2() {
		System.out.println(amt*10);
	}
}
public class HeirarchialInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc obj1=new Hdfc();
		obj1.amt2();
		Icici obj2=new Icici();
		obj2.amtdis1();

	}

}
//the opposite to heirarchial is multiple super class and one sub class it is multiple inheritence(sol is interface)