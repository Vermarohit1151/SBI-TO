package com.example.demo.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer>{

	

}
