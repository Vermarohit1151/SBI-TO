import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbi.anno.Car;
import com.sbi.CarFactory;
import com.sbi.anno.Engine;
import com.sbi.anno.Piston;
import com.sbi.anno.Vehicle;
public class TestCar {
//	@Test
//	public void testCar() {
//		CarFactory carFactory = new CarFactory();
//		Car theCar = carFactory.getCar();
//		theCar.drive();
//	}
	
	@Test
	public void testCarAgain() {
		
		System.out.println("Trying to get the ApplicationContext ...container....");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("myspring4.xml");
		System.out.println("Got the container..."+context);
		
		Car vehicle1 = (Car) context.getBean("theCar");
		/*Vehicle vehicle2 = (Vehicle) context.getBean("theCar");
		Vehicle vehicle3 = (Vehicle) context.getBean("theCar");
		*/
		System.out.println("Vehicle1 "+vehicle1.hashCode());
		//System.out.println("Vehicle2 "+vehicle2.hashCode());
		//System.out.println("Vehicle3 "+vehicle3.hashCode());
		vehicle1.drive();
		vehicle1.loadAllCars();
		//vehicle2.drive();
		//vehicle3.drive();
	}
}
