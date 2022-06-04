
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chalk ch = new Chalk("Red");
		Chalk ch1 = new Chalk("Green");
		Chalk ch2 = new Chalk("White");
		Thread t1 = new Thread(ch);
		Thread t2 = new Thread(ch1);
		Thread t3 = new Thread(ch2);
		
		t1.start(); t2.start(); t3.start();
		FoodItem Samosa  = new FoodItem();
		Samosa.prepare();
	}

}

interface eatable{
	void eat();	
	
}

class FoodItem extends Thread implements eatable{
	public void run() {
		prepare();
	}
	public void prepare() {
		System.out.println("Food Item is being prepared...");
		eat();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating...");
	}
}

class Stone{
	
}

class Chalk extends Stone implements Runnable{
	
	String color;
	public Chalk(String c) {
		color = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println(i+". "+color+" Chalk is writing on the board...\n");
		}
		
	}
	
}
