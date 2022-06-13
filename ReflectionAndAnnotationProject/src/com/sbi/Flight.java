package com.sbi;

@DevelopedBy(name="vinay",version=1.3)
public  class Flight { 

	
	@flightdetails(no=101)
	public  int flightNumber;
	
	public String flightName;
	public  String source;
	public  String destination;
	

	public Flight(int flightNumber, String flightName) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
	}
	
	
	public Flight(int flightNumber, String flightName, String source) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
	}


	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	@FlightSpecs(version=1.23, editedBy="Rohit")
	public Flight(int flightNumber, String flightName, String source, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}


	public Flight(int flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}

	
	@DefinedBy(name="rohit")
	public void fly() { 
		System.out.println("Flight is flying....");
	}
	public void landing() {
		System.out.println("Flight is landing....");
	}
}