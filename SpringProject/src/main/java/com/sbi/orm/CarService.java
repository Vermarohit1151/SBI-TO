package com.sbi.orm;

import java.util.List;

import org.springframework.stereotype.Service;

//Component, Repository, Service, Controller

@Service
public interface CarService {
	void       saveCarService(Car carObj);
	void       modifyCarService(Car carObj);
	void 	   removeCarService(int carId);
	Car  	   findCarService(int carId);
	List<Car>  findAllCarsService();
}
