import java.io.PrintWriter;

public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Min Short "+Short.MIN_VALUE +"\nMax Short "+Short.MAX_VALUE);
		System.out.println("Min Int "+Integer.MIN_VALUE +"\nMax Int "+Integer.MAX_VALUE);
		System.out.println("Min Byte "+Byte.MIN_VALUE +"\nMax Byte "+Byte.MAX_VALUE);
		System.out.println("Min Long "+Long.MIN_VALUE +"\nMax Long "+Long.MAX_VALUE);
		
		System.out.println("Min Char "+Character.MIN_VALUE +"\nMax Char "+Character.MAX_VALUE);
	
		char aa = '\u0905';
		PrintWriter myPW = new PrintWriter(System.out,true);
		myPW.println("aa ="+aa);
	}

}
