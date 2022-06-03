import java.time.LocalDate;
import java.util.Random;
public class TrainBookingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookTicket passenger1 = new bookTicket();
		//Ticket passenger2 = new Ticket();
		
		passenger1.updateTicket("Rohit Verma","KYN","CSMT",2022,05,31);
		passenger1.printTicket();
		System.out.println();
		//passenger1.cancelTicket(7000647);
		//Passenger2
	}

}

class bookTicket{
	
	bookTicket(){
		PNR = 0;
		passengerName = "NONAME";
		Src = "A";
		Dest = "B";
		dateOfJourney= null;
	}
	
	int PNR;
	String passengerName, Src, Dest;
	LocalDate dateOfJourney;
	int ticketPrice ;
	
	Random random;
	 void updateTicket(String PName,String Source, String Destin,int Year,int Month,int day) {
		random  = new Random();
		this.PNR = random.nextInt(1154244, 9912345);
		this.ticketPrice=random.nextInt(200, 1000);
		
		passengerName = PName;
		Src = Source;
		Dest = Destin;
		dateOfJourney = LocalDate.of(Year, Month, day);
	}
	
	void printTicket() {
		System.out.println("PNR :"+PNR);
		System.out.println("NAME :"+passengerName);
		System.out.println("SOURCE :"+Src +"\tDESTINATION :"+Dest);
		System.out.println("DOJ: "+dateOfJourney);
		System.out.println("COST: Rs."+ticketPrice );
	
	}
	
	void cancelTicket(int PNR) {
		System.out.println("Your Ticket Number "+PNR+" is cancelled succesfully");
	}
	
}
