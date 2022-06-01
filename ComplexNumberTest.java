
public class ComplexNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complexNumber c1 = new complexNumber(-3, 2);
		complexNumber c2 = new complexNumber(3, -5);
		c1.printComplex();
		System.out.println("+");
		c2.printComplex();
		System.out.println("------------");
		c1.AddComplex(c2).printComplex();
		
	}

}
class Number{
	
}

class complexNumber extends Number{               
	private int re;
	private int im;
	public complexNumber(int real, int imag) {
		this.re = real;
		this.im = imag;
	}
	
	public void printComplex() {
		if(re==0) {
			System.out.println(im+"i");
		}
		else if(im==0) {
			System.out.println(re);
		}
		else if(im<0 && re!=0) {
			System.out.println(re+" -i"+-im);
		}
		else {
		System.out.println(re+" +i"+im);
		}
	}
	public complexNumber AddComplex( complexNumber c2) {
		
		int newre = this.re + c2.re;
		int newim = this.im + c2.im;
		complexNumber res = new complexNumber(newre, newim);
		
		return res;
	}
}

