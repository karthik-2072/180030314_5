class InvalidAgeException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidAgeException(String s) {
super(s);
}

}
class Age{
void ageVerification(int age) throws Exception {
if(age>=18) {
System.out.println(" you have right to vote");
}
else {
throw new InvalidAgeException("your age is less to vote");
}
}
}
public class Agemain {
public static void main(String[] args) throws Exception {
Age a=new Age();
a.ageVerification(14);
}

}
