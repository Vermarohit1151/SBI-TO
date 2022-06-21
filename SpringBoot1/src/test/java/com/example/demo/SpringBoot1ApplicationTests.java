package com.example.demo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.layer2.Flight;
import com.example.demo.layer3.FlightRepository;
import com.example.demo.layer5.*;

@SpringBootTest
class SpringBoot1ApplicationTests {

	@Autowired
	FlightRepository flightRepo;
	
	@Test
	void contextLoads() {
		Flight flight = new Flight();
		flight.setAirline("Indigo");
		flight.setSourceCity("JPR");
		flight.setDestCity("IXR");
		flight.setFlightArrivalTime(LocalDateTime.of(2022, 9 , 15, 22, 10));
		flight.setFlightDepartureTime(LocalDateTime.of(2022, 9 , 15, 18, 50));
		flightRepo.save(flight);
	}

}
