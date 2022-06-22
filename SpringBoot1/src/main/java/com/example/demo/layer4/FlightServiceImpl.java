package com.example.demo.layer4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.FlightListEmptyException;
import com.example.demo.exceptions.FlightNotFoundException;
import com.example.demo.layer2.Flight;
import com.example.demo.layer3.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	FlightRepository flightRepo;
	
	@Override
	public Flight findFlightByIdService(int flightId) throws FlightNotFoundException
	{
		Optional<Flight> theFlight = flightRepo.findById(flightId);
		
		if(theFlight.isPresent()) {
			return theFlight.get();
		}
		else {
			throw new FlightNotFoundException("Flight Not Found with Flight ID "+flightId);
		}
		
	}

	@Override
	public List<Flight> listAllFlightService() throws FlightListEmptyException {
		// TODO Auto-generated method stub
		List<Flight> flightList = (List<Flight>) flightRepo.findAll();
		
		if(flightList.size() > 0 ) {
			return flightList;
		}
		else {
			throw new FlightListEmptyException("Flight list is empty...");
		}
	}
	
}
