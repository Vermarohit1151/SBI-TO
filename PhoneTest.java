
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone b = new Phone();
		byte ph = 101; 
		b.dial(ph);
		
		short railwayEnquiryNumber = 139;
		b.dial(railwayEnquiryNumber);
		
		
		b.dial("+91",7506563687l);
		b.dial();
	}

}
class Phone  //Example of Overloading (Early binding)
{
	void dial()
	{
		System.out.println("dial() nowhere...");
	}
	void dial(byte helpline)
	{
		System.out.println("dial(byte) to..."+helpline);
	}
	void dial(short helpline) {
		System.out.println("dial(short) to..."+helpline);
	}
	void dial(String country, long number) {
		System.out.println("dial(phone) to..."+country+ " "+Long.toString(number));
	}
	void dial(short helpline,byte number) {
		System.out.println("dial() to short + byte..."+helpline+number);
	}
	void dial(byte number,short helpline) {
		System.out.println("dial() to short + byte..."+helpline+number);
	}
}
