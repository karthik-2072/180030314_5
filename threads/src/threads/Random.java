package threads;
public class Random implements Runnable {

  public static void main(String[] args) {
    Random obj = new Random();
    Thread t1 = new Thread(obj);
    t1.start();
  }

  @Override
  public void run() {
    Random random = new Random();
    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
    int index;
    
    while ((index = random.nextInt(6)) != 4) {
      System.out.println(colours[index]);
    }    
  }

private int nextInt(int i) {
	// TODO Auto-generated method stub
	return 0;
}

}