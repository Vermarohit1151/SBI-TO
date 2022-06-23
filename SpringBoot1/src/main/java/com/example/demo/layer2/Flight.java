package com.example.demo.layer2;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="flights")
public class Flight {
	@Id
	@GeneratedValue
	private int flightNumber;
	
	@Column(name="AIRLINE",length=20)
	private String airline;
	@Column(name="SOURCE",length=20)
	private String sourceCity;
	@Column(name="DESTINATION",length=20)
	private String destCity;
	@Column(name="DEPARTURE")
	private LocalDateTime flightDepartureTime;
	private LocalDateTime flightArrivalTime;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSourceCity() {
		return sourceCity;
	}
	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}
	public String getDestCity() {
		return destCity;
	}
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	public LocalDateTime getFlightDepartureTime() {
		return flightDepartureTime;
	}
	public void setFlightDepartureTime(LocalDateTime flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	public LocalDateTime getFlightArrivalTime() {
		return flightArrivalTime;
	}
	public void setFlightArrivalTime(LocalDateTime flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
	@Override
	public String toString() {
		return "[Flight Number =" + flightNumber + "\nAirlines =" + airline + "\nSource City=" + sourceCity
				+ "\nDestination City=" + destCity + "\nFlight Departure Time=" + flightDepartureTime + "\nFlight Arrival Time="
				+ flightArrivalTime + "]\n\n\n";
	}
	
	
}
