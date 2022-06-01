import java.util.Scanner;

public class BalToWords {

private static String[] oneDigit = {"","one","two","three","four","five","six","seven","eight","nine"};
private static String[] twoDigit = {"","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
private static String[] twenties = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	public static int digitsCalc(int n)
	{
		int digit=0;
		
		
		int len = (Integer.toString(n)).length();
		int position = len;
		
		while( n > 0)
		{
			digit = n % 10;
			
			n = n/10;
			position++;
		}
		
		return digit;
	}
	
	public static void convertToWords(int digit, int position)
	{
		String Bal = "";
		
		if(position == 1)
		{
			Bal = oneDigit[digit];
		}
		
		if(position == 2 ){
			if(digit > 1){
				twoDigit[digit].concat(Bal);
			}
			else
				twenties[digit].concat(Bal);
		}
	//	String Bal = " ".concat;
		
	//	return Bal;
	}
	
	/*public static String toWord(int digit) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
	    int bal =	s.nextInt();
		
	    int digits = digitsCalc(bal);
	    
	    
	}
*/
	}
