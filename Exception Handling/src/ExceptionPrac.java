public class ExceptionPrac {
public static void main(String[] args) {
System.out.println("hi");
try {
try {
int a[]= {1,2,3};
a[99]=23;
}
catch(Exception e) {
System.out.println(e);

}
int a=50/0;

}

catch(Exception e) {
System.out.println(e);

}
System.out.println("hello");
}



}