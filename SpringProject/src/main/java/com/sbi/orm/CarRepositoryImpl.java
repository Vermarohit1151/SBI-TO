package com.sbi.orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("carRepo")
public class CarRepositoryImpl implements CarRepository {

	@PersistenceContext(name = "SpringJPA")
	EntityManager entityManager;
	
	public CarRepositoryImpl() {
		System.out.println("CarRepositoryImpl() ctor..");
		//EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("MyJPA");
		//System.out.println("Entity manager factory : "+entityManagerFactory);
		//entityManager = entityManagerFactory.createEntityManager();	
		//System.out.println("Entity manager         : "+entityManager);
	}
	
	@Transactional
	public void insertCar(Car carObj) {
			entityManager.persist(carObj);
	}

	@Transactional
	public void updateCar(Car carObj) {
		entityManager.merge(carObj);
	}

	@Transactional
	public void deleteCar(int carId) {
		entityManager.remove(entityManager.find(Car.class, carId));
	}

	@Override
	public Car selectCar(int carId) {
		return entityManager.find(Car.class, carId);
	}

	@Override
	public List<Car> selectAllCars() {
		//Query query = entityManager.createQuery("from Car");
		//return query.getResultList();
		TypedQuery<Car> query = entityManager.createQuery("from Car", Car.class);
		return query.getResultList();
	}

}
