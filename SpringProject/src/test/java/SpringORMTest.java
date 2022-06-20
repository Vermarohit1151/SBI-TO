import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sbi.orm.Car;
import com.sbi.orm.CarRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring_orm.xml"})
public class SpringORMTest {

	@Autowired	CarRepository carRepo;
	@Autowired	Car car ;
	
	@Test
	public void insertCarTest() {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_orm.xml");
		//Car car = (Car) ctx.getBean("theCar");
		//CarRepository carRepository= (CarRepository) ctx.getBean("carRepo");
		
					
		car.setCarId(9);
		car.setCarName("Hyudai");
		carRepo.insertCar(car);
	}
	
	@Test
	public void updateCarTest() {
		
		Car car = new Car();
		car.setCarId(9);
		car.setCarName("CRETA");
		
		carRepo.updateCar(car);
	}
	
	@Test
	public void deleteCarTest() {
		carRepo.deleteCar(7);
	}
	
	@Test
	public void showCarTest() {
		Car theCar = carRepo.selectCar(1);
		Assertions.assertTrue(theCar!=null);
		System.out.println("Car Id   : "+theCar.getCarId());
		System.out.println("Car Name : "+theCar.getCarName());
	}
	
	@Test
	public void showAllCarsTest()
{
		List<Car> allCars = carRepo.selectAllCars();
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
