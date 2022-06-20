import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sbi.orm.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring_orm.xml"})
public class CarServiceTesting {
	Scanner sc = new Scanner(System.in);
	@Autowired	CarService carService;
	
	@Test
	public void saveCarTest() {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_orm.xml");
		//Car car = (Car) ctx.getBean("theCar");
		//CarRepository carRepository= (CarRepository) ctx.getBean("carRepo");
		
		Car theCar = new Car();
		theCar.setCarId(7);
	
		theCar.setCarName("Maruti Suzuki");
		carService.saveCarService(theCar);
	}
	
	@Test
	public void updateCarTest() {
		
		Car car = new Car();
		car.setCarId(3);
		car.setCarName("N/A");
		
		carService.modifyCarService(car);
	}
	
	@Test
	public void deleteCarTest() {
		carService.removeCarService(3);
	}
	
	@Test
	public void showCarTest() {
		System.out.println("Enter the car ID : ");
		Car theCar = carService.findCarService(sc.nextInt());
		Assertions.assertTrue(theCar!=null);
		System.out.println("Car Id   : "+theCar.getCarId());
		System.out.println("Car Name : "+theCar.getCarName());
	}
	
	@Test
	public void showAllCarsTest()
{
		List<Car> allCars = carService.findAllCarsService();
		Assertions.assertTrue(allCars!=null);
		System.out.println("got the cars array");
		Assertions.assertTrue(allCars.size()>0);
		System.out.println("array is non empty");
		
		for(Car theCar: allCars) {
			System.out.println("Car ID   :   "+theCar.getCarId());
			System.out.println("Car Name :   "+theCar.getCarName());
			System.out.println("--------------------------------");
		}
		}
}
