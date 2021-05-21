package inheritence;
class Animal{
	//multilevel inheritence
	void eat() {
		System.out.println("Vegetables");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Barks");
	}
}
class Cat extends Dog{
	void sleep() {
		System.out.println("Cat sleeps");
	}
}
public class InheritenceConcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cat obj=new Cat();
       obj.sleep();
       obj.sound();
       obj.eat();
	}

}
