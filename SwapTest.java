
public class SwapTest {

	public static void main(String[] args) {
		AnyPair<Integer> ip= new AnyPair<Integer>(10,20);
		AnyPair<Float> fp = new AnyPair<Float>(0.5f,0.1f);
		AnyPair<String> sp = new AnyPair<String>("Rohit","verma");
		ip.print();
		fp.print();
		sp.print();
	}

}

class AnyPair<T>
{
	T t1,  t2;
	
	AnyPair(T x,T y){
		super();
		this.t1 = x;
		this.t2 = y;
	}
	
	
	
	void print() {
		T temp = t1;
		t1 = t2;
		t2 = temp;
		System.out.println("After Swapping");
		System.out.println("X: "+t1+"\nY: "+t2);
	}
}
