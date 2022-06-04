
public class MultiThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car("Nano");
		
		mycar.start();
	}

}

class Car extends Thread{
	String m;
	public Car(String model) {
		m = model;
	}
	public void run() {
		
		System.out.println(m+ " Car is running");
	}
}

class Bike extends Thread{
	public void run() {
		System.out.println("Bike is running");
	}
}

class Plane extends Thread{
	public void run() {
		System.out.println("Plane is flying.....");
	}
}