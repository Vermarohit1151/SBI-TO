package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping("/enquiry")
public class FlightEnquiryController {
	
	List<Flight> flightList = new ArrayList<Flight>();
	
	public FlightEnquiryController() {
		System.out.println("FlightEnquiry Ctor()");
		Flight theFlight1 = new Flight();
		theFlight1.setFlightNumber(102);
		theFlight1.setAirline("Indigo");
		theFlight1.setSourceCity("BOM");
		theFlight1.setDestCity("DEL");
		theFlight1.setFlightDepartureTime(LocalDateTime.of(2022,06,16,21,30));
		theFlight1.setFlightArrivalTime(LocalDateTime.of(2022,06,16,23,15));
		
		Flight theFlight2 = new Flight();
		theFlight2.setFlightNumber(201);
		theFlight2.setAirline("Air India");
		theFlight2.setSourceCity("IXR");
		theFlight2.setDestCity("DEL");
		theFlight2.setFlightDepartureTime(LocalDateTime.of(2022,06,16,16,10));
		theFlight2.setFlightArrivalTime(LocalDateTime.of(2022,06,16,16,50));
		
		Flight theFlight3 = new Flight();
		theFlight3.setFlightNumber(702);
		theFlight3.setAirline("Spice");
		theFlight3.setSourceCity("BOM");
		theFlight3.setDestCity("IXR");
		theFlight3.setFlightDepartureTime(LocalDateTime.of(2022,06,16,19,07));
		theFlight3.setFlightArrivalTime(LocalDateTime.of(2022,06,16,21,25));
		
		
		flightList.add(theFlight1);
		flightList.add(theFlight2);
		flightList.add(theFlight3);
	}
	
	@RequestMapping("/greet")
	public String greeting() {
		System.out.println("Greeting() is called ");
		return "<h1>Welcome to Flight Enquiry</h1>";
		
	}
	
	@RequestMapping("/error")
	public String err() {
		System.out.println("Greeting() is called ");
		return "<h1>Flight Enquiry not working</h1>";
		
	}
	@RequestMapping("/status")
	public String booked() {
		System.out.println("Greeting() is called ");
		return "<h1>Flight tickets to DEL is booked</h1>";
		
	}
	
	@GetMapping("/getFlight")
	public Flight getSingleFlightObject() {
		Flight theFlight = new Flight();
		theFlight.setFlightNumber(102);
		theFlight.setAirline("Indigo");
		theFlight.setSourceCity("BOM");
		theFlight.setDestCity("DEL");
		theFlight.setFlightDepartureTime(LocalDateTime.of(2022,06,16,21,30));
		theFlight.setFlightArrivalTime(LocalDateTime.of(2022,06,16,23,15));
		return theFlight;
	}
	
	@GetMapping("/getFlights")
	public List<Flight> getAllFlightObjects() {

		
		return flightList;
	}
	
	@GetMapping("/getFlight/{fid}")
	public Flight getFlightObject(@PathVariable("fid") int flightNumber)
	{
		Flight tempFlight = null;
		System.out.println("getFlightObject () called...");
		for(Flight theFlight : flightList) {
			if(theFlight.getFlightNumber() == flightNumber) {
				tempFlight = theFlight;
				break;
			}
			
		}
		return tempFlight;
	}
	
	@PostMapping("/addFlight")
	public ResponseStatus addFlightObject(@RequestBody Flight flightobj)
	{
		System.out.println("addFLightObj() function called");
		flightList.add(flightobj);
		ResponseStatus resp = new ResponseStatus();
		resp.setMessage("Flight Added successfully...");
		return resp;
	}
	
	@PutMapping("/modifyFlight")
	public ResponseStatus modifyFlightObject(@RequestBody Flight flightObj) 
	{
		boolean found = false;
		
		System.out.println("ModifyLight() function called...");
		
		for (Flight tempFlight : flightList) {
			if(tempFlight.getFlightNumber()==flightObj.getFlightNumber())
			{
				flightList.remove(tempFlight);
				flightList.add(flightObj);
				found=true;
				break;
			}
		}
		
		ResponseStatus resp = new ResponseStatus();
		if(found==true) {
			resp.setMessage("Flight updated succesfully...");
			
		}
		else {
			resp.setMessage("Flight number "+flightObj.getFlightNumber()+" NOT FOUND...");
		}
		
		return resp;
	}
	
	@DeleteMapping("/deleteFlight/{fno}")
	public ResponseStatus deleteFlightObject(@PathVariable("fno") int flightNumber)
	{
		ResponseStatus resp = new ResponseStatus();
		
		System.out.println("DeleteFLight() function invoked...");
		
		boolean found= false;
		
		for (Flight tempFlight : flightList) {
			if(tempFlight.getFlightNumber()==flightNumber)
			{
				flightList.remove(tempFlight);
			
				found=true;
				break;
			}
		}
		
		if(found == true) {
			resp.setMessage("Flight Deleted Successfully...");
			
		}
		else {
			resp.setMessage("Flight not found...");
		}
		return resp;
	}
}
