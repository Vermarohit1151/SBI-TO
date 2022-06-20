package com.sbi.orm;
import com.sbi.orm.*;
import com.sbi.orm.exceptions.*;
import java.util.Scanner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService{
	@Autowired CarRepository carRepo;
	Scanner sc = new Scanner(System.in);
	public void saveCarService(Car carObj) {
		Car theCar = carRepo.selectCar(carObj.getCarId());
		if(theCar != null) {
			CarAlreadyExistsException e = new CarAlreadyExistsException("Car already exists...");
			throw e;
		}
		else {
			carRepo.insertCar(carObj);
			System.out.println("New Car inserted successfully");
		}
		
	}


	public void modifyCarService(Car carObj) {
		Car theCar = carRepo.selectCar(carObj.getCarId());
		if(theCar == null) {
			CarDoesNotExistException e = new CarDoesNotExistException("Car Does not exist... Please Enter a valid car ID");
			throw e;
		}
		else {
			carRepo.updateCar(carObj);
			System.out.println("Car "+carObj.getCarName()+" updated successfully");
		}
		
	}

	@Override
	public void removeCarService(int carId) {
		Car theCar = carRepo.selectCar(carId);
		if(theCar == null) {
			CarDoesNotExistException e = new CarDoesNotExistException("Car Does not exist... Please Enter a valid car ID");
			throw e;
		}
		else {
			
			System.out.println("Are you sure to delete car from inventory");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("yes")) {
				carRepo.deleteCar(carId);
				System.out.println("Car ID: "+carId+" deleted successfully");
			}
			else{
				System.out.println("Car deletion process cancelled....");
			}
		}
		
	}

	@Override
	public Car findCarService(int carId) {
		Car theCar = carRepo.selectCar(carId);
		if(theCar == null) {
			CarDoesNotExistException e = new CarDoesNotExistException("Car Does not exist... Please Enter a valid car ID");
			throw e;
		}
		else {
			return theCar;
		}
	}

	@Override
	public List<Car> findAllCarsService() {
		// TODO Auto-generated method stub
		List<Car> carsListArray = carRepo.selectAllCars();
		return carsListArray;
	}

}
