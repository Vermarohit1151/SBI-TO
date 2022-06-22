package com.example.demo.layer4;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exceptions.FlightListEmptyException;
import com.example.demo.exceptions.FlightNotFoundException;
import com.example.demo.layer2.Flight;

@Service
public interface FlightService {
	
	
	public Flight findFlightByIdService(int flightId) throws FlightNotFoundException ;
	public List<Flight> listAllFlightService() throws FlightListEmptyException ;
}
